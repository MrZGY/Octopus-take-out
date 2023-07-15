package org.zgy.octopus.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.zgy.octopus.common.R;
import org.zgy.octopus.entity.User;
import org.zgy.octopus.service.UserService;

import org.zgy.octopus.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    @Resource
    private JavaMailSender javaMailSender;//我们需要用这个进行邮件发送
    //注意这里我们将发送者从配置文件注入进来
    @Value("${spring.mail.username}")
    private String from;

    @PostMapping("/sendMsg")
    private R<String> sendMsg(@RequestBody User user, HttpSession session) {
//        这里用qq邮箱去发送验证码
//获取到前端提交过来的qq号
        String phone = user.getPhone();
        //这里工具类判是否为空
        if (StringUtils.isNotEmpty(phone)) {
//            这里用到生成验证码的工具类
            String code = ValidateCodeUtils.generateValidateCode(4).toString();//生成四位的验证码
            log.info("code={}", code);
//            构建一个邮件的对象
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//          设置邮件发件者
            simpleMailMessage.setFrom(from);
//            设置邮件接受者
            simpleMailMessage.setTo(phone);
//            设置有纪念的主题
            simpleMailMessage.setSubject("登录验证码");
//            设置邮件的征文
            String text = "^-^道哥（兰舟千帆）给您的验证码为" + code + "请勿泄露";
            simpleMailMessage.setText(text);


//将生成的验证码保存到Session
//            将我们生成的手机号和验证码放到session里面，我们后面用户填入验证码之后，我们验证的时候就从这里去取然后进行比对
//这里我们需要一个异常捕获
            session.setAttribute(phone, code);
//            return R_.success("手机验证码短信发送成功");

            try {
                javaMailSender.send(simpleMailMessage);
                return R.success("手机验证码短信发送成功");
            } catch (MailException e) {
                e.printStackTrace();
            }


        }


        return R.error("手机验证码发送失败");
    }
}

//}
//
//
//    //登录
//    @PostMapping("/login")
//    //Map存JSON数据
//    public R<User> login(HttpSession session,@RequestBody Map map){
//        //获取邮箱，用户输入的，这个phone就是输入的邮箱
//        String phone = map.get("phone").toString();
//        //获取验证码，用户输入的，这个code就是生成的验证码
//        String code = map.get("code").toString();
//        /**
//         * 获取session中保存的验证码
//         * 登录的邮箱作为session的key值，将code最为value
//         * 因此邮箱和验证码可以一一对应，保证邮箱验证码数据一致完整性
//         * */
//        Object sessionCode = session.getAttribute(phone);
//        //将session的验证码和用户输入的验证码进行比对
//        if (sessionCode != null && sessionCode.equals(code)) {
//            //要是User数据库没有这个邮箱则自动注册,先看看输入的邮箱是否存在数据库
//            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
//            queryWrapper.eq(User::getPhone,phone);
//            //获得唯一的用户，因为邮箱是唯一的
//            User user = userService.getOne(queryWrapper);
//            //要是User数据库没有这个邮箱则自动注册
//            if (user == null) {
//                user = new User();
//                user.setPhone(phone);
//                user.setStatus(1);
//                //取邮箱的前五位为用户名
//                user.setName("用户"+phone.substring(0,5));
//                userService.save(user);
//            }
//            //不保存这个用户名就登不上去，因为过滤器需要得到这个user才能放行，程序才知道你登录了
//            session.setAttribute("user", user.getId());
//            return R.success(user);
//        }
//        return R.error("登录失败");
//    }
//
//    /**
//     * 退出功能
//     * ①在controller中创建对应的处理方法来接受前端的请求，请求方式为post；
//     * ②清理session中的用户id
//     * ③返回结果（前端页面会进行跳转到登录页面）
//     * @return
//     */
//    @PostMapping("/logout")
//    public R<String> logout(HttpServletRequest request){
//        //清理session中的用户id
//        request.getSession().removeAttribute("user");
//        return R.success("退出成功");
//    }
//
//}

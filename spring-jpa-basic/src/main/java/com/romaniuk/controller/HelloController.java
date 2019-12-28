package com.romaniuk.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @RequestMapping(value = "/basic")
    public String sayHello() {
        return "fdsfsd helloweffwe test";
    }

    @RequestMapping(value = "/proper")
    public String sayProperHello() {
        return "proper hello";
    }

    @RequestMapping(value = "/user_entry")
    public String sendForm() {
                return "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "  <title>Simple Sign up from</title>\n" +
                        "  <head>\n" +
                        "    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n" +
                        "    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n" +
                        "    <style>\n" +
                        "      html, body {\n" +
                        "      display: flex;\n" +
                        "      justify-content: center;\n" +
                        "      font-family: Roboto, Arial, sans-serif;\n" +
                        "      font-size: 15px;\n" +
                        "      }\n" +
                        "      form {\n" +
                        "      border: 5px solid #f1f1f1;\n" +
                        "      }\n" +
                        "      input[type=text], input[type=password] {\n" +
                        "      width: 100%;\n" +
                        "      padding: 16px 8px;\n" +
                        "      margin: 8px 0;\n" +
                        "      display: inline-block;\n" +
                        "      border: 1px solid #ccc;\n" +
                        "      box-sizing: border-box;\n" +
                        "      }\n" +
                        "      .icon {\n" +
                        "      font-size: 110px;\n" +
                        "      display: flex;\n" +
                        "      justify-content: center;\n" +
                        "      color: #4286f4;\n" +
                        "      }\n" +
                        "      button {\n" +
                        "      background-color: #4286f4;\n" +
                        "      color: white;\n" +
                        "      padding: 14px 0;\n" +
                        "      margin: 10px 0;\n" +
                        "      border: none;\n" +
                        "      cursor: grab;\n" +
                        "      width: 48%;\n" +
                        "      }\n" +
                        "      h1 {\n" +
                        "      text-align:center;\n" +
                        "      fone-size:18;\n" +
                        "      }\n" +
                        "      button:hover {\n" +
                        "      opacity: 0.8;\n" +
                        "      }\n" +
                        "      .formcontainer {\n" +
                        "      text-align: center;\n" +
                        "      margin: 24px 50px 12px;\n" +
                        "      }\n" +
                        "      .container {\n" +
                        "      padding: 16px 0;\n" +
                        "      text-align:left;\n" +
                        "      }\n" +
                        "      span.psw {\n" +
                        "      float: right;\n" +
                        "      padding-top: 0;\n" +
                        "      padding-right: 15px;\n" +
                        "      }\n" +
                        "      /* Change styles for span on extra small screens */\n" +
                        "      @media screen and (max-width: 300px) {\n" +
                        "      span.psw {\n" +
                        "      display: block;\n" +
                        "      float: none;\n" +
                        "      }\n" +
                        "    </style>\n" +
                        "  </head>\n" +
                        "  <body>\n" +
                        "    <form action=\"/greeting/user_greeting\" method=\"GET\">\n" +
                        "      <h1>SIGN UP</h1>\n" +
                        "      <div class=\"icon\">\n" +
                        "        <i class=\"fas fa-user-circle\"></i>\n" +
                        "      </div>\n" +
                        "      <div class=\"formcontainer\">\n" +
                        "      <div class=\"container\">\n" +
                        "        <label for=\"uname\"><strong>Username</strong></label>\n" +
                        "        <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n" +
                        "        <label for=\"mail\"><strong>E-mail</strong></label>\n" +
                        "        <input type=\"text\" placeholder=\"Enter E-mail\" name=\"mail\" required>\n" +
                        "        <label for=\"psw\"><strong>Password</strong></label>\n" +
                        "        <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n" +
                        "      </div>\n" +
                        "      <button type=\"submit\"><strong>SIGN UP</strong></button>\n" +
                        "      <div class=\"container\" style=\"background-color: #eee\">\n" +
                        "        <label style=\"padding-left: 15px\">\n" +
                        "        <input type=\"checkbox\"  checked=\"checked\" name=\"remember\"> Remember me\n" +
                        "        </label>\n" +
                        "        <span class=\"psw\"><a href=\"#\">Forgot password?</a></span>\n" +
                        "      </div>\n" +
                        "    </form>\n" +
                        "  </body>\n" +
                        "</html>";
    }

    @RequestMapping(value = "/user_greeting", method = RequestMethod.GET)
    public String printUserGreeting(@RequestParam(name = "uname") String userName, String mail) {
        return "Hello," + userName + "  " + mail;
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public String getOrder(@PathVariable(name = "id") String orderId) {
        return "Order number: " + orderId;
    }

}

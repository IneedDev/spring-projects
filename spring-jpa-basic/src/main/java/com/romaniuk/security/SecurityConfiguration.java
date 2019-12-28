package com.romaniuk.security;

import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;

@Configuration
public class SecurityConfiguration {
//    extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("myUser")
//                .password("pass")
//                .roles("ADMIN")
//                .and()
//                .withUser("aa")
//                .password("aa")
//                .roles("USER");
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/projects/new").hasRole("ADMIN")
//                .antMatchers("/result").authenticated().and().formLogin();
//    }
}

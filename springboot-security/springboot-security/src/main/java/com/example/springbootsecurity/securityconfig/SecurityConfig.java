package com.example.springbootsecurity.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import filter.SpringCustomFilter;

/**
 * This is the entry point to the Spring Security . 
 * @author adash
 *
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	/*@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}*/
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("achi").password("password").roles("ADMIN").and()
		.withUser("anvi").password("password").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity httpSecurity){
		try {
			httpSecurity.authorizeRequests().
			antMatchers("/**hello*")
			.hasRole("USER").
			anyRequest().
			fullyAuthenticated().and().//addFilterBefore(customFilter(), BasicAuthenticationFilter.class).
			httpBasic();
			httpSecurity.csrf().disable();
		} catch (Exception e) {
			System.out.println("exception in configuration");
			e.printStackTrace();
		}
	
		
	}
	
	 @Bean
	    public SpringCustomFilter customFilter() {
	        return new SpringCustomFilter();
	    }
}

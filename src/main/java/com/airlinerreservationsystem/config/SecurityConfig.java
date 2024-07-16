package com.airlinerreservationsystem.config;
/*
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.core.annotation.Order; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.authentication.configuration.
 * AuthenticationConfiguration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * 
 * 
 * @Configuration
 * 
 * @EnableWebSecurity
 * 
 * @Order(1) public class SecurityConfig {
 * 
 * @Bean public UserDetailsService userDetailsService() { return new
 * UserDetailsServiceImpl(); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * public DaoAuthenticationProvider authenticationProvider() {
 * DaoAuthenticationProvider daoAuthenticationProvider = new
 * DaoAuthenticationProvider();
 * 
 * daoAuthenticationProvider.setUserDetailsService(this.userDetailsService());
 * daoAuthenticationProvider.setPasswordEncoder(this.passwordEncoder());
 * 
 * return daoAuthenticationProvider; }
 * 
 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
 * Exception { //
 * http.authorizeRequests().requestMatchers("/").permitAll().and().httpBasic();
 * 
 * //
 * http.csrf().disable().authorizeHttpRequests().anyRequest().authenticated().
 * and().httpBasic();
 * 
 * // http.authorizeHttpRequests().requestMatchers("/apis/admin/**").hasRole(
 * "ADMIN") //
 * .requestMatchers("/apis/passenger/**").hasRole("PASSENGER").requestMatchers(
 * "/**").permitAll().and() // .httpBasic().and().csrf().disable();
 * 
 * http.authorizeHttpRequests().requestMatchers("/registration/**").hasRole(
 * "ADMIN").anyRequest().authenticated().and().httpBasic().and().csrf().disable(
 * );
 * 
 * // http.authorizeHttpRequests().requestMatchers("/apis/admin/**").hasRole(
 * "ADMIN").requestMatchers("/apis/passenger/**").hasRole("PASSENGER").
 * anyRequest().authenticated().and().httpBasic().and().logout().permitAll().and
 * ().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
 * ; return http.build(); }
 * 
 * @Bean public AuthenticationManager authenticationManager(HttpSecurity http,
 * AuthenticationConfiguration authConfig) throws Exception {
 * AuthenticationManagerBuilder authBuilder =
 * http.getSharedObject(AuthenticationManagerBuilder.class);
 * authBuilder.userDetailsService(userDetailsService()).passwordEncoder(
 * passwordEncoder()); return authBuilder.build(); }
 * 
 * }
 */
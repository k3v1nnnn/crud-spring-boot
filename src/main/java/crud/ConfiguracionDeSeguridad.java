package crud;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class ConfiguracionDeSeguridad extends WebSecurityConfigurerAdapter{
	@Override
    protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers("/actualizarEmpleado/**").hasRole("ADMIN")
            .antMatchers("/agregarEmpleado/**").hasRole("ADMIN")
            .antMatchers("/eliminarEmpleado/**").hasRole("ADMIN")
            .anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/iniciarSesion").permitAll();
    }
}

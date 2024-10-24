package com.example.tacocloudauthorization;

import com.example.tacocloudauthorization.model.User;
import com.example.tacocloudauthorization.repository.RegisteredClientRepository;
import com.example.tacocloudauthorization.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

import java.util.UUID;

@SpringBootApplication
public class TacoCloudAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudAuthorizationApplication.class, args);
	}
//	@Bean
//	public ApplicationRunner dataLoader(
//			UserRepository repo, PasswordEncoder encoder) {
//		return args -> {
//			repo.save(
//					new User("habuma", encoder.encode("password"), "ROLE_ADMIN"));
//			repo.save(
//					new User("tacochef", encoder.encode("password"), "ROLE_ADMIN"));
//		};
//	}
//    @Bean
//    public RegisteredClientRepository registeredClientRepository(PasswordEncoder passwordEncoder) {
//	RegisteredClient registeredClient =
//			RegisteredClient.withId(UUID.randomUUID().toString())
//					.clientId("taco-admin-client")
//					.clientSecret(passwordEncoder.encode("secret"))
//					.clientAuthenticationMethod(
//							ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//					.authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//					.authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
//					.redirectUri(
//							"http://127.0.0.1:9090/login/oauth2/code/taco-admin-client")
//					.scope("writeIngredients")
//					.scope("deleteIngredients")
//					.scope(OidcScopes.OPENID)
//					.clientSettings(clientSettings -> clientSettings.requireUserConsent(true))
//					.build();
//	return new InMemoryRegisteredClientRepository(registeredClient);
//}
}

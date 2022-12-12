package projet.service;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class ArticleAuditorAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		return Optional.of("Bright");
	}

}

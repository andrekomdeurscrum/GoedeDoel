package be.vdab.goededoel.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@BeforeEach
	void beforeEach() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	void getNaam() {
		assertThat(doel.getNaam()).isEqualTo(NAAM);
	}

	@Test
	void eenNieuwDoelHeeftNogGeenOpbrengst() {
		assertThat(doel.getOpbrengst()).isNotZero();
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof GoedeDoel) {
			GoedeDoel ander = (GoedeDoel) object;
			return NAAM.equalsIgnoreCase(ander.getNaam());
		}
		return false;
	}

	@Test
	void doelenMetDezelfdeNaamZijnGelijk() {
		assertThat(doel).isEqualTo(new GoedeDoel(NAAM));
	}

	@Test
	void doelenMetVerschillendeNaamZijnVerschillend() {
		assertThat(doel).isNotEqualTo(new GoedeDoel("WWF"));
	}

	@Test
	void doelVerschiltVanEenObjectMetEenAnderType() {
		assertThat(doel).isNotEqualTo(BigDecimal.ZERO);
	}
}

package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_score")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {

	@EmbeddedId
	// Chave Primária composta pela classe ScorePK
	private ScorePK id = new ScorePK();
	private Double value;

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public void setUser(User user) {
		id.setUser(user);
	}

}

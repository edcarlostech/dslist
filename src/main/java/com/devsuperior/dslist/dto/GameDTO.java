package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

public class GameDTO {
	private Long id;
	private  String title;
	private Integer year; //year palavra reservada de banco dedados 
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
    public GameDTO() {
    	
    }
	
    public GameDTO(Game  entity) {
    	
    	/*Para não fazer o que está abaixo utilizo a classe do proprio framework chamda BenaUtils
    	Para funcionar tem que existir o getters e setters*/
    	
    	//copia  as propriedades da entidade para este objeto do DTO
    	BeanUtils.copyProperties(entity, this);
    	
    	/*Metodo convencional*/
		
		/*id = entity.getId();
		title = entity.getTitle();
		year =  entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription =entity.getShortDescription();*/
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
    
	
}

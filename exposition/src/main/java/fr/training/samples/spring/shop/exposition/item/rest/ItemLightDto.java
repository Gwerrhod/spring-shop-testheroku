package fr.training.samples.spring.shop.exposition.item.rest;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Item", description = "Item informations")
public class ItemLightDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("description")
	private String description;

	@JsonProperty("price")
	private int price;

	/**
	 *
	 */
	public ItemLightDto() {
	}

	public ItemLightDto(final String description, final int price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

}

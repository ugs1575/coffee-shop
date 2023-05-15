package gstoy.coffeeshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {
	@Id
	@GeneratedValue
	@Column(name = "item_id")
	private Long id;
	private String name;
	private int price;
	private int stockQuantity;
}

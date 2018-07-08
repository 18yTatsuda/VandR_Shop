package jp.co.example.VandR_Shop.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ShopAdmin implements Serializable {

	private Integer shopAdminId;
	private String shopAdminName;
	private String shopPassword;

	public Integer getShopAdminId() {
		return shopAdminId;
	}

	public void setShopAdminId(Integer shopAdminId) {
		this.shopAdminId = shopAdminId;
	}

	public String getShopAdminName() {
		return shopAdminName;
	}

	public void setShopAdminName(String shopAdminName) {
		this.shopAdminName = shopAdminName;
	}

	public String getShopPassword() {
		return shopPassword;
	}

	public void setShopPassword(String shopPassword) {
		this.shopPassword = shopPassword;
	}
}
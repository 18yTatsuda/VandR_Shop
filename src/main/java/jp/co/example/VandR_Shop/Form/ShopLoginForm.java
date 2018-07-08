package jp.co.example.VandR_Shop.Form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/*
 * ログイン画面用フォーム
 */
public class ShopLoginForm {

	@NotNull
	private Integer shopId;

	@NotBlank
	private String password;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer _shopId) {
		this.shopId = _shopId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String _password) {
		this.password = _password;
	}
}

package jp.co.example.VandR_Shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.example.VandR_Shop.Form.SeatUpdateForm;
import jp.co.example.VandR_Shop.Form.ShopLoginForm;
import jp.co.example.VandR_Shop.entity.ShopSessionInfo;
import jp.co.example.VandR_Shop.service.impl.ShopAdminService;

@Controller
public class ShopUpdateController {
	@Autowired
	private ShopSessionInfo sessionInfo;

	@Autowired
    MessageSource messageSource;

	@Autowired
	private ShopAdminService shopAdminService;

	@RequestMapping("/shopSeatsUpdateInput")
	public String seatsInput(Model model) {
		//ショップ情報をセッションにいれておく
		model.addAttribute("sAdmin",sessionInfo.getLoginShop());
		return "shopSeatsUpdateInput";
	}

	@RequestMapping("/shopProfileUpdateInput")
	public String profileInput(Model model) {
		model.addAttribute("sAdmin",sessionInfo.getLoginShop());
		return "shopProfileUpdateInput";
	}

	@RequestMapping(value ="/shopSeatsUpdate" , method = RequestMethod.POST)
	public String seatsUpdate(@Validated @ModelAttribute("seatUpdateForm") SeatUpdateForm form, BindingResult bindingResult,
			Model model) {
	return "shopSeatsUpdateResult";
	}

//	@RequestMapping(value = "/updateInput", method = RequestMethod.POST)
//	public String updateInput(@Validated @ModelAttribute("seatUpdateForm") SeatUpdateForm form, BindingResult bindingResult,
//			Model model) {
//
//		if (bindingResult.hasFieldErrors("userId")) {
//			String errorMsg = messageSource.getMessage("required.error", null, Locale.getDefault());
//			model.addAttribute("errmsg", errorMsg);
//			return "update";
//		}
//
//		ShopAdmin sAdmin = shopAdminService.findById(form.getUserId());
//
//		if(user == null) {
//			String errorMsg = messageSource.getMessage("id.not.found.error", null, Locale.getDefault());
//			model.addAttribute("errmsg", errorMsg);
//			return "update";
//		}
//
//		sessionInfo.setPrevUser(user);
//
//		form.setNewName(user.getUserName());
//		form.setNewTel(user.getTelephone());
//		form.setNewPassword(user.getPassword());
//
//		return "updateInput";
//	}
}

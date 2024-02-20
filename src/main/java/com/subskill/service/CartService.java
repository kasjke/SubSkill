package com.subskill.service;

import com.subskill.dto.CartDto;
import com.subskill.models.MicroSkill;

import java.util.List;


public interface CartService {
    CartDto addMicroSkillToCart(MicroSkill microSkill);
    void deleteMicroSkillFromCart(long cart_id);
    List<CartDto> allMicroSkillsInCart();
}

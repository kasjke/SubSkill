package com.subskill.repository;

import com.subskill.models.Cart;
import com.subskill.models.MicroSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query("SELECT c FROM Cart c JOIN c.listOfMicroSkills m WHERE m = :microSkill")
    Optional<Cart> findMicroSkillInCart(MicroSkill microSkill);

    Optional<Cart> findCartByUserId(long userId);


}

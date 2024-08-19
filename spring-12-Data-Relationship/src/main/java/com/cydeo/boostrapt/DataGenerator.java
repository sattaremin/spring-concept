package com.cydeo.boostrapt;

import com.cydeo.entitiy.*;
import com.cydeo.enums.Status;
import com.cydeo.repository.CardRepository;
import com.cydeo.repository.ItemRepository;
import com.cydeo.repository.MerchantRepository;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Controller
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;

    private final MerchantRepository merchantRepository;

    private final ItemRepository itemRepository;
    private final CardRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, ItemRepository itemRepository, CardRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Payment payment1 = new Payment(LocalDate.of(2022,4,19),new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail paymentDetail1 = new PaymentDetail(new BigDecimal("140000"),new BigDecimal("10000"),LocalDate.of(2022,4,24));

        payment1.setPaymentDetail(paymentDetail1);

        Payment payment2 = new Payment(LocalDate.of(2022,4,25),new BigDecimal("100000"), Status.FAIL);
        PaymentDetail paymentDetail2 = new PaymentDetail(new BigDecimal("90000"),new BigDecimal("5000"),LocalDate.of(2022,4,29));

        Merchant merchant1 = new Merchant("MErcahnt","A2334", new BigDecimal(3.4),32);


        payment2.setPaymentDetail(paymentDetail2);

        paymentRepository.save(payment1);
        paymentRepository.save(payment2);

        paymentRepository.delete(payment1);


//        Customer customer1 = new Customer("msmith","Mike","Smith","msmith@cydeo.com","VA");

        merchantRepository.save(merchant1);


        Item item1 = new Item("Milk","M01");
        Item item2 = new Item("Sugar","S01");
        Item item3 = new Item("Bread","B01");

        Card cart1 = new Card();
        Card cart2 = new Card();


        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);

        cartRepository.save(cart1);
        cartRepository.save(cart2);

    }
}

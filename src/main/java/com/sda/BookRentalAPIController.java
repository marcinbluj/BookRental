package com.sda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRentalAPIController {

    @RequestMapping("/")
    public String getMethods() {
        return "/books\tbooks/author/{author}\tbooks/id/{id}";
    }
}

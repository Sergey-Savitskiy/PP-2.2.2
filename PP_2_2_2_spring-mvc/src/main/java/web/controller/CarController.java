package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import web.Service.CarService;
import java.util.Optional;


@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String showCars(@RequestParam(value = "count")Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.getCarList(count.orElse(0)));
        return "cars";
    }
}

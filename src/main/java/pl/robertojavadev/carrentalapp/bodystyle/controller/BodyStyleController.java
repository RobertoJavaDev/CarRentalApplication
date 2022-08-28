package pl.robertojavadev.carrentalapp.bodystyle.controller;

import org.springframework.web.bind.annotation.*;
import pl.robertojavadev.carrentalapp.bodystyle.domain.model.BodyStyle;
import pl.robertojavadev.carrentalapp.bodystyle.service.BodyStyleService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/body-styles")
public class BodyStyleController {

    private final BodyStyleService bodyStyleService;

    public BodyStyleController(BodyStyleService bodyStyleService) {
        this.bodyStyleService = bodyStyleService;
    }

    @GetMapping
    public List<BodyStyle> getBodyStyles(){
        return null;
    }

    @GetMapping("{id}")
    public BodyStyle getBodyStyle(@PathVariable UUID id){
        return null;
    }

    @PostMapping
    public BodyStyle createBodyStyle(@RequestBody BodyStyle bodyStyle){
        return null;
    }

    @PutMapping("{id}")
    public BodyStyle updateBodyStyle(@PathVariable UUID id, @RequestBody BodyStyle bodyStyle){
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteBodyStyle(@PathVariable UUID id){

    }
}
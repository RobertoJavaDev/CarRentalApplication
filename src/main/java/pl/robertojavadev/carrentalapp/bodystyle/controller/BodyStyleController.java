package pl.robertojavadev.carrentalapp.bodystyle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.robertojavadev.carrentalapp.bodystyle.domain.model.BodyStyle;
import pl.robertojavadev.carrentalapp.bodystyle.service.BodyStyleService;

import java.util.List;
import java.util.Optional;
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
        return bodyStyleService.getBodyStyles();
    }

    @GetMapping("{id}")
    public Optional<BodyStyle> getBodyStyle(@PathVariable UUID id){
        return bodyStyleService.getBodyStyle(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BodyStyle createBodyStyle(@RequestBody BodyStyle bodyStyle){
        return bodyStyleService.createBodyStyle(bodyStyle);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public BodyStyle updateBodyStyle(@PathVariable UUID id, @RequestBody BodyStyle bodyStyle){
        return bodyStyleService.updateBodyStyle(id, bodyStyle);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBodyStyle(@PathVariable UUID id){
        bodyStyleService.deleteBodyStyle(id);
    }
}
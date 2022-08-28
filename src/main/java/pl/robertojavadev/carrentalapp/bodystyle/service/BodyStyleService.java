package pl.robertojavadev.carrentalapp.bodystyle.service;

import org.springframework.stereotype.Service;
import pl.robertojavadev.carrentalapp.bodystyle.domain.model.BodyStyle;
import pl.robertojavadev.carrentalapp.bodystyle.domain.repository.BodyStyleRepository;

import java.util.List;
import java.util.UUID;

@Service
public class BodyStyleService {

    private final BodyStyleRepository bodyStyleRepository;

    public BodyStyleService(BodyStyleRepository bodyStyleRepository) {
        this.bodyStyleRepository = bodyStyleRepository;
    }

    public List<BodyStyle> getBodyStyles(){
        return null;
    }

    public BodyStyle getBodyStyle(UUID id){
        return null;
    }

    public BodyStyle createBodyStyle(BodyStyle bodyStyleRequest){
        return null;
    }

    public BodyStyle updateBodyStyle(UUID id, BodyStyle bodyStyleRequest){
        return null;
    }

    public void deleteBodyStyle(UUID id){
    }
}

package pl.robertojavadev.carrentalapp.bodystyle.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Transactional(readOnly = true)
    public List<BodyStyle> getBodyStyles(){
        return bodyStyleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public BodyStyle
    getBodyStyle(UUID id){
        return bodyStyleRepository.getReferenceById(id);
    }

    @Transactional
    public BodyStyle createBodyStyle(BodyStyle bodyStyleRequest){
        BodyStyle bodyStyle = new BodyStyle();
        bodyStyle.setName(bodyStyleRequest.getName());
        return bodyStyleRepository.save(bodyStyle);
    }

    @Transactional
    public BodyStyle updateBodyStyle(UUID id, BodyStyle bodyStyleRequest){
        BodyStyle bodyStyle = bodyStyleRepository.getReferenceById(id);
        bodyStyle.setName(bodyStyleRequest.getName());
        return bodyStyleRepository.save(bodyStyle);
    }

    @Transactional
    public void deleteBodyStyle(UUID id){
        bodyStyleRepository.deleteById(id);
    }
}

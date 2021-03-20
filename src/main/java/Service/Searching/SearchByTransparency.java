package Service.Searching;

import characteristic.Transparency;
import entity.Stone;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class SearchByTransparency{
    public  static  List<Stone> search(List<Stone> stones, Transparency initial, Transparency ultimate){
        if(!(initial.compareTo(ultimate) < 0)){
            log.error("The passed range boundaries are not correct.");
            throw  new IllegalArgumentException("The passed range boundaries are not correct.");
        }
        if(stones == null){
            log.error("Method receive null.");
            throw new NullPointerException("object is null");
        }
        return stones.stream()
                .filter(item -> (item.getTransparency().
                        compareTo(initial) > 0 && item.getTransparency().
                        compareTo(ultimate)<0)).collect(Collectors.toList());
    }
}

package service.searching;

import characteristic.Transparency;
import entity.Stone;

import java.util.List;

interface Search {
    List<Stone> search(List<Stone> stones, Transparency initial, Transparency ultimate);
}

package hero_app.dto.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Abstract mapper for DTO retrieving from entity's content.
 *
 * @param <D> a DTO class
 * @param <E> an Entity class
 */
public abstract class AbstractDTOMapper<D, E> {

    /**
     * Creates and returns DTO-object from entity-object.
     * Uses, in particular, for DTO collection creation.
     *
     * @param entity entities collection for DTO retrieving
     * @return DTO object
     */
    public abstract D map(E entity);

    /**
     * Creates and returns DTO-collection from entity-collection.
     *
     * @param entities entities collection for DTO retrieving
     * @return DTO collection
     */
    public Collection<D> map(Collection<E> entities) {
        List<D> dtoList = new LinkedList<>();
        for (E entity : entities) {
            dtoList.add(map(entity));
        }
        return dtoList;
    }
}
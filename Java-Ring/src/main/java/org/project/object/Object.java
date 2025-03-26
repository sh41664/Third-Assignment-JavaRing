package org.project.object;

import org.project.entity.Entity;

public interface Object {
    void use(Entity target);

    // Add other required and bonus methods

    /**
     * Get the name of the object.
     * @return The name of the object.
     */
    String getName();

    /**
     * Get the description of the object.
     * @return The description of the object.
     */
    String getDescription();

    /**
     * Get the weight of the object.
     * @return The weight of the object.
     */
    double getWeight();

    /**
     * Get the value of the object.
     * @return The value of the object.
     */
    int getValue();
}

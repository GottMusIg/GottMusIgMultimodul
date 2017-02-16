package com.gottmusig.database.service.domain.simulation;

import com.gottmusig.database.service.domain.character.Character;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface SimulationService {

    DPSDifference getDPSDifference();

    Character simulateDPS(Character character);

}

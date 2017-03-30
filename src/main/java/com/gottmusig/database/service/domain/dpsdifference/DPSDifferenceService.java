package com.gottmusig.database.service.domain.dpsdifference;

import java.util.List;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface DPSDifferenceService {

    /**
     *
     * @return the DPS Ranking as a list sorted after the dps value in descending order
     */
    List<SpecificationDPS> getDPSDifference();

    /**
     *
     * @return the current spec with the most dps calculated by Simulation Craft (for graph scaling purposes)
     */
    int getMaxDPSValue();

}

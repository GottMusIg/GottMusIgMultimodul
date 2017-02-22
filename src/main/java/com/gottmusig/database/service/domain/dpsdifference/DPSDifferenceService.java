package com.gottmusig.database.service.domain.dpsdifference;

import java.util.List;

/**
 * Description
 *
 * @author lgottschick
 * @since 1.0.0-SNAPSHOT
 */
public interface DPSDifferenceService {

    List<SpecificationDPS> getDPSDifference();

    int getMaxDPSValue();

}

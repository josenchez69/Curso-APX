package com.bbva.capx.lib.r001;
import com.bbva.capx.dto.viajes.DtoOut;

public interface CAPXR001 {

	DtoOut execute(String originPoint, String destinationPoint);

}

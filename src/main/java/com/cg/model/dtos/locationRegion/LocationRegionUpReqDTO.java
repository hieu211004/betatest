package com.cg.model.dtos.locationRegion;

import com.cg.model.LocationRegion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocationRegionUpReqDTO {

    private String provinceId;
    private String provinceName;
    private String districtId;
    private String districtName;
    private String wardId;
    private String wardName;

    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;

    public LocationRegion toLocationRegion(Long locationRegionId) {
        return new LocationRegion()
                .setId(locationRegionId)
                .setProvinceId(provinceId)
                .setProvinceName(provinceName)
                .setDistrictId(districtId)
                .setDistrictName(districtName)
                .setWardId(wardId)
                .setWardName(wardName)
                .setAddress(address)
                ;
    }
}

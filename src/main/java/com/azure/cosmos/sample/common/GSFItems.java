// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.sample.common;

public class GSFItems {
    
    public static GSFItem getItem(Integer nbr) {
        GSFItem item = new GSFItem();
        item.setPartitionId("0_" + nbr);
        item.setType("metadata");
        item.setBuId("0");
        item.setNodeId(nbr);
        item.setNodeType("STORE");
        item.setDescription("FAYETTEVILLE, AR");
        item.setDisplayName("Fayetteville Supercenter");
        item.setNodeTypeId(1);
        item.setAddress1("3919 No. Mall Ave");
        item.setCity("Fayetteville");
        item.setState("AR");
        item.setPostalCode("72703");
        item.setCountry("US");
        item.setPhone("479-443-7679");
        item.setLat(36.122616);
        item.setLng(-94.15276);
        item.setTimeZone("CST");
        item.setOperatingHours("00:00#24:00#00:00#24:00#00:00#24:00#00:00#24:00#00:00#24:00#00:00#24:00#00:00#24:00");
        item.setOpenDate("1980-02-01T06:00:00.000Z");
        item.setDetailsPageURL("http://www.walmart.com/store/359");
        item.setKiosk(false);
        item.setDeleted(false);
        item.setGecOrgId("e2d81267-4948-4dc3-8f53-85af0682847e");
        item.setMarket("322");
        item.setRdcNo(6094);
        item.setNewRdcNo(0);
        item.setId("0_"+nbr+"_metadata");
        return item;
    }
}

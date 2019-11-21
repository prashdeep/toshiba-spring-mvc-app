package com.toshiba.springmvc.controller;

import com.toshiba.springmvc.service.AssetService;

public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }
}
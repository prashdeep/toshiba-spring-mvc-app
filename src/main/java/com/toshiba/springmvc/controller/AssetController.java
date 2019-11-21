package com.toshiba.springmvc.controller;

import com.toshiba.springmvc.service.AssetService;
import org.springframework.stereotype.Controller;

@Controller
public class AssetController {

    private final AssetService assetService;

    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }
}
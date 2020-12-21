Planet	"Ashamant"
{
	ParentBody     "Drinax"
	Class          "Selena"
	Mass            0.000747
	Radius          800.0
	InertiaMoment   0.38054
	Oblateness      0.00589
	TidalLocked	true
	Obliquity       26.72
	EqAscendNode    82.91

	AlbedoBond      0.15
	AlbedoGeom      0.17
	Brightness      1
	BrightnessReal  0.7

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Ashamant-Spec"
		SemiMajorAxis   0.141
		Eccentricity    0.0334
		Inclination     1.7506
		AscendingNode   49.479
		ArgOfPericenter 286.562
		MeanAnomaly     19.412
	}
}


Planet	"Drinax Prime"
{
	ParentBody     "Drinax"
	Class          "Terra"
	Mass            0.11947
	Radius          3650
	InertiaMoment   0.33054
	Oblateness      0.00589
	RotationPeriod  1172
	RotationOffset  -28.7
	RotationEpoch   0
	Obliquity       26.72
	EqAscendNode    82.91

	AlbedoBond      0.25
	AlbedoGeom      0.17
	Brightness      1
	BrightnessReal  0.7

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "terra_wet_LB_green.cfg"
		SurfStyle       0.024245
		Randomize      (-0.485, 0.692, -0.399)
		colorDistMagn   0.044507
		colorDistFreq   794.4
		detailScale     18681
		drivenDarkening -1
		seaLevel        0.27754
		snowLevel       0.86508
		tropicLatitude  0.15192
		icecapLatitude  0.95848
		icecapHeight    0.54579
		climatePole     0.7375
		climateTropic   0.32271
		climateEquator  0.0875
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        1
		heightTempGrad  0.41479
		beachWidth      0.001391
		tropicWidth     0.36641
		mainFreq        1.0687
		venusFreq       0.65375
		venusMagn       0
		mareFreq        3.1049
		mareDensity     0.060662
		terraceProb     0.25347
		erosion         0.11918
		montesMagn      0.15063
		montesFreq      345.08
		montesSpiky     0.89468
		montesFraction  0.51925
		dunesMagn       0.046886
		dunesFreq       54.408
		dunesFraction   0.94263
		hillsMagn       0.13019
		hillsFreq       980.78
		hillsFraction   0.035743
		hills2Fraction  0.81713
		riversMagn      58.116
		riversFreq      2.8588
		riversSin       7.6241
		riftsMagn       0
		riftsFreq       3.1252
		riftsSin        5.4688
		canyonsMagn     0.063291
		canyonsFreq     100
		canyonsFraction 0.045492
		cracksMagn      0.082485
		cracksFreq      0.812
		cracksOctaves   0
		craterMagn      0.75297
		craterFreq      25.728
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.7127
		volcanoFreq     0.70372
		volcanoDensity  0.27555
		volcanoOctaves  3
		volcanoActivity 0.33426
		volcanoFlows    0.4793
		volcanoRadius   0.55222
		volcanoTemp     1460.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.1478
		stripeFluct     0
		stripeTwist     0
		cycloneMagn     2.4033
		cycloneFreq     0.63995
		cycloneDensity  0.419
		cycloneOctaves  2
		BumpHeight      33.338
		BumpOffset      9.2527
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecPowerWater  55
		SpecPowerIce    55
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           9.2527
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		ModulateBright  1
	}

	Clouds
	{
		Height          12.959
		Velocity        155.72
		BumpHeight      2.7715
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.56954
		mainOctaves     10
		Coverage        0.15616
		stripeZones     1.1478
		stripeFluct     0
		stripeTwist     0
	}

	Clouds
	{
		Height          18.502
		Velocity        103.98
		BumpHeight      2.7715
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.56954
		mainOctaves     10
		Coverage        0.15616
		stripeZones     1.1478
		stripeFluct     0
		stripeTwist     0
	}

	Clouds
	{
		Height          24.045
		Velocity        158.67
		BumpHeight      2.7715
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.56954
		mainOctaves     10
		Coverage        0.15616
		stripeZones     1.1478
		stripeFluct     0
		stripeTwist     0
	}

	Clouds
	{
		Height          29.589
		Velocity        110.71
		BumpHeight      2.7715
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.56954
		mainOctaves     10
		Coverage        0.15616
		stripeZones     1.1478
		stripeFluct     0
		stripeTwist     0
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          132
		Density         0.53
		Pressure        0.534
		Greenhouse      52.3
		Bright          4
		Opacity         1
		SkyLight        2
		Hue             0
		Saturation      1

		Composition
		{
			N2        	72.5
			O2        	26.5
			Ar        	0.75
			CO        	0.15
			CO2       	0.1
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Extrasolar"
		Period          0.218505014
		SemiMajorAxis   0.278
		Eccentricity    0.02
		Inclination     1.8506
		AscendingNode   49.479
		ArgOfPericenter 286.562
		MeanAnomaly     19.412
	}
}



DwarfMoon	"Velohar/Drinax Prime I"
{
	ParentBody     "Drinax Prime"
	Class          "Asteroid"
	Mass            2.4776e-09
	Radius          3.5822
	RadiusInfo      6
	InertiaMoment   0.39952
	Obliquity       1.793
	EqAscendNode    25.229
	TidalLocked     true

	AlbedoBond      0.02
	AlbedoGeom      0.08
	Brightness      0.4
	BrightnessReal  0.15
	Color          (0.643 0.639 0.635)

	Surface
	{
		DiffMap        "Deimos/Surface-PBC"
		BumpMap        "Deimos/Bump-SE"
		BumpHeight      4.8247
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      1.65
		SpotWidth       0.068
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Deimos-NOE-4"
		PeriodDays      1.26244096
		SemiMajorAxisKm 23462.866
		Eccentricity    0.00033
		Inclination     1.793
		AscendingNode   25.229
		ArgOfPericenter 208.213
		MeanAnomaly     344.128
	}
}










Planet	"Rhizol"
{
	ParentBody     "Drinax"
	Class          "Jupiter"
	Mass            7.4831
	Radius          16207
	InertiaMoment   0.2306
	Oblateness      0.020905
	RotationPeriod  11.896
	RotationEpoch   0
	Obliquity       79.195
	EqAscendNode    166.51

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_Class_I_b.cfg"
		SurfStyle       0.51901
		Randomize      (0.202, -0.632, -0.003)
		detailScale     256
		tropicLatitude  0.98846
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.4333
		stripeFluct     0.46818
		stripeTwist     2.442
		cycloneMagn     1.9412
		cycloneFreq     0.83989
		cycloneDensity  0.47895
		cycloneOctaves  4
		BumpHeight      18.599
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.77941
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          86.919
		Velocity        1670.6
		BumpHeight      17.46
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.77941
		ModulateBright  1
		mainFreq        0.087792
		mainOctaves     10
		Coverage        0.55498
		stripeZones     1.4333
		stripeFluct     0.46818
		stripeTwist     2.442
	}

	Clouds
	{
		Height          155.24
		Velocity        2365.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.77941
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.087792
		mainOctaves     10
		Coverage        0.55498
		stripeZones     1.4333
		stripeFluct     0.46818
		stripeTwist     2.442
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          360.2
		Density         1388.4
		Pressure        86814
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.39946
		Saturation      0.94406

		Composition
		{
			H2        	88.215
			He        	7.3932
			CH4       	3.1885
			C3H8      	0.36039
			C8H18     	0.30451
			C2H2      	0.28506
			C2H4      	0.12719
			C2H6      	0.058476
			N2        	0.034634
			NH3       	0.023113
			O2        	0.0082034
			Ne        	0.0010762
			Ar        	0.0009183
			CO2       	0.00014822
			H2S       	1.7736e-06
			Kr        	3.4171e-07
			H2O       	2.961e-07
			Xe        	3.7697e-08
			CO        	3.4315e-08
			SO2       	9.8526e-09
			Cl2       	3.238e-10
		}
	}

	Aurora
	{
		Height         504.28
		NorthLat       84.857
		NorthLon       -11.029
		NorthRadius    3907.1
		NorthWidth     1819.7
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 79.076
		NorthMoveSpeed 0.74693
		NorthParticles 10000
		SouthLat       -83.551
		SouthLon       165.13
		SouthRadius    4771.3
		SouthWidth     2741.4
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 67.816
		SouthMoveSpeed 0.92636
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     23532
		OuterRadius     86818
		EdgeRadius      43067
		MeanRadius      30037
		Thickness       25
		ChartRadius     43067
		RotationPeriod  6.1406
		FrontBright     0.7224
		BackBright      3.1923
		Density         0.77941
		Opacity         0.77941
		Brightness      1
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.9722
		densityScale    1.5688
		densityOffset   -0.16242
		densityPower    1.0045
		colorContrast   0.12218
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Rhizol-Spec"
		SemiMajorAxis   0.75
		Eccentricity    0.0484
		Inclination     1.3053
		AscendingNode   100.556
		ArgOfPericenter -85.8021
		MeanAnomaly     19.6501
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            5.016e-09
	Radius          14.052
	InertiaMoment   0.39709
	Oblateness     (0.267, 0.431, 0.000)
	Obliquity       -0.014
	EqAscendNode    34.426
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.720 0.718 0.716)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30115
		Randomize      (0.466, -0.059, -0.620)
		colorDistMagn   0.9795
		colorDistFreq   0.10418
		detailScale     64
		snowLevel       2
		tropicLatitude  0.037979
		icecapLatitude  0.55015
		icecapHeight    0.030026
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.254
		heightTempGrad  0.625
		beachWidth      0.0013117
		tropicWidth     0.07
		mainFreq        0.44694
		venusFreq       0.56135
		venusMagn       0.10012
		mareDensity     0
		terraceProb     0.20023
		erosion         0
		montesMagn      0.47913
		montesFreq      2.9087
		montesSpiky     0.97709
		montesFraction  0.64662
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.40584
		hillsFraction   0.73048
		hills2Fraction  0
		eqridgeMagn     0.38374
		eqridgeWidth    0.10385
		eqridgeModMagn  0.3985
		eqridgeModFreq  0.30829
		canyonsFraction 0
		craterMagn      0.21295
		craterFreq      0.17655
		craterDensity   0.93199
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57824
		volcanoTemp     227.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.647
		BumpOffset      6.3233
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.204917423
		SemiMajorAxisKm 28718.335
		Eccentricity    4.16579293e-05
		Inclination     -0.014000198
		AscendingNode   34.4255997
		ArgOfPericenter 87.4631127
		MeanAnomaly     76.2721392
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            6.8976e-09
	Radius          17.61
	InertiaMoment   0.39899
	Oblateness     (0.260, 0.320, 0.000)
	Obliquity       -0.013343
	EqAscendNode    -143.37
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.504 0.499 0.495)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87022
		Randomize      (0.736, -0.229, -0.287)
		colorDistMagn   0.99545
		colorDistFreq   0.26611
		detailScale     64
		snowLevel       2
		tropicLatitude  0.03799
		icecapLatitude  0.5288
		icecapHeight    0.33239
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15171
		heightTempGrad  0.625
		beachWidth      0.00075958
		tropicWidth     0.07
		mainFreq        0.70375
		venusFreq       0.57988
		venusMagn       0.33449
		mareDensity     0
		terraceProb     0.32662
		erosion         0
		montesMagn      0.60328
		montesFreq      3.7928
		montesSpiky     0.94268
		montesFraction  0.73781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.50932
		hillsFraction   0.46473
		hills2Fraction  0
		eqridgeMagn     0.35612
		eqridgeWidth    0.1226
		eqridgeModMagn  0.48311
		eqridgeModFreq  0.21308
		canyonsFraction 0
		craterMagn      0.2483
		craterFreq      0.23808
		craterDensity   0.70505
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50912
		volcanoTemp     331.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.849
		BumpOffset      7.9244
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.361481664
		SemiMajorAxisKm 41927.3598
		Eccentricity    7.58711699e-05
		Inclination     -0.013342707
		AscendingNode   -143.367696
		ArgOfPericenter 145.199147
		MeanAnomaly     -69.3615895
	}
}

Moon	"8.1"
{
	ParentBody     "Rhizol"
	Class          "Aquaria"
	Mass            0.0002426
	Radius          503.28
	InertiaMoment   0.39968
	Oblateness      0.0088572
	Obliquity       1.3692
	EqAscendNode    129.29
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.685 0.681 0.676)

	Surface
	{
		Preset         "aquaria_airless_triton.cfg"
		SurfStyle       0.43928
		Randomize      (-0.993, -0.399, 0.046)
		colorDistMagn   0.061226
		colorDistFreq   75.524
		detailScale     2048
		drivenDarkening 0.7
		seaLevel        0.087218
		snowLevel       2
		tropicLatitude  0.06142
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44942
		heightTempGrad  0.625
		beachWidth      0.0014074
		tropicWidth     0.07
		mainFreq        1.8053
		venusFreq       0.96903
		venusMagn       0.28564
		mareFreq        0
		mareDensity     0.19728
		terraceProb     0.21191
		erosion         0
		montesMagn      0.054893
		montesFreq      29.157
		montesSpiky     0.91531
		montesFraction  0.56994
		dunesMagn       0.033173
		dunesFreq       3.8739
		dunesFraction   0.78847
		hillsMagn       0.12848
		hillsFreq       44.818
		hillsFraction   0.73251
		hills2Fraction  0.20328
		riversMagn      0
		riversFreq      2.8243
		riversSin       6.3983
		riftsMagn       0
		riftsFreq       3.1711
		riftsSin        7.3526
		eqridgeMagn     0.4101
		eqridgeWidth    0.025148
		eqridgeModMagn  2.398
		eqridgeModFreq  8.0069
		canyonsMagn     0.62331
		canyonsFreq     0.19158
		canyonsFraction 0
		cracksMagn      0.064001
		cracksFreq      0.19983
		cracksOctaves   0
		craterMagn      0.56088
		craterFreq      1.5152
		craterDensity   0.77903
		craterOctaves   17
		craterRayedFactor 0.083659
		volcanoMagn     0.19268
		volcanoFreq     0.62627
		volcanoDensity  0.2529
		volcanoOctaves  3
		volcanoActivity 0.33427
		volcanoFlows    0.32207
		volcanoRadius   0.14057
		volcanoTemp     335.74
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.991318314
		SemiMajorAxisKm 82146.0688
		Eccentricity    0.000452874025
		Inclination     1.36922043
		AscendingNode   129.292651
		ArgOfPericenter 134.361793
		MeanAnomaly     55.4257878
	}
}

DwarfMoon	"8.2"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            1.3156e-05
	Radius          191.03
	InertiaMoment   0.39955
	Oblateness     (0.131, 0.002, 0.000)
	Obliquity       -0.42017
	EqAscendNode    30.275
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.467 0.463 0.456)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0083519
		Randomize      (-0.723, -0.569, 0.379)
		colorDistMagn   0.057208
		colorDistFreq   29.095
		detailScale     512
		snowLevel       2
		tropicLatitude  0.031285
		icecapLatitude  0.47936
		icecapHeight    0.14144
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34713
		heightTempGrad  0.625
		beachWidth      0.00085529
		tropicWidth     0.07
		mainFreq        0.33584
		venusFreq       0.61159
		venusMagn       0.8318
		mareDensity     0
		terraceProb     0.20886
		erosion         0
		montesMagn      0.56339
		montesFreq      3.9859
		montesSpiky     0.81334
		montesFraction  0.3307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       92.623
		hillsFraction   0.71127
		hills2Fraction  0
		eqridgeMagn     0.44675
		eqridgeWidth    0.10704
		eqridgeModMagn  0.42264
		eqridgeModFreq  0.21324
		canyonsFraction 0
		craterMagn      0.2574
		craterFreq      1.4383
		craterDensity   0.97733
		craterOctaves   17
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54864
		volcanoTemp     259.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.03583111
		SemiMajorAxisKm 132719.506
		Eccentricity    0.00751701323
		Inclination     -0.420171298
		AscendingNode   30.2748455
		ArgOfPericenter 54.8163219
		MeanAnomaly     162.208203
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            1.7519e-08
	Radius          20.545
	InertiaMoment   0.39515
	RotationPeriod  247.73
	Obliquity       142.16
	EqAscendNode    3.6501

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.648 0.641 0.638)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.57742
		Randomize      (-0.453, -0.739, 0.712)
		colorDistMagn   0.086953
		colorDistFreq   0.19468
		detailScale     64
		snowLevel       2
		tropicLatitude  0.58424
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24483
		heightTempGrad  0.625
		beachWidth      0.0012031
		tropicWidth     0.07
		mainFreq        0.587
		venusFreq       0.62849
		venusMagn       0.81231
		mareDensity     0
		terraceProb     0.33735
		erosion         0
		montesMagn      0.41326
		montesFreq      2.9897
		montesSpiky     0.97592
		montesFraction  0.4317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.96889
		hillsFraction   0.41044
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23399
		craterFreq      0.20955
		craterDensity   0.80864
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51152
		volcanoTemp     247.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.49
		BumpOffset      9.2452
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      30.9664985
		SemiMajorAxisKm 814769.444
		Eccentricity    0.491186133
		Inclination     142.163545
		AscendingNode   3.65014323
		ArgOfPericenter 81.733021
		MeanAnomaly     119.644942
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            2.3793e-08
	Radius          26.607
	InertiaMoment   0.3986
	RotationPeriod  413.65
	Obliquity       199.02
	EqAscendNode    17.602

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.426 0.423 0.422)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.14649
		Randomize      (-0.182, -0.909, -0.955)
		colorDistMagn   0.11467
		colorDistFreq   0.52989
		detailScale     128
		snowLevel       2
		tropicLatitude  0.36032
		icecapLatitude  0.76566
		icecapHeight    0.13212
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14254
		heightTempGrad  0.625
		beachWidth      0.000651
		tropicWidth     0.07
		mainFreq        0.42556
		venusFreq       0.64964
		venusMagn       0.79732
		mareDensity     0
		terraceProb     0.66593
		erosion         0
		montesMagn      0.53179
		montesFreq      1.7912
		montesSpiky     0.94133
		montesFraction  0.50847
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4426
		hillsFraction   0.59044
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27385
		craterFreq      0.27081
		craterDensity   0.91455
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57819
		volcanoTemp     210.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      34.4704864
		SemiMajorAxisKm 875128.057
		Eccentricity    0.310644325
		Inclination     199.017985
		AscendingNode   17.6021587
		ArgOfPericenter 105.557966
		MeanAnomaly     -1.83467321
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            3.2288e-08
	Radius          28.472
	InertiaMoment   0.39988
	Obliquity       192.86
	EqAscendNode    46.085
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.608 0.605 0.602)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.71555
		Randomize      (0.088, 0.921, -0.622)
		colorDistMagn   0.1407
		colorDistFreq   0.34528
		detailScale     128
		snowLevel       2
		tropicLatitude  0.25826
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44025
		heightTempGrad  0.625
		beachWidth      0.00099886
		tropicWidth     0.07
		mainFreq        0.6721
		venusFreq       0.68968
		venusMagn       0.78491
		mareDensity     0
		terraceProb     0.2175
		erosion         0
		montesMagn      0.35992
		montesFreq      3.0299
		montesSpiky     0.89746
		montesFraction  0.57939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2932
		hillsFraction   0.69355
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24145
		craterFreq      0.22226
		craterDensity   1.0516
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47248
		volcanoTemp     174.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      39.3582759
		SemiMajorAxisKm 956013.542
		Eccentricity    0.387575814
		Inclination     192.860664
		AscendingNode   46.0850576
		ArgOfPericenter -178.843712
		MeanAnomaly     -64.5705795
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            4.3818e-08
	Radius          28.438
	InertiaMoment   0.39838
	RotationPeriod  417.06
	Obliquity       166.48
	EqAscendNode    158.32

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.788 0.786 0.784)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28462
		Randomize      (0.359, 0.752, -0.289)
		colorDistMagn   0.1653
		colorDistFreq   0.57131
		detailScale     128
		snowLevel       2
		tropicLatitude  0.19842
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33796
		heightTempGrad  0.625
		beachWidth      0.0010467
		tropicWidth     0.07
		mainFreq        0.49704
		venusFreq       0.53219
		venusMagn       0.77417
		mareDensity     0
		terraceProb     0.34848
		erosion         0
		montesMagn      0.50313
		montesFreq      2.1242
		montesSpiky     0.80642
		montesFraction  0.65435
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2892
		hillsFraction   0.89094
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2147
		craterFreq      0.17005
		craterDensity   0.85747
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51805
		volcanoTemp     207.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      43.443957
		SemiMajorAxisKm 1021079.56
		Eccentricity    0.400442033
		Inclination     166.481064
		AscendingNode   158.319144
		ArgOfPericenter -171.629225
		MeanAnomaly     138.767002
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            5.9521e-08
	Radius          35.908
	InertiaMoment   0.39971
	Obliquity       208.42
	EqAscendNode    20.778
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.572 0.569 0.563)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.85369
		Randomize      (0.629, 0.582, 0.044)
		colorDistMagn   0.18867
		colorDistFreq   0.50029
		detailScale     128
		snowLevel       2
		tropicLatitude  0.5078
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23567
		heightTempGrad  0.625
		beachWidth      0.0010946
		tropicWidth     0.07
		mainFreq        0.3008
		venusFreq       0.55994
		venusMagn       0.7646
		mareDensity     0
		terraceProb     0.10414
		erosion         0
		montesMagn      0.65921
		montesFreq      3.0704
		montesSpiky     0.97475
		montesFraction  0.74868
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2527
		hillsFraction   0.57299
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24912
		craterFreq      0.23481
		craterDensity   0.95612
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.6181
		volcanoTemp     451.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      48.9881031
		SemiMajorAxisKm 1106200.24
		Eccentricity    0.0529748768
		Inclination     208.418716
		AscendingNode   20.7782941
		ArgOfPericenter 138.991385
		MeanAnomaly     155.038641
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            8.0997e-08
	Radius          35.441
	InertiaMoment   0.39814
	Obliquity       136.51
	EqAscendNode    -165.83
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.752 0.747 0.745)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.42276
		Randomize      (0.899, 0.412, 0.377)
		colorDistMagn   0.21096
		colorDistFreq   0.83966
		detailScale     128
		snowLevel       2
		tropicLatitude  0.66128
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13337
		heightTempGrad  0.625
		beachWidth      0.0014424
		tropicWidth     0.07
		mainFreq        0.56613
		venusFreq       0.57876
		venusMagn       0.75591
		mareDensity     0
		terraceProb     0.22618
		erosion         0
		montesMagn      0.47473
		montesFreq      2.2695
		montesSpiky     0.93998
		montesFraction  0.079812
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8651
		hillsFraction   0.67681
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2265
		craterFreq      0.19122
		craterDensity   0.77883
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4795
		volcanoTemp     204.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      52.1760148
		SemiMajorAxisKm 1153685.06
		Eccentricity    0.221485051
		Inclination     136.514218
		AscendingNode   -165.830067
		ArgOfPericenter -121.128045
		MeanAnomaly     -7.37455197
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            1.1052e-07
	Radius          44.391
	InertiaMoment   0.39954
	Obliquity       213
	EqAscendNode    10.767
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.537 0.528 0.523)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99182
		Randomize      (-0.830, 0.242, 0.710)
		colorDistMagn   0.23233
		colorDistFreq   0.68186
		detailScale     128
		snowLevel       2
		tropicLatitude  0.57502
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43108
		heightTempGrad  0.625
		beachWidth      0.00089028
		tropicWidth     0.07
		mainFreq        0.40286
		venusFreq       0.59491
		venusMagn       0.74789
		mareDensity     0
		terraceProb     0.3601
		erosion         0
		montesMagn      0.59624
		montesFreq      3.1113
		montesSpiky     0.89552
		montesFraction  0.34273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9806
		hillsFraction   0.82519
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25851
		craterFreq      0.24843
		craterDensity   0.89754
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52491
		volcanoTemp     307.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      54.4373128
		SemiMajorAxisKm 1186782.46
		Eccentricity    0.301877454
		Inclination     213.003237
		AscendingNode   10.7665809
		ArgOfPericenter 109.460953
		MeanAnomaly     167.989129
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            1.5137e-07
	Radius          44.46
	InertiaMoment   0.39787
	Obliquity       41.488
	EqAscendNode    103.96
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.713 0.711 0.709)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.56089
		Randomize      (-0.560, 0.072, -0.957)
		colorDistMagn   0.25288
		colorDistFreq   1.2515
		detailScale     128
		snowLevel       2
		tropicLatitude  0.68941
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32879
		heightTempGrad  0.625
		beachWidth      0.00093813
		tropicWidth     0.07
		mainFreq        0.6448
		venusFreq       0.61053
		venusMagn       0.7404
		mareDensity     0
		terraceProb     0.11371
		erosion         0
		montesMagn      0.44408
		montesFreq      2.3708
		montesSpiky     0.79843
		montesFraction  0.43972
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0422
		hillsFraction   0.55419
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23477
		craterFreq      0.20617
		craterDensity   1.0115
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41291
		volcanoTemp     411.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      58.3464819
		SemiMajorAxisKm 1242938.91
		Eccentricity    0.0298110893
		Inclination     41.4875622
		AscendingNode   103.963957
		ArgOfPericenter 155.621307
		MeanAnomaly     131.177357
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            2.083e-07
	Radius          54.243
	InertiaMoment   0.39938
	Obliquity       180.94
	EqAscendNode    111.94
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.496 0.492 0.488)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12996
		Randomize      (-0.290, -0.098, -0.624)
		colorDistMagn   0.27269
		colorDistFreq   0.87508
		detailScale     256
		snowLevel       2
		tropicLatitude  0.054164
		icecapLatitude  0.90995
		icecapHeight    0.033777
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2265
		heightTempGrad  0.625
		beachWidth      0.00068599
		tropicWidth     0.07
		mainFreq        0.4773
		venusFreq       0.62729
		venusMagn       0.73333
		mareDensity     0
		terraceProb     0.23491
		erosion         0
		montesMagn      0.55824
		montesFreq      3.1529
		montesSpiky     0.97357
		montesFraction  0.51541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.2586
		hillsFraction   0.66068
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27749
		craterFreq      0.26536
		craterDensity   0.83801
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48613
		volcanoTemp     164.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      64.723993
		SemiMajorAxisKm 1331936.54
		Eccentricity    0.172441008
		Inclination     180.944557
		AscendingNode   111.94065
		ArgOfPericenter -123.385708
		MeanAnomaly     14.6494595
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "Rhizol"
	Class          "Asteroid"
	Mass            2.8833e-07
	Radius          53.333
	InertiaMoment   0.39756
	Obliquity       -30.205
	EqAscendNode    167.29
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.677 0.674 0.670)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.69903
		Randomize      (-0.019, -0.268, -0.291)
		colorDistMagn   0.29186
		colorDistFreq   1.7051
		detailScale     256
		snowLevel       2
		tropicLatitude  0.47131
		icecapLatitude  1
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12421
		heightTempGrad  0.625
		beachWidth      0.0013338
		tropicWidth     0.07
		mainFreq        0.76702
		venusFreq       0.64798
		venusMagn       0.72662
		mareDensity     0
		terraceProb     0.37228
		erosion         0
		montesMagn      0.40685
		montesFreq      2.4513
		montesSpiky     0.93861
		montesFraction  0.5863
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.1323
		hillsFraction   0.78851
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24219
		craterFreq      0.21911
		craterDensity   0.93719
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53227
		volcanoTemp     198.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      10
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      72.0161609
		SemiMajorAxisKm 1430188.63
		Eccentricity    0.115179785
		Inclination     -30.2048719
		AscendingNode   167.294342
		ArgOfPericenter -112.877523
		MeanAnomaly     -60.202591
	}
}



Planet	"O'Rien"
{
	ParentBody     "Drinax"
	Class          "Jupiter"
	Mass            37.83
	Radius          22492
	InertiaMoment   0.21567
	Oblateness      0.06487
	RotationPeriod  29.9249
	RotationOffset  305.4
	RotationEpoch   0
	Obliquity       2.2225
	EqAscendNode    -22.203

	AlbedoBond      0.903
	AlbedoGeom      0.538
	Brightness      0.75
	BrightnessReal  0.9

	Surface
	{
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0
		RingsWinter     0
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          300
		Density         3018
		Pressure        1e+06
		Bright          2
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1

		Composition
		{
			H2        	89.8
			He        	10.2
			CH4       	0.3
			NH3       	0.026
			C2H6      	0.0006
		}
	}

	Aurora
	{
		Height         800
		NorthLat       90
		NorthLon       0
		NorthRadius    15000
		NorthWidth     5000
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 64.334
		NorthMoveSpeed 0.7744
		NorthParticles 10000
		SouthLat       -90
		SouthLon       0
		SouthRadius    16000
		SouthWidth     5000
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 66.752
		SouthMoveSpeed 0.76944
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}


	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Orien-Spec"
		SemiMajorAxis   1.61
		Eccentricity    0.0959
		Inclination     5.3053
		AscendingNode   100.556
		ArgOfPericenter -85.8021
		MeanAnomaly     19.6501
	}
}


Planet	"Zeclapp"
{
	ParentBody     "Drinax"
	Class          "Jupiter"
	Mass            17.13
	Radius          14492
	InertiaMoment   0.21567
	Oblateness      0.06487
	RotationPeriod  10.9249
	RotationOffset  305.4
	RotationEpoch   0
	Obliquity       5.2225
	EqAscendNode    -22.203

	AlbedoBond      0.603
	AlbedoGeom      0.538
	Brightness      0.75
	BrightnessReal  0.9

	Surface
	{
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0
		RingsWinter     0
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height         	200
		Density         3018
		Pressure        1e+06
		Bright          2
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1

		Composition
		{
			H2        	89.8
			He        	10.2
			CH4       	0.3
			NH3       	0.026
			C2H6      	0.0006
		}
	}

	Aurora
	{
		Height         800
		NorthLat       90
		NorthLon       0
		NorthRadius    15000
		NorthWidth     5000
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 64.334
		NorthMoveSpeed 0.7744
		NorthParticles 10000
		SouthLat       -90
		SouthLon       0
		SouthRadius    16000
		SouthWidth     5000
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 66.752
		SouthMoveSpeed 0.76944
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}


	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Zeclapp-Spec"
		SemiMajorAxis   2.91
		Eccentricity    0.1384
		Inclination     3.11
		AscendingNode   100.556
		ArgOfPericenter -85.8021
		MeanAnomaly     19.6501
	}
}

Planet	"Uincarawa"
{
	ParentBody     "Drinax"
	Class          "Jupiter"
	Mass            12.13
	Radius          25492
	InertiaMoment   0.21567
	Oblateness      0.02487
	RotationPeriod  30.9249
	RotationOffset  305.4
	RotationEpoch   0
	Obliquity       5.2225
	EqAscendNode    -22.203

	AlbedoBond      0.603
	AlbedoGeom      0.538
	Brightness      0.25
	BrightnessReal  0.9

	Surface
	{
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0
		RingsWinter     0
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height         	2300
		Density         3018
		Pressure        1e+06
		Bright          2
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1

		Composition
		{
			H2        	89.8
			He        	10.2
			CH4       	0.3
			NH3       	0.026
			C2H6      	0.0006
		}
	}

	Aurora
	{
		Height         800
		NorthLat       90
		NorthLon       0
		NorthRadius    15000
		NorthWidth     5000
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 64.334
		NorthMoveSpeed 0.7744
		NorthParticles 10000
		SouthLat       -90
		SouthLon       0
		SouthRadius    16000
		SouthWidth     5000
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 66.752
		SouthMoveSpeed 0.76944
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}


	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Uincarowa-Spec"
		SemiMajorAxis   5.73
		Eccentricity    0.1471
		Inclination     1.92
		AscendingNode   100.556
		ArgOfPericenter -85.8021
		MeanAnomaly     19.6501
	}
}


Planet	"D'Gan"
{
	ParentBody     "Drinax"
	Class          "Selena"
	Mass            0.000647
	Radius          475.0
	InertiaMoment   0.40054
	Oblateness      0.00589
	RotationPeriod  9.9249
	RotationOffset  205.4
	RotationEpoch   0
	Obliquity       26.72
	EqAscendNode    82.91

	AlbedoBond      0.15
	AlbedoGeom      0.17
	Brightness      0.6
	BrightnessReal  0.7

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Dgan-Spec"
		SemiMajorAxis   11.341
		Eccentricity    0.2034
		Inclination     -0.9211
		AscendingNode   49.479
		ArgOfPericenter 286.562
		MeanAnomaly     19.412
	}
}
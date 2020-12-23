
Planet	"1"
{
	ParentBody     "Asim"
	Class          "Terra"
	Mass            0.19626
	Radius          3700.6
	InertiaMoment   0.32612
	Obliquity       -1.0967
	EqAscendNode    -169.84
	TidalLocked     true

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.641 0.639 0.638)

	Surface
	{
		Preset         "terra_arid_mars_green_plants.cfg"
		SurfStyle       0.33354
		Randomize      (-0.116, -0.247, 0.437)
		colorDistMagn   0.065327
		colorDistFreq   483.28
		detailScale     16384
		seaLevel        0.10592
		snowLevel       0.85
		tropicLatitude  0.0033907
		icecapLatitude  2
		icecapHeight    0.47677
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2393
		heightTempGrad  0.375
		beachWidth      0.00048176
		tropicWidth     0.5
		mainFreq        0.80077
		venusFreq       1.2598
		venusMagn       0
		mareFreq        2.1544
		mareDensity     0.1287
		terraceProb     0.15516
		erosion         0
		montesMagn      0.24837
		montesFreq      118.63
		montesSpiky     0.82768
		montesFraction  0.90747
		dunesMagn       0.039819
		dunesFreq       41.392
		dunesFraction   0.54505
		hillsMagn       0.16066
		hillsFreq       426.97
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.4084
		riversSin       6.2873
		riftsMagn       59.306
		riftsFreq       2.1847
		riftsSin        5.5093
		canyonsMagn     0.065326
		canyonsFreq     89.253
		canyonsFraction 0
		cracksMagn      0.093949
		cracksFreq      0.25615
		cracksOctaves   0
		craterMagn      0.65789
		craterFreq      10.629
		craterDensity   0.15407
		craterOctaves   3.406
		volcanoMagn     0.66508
		volcanoFreq     0.6043
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.94464
		volcanoRadius   0.46227
		volcanoTemp     1221.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.7811
		cycloneDensity  0.40735
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      1.1378
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.514
		Velocity        123.11
		BumpHeight      2.257
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.70061
		mainOctaves     10
		Coverage        0.23358
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          169.04
		Density         0.22469
		Pressure        0.30839
		Greenhouse      5.3094
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0.014211
		Saturation      0.86741

		Composition
		{
			CO2       	99.663
			SO2       	0.27998
			C3H8      	0.050883
			C8H18     	0.0057132
			H2S       	0.00058675
			Ar        	3.7264e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.109502579
		SemiMajorAxis   0.251087646
		Eccentricity    0.0739773869
		Inclination     -1.09674425
		AscendingNode   -169.836942
		ArgOfPericenter 268.5676
		MeanAnomaly     167.709144
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            1.4069e-09
	Radius          7.4018
	InertiaMoment   0.3984
	Oblateness      0.14409
	Obliquity       0.014591
	EqAscendNode    146.82
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.620 0.616 0.610)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.88437
		Randomize      (-0.746, 0.718, 0.949)
		colorDistMagn   0.81613
		colorDistFreq   0.041752
		detailScale     32
		snowLevel       2
		tropicLatitude  0.019391
		icecapLatitude  2
		icecapHeight    0.71476
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27757
		heightTempGrad  0.625
		beachWidth      0.00081825
		tropicWidth     0.07
		mainFreq        0.47455
		venusFreq       0.58936
		venusMagn       0.69661
		mareDensity     0
		terraceProb     0.33501
		erosion         0
		montesMagn      0.49777
		montesFreq      2.2795
		montesSpiky     0.95351
		montesFraction  0.36668
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11635
		hillsFraction   0.7941
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25476
		craterFreq      0.22922
		craterDensity   0.93329
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.64559
		volcanoTemp     1076.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.6616
		BumpOffset      3.3308
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
		PeriodDays      0.181592756
		SemiMajorAxisKm 7872.11467
		Eccentricity    4.46120487e-05
		Inclination     0.0145907879
		AscendingNode   146.824627
		ArgOfPericenter -52.0369166
		MeanAnomaly     147.500376
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            1.9919e-09
	Radius          8.4724
	InertiaMoment   0.39973
	Oblateness      0.02611
	Obliquity       0.0065825
	EqAscendNode    175.5
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.797 0.796 0.795)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.45344
		Randomize      (-0.476, 0.548, -0.718)
		colorDistMagn   0.83007
		colorDistFreq   0.031339
		detailScale     32
		snowLevel       2
		tropicLatitude  0.019254
		icecapLatitude  2
		icecapHeight    0.6408
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17528
		heightTempGrad  0.625
		beachWidth      0.0005661
		tropicWidth     0.07
		mainFreq        0.75981
		venusFreq       0.60499
		venusMagn       0.69105
		mareDensity     0
		terraceProb     0.64167
		erosion         0
		montesMagn      0.64251
		montesFreq      3.1148
		montesSpiky     0.91399
		montesFraction  0.45665
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12828
		hillsFraction   0.53721
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23196
		craterFreq      0.18316
		craterDensity   0.71271
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48049
		volcanoTemp     1124.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.6252
		BumpOffset      3.8126
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
		PeriodDays      0.440155661
		SemiMajorAxisKm 14204.63
		Eccentricity    9.91314732e-05
		Inclination     0.00658254917
		AscendingNode   175.500903
		ArgOfPericenter -65.7801738
		MeanAnomaly     125.828239
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            2.7926e-09
	Radius          9.2161
	InertiaMoment   0.39816
	Oblateness      0.0030667
	RotationPeriod  29.447
	Obliquity       -9.4129
	EqAscendNode    -121.38

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.580 0.577 0.574)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.022506
		Randomize      (-0.205, 0.378, -0.385)
		colorDistMagn   0.84411
		colorDistFreq   0.061016
		detailScale     32
		snowLevel       2
		tropicLatitude  0.14497
		icecapLatitude  2
		icecapHeight    0.57726
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47299
		heightTempGrad  0.625
		beachWidth      0.00091395
		tropicWidth     0.07
		mainFreq        0.54324
		venusFreq       0.62113
		venusMagn       0.68557
		mareDensity     0
		terraceProb     0.21564
		erosion         0
		montesMagn      0.46915
		montesFreq      2.3784
		montesSpiky     0.85147
		montesFraction  0.53041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.25317
		hillsFraction   0.64765
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26766
		craterFreq      0.24218
		craterDensity   0.87671
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52595
		volcanoTemp     1071.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.2944
		BumpOffset      4.1472
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
		PeriodDays      1.84044196
		SemiMajorAxisKm 36867.2278
		Eccentricity    0.1461602
		Inclination     -9.41294358
		AscendingNode   -121.381161
		ArgOfPericenter 46.4816242
		MeanAnomaly     -171.902902
	}
}

DwarfMoon	"1.D4"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            3.8834e-09
	Radius          10.518
	InertiaMoment   0.39956
	Obliquity       181.65
	EqAscendNode    -2.7613
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.802 0.753 0.715)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.59157
		Randomize      (0.065, 0.208, -0.052)
		colorDistMagn   0.85826
		colorDistFreq   0.044207
		detailScale     32
		snowLevel       2
		tropicLatitude  0.047747
		icecapLatitude  2
		icecapHeight    0.50834
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37069
		heightTempGrad  0.625
		beachWidth      0.00096181
		tropicWidth     0.07
		mainFreq        0.37468
		venusFreq       0.63992
		venusMagn       0.68017
		mareDensity     0
		terraceProb     0.34605
		erosion         0
		montesMagn      0.58805
		montesFreq      3.1566
		montesSpiky     0.98556
		montesFraction  0.60153
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28816
		hillsFraction   0.76556
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23954
		craterFreq      0.19996
		craterDensity   0.97901
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41681
		volcanoTemp     1019.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.4666
		BumpOffset      4.7333
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
		PeriodDays      5.01236332
		SemiMajorAxisKm 71898.6541
		Eccentricity    0.0143370173
		Inclination     181.650363
		AscendingNode   -2.76127894
		ArgOfPericenter 76.6122309
		MeanAnomaly     -12.8499412
	}
}

Planet	"2"
{
	ParentBody     "Asim"
	Class          "Jupiter"
	Mass            502.66
	Radius          77036
	InertiaMoment   0.25479
	Oblateness      0.06163
	RotationPeriod  9.1257
	RotationEpoch   0
	Obliquity       -76.945
	EqAscendNode    -0.27204

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_Class_IV.cfg"
		SurfStyle       0.15593
		Randomize      (-0.669, -0.817, -0.979)
		detailScale     256
		tropicLatitude  0.97934
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.4903
		stripeFluct     0.46738
		stripeTwist     12.924
		cycloneMagn     10.67
		cycloneFreq     0.94587
		cycloneDensity  0.31619
		cycloneOctaves  5
		cycloneMagn2     0.50671
		cycloneFreq2     0.52849
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      10.786
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          68.836
		Velocity        948.88
		BumpHeight      29.025
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.86315
		mainOctaves     12
		Coverage        0.14574
		stripeZones     6.4903
		stripeFluct     0.46738
		stripeTwist     12.924
	}

	Clouds
	{
		Height          126.88
		Velocity        698.15
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.25709
		mainFreq        0.86315
		mainOctaves     12
		Coverage        0.14574
		stripeZones     6.4903
		stripeFluct     0.46738
		stripeTwist     12.924
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          591.28
		Density         7508.1
		Pressure        1e+06
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.41637
		Saturation      0.96422

		Composition
		{
			H2        	89.963
			He        	6.3047
			CH4       	2.6539
			C8H18     	0.29023
			C2H2      	0.28097
			C3H8      	0.26976
			C2H4      	0.10886
			C2H6      	0.057886
			N2        	0.035282
			NH3       	0.025445
			O2        	0.0073705
			Ne        	0.0011703
			Ar        	0.00084405
			CO2       	0.00015713
			H2S       	1.3102e-06
			Kr        	3.389e-07
			H2O       	2.6323e-07
			Xe        	3.6693e-08
			CO        	2.6591e-08
			SO2       	8.5314e-09
			Cl2       	3.2857e-10
		}
	}

	Aurora
	{
		Height         827.79
		NorthLat       87.963
		NorthLon       -156.02
		NorthRadius    19706
		NorthWidth     11883
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 72.972
		NorthMoveSpeed 1.1688
		NorthParticles 10000
		SouthLat       -87.362
		SouthLon       24.386
		SouthRadius    16777
		SouthWidth     8172.4
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 69.279
		SouthMoveSpeed 0.87931
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.332189444
		SemiMajorAxis   0.526378803
		Eccentricity    0.043991271
		Inclination     -1.40405711
		AscendingNode   8.90047073
		ArgOfPericenter 176.40455
		MeanAnomaly     289.32519
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            7.5356e-08
	Radius          27.95
	InertiaMoment   0.39987
	Oblateness     (0.349, 0.573, 0.000)
	Obliquity       -0.0024689
	EqAscendNode    -34.478
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.800 0.778 0.740)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.34687
		Randomize      (-0.025, 0.801, -0.807)
		colorDistMagn   0.57006
		colorDistFreq   0.42835
		detailScale     128
		snowLevel       2
		tropicLatitude  0.024546
		icecapLatitude  2
		icecapHeight    0.45736
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42716
		heightTempGrad  0.625
		beachWidth      0.0011591
		tropicWidth     0.07
		mainFreq        0.49776
		venusFreq       0.55756
		venusMagn       0.71704
		mareDensity     0
		terraceProb     0.4262
		erosion         0
		montesMagn      0.30647
		montesFreq      3.1162
		montesSpiky     0.98444
		montesFraction  0.7333
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9485
		hillsFraction   0.6134
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2021
		craterFreq      0.22192
		craterDensity   0.96238
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54892
		volcanoTemp     1134.1
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
		PeriodDays      0.240039352
		SemiMajorAxisKm 129725.924
		Eccentricity    6.96735225e-05
		Inclination     -0.00246890325
		AscendingNode   -34.4780964
		ArgOfPericenter -129.952309
		MeanAnomaly     -168.369027
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.0275e-07
	Radius          32.8
	InertiaMoment   0.39837
	Oblateness     (0.347, 0.547, 0.000)
	Obliquity       -0.0031438
	EqAscendNode    13.893
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.625 0.522 0.478)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91594
		Randomize      (0.245, 0.631, -0.474)
		colorDistMagn   0.584
		colorDistFreq   0.068134
		detailScale     128
		snowLevel       2
		tropicLatitude  0.024557
		icecapLatitude  2
		icecapHeight    0.84003
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32487
		heightTempGrad  0.625
		beachWidth      0.00090698
		tropicWidth     0.07
		mainFreq        0.30222
		venusFreq       0.57689
		venusMagn       0.71096
		mareDensity     0
		terraceProb     0.15745
		erosion         0
		montesMagn      0.48953
		montesFreq      2.3813
		montesSpiky     0.95099
		montesFraction  0.90239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.425
		hillsFraction   0.71865
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24516
		craterFreq      0.16926
		craterDensity   0.78913
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45537
		volcanoTemp     1281.9
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
		PeriodDays      0.286152322
		SemiMajorAxisKm 145848.956
		Eccentricity    1.25053968e-05
		Inclination     -0.00314379077
		AscendingNode   13.8925156
		ArgOfPericenter 100.549728
		MeanAnomaly     -75.5023952
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.4059e-07
	Radius          35.888
	InertiaMoment   0.3997
	Oblateness     (0.345, 0.497, 0.000)
	Obliquity       0.013317
	EqAscendNode    -167.03
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.785 0.719 0.680)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48501
		Randomize      (0.516, 0.461, -0.141)
		colorDistMagn   0.59784
		colorDistFreq   0.66442
		detailScale     128
		snowLevel       2
		tropicLatitude  0.024273
		icecapLatitude  2
		icecapHeight    0.70699
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22258
		heightTempGrad  0.625
		beachWidth      0.0012548
		tropicWidth     0.07
		mainFreq        0.56688
		venusFreq       0.59321
		venusMagn       0.70506
		mareDensity     0
		terraceProb     0.27813
		erosion         0
		montesMagn      0.62273
		montesFreq      3.158
		montesSpiky     0.91069
		montesFraction  0.32527
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5569
		hillsFraction   0.43637
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22138
		craterFreq      0.23445
		craterDensity   0.90279
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50452
		volcanoTemp     1129.6
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
		PeriodDays      0.358409008
		SemiMajorAxisKm 169469.319
		Eccentricity    7.04837356e-05
		Inclination     0.0133168436
		AscendingNode   -167.029261
		ArgOfPericenter 154.178283
		MeanAnomaly     104.609128
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.9323e-07
	Radius          39.766
	InertiaMoment   0.39813
	Oblateness     (0.341, 0.441, 0.000)
	Obliquity       0.0088333
	EqAscendNode    103.61
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.627 0.504 0.401)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.054077
		Randomize      (0.786, 0.291, 0.192)
		colorDistMagn   0.61161
		colorDistFreq   1.3191
		detailScale     128
		snowLevel       2
		tropicLatitude  0.024351
		icecapLatitude  2
		icecapHeight    0.63491
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12029
		heightTempGrad  0.625
		beachWidth      0.0010027
		tropicWidth     0.07
		mainFreq        0.40372
		venusFreq       0.60881
		venusMagn       0.69931
		mareDensity     0
		terraceProb     0.44338
		erosion         0
		montesMagn      0.46041
		montesFreq      2.46
		montesSpiky     0.84432
		montesFraction  0.42819
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1887
		hillsFraction   0.59707
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25341
		craterFreq      0.19075
		craterDensity   1.0219
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56025
		volcanoTemp     1177.3
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
		PeriodDays      0.43034599
		SemiMajorAxisKm 191447.771
		Eccentricity    7.01689256e-05
		Inclination     0.00883331219
		AscendingNode   103.613294
		ArgOfPericenter -107.981972
		MeanAnomaly     3.92359804
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.6708e-07
	Radius          43.873
	InertiaMoment   0.39954
	Oblateness     (0.338, 0.385, 0.000)
	Obliquity       -0.0047867
	EqAscendNode    -143.13
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.776 0.700 0.613)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.62314
		Randomize      (-0.944, 0.121, 0.525)
		colorDistMagn   0.62531
		colorDistFreq   0.92943
		detailScale     128
		snowLevel       2
		tropicLatitude  0.024585
		icecapLatitude  2
		icecapHeight    0.57149
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.418
		heightTempGrad  0.625
		beachWidth      0.0010505
		tropicWidth     0.07
		mainFreq        0.64574
		venusFreq       0.62535
		venusMagn       0.69369
		mareDensity     0
		terraceProb     0.16623
		erosion         0
		montesMagn      0.57652
		montesFreq      3.2009
		montesSpiky     0.98329
		montesFraction  0.50547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.3226
		hillsFraction   0.70042
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23081
		craterFreq      0.24802
		craterDensity   0.84426
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46402
		volcanoTemp     1325.1
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
		PeriodDays      0.49708205
		SemiMajorAxisKm 210761.135
		Eccentricity    1.35048074e-06
		Inclination     -0.00478669391
		AscendingNode   -143.128465
		ArgOfPericenter -159.505168
		MeanAnomaly     -23.1027377
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.7171e-07
	Radius          47.219
	InertiaMoment   0.39786
	Oblateness     (0.004, 0.000, 0.000)
	Obliquity       180.92
	EqAscendNode    -112.32
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.524 0.487 0.428)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19221
		Randomize      (-0.673, -0.049, 0.858)
		colorDistMagn   0.63896
		colorDistFreq   1.7361
		detailScale     128
		snowLevel       2
		tropicLatitude  0.0089989
		icecapLatitude  2
		icecapHeight    0.50119
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3157
		heightTempGrad  0.625
		beachWidth      0.0007984
		tropicWidth     0.07
		mainFreq        0.47803
		venusFreq       0.64536
		venusMagn       0.68817
		mareDensity     0
		terraceProb     0.28753
		erosion         0
		montesMagn      0.42738
		montesFreq      2.5272
		montesSpiky     0.9497
		montesFraction  0.57643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.5281
		hillsFraction   0.32424
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26514
		craterFreq      0.2058
		craterDensity   0.94288
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51084
		volcanoTemp     1072.8
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
		PeriodDays      5.85992566
		SemiMajorAxisKm 1091691.37
		Eccentricity    0.352815631
		Inclination     180.919543
		AscendingNode   -112.319233
		ArgOfPericenter 6.4204494
		MeanAnomaly     -6.78728079
	}
}

DwarfMoon	"2.D7"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            5.2166e-07
	Radius          55.855
	InertiaMoment   0.39937
	Oblateness     (0.001, 0.000, 0.000)
	Obliquity       152.78
	EqAscendNode    -151.37
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.659 0.656 0.655)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.76128
		Randomize      (-0.403, -0.219, -0.809)
		colorDistMagn   0.65256
		colorDistFreq   1.3998
		detailScale     256
		snowLevel       2
		tropicLatitude  0.47877
		icecapLatitude  2
		icecapHeight    0.38349
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21341
		heightTempGrad  0.625
		beachWidth      0.00084625
		tropicWidth     0.07
		mainFreq        0.257
		venusFreq       0.67852
		venusMagn       0.68274
		mareDensity     0
		terraceProb     0.46257
		erosion         0
		montesMagn      0.54281
		montesFreq      3.2454
		montesSpiky     0.90898
		montesFraction  0.651
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.9865
		hillsFraction   0.58002
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23848
		craterFreq      0.26481
		craterDensity   0.74947
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.576
		volcanoTemp     1120.5
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
		PeriodDays      6.16829783
		SemiMajorAxisKm 1129662.46
		Eccentricity    0.235694957
		Inclination     152.782882
		AscendingNode   -151.366957
		ArgOfPericenter 167.02205
		MeanAnomaly     -79.4066043
	}
}

DwarfMoon	"2.D8"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            7.3946e-07
	Radius          63.188
	InertiaMoment   0.39754
	Obliquity       172.32
	EqAscendNode    -112.88
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.442 0.437 0.435)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33035
		Randomize      (-0.132, -0.389, -0.476)
		colorDistMagn   0.66612
		colorDistFreq   2.9256
		detailScale     256
		snowLevel       2
		tropicLatitude  0.15758
		icecapLatitude  2
		icecapHeight    0.75355
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11112
		heightTempGrad  0.625
		beachWidth      0.0008941
		tropicWidth     0.07
		mainFreq        0.54671
		venusFreq       0.52462
		venusMagn       0.67738
		mareDensity     0
		terraceProb     0.17495
		erosion         0
		montesMagn      0.38331
		montesFreq      2.5868
		montesSpiky     0.84039
		montesFraction  0.74393
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.8492
		hillsFraction   0.68334
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20586
		craterFreq      0.21877
		craterDensity   0.88578
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4717
		volcanoTemp     1268.3
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
		PeriodDays      6.72769555
		SemiMajorAxisKm 1196968.43
		Eccentricity    0.173597484
		Inclination     172.323539
		AscendingNode   -112.877764
		ArgOfPericenter -21.9728929
		MeanAnomaly     -174.709149
	}
}

DwarfMoon	"2.D9"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.0609e-06
	Radius          70.016
	InertiaMoment   0.39919
	Obliquity       206.34
	EqAscendNode    -175.81
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.623 0.619 0.616)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.89941
		Randomize      (0.138, -0.559, -0.143)
		colorDistMagn   0.67966
		colorDistFreq   2.0226
		detailScale     256
		snowLevel       2
		tropicLatitude  0.42183
		icecapLatitude  2
		icecapHeight    0.66724
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40883
		heightTempGrad  0.625
		beachWidth      0.001242
		tropicWidth     0.07
		mainFreq        0.37921
		venusFreq       0.55607
		venusMagn       0.67206
		mareDensity     0
		terraceProb     0.29712
		erosion         0
		montesMagn      0.51344
		montesFreq      3.2919
		montesSpiky     0.98213
		montesFraction  0.94047
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.9725
		hillsFraction   0.84502
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24594
		craterFreq      0.16088
		craterDensity   0.99185
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51734
		volcanoTemp     1116
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
		PeriodDays      7.5505123
		SemiMajorAxisKm 1292675.21
		Eccentricity    0.413032167
		Inclination     206.336697
		AscendingNode   -175.811814
		ArgOfPericenter 30.4515807
		MeanAnomaly     -155.031504
	}
}

DwarfMoon	"2.D10"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.544e-06
	Radius          78.959
	InertiaMoment   0.39715
	RotationPeriod  101.1
	Obliquity       219.47
	EqAscendNode    -7.8681

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.405 0.401 0.396)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46848
		Randomize      (0.408, -0.728, 0.190)
		colorDistMagn   0.69319
		colorDistFreq   4.3165
		detailScale     256
		snowLevel       2
		tropicLatitude  0.61681
		icecapLatitude  2
		icecapHeight    0.60187
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30654
		heightTempGrad  0.625
		beachWidth      0.00098981
		tropicWidth     0.07
		mainFreq        0.62114
		venusFreq       0.57574
		venusMagn       0.66678
		mareDensity     0
		terraceProb     0.48454
		erosion         0
		montesMagn      0.26507
		montesFreq      2.641
		montesSpiky     0.94841
		montesFraction  0.33765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       17.11
		hillsFraction   0.56182
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2225
		craterFreq      0.23125
		craterDensity   0.82311
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.60929
		volcanoTemp     1263.8
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
		PeriodDays      8.42485991
		SemiMajorAxisKm 1390636.42
		Eccentricity    0.315667951
		Inclination     219.470246
		AscendingNode   -7.86813081
		ArgOfPericenter 140.787656
		MeanAnomaly     -175.456076
	}
}

DwarfMoon	"2.D11"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.2863e-06
	Radius          89.132
	InertiaMoment   0.39901
	Obliquity       -49.637
	EqAscendNode    145.26
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.588 0.583 0.576)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.03755
		Randomize      (0.679, -0.898, 0.523)
		colorDistMagn   0.70671
		colorDistFreq   2.9666
		detailScale     256
		snowLevel       2
		tropicLatitude  0.77742
		icecapLatitude  2
		icecapHeight    0.53692
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20424
		heightTempGrad  0.625
		beachWidth      0.0013377
		tropicWidth     0.07
		mainFreq        0.45787
		venusFreq       0.59216
		venusMagn       0.66152
		mareDensity     0
		terraceProb     0.18362
		erosion         0
		montesMagn      0.48522
		montesFreq      3.3411
		montesSpiky     0.90725
		montesFraction  0.43629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.58
		hillsFraction   0.667
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25436
		craterFreq      0.23122
		craterDensity   0.9249
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47877
		volcanoTemp     1211.5
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
		PeriodDays      9.10633189
		SemiMajorAxisKm 1464650.9
		Eccentricity    0.36916751
		Inclination     -49.6370438
		AscendingNode   145.264915
		ArgOfPericenter -119.828774
		MeanAnomaly     -72.8174373
	}
}

DwarfMoon	"2.D12"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.4574e-06
	Radius          105
	InertiaMoment   0.3966
	Obliquity       -51.225
	EqAscendNode    179.45
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.764 0.762 0.762)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60662
		Randomize      (0.949, 0.932, 0.856)
		colorDistMagn   0.72024
		colorDistFreq   7.2272
		detailScale     512
		snowLevel       2
		tropicLatitude  0.79455
		icecapLatitude  2
		icecapHeight    0.45309
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10195
		heightTempGrad  0.625
		beachWidth      0.0010855
		tropicWidth     0.07
		mainFreq        0.72321
		venusFreq       0.60776
		venusMagn       0.65626
		mareDensity     0
		terraceProb     0.30694
		erosion         0
		montesMagn      0.61411
		montesFreq      2.6913
		montesSpiky     0.83619
		montesFraction  0.51243
		dunesFraction   0
		hillsMagn       0
		hillsFreq       24.53
		hillsFraction   0.80144
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23163
		craterFreq      0.42108
		craterDensity   1.0972
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52415
		volcanoTemp     1059.2
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
		PeriodDays      9.60861467
		SemiMajorAxisKm 1518025.24
		Eccentricity    0.440696765
		Inclination     -51.225206
		AscendingNode   179.448176
		ArgOfPericenter -131.099067
		MeanAnomaly     99.549135
	}
}

DwarfMoon	"2.D13"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            5.3651e-06
	Radius          120.76
	InertiaMoment   0.39882
	Obliquity       155.61
	EqAscendNode    -22.706
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.547 0.543 0.541)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.17568
		Randomize      (-0.780, 0.762, -0.811)
		colorDistMagn   0.73378
		colorDistFreq   4.8034
		detailScale     512
		snowLevel       2
		tropicLatitude  0.43492
		icecapLatitude  2
		icecapHeight    0.8298
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39966
		heightTempGrad  0.625
		beachWidth      0.0017334
		tropicWidth     0.07
		mainFreq        0.52697
		venusFreq       0.62418
		venusMagn       0.65099
		mareDensity     0
		terraceProb     0.5106
		erosion         0
		montesMagn      0.45574
		montesFreq      3.3938
		montesSpiky     0.98098
		montesFraction  0.58332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.372
		hillsFraction   0.54188
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26688
		craterFreq      0.46088
		craterDensity   0.86835
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40969
		volcanoTemp     1107
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
		PeriodDays      10.4384148
		SemiMajorAxisKm 1604211.07
		Eccentricity    0.109047694
		Inclination     155.608087
		AscendingNode   -22.7056333
		ArgOfPericenter 28.183777
		MeanAnomaly     -129.308059
	}
}

DwarfMoon	"2.D14"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.6422e-11
	Radius          1.7444
	InertiaMoment   0.39549
	Obliquity       145.02
	EqAscendNode    105.91
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.728 0.725 0.723)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.74475
		Randomize      (-0.510, 0.592, -0.478)
		colorDistMagn   0.74734
		colorDistFreq   0.0018891
		detailScale     8
		snowLevel       2
		tropicLatitude  0.5929
		icecapLatitude  2
		icecapHeight    0.70366
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29737
		heightTempGrad  0.625
		beachWidth      0.00058123
		tropicWidth     0.07
		mainFreq        0.35191
		venusFreq       0.64383
		venusMagn       0.64569
		mareDensity     0
		terraceProb     0.19226
		erosion         0
		montesMagn      0.5709
		montesFreq      2.7386
		montesSpiky     0.94711
		montesFraction  0.65882
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.010662
		hillsFraction   0.65109
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23923
		craterFreq      0.26004
		craterDensity   0.96845
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48543
		volcanoTemp     1054.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.57
		BumpOffset      0.78498
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
		PeriodDays      11.0531681
		SemiMajorAxisKm 1666593.4
		Eccentricity    0.0363119092
		Inclination     145.024536
		AscendingNode   105.909763
		ArgOfPericenter 70.9822799
		MeanAnomaly     53.934946
	}
}

DwarfMoon	"2.D15"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.2125e-11
	Radius          2.1723
	InertiaMoment   0.39862
	RotationPeriod  93.067
	Obliquity       147.77
	EqAscendNode    144.05

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.512 0.506 0.501)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.31382
		Randomize      (-0.240, 0.422, -0.145)
		colorDistMagn   0.76094
		colorDistFreq   0.0013088
		detailScale     8
		snowLevel       2
		tropicLatitude  0.55359
		icecapLatitude  2
		icecapHeight    0.63234
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19508
		heightTempGrad  0.625
		beachWidth      0.00092909
		tropicWidth     0.07
		mainFreq        0.59845
		venusFreq       0.67516
		venusMagn       0.64036
		mareDensity     0
		terraceProb     0.31703
		erosion         0
		montesMagn      0.42169
		montesFreq      3.4513
		montesSpiky     0.90549
		montesFraction  0.75514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012854
		hillsFraction   0.77123
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20869
		craterFreq      0.21559
		craterDensity   0.79777
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53145
		volcanoTemp     1202.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.955
		BumpOffset      0.97752
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
		PeriodDays      11.6333284
		SemiMajorAxisKm 1724412.38
		Eccentricity    0.465042525
		Inclination     147.773798
		AscendingNode   144.049964
		ArgOfPericenter 43.8382183
		MeanAnomaly     91.1526825
	}
}

DwarfMoon	"2.D16"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            5.7867e-11
	Radius          2.6266
	InertiaMoment   0.3999
	Obliquity       156.57
	EqAscendNode    145.56
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.692 0.688 0.684)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.88289
		Randomize      (0.031, 0.252, 0.188)
		colorDistMagn   0.77459
		colorDistFreq   0.0040534
		detailScale     8
		snowLevel       2
		tropicLatitude  0.41976
		icecapLatitude  2
		icecapHeight    0.56893
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49278
		heightTempGrad  0.625
		beachWidth      0.00097694
		tropicWidth     0.07
		mainFreq        0.43701
		venusFreq       0.52123
		venusMagn       0.63497
		mareDensity     0
		terraceProb     0.54336
		erosion         0
		montesMagn      0.53816
		montesFreq      2.7838
		montesSpiky     0.83168
		montesFraction  0.12648
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016901
		hillsFraction   0.5192
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24672
		craterFreq      0.14877
		craterDensity   0.9077
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43148
		volcanoTemp     1150.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3639
		BumpOffset      1.182
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
		PeriodDays      11.9769804
		SemiMajorAxisKm 1758207.11
		Eccentricity    0.0518418053
		Inclination     156.568488
		AscendingNode   145.564713
		ArgOfPericenter -98.4520838
		MeanAnomaly     -11.1970343
	}
}

DwarfMoon	"2.D17"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            9.8224e-11
	Radius          2.9558
	InertiaMoment   0.39841
	Obliquity       163.77
	EqAscendNode    36.007
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.475 0.471 0.462)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.45196
		Randomize      (0.301, 0.082, 0.521)
		colorDistMagn   0.78829
		colorDistFreq   0.0018333
		detailScale     8
		snowLevel       2
		tropicLatitude  0.3026
		icecapLatitude  2
		icecapHeight    0.49795
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39049
		heightTempGrad  0.625
		beachWidth      0.0013248
		tropicWidth     0.07
		mainFreq        0.68817
		venusFreq       0.55453
		venusMagn       0.6295
		mareDensity     0
		terraceProb     0.20089
		erosion         0
		montesMagn      0.3744
		montesFreq      3.5155
		montesSpiky     0.97982
		montesFraction  0.34926
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019308
		hillsFraction   0.63535
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22357
		craterFreq      0.22808
		craterDensity   1.0329
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49184
		volcanoTemp     997.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.6602
		BumpOffset      1.3301
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
		PeriodDays      12.4280254
		SemiMajorAxisKm 1802076.52
		Eccentricity    0.37331209
		Inclination     163.77447
		AscendingNode   36.0067888
		ArgOfPericenter 66.5640999
		MeanAnomaly     45.0924207
	}
}

DwarfMoon	"2.D18"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.5942e-10
	Radius          3.764
	InertiaMoment   0.39973
	RotationPeriod  213.82
	Obliquity       162.39
	EqAscendNode    109.28

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.652 0.649 0.648)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.021023
		Randomize      (0.571, -0.088, 0.854)
		colorDistMagn   0.80206
		colorDistFreq   0.0078627
		detailScale     16
		snowLevel       2
		tropicLatitude  0.32548
		icecapLatitude  2
		icecapHeight    0.3748
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2882
		heightTempGrad  0.625
		beachWidth      0.0010727
		tropicWidth     0.07
		mainFreq        0.50741
		venusFreq       0.57457
		venusMagn       0.62395
		mareDensity     0
		terraceProb     0.32743
		erosion         0
		montesMagn      0.50914
		montesFreq      2.8272
		montesSpiky     0.9458
		montesFraction  0.44421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.027272
		hillsFraction   0.74699
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25534
		craterFreq      0.18131
		craterDensity   0.8499
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53949
		volcanoTemp     1145.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.3876
		BumpOffset      1.6938
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
		PeriodDays      13.3640311
		SemiMajorAxisKm 1891458.4
		Eccentricity    0.0653075032
		Inclination     162.393512
		AscendingNode   109.279952
		ArgOfPericenter -25.0006837
		MeanAnomaly     -62.350178
	}
}

DwarfMoon	"2.D19"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.499e-10
	Radius          4.3316
	InertiaMoment   0.39817
	Obliquity       209.06
	EqAscendNode    121.2
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.434 0.430 0.428)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.59009
		Randomize      (0.842, -0.258, -0.813)
		colorDistMagn   0.8159
		colorDistFreq   0.0018873
		detailScale     16
		snowLevel       2
		tropicLatitude  0.4644
		icecapLatitude  2
		icecapHeight    0.74906
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18591
		heightTempGrad  0.625
		beachWidth      0.00082051
		tropicWidth     0.07
		mainFreq        0.32027
		venusFreq       0.59112
		venusMagn       0.61827
		mareDensity     0
		terraceProb     0.58928
		erosion         0
		montesMagn      0.68554
		montesFreq      3.5896
		montesSpiky     0.9037
		montesFraction  0.51934
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.06226
		hillsFraction   0.49191
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23243
		craterFreq      0.24095
		craterDensity   0.94832
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44487
		volcanoTemp     1093.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.8984
		BumpOffset      1.9492
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
		PeriodDays      13.817786
		SemiMajorAxisKm 1934034.05
		Eccentricity    0.181423946
		Inclination     209.057682
		AscendingNode   121.200959
		ArgOfPericenter -18.8940867
		MeanAnomaly     -88.9177536
	}
}

DwarfMoon	"2.D20"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.8101e-10
	Radius          4.9428
	InertiaMoment   0.39957
	RotationPeriod  116.92
	Obliquity       138.1
	EqAscendNode    -33.149

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.616 0.612 0.609)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15916
		Randomize      (-0.888, -0.428, -0.480)
		colorDistMagn   0.82984
		colorDistFreq   0.012766
		detailScale     16
		snowLevel       2
		tropicLatitude  0.68569
		icecapLatitude  2
		icecapHeight    0.66444
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48362
		heightTempGrad  0.625
		beachWidth      0.00086836
		tropicWidth     0.07
		mainFreq        0.57707
		venusFreq       0.60672
		venusMagn       0.61246
		mareDensity     0
		terraceProb     0.20952
		erosion         0
		montesMagn      0.48088
		montesFreq      2.8693
		montesSpiky     0.8268
		montesFraction  0.59025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.066077
		hillsFraction   0.61954
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26884
		craterFreq      0.19861
		craterDensity   0.76321
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49813
		volcanoTemp     941.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.4485
		BumpOffset      2.2243
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
		PeriodDays      14.6155095
		SemiMajorAxisKm 2007772.25
		Eccentricity    0.481664867
		Inclination     138.097942
		AscendingNode   -33.1493677
		ArgOfPericenter -157.892417
		MeanAnomaly     53.7890372
	}
}

DwarfMoon	"2.D21"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            5.6798e-10
	Radius          5.6279
	InertiaMoment   0.39791
	RotationPeriod  123.65
	Obliquity       190.75
	EqAscendNode    -21.411

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.796 0.794 0.791)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.72823
		Randomize      (-0.617, -0.598, -0.147)
		colorDistMagn   0.84387
		colorDistFreq   0.026839
		detailScale     16
		snowLevel       2
		tropicLatitude  0.16272
		icecapLatitude  2
		icecapHeight    0.59936
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38132
		heightTempGrad  0.625
		beachWidth      0.00091622
		tropicWidth     0.07
		mainFreq        0.41507
		venusFreq       0.62303
		venusMagn       0.60649
		mareDensity     0
		terraceProb     0.33818
		erosion         0
		montesMagn      0.60625
		montesFreq      3.6795
		montesSpiky     0.97866
		montesFraction  0.66681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.077133
		hillsFraction   0.72608
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23997
		craterFreq      0.2557
		craterDensity   0.89072
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5487
		volcanoTemp     1188.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.0651
		BumpOffset      2.5325
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
		PeriodDays      15.4560666
		SemiMajorAxisKm 2084032.38
		Eccentricity    0.487220312
		Inclination     190.749479
		AscendingNode   -21.4109981
		ArgOfPericenter 55.2574664
		MeanAnomaly     -136.591418
	}
}

DwarfMoon	"2.D22"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            8.3121e-10
	Radius          6.0799
	InertiaMoment   0.3994
	RotationPeriod  189.63
	Obliquity       198.56
	EqAscendNode    51.61

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.580 0.576 0.569)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.29729
		Randomize      (-0.347, -0.768, 0.186)
		colorDistMagn   0.85802
		colorDistFreq   0.018101
		detailScale     16
		snowLevel       2
		tropicLatitude  0.29521
		icecapLatitude  2
		icecapHeight    0.53414
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27903
		heightTempGrad  0.625
		beachWidth      0.00066407
		tropicWidth     0.07
		mainFreq        0.65883
		venusFreq       0.64233
		venusMagn       0.60032
		mareDensity     0
		terraceProb     0.67648
		erosion         0
		montesMagn      0.45096
		montesFreq      2.9105
		montesSpiky     0.94448
		montesFraction  0.76703
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.08114
		hillsFraction   0.45542
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21101
		craterFreq      0.21236
		craterDensity   0.9996
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45517
		volcanoTemp     1236.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.4719
		BumpOffset      2.736
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
		PeriodDays      15.8024397
		SemiMajorAxisKm 2115052.91
		Eccentricity    0.262296762
		Inclination     198.556237
		AscendingNode   51.6095014
		ArgOfPericenter 168.997823
		MeanAnomaly     30.2729031
	}
}

DwarfMoon	"2.D23"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.198e-09
	Radius          7.3795
	InertiaMoment   0.39761
	Obliquity       135.04
	EqAscendNode    133.91
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.759 0.754 0.752)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.86636
		Randomize      (-0.077, -0.938, 0.519)
		colorDistMagn   0.8723
		colorDistFreq   0.042969
		detailScale     32
		snowLevel       2
		tropicLatitude  0.72357
		icecapLatitude  2
		icecapHeight    0.44867
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17674
		heightTempGrad  0.625
		beachWidth      0.0010119
		tropicWidth     0.07
		mainFreq        0.48779
		venusFreq       0.67211
		venusMagn       0.59391
		mareDensity     0
		terraceProb     0.21816
		erosion         0
		montesMagn      0.5655
		montesFreq      3.7993
		montesSpiky     0.90187
		montesFraction  0.17587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10364
		hillsFraction   0.60341
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24751
		craterFreq      0.27616
		craterDensity   0.82954
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50438
		volcanoTemp     1184.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.6416
		BumpOffset      3.3208
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
		PeriodDays      16.3548124
		SemiMajorAxisKm 2164057.78
		Eccentricity    0.00893524766
		Inclination     135.037186
		AscendingNode   133.907231
		ArgOfPericenter 160.096259
		MeanAnomaly     178.245058
	}
}

DwarfMoon	"2.D24"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.7047e-09
	Radius          8.2702
	InertiaMoment   0.39923
	Obliquity       49.144
	EqAscendNode    27.536
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.540 0.536 0.534)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43543
		Randomize      (0.194, 0.892, 0.852)
		colorDistMagn   0.88672
		colorDistFreq   0.031176
		detailScale     32
		snowLevel       2
		tropicLatitude  0.74031
		icecapLatitude  2
		icecapHeight    0.82067
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47445
		heightTempGrad  0.625
		beachWidth      0.00075978
		tropicWidth     0.07
		mainFreq        0.28113
		venusFreq       0.51744
		venusMagn       0.58722
		mareDensity     0
		terraceProb     0.34935
		erosion         0
		montesMagn      0.41574
		montesFreq      2.9512
		montesSpiky     0.82146
		montesFraction  0.36024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.22016
		hillsFraction   0.70726
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22459
		craterFreq      0.22494
		craterDensity   0.92999
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55997
		volcanoTemp     1132.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.4431
		BumpOffset      3.7216
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
		PeriodDays      16.7938936
		SemiMajorAxisKm 2202619.13
		Eccentricity    0.185755244
		Inclination     49.1444707
		AscendingNode   27.5362805
		ArgOfPericenter -101.366478
		MeanAnomaly     72.3143561
	}
}

DwarfMoon	"2.D25"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.4e-09
	Radius          9.2202
	InertiaMoment   0.39723
	RotationPeriod  226.52
	Obliquity       154.25
	EqAscendNode    -20.877

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.720 0.718 0.716)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0044953
		Randomize      (0.464, 0.723, -0.815)
		colorDistMagn   0.9013
		colorDistFreq   0.063042
		detailScale     32
		snowLevel       2
		tropicLatitude  0.45621
		icecapLatitude  2
		icecapHeight    0.7004
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37216
		heightTempGrad  0.625
		beachWidth      0.0011076
		tropicWidth     0.07
		mainFreq        0.55658
		venusFreq       0.55294
		venusMagn       0.58018
		mareDensity     0
		terraceProb     0.10488
		erosion         0
		montesMagn      0.5336
		montesFreq      3.999
		montesSpiky     0.97749
		montesFraction  0.45197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.22832
		hillsFraction   0.39052
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25636
		craterFreq      0.17567
		craterDensity   0.69034
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46384
		volcanoTemp     1279.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.2982
		BumpOffset      4.1491
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
		PeriodDays      18.8768806
		SemiMajorAxisKm 2381178.55
		Eccentricity    0.241985019
		Inclination     154.24504
		AscendingNode   -20.8768973
		ArgOfPericenter -5.3711326
		MeanAnomaly     47.5780596
	}
}

DwarfMoon	"2.D26"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.3491e-09
	Radius          10.196
	InertiaMoment   0.39905
	Obliquity       203.67
	EqAscendNode    -32.147
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.504 0.500 0.495)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.57356
		Randomize      (0.735, 0.553, -0.482)
		colorDistMagn   0.91605
		colorDistFreq   0.04368
		detailScale     32
		snowLevel       2
		tropicLatitude  0.37914
		icecapLatitude  2
		icecapHeight    0.62977
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26986
		heightTempGrad  0.625
		beachWidth      0.00085549
		tropicWidth     0.07
		mainFreq        0.39157
		venusFreq       0.57339
		venusMagn       0.57273
		mareDensity     0
		terraceProb     0.22684
		erosion         0
		montesMagn      0.36436
		montesFreq      2.9915
		montesSpiky     0.94315
		montesFraction  0.52622
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.25166
		hillsFraction   0.58668
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23322
		craterFreq      0.2376
		craterDensity   0.87347
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5107
		volcanoTemp     1027.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.1763
		BumpOffset      4.5882
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
		PeriodDays      19.6251714
		SemiMajorAxisKm 2443697.51
		Eccentricity    0.202167309
		Inclination     203.666411
		AscendingNode   -32.1473307
		ArgOfPericenter -21.614867
		MeanAnomaly     89.4170129
	}
}

DwarfMoon	"2.D27"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            4.6392e-09
	Radius          10.92
	InertiaMoment   0.39672
	RotationPeriod  324.12
	Obliquity       201.81
	EqAscendNode    -47.265

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.684 0.681 0.677)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.14263
		Randomize      (-0.995, 0.383, -0.149)
		colorDistMagn   0.93099
		colorDistFreq   0.08351
		detailScale     32
		snowLevel       2
		tropicLatitude  0.34903
		icecapLatitude  2
		icecapHeight    0.56635
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16757
		heightTempGrad  0.625
		beachWidth      0.00090334
		tropicWidth     0.07
		mainFreq        0.63299
		venusFreq       0.59007
		venusMagn       0.56476
		mareDensity     0
		terraceProb     0.361
		erosion         0
		montesMagn      0.50485
		montesFreq      1.8227
		montesSpiky     0.90002
		montesFraction  0.59723
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.25997
		hillsFraction   0.68979
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27112
		craterFreq      0.19473
		craterDensity   0.97479
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57557
		volcanoTemp     1075.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.8283
		BumpOffset      4.9142
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
		PeriodDays      20.2574533
		SemiMajorAxisKm 2495906.85
		Eccentricity    0.164663549
		Inclination     201.813815
		AscendingNode   -47.2647545
		ArgOfPericenter 21.1180518
		MeanAnomaly     39.4503514
	}
}

DwarfMoon	"2.D28"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            6.3877e-09
	Radius          12.869
	InertiaMoment   0.39886
	Obliquity       210.95
	EqAscendNode    -174.32
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.468 0.459 0.456)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.7117
		Randomize      (-0.725, 0.213, 0.184)
		colorDistMagn   0.94614
		colorDistFreq   0.063226
		detailScale     32
		snowLevel       2
		tropicLatitude  0.49333
		icecapLatitude  2
		icecapHeight    0.49465
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46528
		heightTempGrad  0.625
		beachWidth      0.0009512
		tropicWidth     0.07
		mainFreq        0.46788
		venusFreq       0.60568
		venusMagn       0.55613
		mareDensity     0
		terraceProb     0.11443
		erosion         0
		montesMagn      0.66562
		montesFreq      3.0317
		montesSpiky     0.81557
		montesFraction  0.67499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.31145
		hillsFraction   0.87064
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24072
		craterFreq      0.25167
		craterDensity   0.80571
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47154
		volcanoTemp     1023.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.583
		BumpOffset      5.7913
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
		PeriodDays      20.9870308
		SemiMajorAxisKm 2555479.93
		Eccentricity    0.0670727999
		Inclination     210.946282
		AscendingNode   -174.321677
		ArgOfPericenter 25.4378591
		MeanAnomaly     175.273318
	}
}

DwarfMoon	"2.D29"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            8.7523e-09
	Radius          14.243
	InertiaMoment   0.3958
	Obliquity       181.75
	EqAscendNode    79.911
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.648 0.641 0.638)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28077
		Randomize      (-0.454, 0.043, 0.517)
		colorDistMagn   0.96152
		colorDistFreq   0.13447
		detailScale     64
		snowLevel       2
		tropicLatitude  0.0074294
		icecapLatitude  2
		icecapHeight    0.36515
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36299
		heightTempGrad  0.625
		beachWidth      0.00069905
		tropicWidth     0.07
		mainFreq        0.7439
		venusFreq       0.62188
		venusMagn       0.54664
		mareDensity     0
		terraceProb     0.23557
		erosion         0
		montesMagn      0.4765
		montesFreq      2.1325
		montesSpiky     0.97633
		montesFraction  0.77975
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.63866
		hillsFraction   0.56898
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21299
		craterFreq      0.20906
		craterDensity   0.91262
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5172
		volcanoTemp     1070.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.819
		BumpOffset      6.4095
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
		PeriodDays      22.1786581
		SemiMajorAxisKm 2651319.01
		Eccentricity    0.250385011
		Inclination     181.753247
		AscendingNode   79.9109568
		ArgOfPericenter -77.2321912
		MeanAnomaly     -9.66663896
	}
}

DwarfMoon	"2.D30"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.1947e-08
	Radius          15.66
	InertiaMoment   0.39866
	Obliquity       227.95
	EqAscendNode    128.09
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.427 0.424 0.421)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84983
		Randomize      (-0.184, -0.127, 0.850)
		colorDistMagn   0.97716
		colorDistFreq   0.083122
		detailScale     64
		snowLevel       2
		tropicLatitude  0.72608
		icecapLatitude  2
		icecapHeight    0.74472
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2607
		heightTempGrad  0.625
		beachWidth      0.00074691
		tropicWidth     0.07
		mainFreq        0.53666
		venusFreq       0.64087
		venusMagn       0.53601
		mareDensity     0
		terraceProb     0.37323
		erosion         0
		montesMagn      0.59901
		montesFreq      3.0722
		montesSpiky     0.94181
		montesFraction  0.20941
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.65416
		hillsFraction   0.67321
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24832
		craterFreq      0.26996
		craterDensity   1.0458
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.60785
		volcanoTemp     1018.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.094
		BumpOffset      7.0472
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
		PeriodDays      22.9598254
		SemiMajorAxisKm 2713214.91
		Eccentricity    0.00118682301
		Inclination     227.945614
		AscendingNode   128.086794
		ArgOfPericenter 35.2557948
		MeanAnomaly     -124.480515
	}
}

DwarfMoon	"2.D31"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.6262e-08
	Radius          17.35
	InertiaMoment   0.39993
	RotationPeriod  376.75
	Obliquity       211.69
	EqAscendNode    -14.105

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.670 0.605 0.540)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4189
		Randomize      (0.086, -0.297, -0.817)
		colorDistMagn   0.99306
		colorDistFreq   0.18897
		detailScale     64
		snowLevel       2
		tropicLatitude  0.50453
		icecapLatitude  2
		icecapHeight    0.66167
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1584
		heightTempGrad  0.625
		beachWidth      0.00079476
		tropicWidth     0.07
		mainFreq        0.36579
		venusFreq       0.6693
		venusMagn       0.52376
		mareDensity     0
		terraceProb     0.12379
		erosion         0
		montesMagn      0.44608
		montesFreq      2.2748
		montesSpiky     0.89813
		montesFraction  0.37067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.72435
		hillsFraction   0.81582
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22557
		craterFreq      0.2218
		craterDensity   0.85538
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47862
		volcanoTemp     1166.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.615
		BumpOffset      7.8074
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
		PeriodDays      23.5467485
		SemiMajorAxisKm 2759258.81
		Eccentricity    0.139277541
		Inclination     211.686665
		AscendingNode   -14.1050886
		ArgOfPericenter -31.4937154
		MeanAnomaly     -67.6468281
	}
}

DwarfMoon	"2.D32"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.2092e-08
	Radius          19.022
	InertiaMoment   0.39845
	Obliquity       222.68
	EqAscendNode    140.55
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.829 0.793 0.744)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98797
		Randomize      (0.357, -0.467, -0.484)
		colorDistMagn   0.01996
		colorDistFreq   0.10454
		detailScale     64
		snowLevel       2
		tropicLatitude  0.65985
		icecapLatitude  2
		icecapHeight    0.59686
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45611
		heightTempGrad  0.625
		beachWidth      0.0011426
		tropicWidth     0.07
		mainFreq        0.60944
		venusFreq       0.5131
		venusMagn       0.50903
		mareDensity     0
		terraceProb     0.24437
		erosion         0
		montesMagn      0.56029
		montesFreq      3.1131
		montesSpiky     0.80895
		montesFraction  0.45959
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.78325
		hillsFraction   0.54979
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25742
		craterFreq      0.16898
		craterDensity   0.95391
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.524
		volcanoTemp     1014
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.12
		BumpOffset      8.5598
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
		PeriodDays      24.0528064
		SemiMajorAxisKm 2798652.51
		Eccentricity    0.267882754
		Inclination     222.67531
		AscendingNode   140.55347
		ArgOfPericenter -10.4924349
		MeanAnomaly     -150.344138
	}
}

DwarfMoon	"2.D33"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.9984e-08
	Radius          20.767
	InertiaMoment   0.39976
	Obliquity       198.3
	EqAscendNode    45.092
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.669 0.599 0.466)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.55704
		Randomize      (0.627, -0.637, -0.151)
		colorDistMagn   0.052586
		colorDistFreq   0.25629
		detailScale     64
		snowLevel       2
		tropicLatitude  0.2909
		icecapLatitude  2
		icecapHeight    0.53133
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35382
		heightTempGrad  0.625
		beachWidth      0.00089047
		tropicWidth     0.07
		mainFreq        0.4474
		venusFreq       0.55131
		venusMagn       0.49002
		mareDensity     0
		terraceProb     0.38614
		erosion         0
		montesMagn      0.40947
		montesFreq      2.3748
		montesSpiky     0.97516
		montesFraction  0.53307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.8007
		hillsFraction   0.65717
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23401
		craterFreq      0.23433
		craterDensity   0.77476
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40899
		volcanoTemp     1061.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.69
		BumpOffset      9.3452
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
		PeriodDays      25.9335736
		SemiMajorAxisKm 2942704.94
		Eccentricity    0.334106736
		Inclination     198.297416
		AscendingNode   45.0916441
		ArgOfPericenter 0.0484010484
		MeanAnomaly     -146.078266
	}
}

DwarfMoon	"2.D34"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            4.0687e-08
	Radius          23.837
	InertiaMoment   0.39822
	RotationPeriod  447.98
	Obliquity       165.18
	EqAscendNode    -174.36

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.816 0.724 0.681)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.1261
		Randomize      (0.898, -0.807, 0.182)
		colorDistMagn   0.082667
		colorDistFreq   0.12819
		detailScale     64
		snowLevel       2
		tropicLatitude  0.27906
		icecapLatitude  2
		icecapHeight    0.4441
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25153
		heightTempGrad  0.625
		beachWidth      0.00093833
		tropicWidth     0.07
		mainFreq        0.70453
		venusFreq       0.57219
		venusMagn       0.46157
		mareDensity     0
		terraceProb     0.13298
		erosion         0
		montesMagn      0.5291
		montesFreq      3.1549
		montesSpiky     0.94045
		montesFraction  0.60427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7568
		hillsFraction   0.78191
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27391
		craterFreq      0.19059
		craterDensity   0.89563
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48529
		volcanoTemp     1109.5
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
		PeriodDays      27.9989005
		SemiMajorAxisKm 3096937.63
		Eccentricity    0.0929896535
		Inclination     165.184695
		AscendingNode   -174.364253
		ArgOfPericenter 131.492653
		MeanAnomaly     -132.920054
	}
}

DwarfMoon	"2.D35"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            5.5252e-08
	Radius          26.17
	InertiaMoment   0.3996
	RotationPeriod  514.6
	Obliquity       202.75
	EqAscendNode    151.1

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.579 0.520 0.481)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.69517
		Randomize      (-0.832, -0.977, 0.515)
		colorDistMagn   0.11067
		colorDistFreq   0.38464
		detailScale     128
		snowLevel       2
		tropicLatitude  0.36423
		icecapLatitude  2
		icecapHeight    0.81239
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14924
		heightTempGrad  0.625
		beachWidth      0.00098618
		tropicWidth     0.07
		mainFreq        0.51704
		venusFreq       0.58901
		venusMagn       0.38099
		mareDensity     0
		terraceProb     0.25326
		erosion         0
		montesMagn      0.35273
		montesFreq      2.4546
		montesSpiky     0.8962
		montesFraction  0.68339
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8146
		hillsFraction   0.52833
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24146
		craterFreq      0.24789
		craterDensity   1.008
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53128
		volcanoTemp     957.22
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
		PeriodDays      32.1625169
		SemiMajorAxisKm 3396814.47
		Eccentricity    0.166975788
		Inclination     202.746033
		AscendingNode   151.096566
		ArgOfPericenter 162.745227
		MeanAnomaly     176.417295
	}
}

DwarfMoon	"2.D36"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            7.5148e-08
	Radius          28.845
	InertiaMoment   0.39796
	Obliquity       144.91
	EqAscendNode    1.4232
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.751 0.709 0.671)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.26424
		Randomize      (-0.562, 0.853, 0.848)
		colorDistMagn   0.13693
		colorDistFreq   0.10813
		detailScale     128
		snowLevel       2
		tropicLatitude  0.59453
		icecapLatitude  2
		icecapHeight    0.69719
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44694
		heightTempGrad  0.625
		beachWidth      0.001034
		tropicWidth     0.07
		mainFreq        0.33655
		venusFreq       0.60464
		venusMagn       0.86714
		mareDensity     0
		terraceProb     0.39988
		erosion         0
		montesMagn      0.50056
		montesFreq      3.1977
		montesSpiky     0.80138
		montesFraction  0.79346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9902
		hillsFraction   0.64139
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21474
		craterFreq      0.20567
		craterDensity   0.83569
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43113
		volcanoTemp     1005
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
		PeriodDays      33.5748317
		SemiMajorAxisKm 3495540.76
		Eccentricity    0.0615989624
		Inclination     144.908765
		AscendingNode   1.42324883
		ArgOfPericenter 9.04079368
		MeanAnomaly     -41.7486045
	}
}

DwarfMoon	"2.D37"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.0247e-07
	Radius          31.798
	InertiaMoment   0.39943
	Obliquity       164.61
	EqAscendNode    106.34
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.577 0.501 0.407)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83331
		Randomize      (-0.291, 0.683, -0.819)
		colorDistMagn   0.16172
		colorDistFreq   0.53508
		detailScale     128
		snowLevel       2
		tropicLatitude  0.2887
		icecapLatitude  2
		icecapHeight    0.62721
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34465
		heightTempGrad  0.625
		beachWidth      0.0010819
		tropicWidth     0.07
		mainFreq        0.58748
		venusFreq       0.62075
		venusMagn       0.83491
		mareDensity     0
		terraceProb     0.14204
		erosion         0
		montesMagn      0.6507
		montesFreq      2.5225
		montesSpiky     0.97398
		montesFraction  0.23544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1732
		hillsFraction   0.75581
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24913
		craterFreq      0.26462
		craterDensity   0.93516
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49171
		volcanoTemp     1152.7
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
		PeriodDays      35.6110821
		SemiMajorAxisKm 3635481.35
		Eccentricity    0.0450888417
		Inclination     164.608561
		AscendingNode   106.337508
		ArgOfPericenter 103.945958
		MeanAnomaly     -33.9065265
	}
}

DwarfMoon	"2.D38"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.4019e-07
	Radius          34.47
	InertiaMoment   0.39766
	Obliquity       201.42
	EqAscendNode    31.933
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.741 0.691 0.606)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.40237
		Randomize      (-0.021, 0.513, -0.486)
		colorDistMagn   0.18526
		colorDistFreq   1.0236
		detailScale     128
		snowLevel       2
		tropicLatitude  0.34257
		icecapLatitude  2
		icecapHeight    0.56377
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24236
		heightTempGrad  0.625
		beachWidth      0.00052975
		tropicWidth     0.07
		mainFreq        0.42605
		venusFreq       0.63945
		venusMagn       0.81455
		mareDensity     0
		terraceProb     0.26225
		erosion         0
		montesMagn      0.47207
		montesFreq      3.242
		montesSpiky     0.93909
		montesFraction  0.38063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1761
		hillsFraction   0.50314
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22652
		craterFreq      0.21865
		craterDensity   0.72203
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5393
		volcanoTemp     900.44
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
		PeriodDays      41.0756568
		SemiMajorAxisKm 3998479
		Eccentricity    0.0747674583
		Inclination     201.419359
		AscendingNode   31.9334909
		ArgOfPericenter 160.509831
		MeanAnomaly     178.885025
	}
}

Planet	"3"
{
	ParentBody     "Asim"
	Class          "Neptune"
	Mass            0.64518
	Radius          5911.2
	InertiaMoment   0.33347
	Oblateness      0.0072341
	RotationPeriod  18.169
	RotationEpoch   0
	Obliquity       24.247
	EqAscendNode    -83.706

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_warm_default.cfg"
		SurfStyle       0.70354
		Randomize      (-0.340, 0.169, -0.371)
		detailScale     256
		tropicLatitude  0.41047
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 1.0372
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7672
		stripeFluct     0.4995
		stripeTwist     1.9806
		cycloneMagn     2.482
		cycloneFreq     0.67498
		cycloneDensity  0.25127
		cycloneOctaves  4
		BumpHeight      20
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          75.112
		Velocity        165.22
		BumpHeight      5.4652
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.075241
		mainOctaves     10
		Coverage        0.34618
		stripeZones     1.7672
		stripeFluct     0.4995
		stripeTwist     1.9806
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          295.56
		Density         709.39
		Pressure        4397.2
		Greenhouse      1000
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.019757
		Saturation      0.93762

		Composition
		{
			H2O       	99.394
			CO2       	0.26839
			SO2       	0.16812
			N2        	0.16755
			CO        	0.0016863
		}
	}

	Aurora
	{
		Height         89.353
		NorthLat       61.678
		NorthLon       131.1
		NorthRadius    1552.5
		NorthWidth     437.69
		NorthRings     5
		NorthBright    0.3
		NorthFlashFreq 63.652
		NorthMoveSpeed 1.569
		NorthParticles 10000
		SouthLat       -46.831
		SouthLon       -11.96
		SouthRadius    1524.5
		SouthWidth     560.86
		SouthRings     4
		SouthBright    0.3
		SouthFlashFreq 74.134
		SouthMoveSpeed 0.81486
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
//		Period          0.698290527
		SemiMajorAxis   3.80418547
		Eccentricity    0.0684774666
		Inclination     -0.0490952424
		AscendingNode   -74.4937382
		ArgOfPericenter 191.814734
		MeanAnomaly     41.0506942
	}
}

DwarfMoon	"3.D1"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            4.3837e-06
	Radius          110.51
	InertiaMoment   0.39819
	Oblateness      0.10614
	Obliquity       0.010471
	EqAscendNode    144.22
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.687 0.685 0.682)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15767
		Randomize      (-0.111, -0.894, 0.759)
		colorDistMagn   0.78806
		colorDistFreq   4.3263
		detailScale     512
		snowLevel       2
		tropicLatitude  0.00082698
		icecapLatitude  2
		icecapHeight    0.52485
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29883
		heightTempGrad  0.625
		beachWidth      0.0010271
		tropicWidth     0.07
		mainFreq        0.54011
		venusFreq       0.55707
		venusMagn       0.51645
		mareDensity     0
		terraceProb     0.32003
		erosion         0
		montesMagn      0.52062
		montesFreq      3.1991
		montesSpiky     0.93775
		montesFraction  0.50818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.326
		hillsFraction   0.71123
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25593
		craterFreq      0.45748
		craterDensity   1.0789
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50909
		volcanoTemp     1114.9
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
		PeriodDays      0.218592229
		SemiMajorAxisKm 13245.3451
		Eccentricity    2.73591031e-05
		Inclination     0.0104714056
		AscendingNode   144.21918
		ArgOfPericenter 152.132298
		MeanAnomaly     -124.23843
	}
}

DwarfMoon	"3.D2"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            1.1691e-11
	Radius          1.4824
	InertiaMoment   0.39958
	Oblateness      0.033581
	Obliquity       -0.01287
	EqAscendNode    -147.72
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.471 0.466 0.462)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.72674
		Randomize      (0.160, 0.936, -0.908)
		colorDistMagn   0.80182
		colorDistFreq   0.0014055
		detailScale     8
		snowLevel       2
		tropicLatitude  0.00094213
		icecapLatitude  2
		icecapHeight    0.43307
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19654
		heightTempGrad  0.625
		beachWidth      0.0010749
		tropicWidth     0.07
		mainFreq        0.37049
		venusFreq       0.57651
		venusMagn       0.49982
		mareDensity     0
		terraceProb     0.55488
		erosion         0
		montesMagn      0.32212
		montesFreq      2.5246
		montesSpiky     0.89227
		montesFraction  0.5791
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0062078
		hillsFraction   0.41026
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2329
		craterFreq      0.19724
		craterDensity   0.86503
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57095
		volcanoTemp     1162.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.3342
		BumpOffset      0.6671
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
		PeriodDays      0.370679945
		SemiMajorAxisKm 18835.2711
		Eccentricity    2.58793203e-05
		Inclination     -0.0128701307
		AscendingNode   -147.715872
		ArgOfPericenter -93.120371
		MeanAnomaly     83.1669707
	}
}

DwarfMoon	"3.D3"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            2.4014e-11
	Radius          1.9636
	InertiaMoment   0.39792
	Oblateness      0.023168
	Obliquity       -1.4453
	EqAscendNode    -2.5716
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.651 0.648 0.643)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.29581
		Randomize      (0.430, 0.766, -0.575)
		colorDistMagn   0.81567
		colorDistFreq   0.0011843
		detailScale     8
		snowLevel       2
		tropicLatitude  0.025466
		icecapLatitude  2
		icecapHeight    0.79596
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49425
		heightTempGrad  0.625
		beachWidth      0.00052277
		tropicWidth     0.07
		mainFreq        0.61342
		venusFreq       0.59286
		venusMagn       0.47699
		mareDensity     0
		terraceProb     0.2034
		erosion         0
		montesMagn      0.49234
		montesFreq      3.2435
		montesSpiky     0.78175
		montesFraction  0.65402
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0097126
		hillsFraction   0.5904
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27012
		craterFreq      0.25422
		craterDensity   0.96454
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46966
		volcanoTemp     1310.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7673
		BumpOffset      0.88363
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
		PeriodDays      0.473235066
		SemiMajorAxisKm 22166.1581
		Eccentricity    0.0255079176
		Inclination     -1.44534427
		AscendingNode   -2.57163059
		ArgOfPericenter -29.9002866
		MeanAnomaly     -58.4227902
	}
}

Moon	"3.1"
{
	ParentBody     "3"
	Class          "Terra"
	Mass            0.0042389
	Radius          1083.3
	InertiaMoment   0.39121
	Oblateness      0.0050824
	Obliquity       -0.66681
	EqAscendNode    -61.84
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.434 0.430 0.423)

	Surface
	{
		Preset         "terra_airless_vesta_natural.cfg"
		SurfStyle       0.86488
		Randomize      (0.700, 0.596, -0.242)
		colorDistMagn   0.078347
		colorDistFreq   139.61
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.087466
		snowLevel       2
		tropicLatitude  0.011896
		icecapLatitude  2
		icecapHeight    0.54538
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39196
		heightTempGrad  0.625
		beachWidth      0.00087062
		tropicWidth     0.07
		mainFreq        1.7303
		venusFreq       1.0646
		venusMagn       0
		mareFreq        0.43405
		mareDensity     0.12797
		terraceProb     0.33052
		erosion         0
		montesMagn      0.072548
		montesFreq      59.748
		montesSpiky     0.9234
		montesFraction  0.88601
		dunesMagn       0.044033
		dunesFreq       9.595
		dunesFraction   0.24504
		hillsMagn       0.12115
		hillsFreq       138.31
		hillsFraction   0.71197
		hills2Fraction  0
		riversMagn      59.708
		riversFreq      3.8482
		riversSin       5.1689
		riftsMagn       61.702
		riftsFreq       3.0425
		riftsSin        5.6281
		canyonsMagn     0.56353
		canyonsFreq     0.39783
		canyonsFraction 0.3002
		cracksMagn      0.067797
		cracksFreq      0.38931
		cracksOctaves   0
		craterMagn      0.61171
		craterFreq      2.5138
		craterDensity   0.90826
		craterOctaves   18
		craterRayedFactor 0.13995
		volcanoMagn     0.20379
		volcanoFreq     0.60586
		volcanoDensity  0.35301
		volcanoOctaves  3
		volcanoActivity 1.0351
		volcanoFlows    0.35646
		volcanoRadius   0.15363
		volcanoTemp     1092.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		PeriodDays      0.973166608
		SemiMajorAxisKm 35923.4979
		Eccentricity    0.000266942458
		Inclination     -0.666813198
		AscendingNode   -61.8398512
		ArgOfPericenter 46.7938708
		MeanAnomaly     -173.266967
	}
}

DwarfMoon	"3.D4"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            7.7832e-11
	Radius          2.8486
	InertiaMoment   0.39762
	Obliquity       141.65
	EqAscendNode    -33.056
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.615 0.607 0.604)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43394
		Randomize      (0.971, 0.426, 0.091)
		colorDistMagn   0.84364
		colorDistFreq   0.0020243
		detailScale     8
		snowLevel       2
		tropicLatitude  0.62059
		icecapLatitude  2
		icecapHeight    0.62145
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28966
		heightTempGrad  0.625
		beachWidth      0.00091848
		tropicWidth     0.07
		mainFreq        0.71071
		venusFreq       0.62496
		venusMagn       0.89594
		mareDensity     0
		terraceProb     0.60752
		erosion         0
		montesMagn      0.46342
		montesFreq      3.2899
		montesSpiky     0.93636
		montesFraction  0.075151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016355
		hillsFraction   0.89069
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2122
		craterFreq      0.2738
		craterDensity   0.90455
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59545
		volcanoTemp     1205.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.5637
		BumpOffset      1.2819
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
		PeriodDays      11.8410938
		SemiMajorAxisKm 189627.082
		Eccentricity    0.44743992
		Inclination     141.653856
		AscendingNode   -33.0555742
		ArgOfPericenter 26.8659256
		MeanAnomaly     -64.5912186
	}
}

DwarfMoon	"3.D5"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            1.2872e-10
	Radius          3.1748
	InertiaMoment   0.39923
	RotationPeriod  148.59
	Obliquity       167.32
	EqAscendNode    -86.947

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.792 0.791 0.789)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0030116
		Randomize      (-0.759, 0.256, 0.424)
		colorDistMagn   0.85778
		colorDistFreq   0.0057729
		detailScale     8
		snowLevel       2
		tropicLatitude  0.21973
		icecapLatitude  2
		icecapHeight    0.55787
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18737
		heightTempGrad  0.625
		beachWidth      0.00066633
		tropicWidth     0.07
		mainFreq        0.52045
		venusFreq       0.64485
		venusMagn       0.84789
		mareDensity     0
		terraceProb     0.21203
		erosion         0
		montesMagn      0.58032
		montesFreq      2.6389
		montesSpiky     0.89022
		montesFraction  0.34224
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015354
		hillsFraction   0.57295
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24798
		craterFreq      0.22381
		craterDensity   1.0256
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47687
		volcanoTemp     1153.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.8573
		BumpOffset      1.4287
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
		PeriodDays      15.4785836
		SemiMajorAxisKm 226704.405
		Eccentricity    0.419361313
		Inclination     167.32028
		AscendingNode   -86.9469432
		ArgOfPericenter 26.3622077
		MeanAnomaly     124.43633
	}
}

DwarfMoon	"3.D6"
{
	ParentBody     "3"
	Class          "Asteroid"
	Mass            2.0476e-10
	Radius          3.8304
	InertiaMoment   0.39725
	RotationPeriod  150.13
	Obliquity       -16.507
	EqAscendNode    -6.8303

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.576 0.572 0.568)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.57208
		Randomize      (-0.489, 0.086, 0.757)
		colorDistMagn   0.87206
		colorDistFreq   0.002482
		detailScale     16
		snowLevel       2
		tropicLatitude  0.28435
		icecapLatitude  2
		icecapHeight    0.48345
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48508
		heightTempGrad  0.625
		beachWidth      0.0010142
		tropicWidth     0.07
		mainFreq        0.34197
		venusFreq       0.67737
		venusMagn       0.82343
		mareDensity     0
		terraceProb     0.34139
		erosion         0
		montesMagn      0.43097
		montesFreq      3.339
		montesSpiky     0.76739
		montesFraction  0.43939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0411
		hillsFraction   0.67677
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22517
		craterFreq      0.17341
		craterDensity   0.8463
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52224
		volcanoTemp     1101.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.4474
		BumpOffset      1.7237
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
		PeriodDays      18.7656732
		SemiMajorAxisKm 257759.837
		Eccentricity    0.496707595
		Inclination     -16.5068403
		AscendingNode   -6.83029496
		ArgOfPericenter 27.2215724
		MeanAnomaly     48.264329
	}
}

Planet	"4"
{
	ParentBody     "Asim"
	Class          "Jupiter"
	Mass            1251.4
	Radius          77697
	InertiaMoment   0.20823
	Oblateness      0.026185
	RotationPeriod  8.315
	RotationEpoch   0
	Obliquity       37.689
	EqAscendNode    -96.61

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_Class_III.cfg"
		SurfStyle       0.25115
		Randomize      (-0.011, -0.846, 0.237)
		detailScale     256
		tropicLatitude  0.60852
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.8961
		stripeFluct     0.39708
		stripeTwist     10.379
		cycloneMagn     13.629
		cycloneFreq     0.65179
		cycloneDensity  0.45233
		cycloneOctaves  5
		cycloneMagn2     0.39625
		cycloneFreq2     0.98376
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      6.895
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          32.813
		Velocity        -516.61
		BumpHeight      12.958
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.0999
		mainOctaves     12
		Coverage        0.59767
		stripeZones     7.8961
		stripeFluct     0.39708
		stripeTwist     10.379
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          136.48
		Density         7282.8
		Pressure        1e+06
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0034585
		Saturation      0.94864

		Composition
		{
			H2        	90.238
			He        	6.3608
			CH4       	2.4191
			C3H8      	0.25778
			C2H2      	0.25672
			C8H18     	0.25043
			C2H4      	0.10837
			C2H6      	0.048671
			N2        	0.02952
			NH3       	0.022784
			O2        	0.006046
			Ne        	0.0010067
			Ar        	0.00068587
			CO2       	0.00013474
			H2S       	1.234e-06
			Kr        	3.1996e-07
			H2O       	3.1569e-07
			Xe        	3.2087e-08
			CO        	3.1816e-08
			SO2       	7.5674e-09
			Cl2       	2.6129e-10
		}
	}

	Aurora
	{
		Height         191.07
		NorthLat       89.207
		NorthLon       103.57
		NorthRadius    18569
		NorthWidth     8287.6
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 71.781
		NorthMoveSpeed 1.1057
		NorthParticles 10000
		SouthLat       -88.417
		SouthLon       -81.695
		SouthRadius    21815
		SouthWidth     12475
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 74.308
		SouthMoveSpeed 0.90281
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
//		Period          2.67736942
		SemiMajorAxis   0.88
		Eccentricity    0.194172508
		Inclination     1.96174071
		AscendingNode   -97.2949448
		ArgOfPericenter 39.0621695
		MeanAnomaly     98.6071306
	}
}

Asteroid	"4.S1"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.8648e-13
	Radius          0.37213
	InertiaMoment   0.39797
	Oblateness      0.15756
	Obliquity       0.90437
	EqAscendNode    -87.02
	TidalLocked     true

	AlbedoBond      0.23778
	AlbedoGeom      0.28534
	Brightness      2.25
	BrightnessReal  1
	Color          (0.545 0.444 0.401)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.90236
		Randomize      (-0.626, 0.653, -0.351)
		colorDistMagn   0.57252
		colorDistFreq   3.4149e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035827
		icecapLatitude  2
		icecapHeight    0.53836
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10632
		heightTempGrad  0.625
		beachWidth      0.0013349
		tropicWidth     0.07
		mainFreq        0.38732
		venusFreq       0.62113
		venusMagn       0.7621
		mareDensity     0
		terraceProb     0.58111
		erosion         0
		montesMagn      0.51046
		montesFreq      2.5172
		montesSpiky     0.84757
		montesFraction  0.2525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00038074
		hillsFraction   0.78802
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24537
		craterFreq      0.24514
		craterDensity   0.71486
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43776
		volcanoTemp     1232.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.33492
		BumpOffset      0.16746
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
		Period          0.000465185167
		SemiMajorAxis   0.000933442678
		Eccentricity    0
		Inclination     0.904368135
		AscendingNode   -87.0202897
		ArgOfPericenter -26.2121717
		MeanAnomaly     77.1901707
	}
}

Asteroid	"4.S2"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.0396e-15
	Radius          0.097989
	InertiaMoment   0.39972
	Oblateness      0.17192
	Obliquity       0.70508
	EqAscendNode    -170.39
	TidalLocked     true

	AlbedoBond      0.24491
	AlbedoGeom      0.29389
	Brightness      2.25
	BrightnessReal  1
	Color          (0.657 0.653 0.651)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.47143
		Randomize      (-0.356, 0.483, -0.018)
		colorDistMagn   0.58644
		colorDistFreq   5.4858e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034874
		icecapLatitude  2
		icecapHeight    0.45533
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40403
		heightTempGrad  0.625
		beachWidth      0.0001
		tropicWidth     0.07
		mainFreq        0.62879
		venusFreq       0.63992
		venusMagn       0.75362
		mareDensity     0
		terraceProb     0.20824
		erosion         0
		montesMagn      0.69346
		montesFreq      3.2383
		montesSpiky     0.98429
		montesFraction  0.38809
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3699e-05
		hillsFraction   0.53297
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22169
		craterFreq      0.20301
		craterDensity   0.87709
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49454
		volcanoTemp     1080.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.08819
		BumpOffset      0.044095
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
		Period          0.000472868108
		SemiMajorAxis   0.000943692343
		Eccentricity    0
		Inclination     0.705081687
		AscendingNode   -170.387602
		ArgOfPericenter -118.044659
		MeanAnomaly     141.887059
	}
}

Asteroid	"4.S3"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.6756e-11
	Radius          2.7023
	InertiaMoment   0.39854
	Oblateness      0.16051
	Obliquity       1.4957
	EqAscendNode    97.578
	TidalLocked     true

	AlbedoBond      0.25106
	AlbedoGeom      0.30127
	Brightness      2.25
	BrightnessReal  1
	Color          (0.440 0.435 0.430)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.040499
		Randomize      (-0.085, 0.313, 0.315)
		colorDistMagn   0.60027
		colorDistFreq   0.0012026
		detailScale     8
		snowLevel       2
		tropicLatitude  0.040319
		icecapLatitude  2
		icecapHeight    0.83496
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30174
		heightTempGrad  0.625
		beachWidth      0.00083063
		tropicWidth     0.07
		mainFreq        0.4644
		venusFreq       0.66755
		venusMagn       0.74576
		mareDensity     0
		terraceProb     0.33656
		erosion         0
		montesMagn      0.48221
		montesFreq      2.5778
		montesSpiky     0.95083
		montesFraction  0.47281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016273
		hillsFraction   0.64462
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25366
		craterFreq      0.26098
		craterDensity   0.97953
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54325
		volcanoTemp     1127.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.4321
		BumpOffset      1.2161
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
		Period          0.000477205346
		SemiMajorAxis   0.000949454043
		Eccentricity    0
		Inclination     1.49569434
		AscendingNode   97.5780103
		ArgOfPericenter -27.8282603
		MeanAnomaly     -77.4857409
	}
}

Asteroid	"4.S4"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.7571e-12
	Radius          0.80269
	InertiaMoment   0.39597
	Oblateness      0.15625
	Obliquity       0.69907
	EqAscendNode    -149.69
	TidalLocked     true

	AlbedoBond      0.25654
	AlbedoGeom      0.30785
	Brightness      2.25
	BrightnessReal  1
	Color          (0.621 0.617 0.611)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60957
		Randomize      (0.185, 0.143, 0.648)
		colorDistMagn   0.61403
		colorDistFreq   0.00034721
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03485
		icecapLatitude  2
		icecapHeight    0.70538
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19945
		heightTempGrad  0.625
		beachWidth      0.00087849
		tropicWidth     0.07
		mainFreq        0.73633
		venusFreq       0.50981
		venusMagn       0.73839
		mareDensity     0
		terraceProb     0.65703
		erosion         0
		montesMagn      0.6086
		montesFreq      3.2844
		montesSpiky     0.91047
		montesFraction  0.5452
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0012569
		hillsFraction   0.76075
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23103
		craterFreq      0.21624
		craterDensity   0.81106
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44954
		volcanoTemp     1075.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.72242
		BumpOffset      0.36121
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
		Period          0.000480286138
		SemiMajorAxis   0.000953536048
		Eccentricity    0
		Inclination     0.699071002
		AscendingNode   -149.688623
		ArgOfPericenter 92.0326204
		MeanAnomaly     -51.0020053
	}
}

Asteroid	"4.S5"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.831e-14
	Radius          0.25024
	InertiaMoment   0.39901
	Oblateness      0.14161
	Obliquity       -0.85525
	EqAscendNode    -123.84
	TidalLocked     true

	AlbedoBond      0.26155
	AlbedoGeom      0.31386
	Brightness      2.25
	BrightnessReal  1
	Color          (0.800 0.798 0.794)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.17863
		Randomize      (0.456, -0.027, 0.981)
		colorDistMagn   0.62772
		colorDistFreq   5.5367e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.039039
		icecapLatitude  2
		icecapHeight    0.63367
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49715
		heightTempGrad  0.625
		beachWidth      0.00092634
		tropicWidth     0.07
		mainFreq        0.53327
		venusFreq       0.5502
		venusMagn       0.73143
		mareDensity     0
		terraceProb     0.21688
		erosion         0
		montesMagn      0.45244
		montesFreq      2.6328
		montesSpiky     0.84384
		montesFraction  0.61695
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00022542
		hillsFraction   0.50871
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26559
		craterFreq      0.15177
		craterDensity   0.91618
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5008
		volcanoTemp     1123.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.22521
		BumpOffset      0.11261
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
		Period          0.000484817607
		SemiMajorAxis   0.000959524357
		Eccentricity    0
		Inclination     -0.855246162
		AscendingNode   -123.838123
		ArgOfPericenter 117.192662
		MeanAnomaly     113.90365
	}
}

Asteroid	"4.S6"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.3817e-16
	Radius          0.047122
	InertiaMoment   0.39743
	Oblateness      0.1587
	Obliquity       -0.91737
	EqAscendNode    135.66
	TidalLocked     true

	AlbedoBond      0.2662
	AlbedoGeom      0.31944
	Brightness      2.25
	BrightnessReal  1
	Color          (0.581 0.577 0.576)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.7477
		Randomize      (0.726, -0.197, -0.686)
		colorDistMagn   0.64136
		colorDistFreq   1.1243e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.039585
		icecapLatitude  2
		icecapHeight    0.57026
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39486
		heightTempGrad  0.625
		beachWidth      0.0009742
		tropicWidth     0.07
		mainFreq        0.36104
		venusFreq       0.57139
		venusMagn       0.7248
		mareDensity     0
		terraceProb     0.34766
		erosion         0
		montesMagn      0.56714
		montesFreq      3.3331
		montesSpiky     0.98314
		montesFraction  0.69892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.0597e-06
		hillsFraction   0.62888
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23868
		craterFreq      0.22872
		craterDensity   1.0569
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5532
		volcanoTemp     252.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.04241
		BumpOffset      0.021205
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
		Period          0.00048996234
		SemiMajorAxis   0.000966300523
		Eccentricity    0
		Inclination     -0.917365871
		AscendingNode   135.659069
		ArgOfPericenter 129.256249
		MeanAnomaly     156.888893
	}
}

Asteroid	"4.S7"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.8165e-11
	Radius          1.7784
	InertiaMoment   0.39943
	Oblateness      0.1547
	Obliquity       -1.3659
	EqAscendNode    -88.722
	TidalLocked     true

	AlbedoBond      0.27057
	AlbedoGeom      0.32468
	Brightness      2.25
	BrightnessReal  1
	Color          (0.762 0.759 0.758)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.31677
		Randomize      (0.996, -0.367, -0.353)
		colorDistMagn   0.65495
		colorDistFreq   0.0025828
		detailScale     8
		snowLevel       2
		tropicLatitude  0.044118
		icecapLatitude  2
		icecapHeight    0.49964
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29257
		heightTempGrad  0.625
		beachWidth      0.00072205
		tropicWidth     0.07
		mainFreq        0.60556
		venusFreq       0.58831
		venusMagn       0.71844
		mareDensity     0
		terraceProb     0.10344
		erosion         0
		montesMagn      0.4176
		montesFreq      2.6836
		montesSpiky     0.94954
		montesFraction  0.82115
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00776
		hillsFraction   0.73808
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20669
		craterFreq      0.18237
		craterDensity   0.85923
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45903
		volcanoTemp     1218.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6006
		BumpOffset      0.8003
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
		Period          0.000498328877
		SemiMajorAxis   0.000977269739
		Eccentricity    0
		Inclination     -1.36587585
		AscendingNode   -88.7216914
		ArgOfPericenter 166.168099
		MeanAnomaly     171.656804
	}
}

Asteroid	"4.S8"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.9891e-13
	Radius          0.55305
	InertiaMoment   0.39815
	Oblateness      0.1359
	Obliquity       0.68083
	EqAscendNode    -130.29
	TidalLocked     true

	AlbedoBond      0.27473
	AlbedoGeom      0.32967
	Brightness      2.25
	BrightnessReal  1
	Color          (0.545 0.540 0.536)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.88584
		Randomize      (-0.733, -0.537, -0.020)
		colorDistMagn   0.66851
		colorDistFreq   0.00014469
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03478
		icecapLatitude  2
		icecapHeight    0.37942
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19028
		heightTempGrad  0.625
		beachWidth      0.00076991
		tropicWidth     0.07
		mainFreq        0.4438
		venusFreq       0.60395
		venusMagn       0.71231
		mareDensity     0
		terraceProb     0.22555
		erosion         0
		montesMagn      0.53499
		montesFreq      3.3852
		montesSpiky     0.90876
		montesFraction  0.2717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00067707
		hillsFraction   0.47849
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24615
		craterFreq      0.24165
		craterDensity   0.95802
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50707
		volcanoTemp     966.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.49775
		BumpOffset      0.24887
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
		Period          0.000506549284
		SemiMajorAxis   0.000987987731
		Eccentricity    0
		Inclination     0.680829052
		AscendingNode   -130.293621
		ArgOfPericenter -94.8961129
		MeanAnomaly     55.4089966
	}
}

Asteroid	"4.S9"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.6002e-14
	Radius          0.16081
	InertiaMoment   0.39983
	Oblateness      0.12514
	Obliquity       0.19072
	EqAscendNode    -83.393
	TidalLocked     true

	AlbedoBond      0.27872
	AlbedoGeom      0.33446
	Brightness      2.25
	BrightnessReal  1
	Color          (0.725 0.722 0.719)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4549
		Randomize      (-0.463, -0.707, 0.313)
		colorDistMagn   0.68205
		colorDistFreq   1.977e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03397
		icecapLatitude  2
		icecapHeight    0.75137
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48799
		heightTempGrad  0.625
		beachWidth      0.0011178
		tropicWidth     0.07
		mainFreq        0.69864
		venusFreq       0.62001
		venusMagn       0.70637
		mareDensity     0
		terraceProb     0.35924
		erosion         0
		montesMagn      0.36759
		montesFreq      2.7314
		montesSpiky     0.83987
		montesFraction  0.39738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.9912e-05
		hillsFraction   0.61297
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22279
		craterFreq      0.19938
		craterDensity   0.78213
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56587
		volcanoTemp     1014.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.14473
		BumpOffset      0.072364
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
		Period          0.000507957791
		SemiMajorAxis   0.000989818344
		Eccentricity    0
		Inclination     0.190718728
		AscendingNode   -83.3928864
		ArgOfPericenter 77.8608693
		MeanAnomaly     60.7987461
	}
}

Asteroid	"4.S10"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.5815e-10
	Radius          4.836
	InertiaMoment   0.39868
	Oblateness      0.1488
	Obliquity       0.9818
	EqAscendNode    43.887
	TidalLocked     true

	AlbedoBond      0.28258
	AlbedoGeom      0.33909
	Brightness      2.25
	BrightnessReal  1
	Color          (0.510 0.504 0.497)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.023972
		Randomize      (-0.192, -0.877, 0.646)
		colorDistMagn   0.69557
		colorDistFreq   0.010253
		detailScale     16
		snowLevel       2
		tropicLatitude  0.03628
		icecapLatitude  2
		icecapHeight    0.66589
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38569
		heightTempGrad  0.625
		beachWidth      0.00086562
		tropicWidth     0.07
		mainFreq        0.51367
		venusFreq       0.63852
		venusMagn       0.70059
		mareDensity     0
		terraceProb     0.11302
		erosion         0
		montesMagn      0.50616
		montesFreq      3.4419
		montesSpiky     0.98199
		montesFraction  0.4801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.07837
		hillsFraction   0.71814
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25462
		craterFreq      0.25656
		craterDensity   0.89915
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46723
		volcanoTemp     962.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.3524
		BumpOffset      2.1762
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
		Period          0.000512386813
		SemiMajorAxis   0.000995563679
		Eccentricity    0
		Inclination     0.981799692
		AscendingNode   43.8870221
		ArgOfPericenter -141.251491
		MeanAnomaly     -69.6158882
	}
}

Asteroid	"4.S11"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.6547e-12
	Radius          1.2054
	InertiaMoment   0.39658
	Oblateness      0.14376
	Obliquity       -1.0767
	EqAscendNode    -150.54
	TidalLocked     true

	AlbedoBond      0.28634
	AlbedoGeom      0.3436
	Brightness      2.25
	BrightnessReal  1
	Color          (0.689 0.682 0.680)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.59304
		Randomize      (0.078, 0.954, 0.979)
		colorDistMagn   0.70909
		colorDistFreq   0.0010468
		detailScale     8
		snowLevel       2
		tropicLatitude  0.041082
		icecapLatitude  2
		icecapHeight    0.60066
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2834
		heightTempGrad  0.625
		beachWidth      0.00091347
		tropicWidth     0.07
		mainFreq        0.33103
		venusFreq       0.66507
		venusMagn       0.69495
		mareDensity     0
		terraceProb     0.23427
		erosion         0
		montesMagn      0.67104
		montesFreq      2.7768
		montesSpiky     0.94825
		montesFraction  0.55201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0039365
		hillsFraction   0.43486
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23184
		craterFreq      0.21302
		craterDensity   1.0145
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51345
		volcanoTemp     1109.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.0848
		BumpOffset      0.54242
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
		Period          0.000514221405
		SemiMajorAxis   0.000997938662
		Eccentricity    0
		Inclination     -1.07671304
		AscendingNode   -150.539086
		ArgOfPericenter -55.0208977
		MeanAnomaly     -146.418936
	}
}

Asteroid	"4.S12"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.0042e-13
	Radius          0.39875
	InertiaMoment   0.39913
	Oblateness      0.14551
	Obliquity       0.57428
	EqAscendNode    -30.482
	TidalLocked     true

	AlbedoBond      0.29002
	AlbedoGeom      0.34802
	Brightness      2.25
	BrightnessReal  1
	Color          (0.469 0.464 0.462)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.16211
		Randomize      (0.348, 0.784, -0.688)
		colorDistMagn   0.72262
		colorDistFreq   6.3845e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034425
		icecapLatitude  2
		icecapHeight    0.53559
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18111
		heightTempGrad  0.625
		beachWidth      0.00066133
		tropicWidth     0.07
		mainFreq        0.58381
		venusFreq       0.50398
		venusMagn       0.68941
		mareDensity     0
		terraceProb     0.37138
		erosion         0
		montesMagn      0.47785
		montesFreq      3.5049
		montesSpiky     0.90703
		montesFraction  0.6242
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00038778
		hillsFraction   0.59663
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26738
		craterFreq      0.27758
		craterDensity   0.83996
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5853
		volcanoTemp     857.56
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.35887
		BumpOffset      0.17944
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
		Period          0.000519033848
		SemiMajorAxis   0.00100415526
		Eccentricity    0
		Inclination     0.574275908
		AscendingNode   -30.4824733
		ArgOfPericenter 169.558401
		MeanAnomaly     6.11660658
	}
}

Asteroid	"4.S13"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.4058e-15
	Radius          0.1005
	InertiaMoment   0.39766
	Oblateness      0.13192
	Obliquity       -0.74009
	EqAscendNode    23.285
	TidalLocked     true

	AlbedoBond      0.29365
	AlbedoGeom      0.35238
	Brightness      2.25
	BrightnessReal  1
	Color          (0.650 0.646 0.644)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73117
		Randomize      (0.619, 0.614, -0.355)
		colorDistMagn   0.73616
		colorDistFreq   6.881e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038088
		icecapLatitude  2
		icecapHeight    0.45098
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47882
		heightTempGrad  0.625
		beachWidth      0.00070918
		tropicWidth     0.07
		mainFreq        0.42225
		venusFreq       0.54847
		venusMagn       0.68396
		mareDensity     0
		terraceProb     0.12241
		erosion         0
		montesMagn      0.60118
		montesFreq      2.8204
		montesSpiky     0.83564
		montesFraction  0.70807
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2207e-05
		hillsFraction   0.69995
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23943
		craterFreq      0.22558
		craterDensity   0.93893
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47463
		volcanoTemp     1005.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.090448
		BumpOffset      0.045224
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
		Period          0.000527647855
		SemiMajorAxis   0.00101523488
		Eccentricity    0
		Inclination     -0.74008583
		AscendingNode   23.2851456
		ArgOfPericenter -73.3237596
		MeanAnomaly     111.981906
	}
}

Asteroid	"4.S14"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.3105e-11
	Radius          2.8178
	InertiaMoment   0.39955
	Oblateness      0.13477
	Obliquity       -1.4149
	EqAscendNode    -89.703
	TidalLocked     true

	AlbedoBond      0.29724
	AlbedoGeom      0.35669
	Brightness      2.25
	BrightnessReal  1
	Color          (0.432 0.428 0.424)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30024
		Randomize      (0.889, 0.444, -0.022)
		colorDistMagn   0.74974
		colorDistFreq   0.0028677
		detailScale     8
		snowLevel       2
		tropicLatitude  0.044669
		icecapLatitude  2
		icecapHeight    0.82529
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37653
		heightTempGrad  0.625
		beachWidth      0.001057
		tropicWidth     0.07
		mainFreq        0.66779
		venusFreq       0.57016
		venusMagn       0.67858
		mareDensity     0
		terraceProb     0.24306
		erosion         0
		montesMagn      0.44759
		montesFreq      3.5771
		montesSpiky     0.98083
		montesFraction  0.83933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015154
		hillsFraction   0.95509
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20936
		craterFreq      0.17689
		craterDensity   0.73705
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52006
		volcanoTemp     853.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.536
		BumpOffset      1.268
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
		Period          0.000530875498
		SemiMajorAxis   0.00101937083
		Eccentricity    0
		Inclination     -1.41492651
		AscendingNode   -89.7027663
		ArgOfPericenter -30.4028383
		MeanAnomaly     107.885412
	}
}

Asteroid	"4.S15"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.8837e-12
	Radius          0.82135
	InertiaMoment   0.39831
	Oblateness      0.1263
	Obliquity       -0.61448
	EqAscendNode    140.16
	TidalLocked     true

	AlbedoBond      0.30082
	AlbedoGeom      0.36099
	Brightness      2.25
	BrightnessReal  1
	Color          (0.614 0.610 0.604)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.86931
		Randomize      (-0.841, 0.274, 0.311)
		colorDistMagn   0.76334
		colorDistFreq   0.00043525
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037147
		icecapLatitude  2
		icecapHeight    0.70209
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27423
		heightTempGrad  0.625
		beachWidth      0.00080489
		tropicWidth     0.07
		mainFreq        0.4941
		venusFreq       0.58724
		venusMagn       0.67326
		mareDensity     0
		terraceProb     0.38418
		erosion         0
		montesMagn      0.56187
		montesFreq      2.8628
		montesSpiky     0.94694
		montesFraction  0.28862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0021856
		hillsFraction   0.57955
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24693
		craterFreq      0.23828
		craterDensity   0.8821
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.37398
		volcanoTemp     1100.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.73922
		BumpOffset      0.36961
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
		Period          0.000536383339
		SemiMajorAxis   0.00102640935
		Eccentricity    0
		Inclination     -0.614478373
		AscendingNode   140.158054
		ArgOfPericenter -178.948961
		MeanAnomaly     110.205984
	}
}

Asteroid	"4.S16"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.3035e-14
	Radius          0.26007
	InertiaMoment   0.39994
	Oblateness      0.1182
	Obliquity       1.1166
	EqAscendNode    114.81
	TidalLocked     true

	AlbedoBond      0.30441
	AlbedoGeom      0.36529
	Brightness      2.25
	BrightnessReal  1
	Color          (0.793 0.791 0.787)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43838
		Randomize      (-0.570, 0.104, 0.644)
		colorDistMagn   0.777
		colorDistFreq   2.1324e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037173
		icecapLatitude  2
		icecapHeight    0.6311
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17194
		heightTempGrad  0.625
		beachWidth      0.00085275
		tropicWidth     0.07
		mainFreq        0.29482
		venusFreq       0.60292
		venusMagn       0.66797
		mareDensity     0
		terraceProb     0.13163
		erosion         0
		montesMagn      0.41143
		montesFreq      3.664
		montesSpiky     0.90526
		montesFraction  0.40634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00018196
		hillsFraction   0.68289
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22385
		craterFreq      0.19555
		craterDensity   0.98644
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48151
		volcanoTemp     1048.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.23406
		BumpOffset      0.11703
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
		Period          0.000541710834
		SemiMajorAxis   0.00103319452
		Eccentricity    0
		Inclination     1.11659418
		AscendingNode   114.808296
		ArgOfPericenter 156.123702
		MeanAnomaly     44.4460198
	}
}

Asteroid	"4.S17"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.0389e-16
	Radius          0.048763
	InertiaMoment   0.39881
	Oblateness      0.11806
	Obliquity       -0.32063
	EqAscendNode    123.29
	TidalLocked     true

	AlbedoBond      0.30802
	AlbedoGeom      0.36962
	Brightness      2.25
	BrightnessReal  1
	Color          (0.574 0.571 0.569)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0074448
		Randomize      (-0.300, -0.066, 0.977)
		colorDistMagn   0.79071
		colorDistFreq   1.4528e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03538
		icecapLatitude  2
		icecapHeight    0.56769
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46965
		heightTempGrad  0.625
		beachWidth      0.0012006
		tropicWidth     0.07
		mainFreq        0.56308
		venusFreq       0.6189
		venusMagn       0.6627
		mareDensity     0
		terraceProb     0.25193
		erosion         0
		montesMagn      0.53048
		montesFreq      2.9041
		montesSpiky     0.83108
		montesFraction  0.4873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.7646e-06
		hillsFraction   0.84352
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25561
		craterFreq      0.25248
		craterDensity   0.81812
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52705
		volcanoTemp     270.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.043886
		BumpOffset      0.021943
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
		Period          0.00054858394
		SemiMajorAxis   0.00104191544
		Eccentricity    0
		Inclination     -0.320633469
		AscendingNode   123.2907
		ArgOfPericenter 77.647564
		MeanAnomaly     17.1845738
	}
}

Asteroid	"4.S18"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.9655e-11
	Radius          1.8252
	InertiaMoment   0.39698
	Oblateness      0.12246
	Obliquity       -0.31567
	EqAscendNode    -150.98
	TidalLocked     true

	AlbedoBond      0.31167
	AlbedoGeom      0.374
	Brightness      2.25
	BrightnessReal  1
	Color          (0.754 0.752 0.751)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.57651
		Randomize      (-0.029, -0.236, -0.690)
		colorDistMagn   0.80449
		colorDistFreq   0.00086554
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035356
		icecapLatitude  2
		icecapHeight    0.49637
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36736
		heightTempGrad  0.625
		beachWidth      0.0012485
		tropicWidth     0.07
		mainFreq        0.39932
		venusFreq       0.63714
		venusMagn       0.65744
		mareDensity     0
		terraceProb     0.39779
		erosion         0
		montesMagn      0.35651
		montesFreq      3.7774
		montesSpiky     0.97967
		montesFraction  0.55883
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0072749
		hillsFraction   0.56131
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23265
		craterFreq      0.20974
		craterDensity   0.92116
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4204
		volcanoTemp     1344
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6427
		BumpOffset      0.82136
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
		Period          0.000557274932
		SemiMajorAxis   0.00105289101
		Eccentricity    0
		Inclination     -0.315674349
		AscendingNode   -150.98432
		ArgOfPericenter 84.092245
		MeanAnomaly     -9.46951286
	}
}

Asteroid	"4.S19"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.4197e-13
	Radius          0.55877
	InertiaMoment   0.39925
	Oblateness      0.10666
	Obliquity       -0.84746
	EqAscendNode    -130.47
	TidalLocked     true

	AlbedoBond      0.31538
	AlbedoGeom      0.37846
	Brightness      2.25
	BrightnessReal  1
	Color          (0.538 0.533 0.530)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.14558
		Randomize      (0.241, -0.406, -0.357)
		colorDistMagn   0.81835
		colorDistFreq   0.00018046
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038972
		icecapLatitude  2
		icecapHeight    0.3703
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26507
		heightTempGrad  0.625
		beachWidth      0.00099631
		tropicWidth     0.07
		mainFreq        0.64098
		venusFreq       0.66273
		venusMagn       0.65218
		mareDensity     0
		terraceProb     0.14071
		erosion         0
		montesMagn      0.50188
		montesFreq      2.9448
		montesSpiky     0.94563
		montesFraction  0.63155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0005889
		hillsFraction   0.66657
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26942
		craterFreq      0.27114
		craterDensity   1.0764
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48806
		volcanoTemp     1191.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.50289
		BumpOffset      0.25145
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
		Period          0.000562021207
		SemiMajorAxis   0.00105886083
		Eccentricity    0
		Inclination     -0.847457977
		AscendingNode   -130.473045
		ArgOfPericenter -70.0448033
		MeanAnomaly     -160.924489
	}
}

Asteroid	"4.S20"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.7493e-14
	Radius          0.17766
	InertiaMoment   0.39787
	Oblateness      0.12204
	Obliquity       0.65434
	EqAscendNode    28.767
	TidalLocked     true

	AlbedoBond      0.31918
	AlbedoGeom      0.38302
	Brightness      2.25
	BrightnessReal  1
	Color          (0.718 0.715 0.712)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.71465
		Randomize      (0.511, -0.576, -0.024)
		colorDistMagn   0.8323
		colorDistFreq   5.8313e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034683
		icecapLatitude  2
		icecapHeight    0.74696
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16277
		heightTempGrad  0.625
		beachWidth      0.0010442
		tropicWidth     0.07
		mainFreq        0.47431
		venusFreq       0.49644
		venusMagn       0.64689
		mareDensity     0
		terraceProb     0.26091
		erosion         0
		montesMagn      0.65492
		montesFreq      3.9563
		montesSpiky     0.90347
		montesFraction  0.71756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.9863e-05
		hillsFraction   0.80051
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24017
		craterFreq      0.22244
		craterDensity   0.8645
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53461
		volcanoTemp     1039.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.1599
		BumpOffset      0.079949
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
		Period          0.00056919381
		SemiMajorAxis   0.00106785068
		Eccentricity    0
		Inclination     0.654341501
		AscendingNode   28.7671644
		ArgOfPericenter 18.6523277
		MeanAnomaly     149.347432
	}
}

Asteroid	"4.S21"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.0295e-10
	Radius          4.6982
	InertiaMoment   0.39966
	Oblateness      0.096392
	Obliquity       0.88548
	EqAscendNode    81.843
	TidalLocked     true

	AlbedoBond      0.3231
	AlbedoGeom      0.38772
	Brightness      2.25
	BrightnessReal  1
	Color          (0.502 0.498 0.490)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28371
		Randomize      (0.782, -0.746, 0.309)
		colorDistMagn   0.84636
		colorDistFreq   0.012041
		detailScale     16
		snowLevel       2
		tropicLatitude  0.035723
		icecapLatitude  2
		icecapHeight    0.6631
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46048
		heightTempGrad  0.625
		beachWidth      0.001092
		tropicWidth     0.07
		mainFreq        0.75921
		venusFreq       0.54668
		venusMagn       0.64157
		mareDensity     0
		terraceProb     0.41238
		erosion         0
		montesMagn      0.47344
		montesFreq      2.9852
		montesSpiky     0.82615
		montesFraction  0.86028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.058975
		hillsFraction   0.54131
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21157
		craterFreq      0.17046
		craterDensity   0.96392
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43747
		volcanoTemp     1187.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.2284
		BumpOffset      2.1142
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
		Period          0.000575760387
		SemiMajorAxis   0.0010760479
		Eccentricity    0
		Inclination     0.88547718
		AscendingNode   81.843503
		ArgOfPericenter -152.091371
		MeanAnomaly     161.763195
	}
}

Asteroid	"4.S22"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.0802e-12
	Radius          1.2349
	InertiaMoment   0.39846
	Oblateness      0.11388
	Obliquity       0.6808
	EqAscendNode    92.293
	TidalLocked     true

	AlbedoBond      0.32716
	AlbedoGeom      0.39259
	Brightness      2.25
	BrightnessReal  1
	Color          (0.682 0.675 0.673)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.85278
		Randomize      (-0.948, -0.916, 0.642)
		colorDistMagn   0.86053
		colorDistFreq   6.6427e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03478
		icecapLatitude  2
		icecapHeight    0.59816
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35819
		heightTempGrad  0.625
		beachWidth      0.0014399
		tropicWidth     0.07
		mainFreq        0.543
		venusFreq       0.56892
		venusMagn       0.63619
		mareDensity     0
		terraceProb     0.14966
		erosion         0
		montesMagn      0.59428
		montesFreq      1.6837
		montesSpiky     0.97851
		montesFraction  0.30386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0036753
		hillsFraction   0.65067
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24773
		craterFreq      0.23499
		craterDensity   0.79143
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49441
		volcanoTemp     1134.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.1114
		BumpOffset      0.55572
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
		Period          0.000579848266
		SemiMajorAxis   0.00108113516
		Eccentricity    0
		Inclination     0.68080128
		AscendingNode   92.293339
		ArgOfPericenter -12.3512015
		MeanAnomaly     55.082034
	}
}

Asteroid	"4.S23"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.1535e-13
	Radius          0.40541
	InertiaMoment   0.39532
	Oblateness      0.10993
	Obliquity       -0.53456
	EqAscendNode    -138.15
	TidalLocked     true

	AlbedoBond      0.33141
	AlbedoGeom      0.3977
	Brightness      2.25
	BrightnessReal  1
	Color          (0.461 0.458 0.456)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.42185
		Randomize      (-0.677, 0.914, 0.975)
		colorDistMagn   0.87483
		colorDistFreq   8.4318e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036604
		icecapLatitude  2
		icecapHeight    0.53279
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2559
		heightTempGrad  0.625
		beachWidth      0.0011877
		tropicWidth     0.07
		mainFreq        0.37437
		venusFreq       0.58617
		venusMagn       0.63074
		mareDensity     0
		terraceProb     0.27001
		erosion         0
		montesMagn      0.44262
		montesFreq      3.0254
		montesSpiky     0.94431
		montesFraction  0.41503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0003564
		hillsFraction   0.77052
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22486
		craterFreq      0.19146
		craterDensity   0.90405
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54305
		volcanoTemp     1182.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.36487
		BumpOffset      0.18243
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
		Period          0.000586354816
		SemiMajorAxis   0.00108920781
		Eccentricity    0
		Inclination     -0.534562984
		AscendingNode   -138.150158
		ArgOfPericenter 30.3878659
		MeanAnomaly     13.358589
	}
}

Asteroid	"4.S24"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.8079e-15
	Radius          0.099383
	InertiaMoment   0.39894
	Oblateness      0.090115
	Obliquity       1.1435
	EqAscendNode    -87.292
	TidalLocked     true

	AlbedoBond      0.3359
	AlbedoGeom      0.40308
	Brightness      2.25
	BrightnessReal  1
	Color          (0.642 0.639 0.637)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99092
		Randomize      (-0.407, 0.744, -0.692)
		colorDistMagn   0.88928
		colorDistFreq   8.1857e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037366
		icecapLatitude  2
		icecapHeight    0.4465
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15361
		heightTempGrad  0.625
		beachWidth      0.00093558
		tropicWidth     0.07
		mainFreq        0.61679
		venusFreq       0.60189
		venusMagn       0.62521
		mareDensity     0
		terraceProb     0.42819
		erosion         0
		montesMagn      0.55677
		montesFreq      2.1026
		montesSpiky     0.90164
		montesFraction  0.49442
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8397e-05
		hillsFraction   0.51855
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25664
		craterFreq      0.24864
		craterDensity   1.0245
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44932
		volcanoTemp     1230.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.089445
		BumpOffset      0.044722
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
		Period          0.000595164104
		SemiMajorAxis   0.00110009004
		Eccentricity    0
		Inclination     1.14345047
		AscendingNode   -87.2923925
		ArgOfPericenter 74.1218183
		MeanAnomaly     35.3960374
	}
}

Asteroid	"4.S25"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.0144e-11
	Radius          2.8705
	InertiaMoment   0.39728
	Oblateness      0.10017
	Obliquity       1.424
	EqAscendNode    62.288
	TidalLocked     true

	AlbedoBond      0.34071
	AlbedoGeom      0.40885
	Brightness      2.25
	BrightnessReal  1
	Color          (0.425 0.421 0.417)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.55999
		Randomize      (-0.137, 0.575, -0.359)
		colorDistMagn   0.90389
		colorDistFreq   0.0039547
		detailScale     8
		snowLevel       2
		tropicLatitude  0.039659
		icecapLatitude  2
		icecapHeight    0.8166
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45131
		heightTempGrad  0.625
		beachWidth      0.0012834
		tropicWidth     0.07
		mainFreq        0.45405
		venusFreq       0.61779
		venusMagn       0.61956
		mareDensity     0
		terraceProb     0.15852
		erosion         0
		montesMagn      0.40491
		montesFreq      3.0658
		montesSpiky     0.82075
		montesFraction  0.56566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.025582
		hillsFraction   0.63493
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23344
		craterFreq      0.20637
		craterDensity   0.84573
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50066
		volcanoTemp     978.16
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.5835
		BumpOffset      1.2917
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
		Period          0.000602150055
		SemiMajorAxis   0.00110868176
		Eccentricity    0
		Inclination     1.42402248
		AscendingNode   62.2882815
		ArgOfPericenter -22.2817753
		MeanAnomaly     126.699216
	}
}

Asteroid	"4.S26"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.0196e-12
	Radius          0.84865
	InertiaMoment   0.39937
	Oblateness      0.10103
	Obliquity       -1.4149
	EqAscendNode    -89.494
	TidalLocked     true

	AlbedoBond      0.34592
	AlbedoGeom      0.4151
	Brightness      2.25
	BrightnessReal  1
	Color          (0.688 0.619 0.516)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12905
		Randomize      (0.134, 0.405, -0.026)
		colorDistMagn   0.91867
		colorDistFreq   0.00055769
		detailScale     8
		snowLevel       2
		tropicLatitude  0.044668
		icecapLatitude  2
		icecapHeight    0.69885
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34902
		heightTempGrad  0.625
		beachWidth      0.00073129
		tropicWidth     0.07
		mainFreq        0.71609
		venusFreq       0.6358
		venusMagn       0.61379
		mareDensity     0
		terraceProb     0.27926
		erosion         0
		montesMagn      0.52602
		montesFreq      2.2563
		montesSpiky     0.97735
		montesFraction  0.63901
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0019113
		hillsFraction   0.74639
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27182
		craterFreq      0.26566
		craterDensity   0.94427
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55296
		volcanoTemp     1225.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.76378
		BumpOffset      0.38189
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
		Period          0.000609523945
		SemiMajorAxis   0.00111771461
		Eccentricity    0
		Inclination     -1.4148795
		AscendingNode   -89.4938142
		ArgOfPericenter -11.193139
		MeanAnomaly     153.927747
	}
}

Asteroid	"4.S27"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.8109e-14
	Radius          0.27627
	InertiaMoment   0.39805
	Oblateness      0.1007
	Obliquity       0.67467
	EqAscendNode    159.53
	TidalLocked     true

	AlbedoBond      0.35168
	AlbedoGeom      0.42201
	Brightness      2.25
	BrightnessReal  1
	Color          (0.837 0.757 0.729)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.69812
		Randomize      (0.404, 0.235, 0.307)
		colorDistMagn   0.93365
		colorDistFreq   3.4015e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034757
		icecapLatitude  2
		icecapHeight    0.62854
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24673
		heightTempGrad  0.625
		beachWidth      0.0010791
		tropicWidth     0.07
		mainFreq        0.52332
		venusFreq       0.66053
		venusMagn       0.60785
		mareDensity     0
		terraceProb     0.44559
		erosion         0
		montesMagn      0.34333
		montesFreq      3.1067
		montesSpiky     0.94298
		montesFraction  0.72745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00018284
		hillsFraction   0.49109
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24092
		craterFreq      0.21929
		craterDensity   0.75327
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45884
		volcanoTemp     1073.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.24865
		BumpOffset      0.12432
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
		Period          0.000615990361
		SemiMajorAxis   0.00112560589
		Eccentricity    0
		Inclination     0.674670471
		AscendingNode   159.533943
		ArgOfPericenter -135.829665
		MeanAnomaly     81.8491637
	}
}

Asteroid	"4.S28"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.7896e-16
	Radius          0.052916
	InertiaMoment   0.39977
	Oblateness      0.10089
	Obliquity       -0.85077
	EqAscendNode    86.068
	TidalLocked     true

	AlbedoBond      0.35823
	AlbedoGeom      0.42987
	Brightness      2.25
	BrightnessReal  1
	Color          (0.688 0.525 0.440)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.26719
		Randomize      (0.674, 0.065, 0.640)
		colorDistMagn   0.94884
		colorDistFreq   2.0414e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.039
		icecapLatitude  2
		icecapHeight    0.56511
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14444
		heightTempGrad  0.625
		beachWidth      0.000527
		tropicWidth     0.07
		mainFreq        0.34641
		venusFreq       0.48536
		venusMagn       0.60173
		mareDensity     0
		terraceProb     0.16729
		erosion         0
		montesMagn      0.4976
		montesFreq      2.3608
		montesSpiky     0.89978
		montesFraction  0.88532
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.0289e-06
		hillsFraction   0.61912
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21348
		craterFreq      0.16245
		craterDensity   0.88706
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50693
		volcanoTemp     217.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.047625
		BumpOffset      0.023812
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
		Period          0.000617169592
		SemiMajorAxis   0.00112704198
		Eccentricity    0
		Inclination     -0.850771281
		AscendingNode   86.0681022
		ArgOfPericenter 82.6347126
		MeanAnomaly     -127.207968
	}
}

Asteroid	"4.S29"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.1279e-11
	Radius          1.8216
	InertiaMoment   0.3986
	Oblateness      0.090966
	Obliquity       -1.0498
	EqAscendNode    166.09
	TidalLocked     true

	AlbedoBond      0.36596
	AlbedoGeom      0.43916
	Brightness      2.25
	BrightnessReal  1
	Color          (0.776 0.741 0.715)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83626
		Randomize      (0.945, -0.105, 0.973)
		colorDistMagn   0.96426
		colorDistFreq   0.0013582
		detailScale     8
		snowLevel       2
		tropicLatitude  0.04082
		icecapLatitude  2
		icecapHeight    0.49305
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44215
		heightTempGrad  0.625
		beachWidth      0.0014749
		tropicWidth     0.07
		mainFreq        0.59438
		venusFreq       0.54482
		venusMagn       0.59538
		mareDensity     0
		terraceProb     0.28868
		erosion         0
		montesMagn      0.64205
		montesFreq      3.1483
		montesSpiky     0.81478
		montesFraction  0.31779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0060981
		hillsFraction   0.72555
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24853
		craterFreq      0.23178
		craterDensity   0.99379
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56555
		volcanoTemp     1169.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6394
		BumpOffset      0.81972
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
		Period          0.000621438715
		SemiMajorAxis   0.00113223337
		Eccentricity    0
		Inclination     -1.04984619
		AscendingNode   166.094762
		ArgOfPericenter 110.46014
		MeanAnomaly     128.599081
	}
}

Asteroid	"4.S30"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.881e-13
	Radius          0.57851
	InertiaMoment   0.39628
	Oblateness      0.088243
	Obliquity       0.017278
	EqAscendNode    132.16
	TidalLocked     true

	AlbedoBond      0.37571
	AlbedoGeom      0.45086
	Brightness      2.25
	BrightnessReal  1
	Color          (0.600 0.527 0.454)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.40532
		Randomize      (-0.785, -0.275, -0.694)
		colorDistMagn   0.97994
		colorDistFreq   0.0002306
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034195
		icecapLatitude  2
		icecapHeight    0.36008
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33985
		heightTempGrad  0.625
		beachWidth      0.00092271
		tropicWidth     0.07
		mainFreq        0.43302
		venusFreq       0.56766
		venusMagn       0.58876
		mareDensity     0
		terraceProb     0.46506
		erosion         0
		montesMagn      0.46898
		montesFreq      2.443
		montesSpiky     0.97618
		montesFraction  0.42346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0010227
		hillsFraction   0.45422
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22583
		craterFreq      0.18705
		craterDensity   0.82479
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46706
		volcanoTemp     1116.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.52066
		BumpOffset      0.26033
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
		Period          0.000625234928
		SemiMajorAxis   0.00113683971
		Eccentricity    0
		Inclination     0.0172784259
		AscendingNode   132.155197
		ArgOfPericenter -160.768528
		MeanAnomaly     -124.919677
	}
}

Asteroid	"4.S31"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.9104e-14
	Radius          0.17766
	InertiaMoment   0.39907
	Oblateness      0.091385
	Obliquity       -0.75992
	EqAscendNode    23.111
	TidalLocked     true

	AlbedoBond      0.3897
	AlbedoGeom      0.46764
	Brightness      2.25
	BrightnessReal  1
	Color          (0.763 0.716 0.653)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.97439
		Randomize      (-0.514, -0.445, -0.361)
		colorDistMagn   0.9959
		colorDistFreq   1.1672e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038246
		icecapLatitude  2
		icecapHeight    0.74268
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23756
		heightTempGrad  0.625
		beachWidth      0.00097057
		tropicWidth     0.07
		mainFreq        0.68236
		venusFreq       0.5851
		venusMagn       0.5818
		mareDensity     0
		terraceProb     0.176
		erosion         0
		montesMagn      0.5878
		montesFreq      3.1909
		montesSpiky     0.94164
		montesFraction  0.50147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.3209e-05
		hillsFraction   0.60298
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25771
		craterFreq      0.24501
		craterDensity   0.9262
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51331
		volcanoTemp     1064.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.15989
		BumpOffset      0.079947
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
		Period          0.00063080102
		SemiMajorAxis   0.00114357681
		Eccentricity    0
		Inclination     -0.759918743
		AscendingNode   23.1114846
		ArgOfPericenter -123.751106
		MeanAnomaly     128.96618
	}
}

Asteroid	"4.S32"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.5451e-10
	Radius          5.1794
	InertiaMoment   0.39754
	Oblateness      0.093941
	Obliquity       0.84636
	EqAscendNode    -93.588
	TidalLocked     true

	AlbedoBond      0.42079
	AlbedoGeom      0.50495
	Brightness      2.25
	BrightnessReal  1
	Color          (0.598 0.523 0.380)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.54346
		Randomize      (-0.244, -0.615, -0.028)
		colorDistMagn   0.025921
		colorDistFreq   0.017501
		detailScale     16
		snowLevel       2
		tropicLatitude  0.035517
		icecapLatitude  2
		icecapHeight    0.66034
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13527
		heightTempGrad  0.625
		beachWidth      0.0013184
		tropicWidth     0.07
		mainFreq        0.50376
		venusFreq       0.60085
		venusMagn       0.57445
		mareDensity     0
		terraceProb     0.2983
		erosion         0
		montesMagn      0.4375
		montesFreq      2.5124
		montesSpiky     0.89789
		montesFraction  0.5725
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.063878
		hillsFraction   0.70677
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23422
		craterFreq      0.20288
		craterDensity   0.63028
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58472
		volcanoTemp     1112.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.6615
		BumpOffset      2.3307
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
		Period          0.000633119691
		SemiMajorAxis   0.00114637743
		Eccentricity    0
		Inclination     0.846358855
		AscendingNode   -93.587875
		ArgOfPericenter -32.5814505
		MeanAnomaly     -72.6393882
	}
}

Asteroid	"4.S33"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.5396e-12
	Radius          1.2648
	InertiaMoment   0.39948
	Oblateness      0.09317
	Obliquity       -0.7716
	EqAscendNode    72.858
	TidalLocked     true

	AlbedoBond      0.19807
	AlbedoGeom      0.23768
	Brightness      2.25
	BrightnessReal  1
	Color          (0.755 0.639 0.585)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.11253
		Randomize      (0.026, -0.785, 0.304)
		colorDistMagn   0.058059
		colorDistFreq   0.00052037
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03834
		icecapLatitude  2
		icecapHeight    0.59565
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43298
		heightTempGrad  0.625
		beachWidth      0.0010663
		tropicWidth     0.07
		mainFreq        0.31368
		venusFreq       0.6167
		venusMagn       0.56661
		mareDensity     0
		terraceProb     0.48744
		erosion         0
		montesMagn      0.55181
		montesFreq      3.2349
		montesSpiky     0.80806
		montesFraction  0.6466
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0034195
		hillsFraction   0.38764
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27479
		craterFreq      0.26081
		craterDensity   0.86968
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47448
		volcanoTemp     1160.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.1384
		BumpOffset      0.56918
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
		Period          0.000641932595
		SemiMajorAxis   0.00115699114
		Eccentricity    0
		Inclination     -0.771602479
		AscendingNode   72.8576709
		ArgOfPericenter -127.356836
		MeanAnomaly     -60.3057643
	}
}

Asteroid	"4.S34"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.3133e-13
	Radius          0.4152
	InertiaMoment   0.39822
	Oblateness      0.091114
	Obliquity       0.20665
	EqAscendNode    -96.134
	TidalLocked     true

	AlbedoBond      0.21742
	AlbedoGeom      0.2609
	Brightness      2.25
	BrightnessReal  1
	Color          (0.583 0.424 0.319)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.68159
		Randomize      (0.297, -0.955, 0.637)
		colorDistMagn   0.087743
		colorDistFreq   0.00010651
		detailScale     8
		snowLevel       2
		tropicLatitude  0.033963
		icecapLatitude  2
		icecapHeight    0.52997
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33069
		heightTempGrad  0.625
		beachWidth      0.00081413
		tropicWidth     0.07
		mainFreq        0.5732
		venusFreq       0.63448
		venusMagn       0.55814
		mareDensity     0
		terraceProb     0.18467
		erosion         0
		montesMagn      0.39795
		montesFreq      2.5735
		montesSpiky     0.97501
		montesFraction  0.73779
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00031226
		hillsFraction   0.58622
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24166
		craterFreq      0.21612
		craterDensity   0.97006
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51992
		volcanoTemp     1107.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.37368
		BumpOffset      0.18684
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
		Period          0.000647581096
		SemiMajorAxis   0.0011637683
		Eccentricity    0
		Inclination     0.206645176
		AscendingNode   -96.1336494
		ArgOfPericenter 173.71267
		MeanAnomaly     -17.8225447
	}
}

Asteroid	"4.S35"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.2487e-15
	Radius          0.1095
	InertiaMoment   0.39988
	Oblateness      0.091065
	Obliquity       -0.26912
	EqAscendNode    91.24
	TidalLocked     true

	AlbedoBond      0.22902
	AlbedoGeom      0.27483
	Brightness      2.25
	BrightnessReal  1
	Color          (0.679 0.630 0.586)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25066
		Randomize      (0.567, 0.875, 0.970)
		colorDistMagn   0.11541
		colorDistFreq   3.2644e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035138
		icecapLatitude  2
		icecapHeight    0.44184
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22839
		heightTempGrad  0.625
		beachWidth      0.00056198
		tropicWidth     0.07
		mainFreq        0.41083
		venusFreq       0.65843
		venusMagn       0.54887
		mareDensity     0
		terraceProb     0.30815
		erosion         0
		montesMagn      0.52162
		montesFreq      3.2809
		montesSpiky     0.94028
		montesFraction  0.91709
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.6131e-05
		hillsFraction   0.68934
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21518
		craterFreq      0.15124
		craterDensity   0.79987
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.37041
		volcanoTemp     955.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.098549
		BumpOffset      0.049274
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
		Period          0.000649355839
		SemiMajorAxis   0.00116589359
		Eccentricity    0
		Inclination     -0.269116761
		AscendingNode   91.2396929
		ArgOfPericenter 134.69483
		MeanAnomaly     154.753584
	}
}

Asteroid	"4.S36"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.796e-11
	Radius          2.9595
	InertiaMoment   0.39874
	Oblateness      0.08495
	Obliquity       1.0189
	EqAscendNode    -70.572
	TidalLocked     true

	AlbedoBond      0.23771
	AlbedoGeom      0.28526
	Brightness      2.25
	BrightnessReal  1
	Color          (0.480 0.421 0.347)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.81973
		Randomize      (0.838, 0.705, -0.697)
		colorDistMagn   0.1414
		colorDistFreq   0.0051209
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036513
		icecapLatitude  2
		icecapHeight    0.80866
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1261
		heightTempGrad  0.625
		beachWidth      0.00060984
		tropicWidth     0.07
		mainFreq        0.6538
		venusFreq       0.46086
		venusMagn       0.53853
		mareDensity     0
		terraceProb     0.51414
		erosion         0
		montesMagn      0.32667
		montesFreq      2.6289
		montesSpiky     0.89595
		montesFraction  0.33067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.022939
		hillsFraction   0.86854
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24936
		craterFreq      0.22861
		craterDensity   0.90896
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48137
		volcanoTemp     1103.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.6635
		BumpOffset      1.3318
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
		Period          0.000655146092
		SemiMajorAxis   0.00117281412
		Eccentricity    0
		Inclination     1.0188985
		AscendingNode   -70.5718475
		ArgOfPericenter 174.825868
		MeanAnomaly     -159.448029
	}
}

Asteroid	"4.S37"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.1656e-12
	Radius          0.86042
	InertiaMoment   0.39677
	Oblateness      0.083744
	Obliquity       1.1327
	EqAscendNode    120.3
	TidalLocked     true

	AlbedoBond      0.24485
	AlbedoGeom      0.29382
	Brightness      2.25
	BrightnessReal  1
	Color          (0.674 0.616 0.515)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.3888
		Randomize      (-0.892, 0.535, -0.364)
		colorDistMagn   0.16596
		colorDistFreq   0.00015007
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037288
		icecapLatitude  2
		icecapHeight    0.69566
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42381
		heightTempGrad  0.625
		beachWidth      0.0012577
		tropicWidth     0.07
		mainFreq        0.48411
		venusFreq       0.54288
		venusMagn       0.5267
		mareDensity     0
		terraceProb     0.19331
		erosion         0
		montesMagn      0.49332
		montesFreq      3.3294
		montesSpiky     0.80034
		montesFraction  0.43168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0017522
		hillsFraction   0.56849
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22677
		craterFreq      0.18218
		craterDensity   1.036
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52689
		volcanoTemp     1151
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.77438
		BumpOffset      0.38719
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
		Period          0.000656814186
		SemiMajorAxis   0.00117480404
		Eccentricity    0
		Inclination     1.13265499
		AscendingNode   120.296735
		ArgOfPericenter -46.0989143
		MeanAnomaly     -32.1588748
	}
}

Asteroid	"4.S38"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.3556e-14
	Radius          0.28159
	InertiaMoment   0.39919
	Oblateness      0.084831
	Obliquity       0.99197
	EqAscendNode    -69.609
	TidalLocked     true

	AlbedoBond      0.251
	AlbedoGeom      0.3012
	Brightness      2.25
	BrightnessReal  1
	Color          (0.828 0.755 0.724)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.95786
		Randomize      (-0.622, 0.365, -0.031)
		colorDistMagn   0.18929
		colorDistFreq   4.3781e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036343
		icecapLatitude  2
		icecapHeight    0.62599
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32152
		heightTempGrad  0.625
		beachWidth      0.0013055
		tropicWidth     0.07
		mainFreq        0.27252
		venusFreq       0.56638
		venusMagn       0.51264
		mareDensity     0
		terraceProb     0.31827
		erosion         0
		montesMagn      0.63117
		montesFreq      2.68
		montesSpiky     0.97384
		montesFraction  0.50846
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00016823
		hillsFraction   0.67277
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25884
		craterFreq      0.24152
		craterDensity   0.85132
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41991
		volcanoTemp     1098.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.25343
		BumpOffset      0.12671
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
		Period          0.000665954114
		SemiMajorAxis   0.00118567761
		Eccentricity    0
		Inclination     0.991965868
		AscendingNode   -69.6093784
		ArgOfPericenter -9.83450627
		MeanAnomaly     -105.51816
	}
}

Asteroid	"4.S39"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.6432e-16
	Radius          0.054787
	InertiaMoment   0.39775
	Oblateness      0.079206
	Obliquity       -0.17433
	EqAscendNode    -139.3
	TidalLocked     true

	AlbedoBond      0.2565
	AlbedoGeom      0.30779
	Brightness      2.25
	BrightnessReal  1
	Color          (0.563 0.556 0.551)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.52693
		Randomize      (-0.351, 0.195, 0.302)
		colorDistMagn   0.21157
		colorDistFreq   2.5802e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034749
		icecapLatitude  2
		icecapHeight    0.56253
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21923
		heightTempGrad  0.625
		beachWidth      0.0010534
		tropicWidth     0.07
		mainFreq        0.55284
		venusFreq       0.58402
		venusMagn       0.49484
		mareDensity     0
		terraceProb     0.54801
		erosion         0
		montesMagn      0.46446
		montesFreq      3.3812
		montesSpiky     0.93892
		montesFraction  0.57938
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.3526e-06
		hillsFraction   0.81474
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23499
		craterFreq      0.19924
		craterDensity   0.94974
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48792
		volcanoTemp     235.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.049308
		BumpOffset      0.024654
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
		Period          0.000673467692
		SemiMajorAxis   0.00119457914
		Eccentricity    0
		Inclination     -0.174334714
		AscendingNode   -139.299206
		ArgOfPericenter -29.2955655
		MeanAnomaly     74.8803206
	}
}

Asteroid	"4.S40"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.3051e-11
	Radius          1.9309
	InertiaMoment   0.39959
	Oblateness      0.083936
	Obliquity       1.0603
	EqAscendNode    108.93
	TidalLocked     true

	AlbedoBond      0.26151
	AlbedoGeom      0.31381
	Brightness      2.25
	BrightnessReal  1
	Color          (0.742 0.738 0.734)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.095998
		Randomize      (-0.081, 0.026, 0.635)
		colorDistMagn   0.23291
		colorDistFreq   0.0019376
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036784
		icecapLatitude  2
		icecapHeight    0.48966
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11693
		heightTempGrad  0.625
		beachWidth      0.00080126
		tropicWidth     0.07
		mainFreq        0.38697
		venusFreq       0.59982
		venusMagn       0.46942
		mareDensity     0
		terraceProb     0.20193
		erosion         0
		montesMagn      0.58168
		montesFreq      2.7279
		montesSpiky     0.89398
		montesFraction  0.65433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011095
		hillsFraction   0.54925
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27882
		craterFreq      0.2564
		craterDensity   0.76635
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53443
		volcanoTemp     1094.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7378
		BumpOffset      0.86888
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
		Period          0.000679587577
		SemiMajorAxis   0.00120180508
		Eccentricity    0
		Inclination     1.06028027
		AscendingNode   108.929661
		ArgOfPericenter -125.665792
		MeanAnomaly     69.4413057
	}
}

Asteroid	"4.S41"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.375e-13
	Radius          0.60128
	InertiaMoment   0.39838
	Oblateness      0.077798
	Obliquity       -0.3538
	EqAscendNode    -135.74
	TidalLocked     true

	AlbedoBond      0.26616
	AlbedoGeom      0.31939
	Brightness      2.25
	BrightnessReal  1
	Color          (0.523 0.520 0.516)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.66507
		Randomize      (0.189, -0.144, 0.968)
		colorDistMagn   0.25343
		colorDistFreq   0.0003043
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035547
		icecapLatitude  2
		icecapHeight    0.3484
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41464
		heightTempGrad  0.625
		beachWidth      0.00054911
		tropicWidth     0.07
		mainFreq        0.62845
		venusFreq       0.61561
		venusMagn       0.41609
		mareDensity     0
		terraceProb     0.32871
		erosion         0
		montesMagn      0.43221
		montesFreq      3.4375
		montesSpiky     0.7912
		montesFraction  0.74865
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00094087
		hillsFraction   0.65674
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24241
		craterFreq      0.2129
		craterDensity   0.89198
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43717
		volcanoTemp     1142
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.54116
		BumpOffset      0.27058
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
		Period          0.000684234056
		SemiMajorAxis   0.00120727685
		Eccentricity    0
		Inclination     -0.353797419
		AscendingNode   -135.743319
		ArgOfPericenter -53.0073057
		MeanAnomaly     176.521195
	}
}

Asteroid	"4.S42"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.0845e-14
	Radius          0.18036
	InertiaMoment   0.39999
	Oblateness      0.074156
	Obliquity       -1.1786
	EqAscendNode    -45.396
	TidalLocked     true

	AlbedoBond      0.27053
	AlbedoGeom      0.32464
	Brightness      2.25
	BrightnessReal  1
	Color          (0.703 0.701 0.698)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.23413
		Randomize      (0.460, -0.314, -0.699)
		colorDistMagn   0.27323
		colorDistFreq   1.5835e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.042109
		icecapLatitude  2
		icecapHeight    0.73854
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31235
		heightTempGrad  0.625
		beachWidth      0.001197
		tropicWidth     0.07
		mainFreq        0.46411
		venusFreq       0.63318
		venusMagn       0.87853
		mareDensity     0
		terraceProb     0.59647
		erosion         0
		montesMagn      0.54698
		montesFreq      2.7735
		montesSpiky     0.97266
		montesFraction  0.079571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.6531e-05
		hillsFraction   0.78113
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21671
		craterFreq      0.27731
		craterDensity   1.0017
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49427
		volcanoTemp     989.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.16233
		BumpOffset      0.081163
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
		Period          0.000686910297
		SemiMajorAxis   0.00121042281
		Eccentricity    0
		Inclination     -1.17863938
		AscendingNode   -45.3960127
		ArgOfPericenter -110.370017
		MeanAnomaly     -153.118827
	}
}

Asteroid	"4.S43"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.1409e-10
	Radius          5.4181
	InertiaMoment   0.39887
	Oblateness      0.079891
	Obliquity       -0.68761
	EqAscendNode    -153.6
	TidalLocked     true

	AlbedoBond      0.27469
	AlbedoGeom      0.32963
	Brightness      2.25
	BrightnessReal  1
	Color          (0.487 0.480 0.477)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.8032
		Randomize      (0.730, -0.484, -0.366)
		colorDistMagn   0.29238
		colorDistFreq   0.023031
		detailScale     16
		snowLevel       2
		tropicLatitude  0.037682
		icecapLatitude  2
		icecapHeight    0.65761
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21006
		heightTempGrad  0.625
		beachWidth      0.0012448
		tropicWidth     0.07
		mainFreq        0.73573
		venusFreq       0.65643
		venusMagn       0.84066
		mareDensity     0
		terraceProb     0.21056
		erosion         0
		montesMagn      0.39046
		montesFreq      3.4999
		montesSpiky     0.93755
		montesFraction  0.34271
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.061808
		hillsFraction   0.52771
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2502
		craterFreq      0.22546
		craterDensity   0.83114
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54286
		volcanoTemp     1137.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.8762
		BumpOffset      2.4381
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
		Period          0.000692387017
		SemiMajorAxis   0.00121684807
		Eccentricity    0
		Inclination     -0.687608735
		AscendingNode   -153.597984
		ArgOfPericenter 138.598995
		MeanAnomaly     80.640335
	}
}

Asteroid	"4.S44"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.0359e-12
	Radius          1.296
	InertiaMoment   0.39712
	Oblateness      0.077597
	Obliquity       -0.026688
	EqAscendNode    156.86
	TidalLocked     true

	AlbedoBond      0.27868
	AlbedoGeom      0.33442
	Brightness      2.25
	BrightnessReal  1
	Color          (0.667 0.662 0.659)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.37227
		Randomize      (-0.999, -0.654, -0.033)
		colorDistMagn   0.31095
		colorDistFreq   0.00076052
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034294
		icecapLatitude  2
		icecapHeight    0.59315
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10777
		heightTempGrad  0.625
		beachWidth      0.00069268
		tropicWidth     0.07
		mainFreq        0.53299
		venusFreq       0.727
		venusMagn       0.81859
		mareDensity     0
		terraceProb     0.33951
		erosion         0
		montesMagn      0.51726
		montesFreq      2.8172
		montesSpiky     0.89197
		montesFraction  0.43971
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0029442
		hillsFraction   0.64097
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22769
		craterFreq      0.17667
		craterDensity   0.93131
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44909
		volcanoTemp     985.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.1664
		BumpOffset      0.5832
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
		Period          0.000700250477
		SemiMajorAxis   0.00122604391
		Eccentricity    0
		Inclination     -0.0266882214
		AscendingNode   156.855128
		ArgOfPericenter -161.453893
		MeanAnomaly     86.7288107
	}
}

Asteroid	"4.S45"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.4844e-13
	Radius          0.42202
	InertiaMoment   0.3993
	Oblateness      0.074351
	Obliquity       0.86169
	EqAscendNode    -121.29
	TidalLocked     true

	AlbedoBond      0.28254
	AlbedoGeom      0.33905
	Brightness      2.25
	BrightnessReal  1
	Color          (0.450 0.443 0.438)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94134
		Randomize      (-0.729, -0.824, 0.300)
		colorDistMagn   0.329
		colorDistFreq   0.0001314
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035596
		icecapLatitude  2
		icecapHeight    0.52712
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40547
		heightTempGrad  0.625
		beachWidth      0.00044053
		tropicWidth     0.07
		mainFreq        0.36065
		venusFreq       0.54086
		venusMagn       0.80231
		mareDensity     0
		terraceProb     0.69656
		erosion         0
		montesMagn      0.30305
		montesFreq      3.5713
		montesSpiky     0.7799
		montesFraction  0.5154
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00052403
		hillsFraction   0.75518
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26004
		craterFreq      0.23815
		craterDensity   0.70054
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50053
		volcanoTemp     1232.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.37982
		BumpOffset      0.18991
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
		Period          0.000710319298
		SemiMajorAxis   0.00123776868
		Eccentricity    0
		Inclination     0.861691664
		AscendingNode   -121.292765
		ArgOfPericenter 147.801779
		MeanAnomaly     84.8408902
	}
}

Asteroid	"4.S46"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.7313e-15
	Radius          0.11019
	InertiaMoment   0.39795
	Oblateness      0.068638
	Obliquity       -0.24768
	EqAscendNode    -162.49
	TidalLocked     true

	AlbedoBond      0.2863
	AlbedoGeom      0.34356
	Brightness      2.25
	BrightnessReal  1
	Color          (0.627 0.625 0.623)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5104
		Randomize      (-0.459, -0.994, 0.633)
		colorDistMagn   0.34658
		colorDistFreq   5.0626e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035044
		icecapLatitude  2
		icecapHeight    0.43701
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30318
		heightTempGrad  0.625
		beachWidth      0.0010884
		tropicWidth     0.07
		mainFreq        0.60525
		venusFreq       0.56507
		venusMagn       0.78911
		mareDensity     0
		terraceProb     0.21921
		erosion         0
		montesMagn      0.48902
		montesFreq      2.8596
		montesSpiky     0.97148
		montesFraction  0.58628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.1397e-05
		hillsFraction   0.50239
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23575
		craterFreq      0.1954
		craterDensity   0.87477
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55272
		volcanoTemp     980.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.09917
		BumpOffset      0.049585
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
		Period          0.000712920679
		SemiMajorAxis   0.00124078887
		Eccentricity    0
		Inclination     -0.247675456
		AscendingNode   -162.492576
		ArgOfPericenter -83.7288228
		MeanAnomaly     169.888149
	}
}

Asteroid	"4.S47"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.6654e-11
	Radius          3.1156
	InertiaMoment   0.39971
	Oblateness      0.07609
	Obliquity       0.0884
	EqAscendNode    141.38
	TidalLocked     true

	AlbedoBond      0.28999
	AlbedoGeom      0.34798
	Brightness      2.25
	BrightnessReal  1
	Color          (0.409 0.407 0.404)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.079471
		Randomize      (-0.188, 0.836, 0.966)
		colorDistMagn   0.36373
		colorDistFreq   0.0067644
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034071
		icecapLatitude  2
		icecapHeight    0.80135
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20089
		heightTempGrad  0.625
		beachWidth      0.0011362
		tropicWidth     0.07
		mainFreq        0.4435
		venusFreq       0.58293
		venusMagn       0.77784
		mareDensity     0
		terraceProb     0.35073
		erosion         0
		montesMagn      0.62166
		montesFreq      3.6568
		montesSpiky     0.93616
		montesFraction  0.66222
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.022698
		hillsFraction   0.62522
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28561
		craterFreq      0.25233
		craterDensity   0.97646
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45865
		volcanoTemp     1028.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.804
		BumpOffset      1.402
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
		Period          0.000714601758
		SemiMajorAxis   0.00124273864
		Eccentricity    0
		Inclination     0.0884000422
		AscendingNode   141.375584
		ArgOfPericenter -64.1751993
		MeanAnomaly     -81.0474274
	}
}

Asteroid	"4.S48"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.3223e-12
	Radius          0.87912
	InertiaMoment   0.39852
	Oblateness      0.069277
	Obliquity       0.37018
	EqAscendNode    -96.732
	TidalLocked     true

	AlbedoBond      0.29362
	AlbedoGeom      0.35234
	Brightness      2.25
	BrightnessReal  1
	Color          (0.591 0.589 0.584)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64854
		Randomize      (0.082, 0.666, -0.701)
		colorDistMagn   0.38049
		colorDistFreq   0.00029231
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034021
		icecapLatitude  2
		icecapHeight    0.69252
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4986
		heightTempGrad  0.625
		beachWidth      0.0011841
		tropicWidth     0.07
		mainFreq        0.69816
		venusFreq       0.59879
		venusMagn       0.7679
		mareDensity     0
		terraceProb     0.10604
		erosion         0
		montesMagn      0.45986
		montesFreq      2.9011
		montesSpiky     0.88991
		montesFraction  0.76014
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0016146
		hillsFraction   0.73326
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24316
		craterFreq      0.20962
		craterDensity   0.80766
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5068
		volcanoTemp     1076.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.79121
		BumpOffset      0.3956
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
		Period          0.000722578814
		SemiMajorAxis   0.00125196993
		Eccentricity    0
		Inclination     0.370175649
		AscendingNode   -96.7319711
		ArgOfPericenter -76.8108948
		MeanAnomaly     -179.260319
	}
}

Asteroid	"4.S49"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.9401e-14
	Radius          0.29077
	InertiaMoment   0.39585
	Oblateness      0.071271
	Obliquity       0.98115
	EqAscendNode    -44.257
	TidalLocked     true

	AlbedoBond      0.29721
	AlbedoGeom      0.35665
	Brightness      2.25
	BrightnessReal  1
	Color          (0.771 0.768 0.766)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.21761
		Randomize      (0.353, 0.496, -0.368)
		colorDistMagn   0.3969
		colorDistFreq   5.5771e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036276
		icecapLatitude  2
		icecapHeight    0.62344
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39631
		heightTempGrad  0.625
		beachWidth      0.00063195
		tropicWidth     0.07
		mainFreq        0.5134
		venusFreq       0.61453
		venusMagn       0.75893
		mareDensity     0
		terraceProb     0.2279
		erosion         0
		montesMagn      0.57584
		montesFreq      3.7675
		montesSpiky     0.7648
		montesFraction  0.15065
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00014541
		hillsFraction   0.47007
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21812
		craterFreq      0.27092
		craterDensity   0.91389
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56523
		volcanoTemp     1023.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.26169
		BumpOffset      0.13084
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
		Period          0.000729184209
		SemiMajorAxis   0.0012595882
		Eccentricity    0
		Inclination     0.981148603
		AscendingNode   -44.2568766
		ArgOfPericenter 115.337128
		MeanAnomaly     -152.468344
	}
}

Asteroid	"4.S50"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.6101e-16
	Radius          0.057689
	InertiaMoment   0.399
	Oblateness      0.066027
	Obliquity       1.4517
	EqAscendNode    -81.773
	TidalLocked     true

	AlbedoBond      0.30079
	AlbedoGeom      0.36095
	Brightness      2.25
	BrightnessReal  1
	Color          (0.556 0.549 0.545)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.78667
		Randomize      (0.623, 0.326, -0.035)
		colorDistMagn   0.41299
		colorDistFreq   1.1146e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.039911
		icecapLatitude  2
		icecapHeight    0.55992
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29401
		heightTempGrad  0.625
		beachWidth      0.0006798
		tropicWidth     0.07
		mainFreq        0.33057
		venusFreq       0.6319
		venusMagn       0.75069
		mareDensity     0
		terraceProb     0.36245
		erosion         0
		montesMagn      0.42672
		montesFreq      2.9418
		montesSpiky     0.97029
		montesFraction  0.35404
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6891e-06
		hillsFraction   0.60923
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25105
		craterFreq      0.22232
		craterDensity   1.0496
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46689
		volcanoTemp     253.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.05192
		BumpOffset      0.02596
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
		Period          0.000738129933
		SemiMajorAxis   0.00126986911
		Eccentricity    0
		Inclination     1.45172776
		AscendingNode   -81.7730916
		ArgOfPericenter -82.6208854
		MeanAnomaly     -150.359537
	}
}

Asteroid	"4.S51"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.4986e-11
	Radius          1.9337
	InertiaMoment   0.3974
	Oblateness      0.063943
	Obliquity       0.16041
	EqAscendNode    56.779
	TidalLocked     true

	AlbedoBond      0.30438
	AlbedoGeom      0.36525
	Brightness      2.25
	BrightnessReal  1
	Color          (0.735 0.731 0.727)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.35574
		Randomize      (0.893, 0.156, 0.298)
		colorDistMagn   0.42879
		colorDistFreq   0.0023362
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03399
		icecapLatitude  2
		icecapHeight    0.48621
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19172
		heightTempGrad  0.625
		beachWidth      0.0010277
		tropicWidth     0.07
		mainFreq        0.58352
		venusFreq       0.65452
		venusMagn       0.74302
		mareDensity     0
		terraceProb     0.11557
		erosion         0
		montesMagn      0.54225
		montesFreq      3.9383
		montesSpiky     0.93476
		montesFraction  0.44756
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0096086
		hillsFraction   0.7138
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22857
		craterFreq      0.17019
		craterDensity   0.85677
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51317
		volcanoTemp     1119.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7403
		BumpOffset      0.87016
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
		Period          0.000746424438
		SemiMajorAxis   0.00127936456
		Eccentricity    0
		Inclination     0.160405485
		AscendingNode   56.7787251
		ArgOfPericenter 82.9531411
		MeanAnomaly     -27.6390214
	}
}

Asteroid	"4.S52"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.904e-13
	Radius          0.60525
	InertiaMoment   0.39942
	Oblateness      0.061697
	Obliquity       -0.52757
	EqAscendNode    16.357
	TidalLocked     true

	AlbedoBond      0.30799
	AlbedoGeom      0.36958
	Brightness      2.25
	BrightnessReal  1
	Color          (0.515 0.513 0.510)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.92481
		Randomize      (-0.836, -0.014, 0.631)
		colorDistMagn   0.44433
		colorDistFreq   0.00010406
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036558
		icecapLatitude  2
		icecapHeight    0.33465
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48943
		heightTempGrad  0.625
		beachWidth      0.0010755
		tropicWidth     0.07
		mainFreq        0.42194
		venusFreq       0.71018
		venusMagn       0.73581
		mareDensity     0
		terraceProb     0.23663
		erosion         0
		montesMagn      0.3823
		montesFreq      2.9822
		montesSpiky     0.8878
		montesFraction  0.52229
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00085136
		hillsFraction   0.42046
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26131
		craterFreq      0.23487
		craterDensity   0.95537
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58415
		volcanoTemp     967.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.54472
		BumpOffset      0.27236
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
		Period          0.000750996387
		SemiMajorAxis   0.00128458342
		Eccentricity    0
		Inclination     -0.527570504
		AscendingNode   16.3568408
		ArgOfPericenter 147.115741
		MeanAnomaly     15.4241133
	}
}

Asteroid	"4.S53"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.2725e-14
	Radius          0.18292
	InertiaMoment   0.39813
	Oblateness      0.057876
	Obliquity       1.316
	EqAscendNode    -174.42
	TidalLocked     true

	AlbedoBond      0.31164
	AlbedoGeom      0.37396
	Brightness      2.25
	BrightnessReal  1
	Color          (0.696 0.694 0.691)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49388
		Randomize      (-0.566, -0.184, 0.964)
		colorDistMagn   0.45962
		colorDistFreq   1.9788e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038719
		icecapLatitude  2
		icecapHeight    0.73451
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38714
		heightTempGrad  0.625
		beachWidth      0.0011234
		tropicWidth     0.07
		mainFreq        0.66738
		venusFreq       0.53872
		venusMagn       0.72898
		mareDensity     0
		terraceProb     0.37476
		erosion         0
		montesMagn      0.51293
		montesFreq      1.5481
		montesSpiky     0.74103
		montesFraction  0.59323
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.9343e-05
		hillsFraction   0.59275
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23651
		craterFreq      0.1913
		craterDensity   0.77748
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47432
		volcanoTemp     1314.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.16463
		BumpOffset      0.082314
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
		Period          0.000757948355
		SemiMajorAxis   0.00129249883
		Eccentricity    0
		Inclination     1.31597477
		AscendingNode   -174.415926
		ArgOfPericenter 111.732532
		MeanAnomaly     -105.050061
	}
}

Asteroid	"4.S54"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.8318e-10
	Radius          5.4617
	InertiaMoment   0.39981
	Oblateness      0.05971
	Obliquity       -0.80418
	EqAscendNode    -65.987
	TidalLocked     true

	AlbedoBond      0.31535
	AlbedoGeom      0.37842
	Brightness      2.25
	BrightnessReal  1
	Color          (0.479 0.473 0.470)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.062944
		Randomize      (-0.296, -0.353, -0.703)
		colorDistMagn   0.47469
		colorDistFreq   0.0065345
		detailScale     16
		snowLevel       2
		tropicLatitude  0.038607
		icecapLatitude  2
		icecapHeight    0.65489
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28485
		heightTempGrad  0.625
		beachWidth      0.0014712
		tropicWidth     0.07
		mainFreq        0.49382
		venusFreq       0.56374
		venusMagn       0.72245
		mareDensity     0
		terraceProb     0.12491
		erosion         0
		montesMagn      0.25616
		montesFreq      3.0224
		montesSpiky     0.9691
		montesFraction  0.67029
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.050218
		hillsFraction   0.69591
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.18836
		craterFreq      0.2485
		craterDensity   0.89689
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51977
		volcanoTemp     962.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.9156
		BumpOffset      2.4578
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
		Period          0.00076241385
		SemiMajorAxis   0.00129757041
		Eccentricity    0
		Inclination     -0.804184608
		AscendingNode   -65.986583
		ArgOfPericenter -96.6311655
		MeanAnomaly     127.900812
	}
}

Asteroid	"4.S55"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.5721e-12
	Radius          1.3006
	InertiaMoment   0.39866
	Oblateness      0.060757
	Obliquity       -0.3555
	EqAscendNode    -78.106
	TidalLocked     true

	AlbedoBond      0.31915
	AlbedoGeom      0.38298
	Brightness      2.25
	BrightnessReal  1
	Color          (0.660 0.655 0.652)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.63201
		Randomize      (-0.025, -0.523, -0.370)
		colorDistMagn   0.48956
		colorDistFreq   0.00094521
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035556
		icecapLatitude  2
		icecapHeight    0.59064
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18255
		heightTempGrad  0.625
		beachWidth      0.0012191
		tropicWidth     0.07
		mainFreq        0.29425
		venusFreq       0.58183
		venusMagn       0.71618
		mareDensity     0
		terraceProb     0.24544
		erosion         0
		montesMagn      0.4847
		montesFreq      2.0871
		montesSpiky     0.93335
		montesFraction  0.77237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0048763
		hillsFraction   0.90764
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24392
		craterFreq      0.20624
		craterDensity   1.0103
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.36603
		volcanoTemp     1110.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.1705
		BumpOffset      0.58527
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
		Period          0.000769118848
		SemiMajorAxis   0.0013051669
		Eccentricity    0
		Inclination     -0.355503538
		AscendingNode   -78.1063342
		ArgOfPericenter -156.319695
		MeanAnomaly     179.034499
	}
}

Asteroid	"4.S56"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.6677e-13
	Radius          0.42589
	InertiaMoment   0.39652
	Oblateness      0.059099
	Obliquity       1.111
	EqAscendNode    -157.56
	TidalLocked     true

	AlbedoBond      0.32306
	AlbedoGeom      0.38768
	Brightness      2.25
	BrightnessReal  1
	Color          (0.443 0.437 0.432)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.20108
		Randomize      (0.245, -0.693, -0.037)
		colorDistMagn   0.50424
		colorDistFreq   2.1434e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037134
		icecapLatitude  2
		icecapHeight    0.52423
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48026
		heightTempGrad  0.625
		beachWidth      0.00096693
		tropicWidth     0.07
		mainFreq        0.56279
		venusFreq       0.59776
		venusMagn       0.71013
		mareDensity     0
		terraceProb     0.38776
		erosion         0
		montesMagn      0.61314
		montesFreq      3.0628
		montesSpiky     0.88564
		montesFraction  0.19148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00046322
		hillsFraction   0.57544
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21943
		craterFreq      0.26547
		craterDensity   0.83723
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48122
		volcanoTemp     1158
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.3833
		BumpOffset      0.19165
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
		Period          0.000775397911
		SemiMajorAxis   0.00131226083
		Eccentricity    0
		Inclination     1.11100594
		AscendingNode   -157.56496
		ArgOfPericenter -27.6964452
		MeanAnomaly     70.3573015
	}
}

Asteroid	"4.S57"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.259e-15
	Radius          0.11269
	InertiaMoment   0.39912
	Oblateness      0.055767
	Obliquity       -0.71305
	EqAscendNode    -123.43
	TidalLocked     true

	AlbedoBond      0.32713
	AlbedoGeom      0.39255
	Brightness      2.25
	BrightnessReal  1
	Color          (0.624 0.619 0.613)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.77015
		Randomize      (0.516, -0.863, 0.296)
		colorDistMagn   0.51876
		colorDistFreq   6.6843e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037877
		icecapLatitude  2
		icecapHeight    0.43197
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37797
		heightTempGrad  0.625
		beachWidth      0.0010148
		tropicWidth     0.07
		mainFreq        0.39898
		venusFreq       0.61346
		venusMagn       0.70425
		mareDensity     0
		terraceProb     0.13409
		erosion         0
		montesMagn      0.45517
		montesFreq      2.2471
		montesSpiky     0.65409
		montesFraction  0.36477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9332e-05
		hillsFraction   0.67906
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25193
		craterFreq      0.21918
		craterDensity   0.9365
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52673
		volcanoTemp     1105.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10142
		BumpOffset      0.050711
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
		Period          0.000777576141
		SemiMajorAxis   0.00131471726
		Eccentricity    0
		Inclination     -0.713053477
		AscendingNode   -123.425189
		ArgOfPericenter 22.2467782
		MeanAnomaly     -146.922817
	}
}

Asteroid	"4.S58"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0634e-10
	Radius          3.1097
	InertiaMoment   0.39763
	Oblateness      0.056173
	Obliquity       0.87021
	EqAscendNode    100.24
	TidalLocked     true

	AlbedoBond      0.33137
	AlbedoGeom      0.39765
	Brightness      2.25
	BrightnessReal  1
	Color          (0.801 0.800 0.798)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33921
		Randomize      (0.786, 0.967, 0.629)
		colorDistMagn   0.53312
		colorDistFreq   0.0082715
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035641
		icecapLatitude  2
		icecapHeight    0.79455
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27568
		heightTempGrad  0.625
		beachWidth      0.0013626
		tropicWidth     0.07
		mainFreq        0.64062
		venusFreq       0.63065
		venusMagn       0.69852
		mareDensity     0
		terraceProb     0.25434
		erosion         0
		montesMagn      0.57025
		montesFreq      3.1036
		montesSpiky     0.96791
		montesFraction  0.45525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019875
		hillsFraction   0.83154
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22944
		craterFreq      0.1621
		craterDensity   0.72786
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41942
		volcanoTemp     953.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.7987
		BumpOffset      1.3993
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
		Period          0.000787599813
		SemiMajorAxis   0.00132599174
		Eccentricity    0
		Inclination     0.870207549
		AscendingNode   100.242926
		ArgOfPericenter 47.780376
		MeanAnomaly     -177.943111
	}
}

Asteroid	"4.S59"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.4908e-12
	Radius          0.91739
	InertiaMoment   0.39953
	Oblateness      0.06164
	Obliquity       0.76614
	EqAscendNode    4.1276
	TidalLocked     true

	AlbedoBond      0.33586
	AlbedoGeom      0.40303
	Brightness      2.25
	BrightnessReal  1
	Color          (0.584 0.579 0.577)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.90828
		Randomize      (-0.944, 0.797, 0.962)
		colorDistMagn   0.54735
		colorDistFreq   0.0004154
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035132
		icecapLatitude  2
		icecapHeight    0.68943
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17339
		heightTempGrad  0.625
		beachWidth      0.0011105
		tropicWidth     0.07
		mainFreq        0.47403
		venusFreq       0.65269
		venusMagn       0.69292
		mareDensity     0
		terraceProb     0.40161
		erosion         0
		montesMagn      0.421
		montesFreq      2.3539
		montesSpiky     0.93192
		montesFraction  0.52916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0013823
		hillsFraction   0.55686
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26267
		craterFreq      0.23166
		craterDensity   0.8798
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48778
		volcanoTemp     1301.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.82565
		BumpOffset      0.41282
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
		Period          0.000789989594
		SemiMajorAxis   0.00132867265
		Eccentricity    0
		Inclination     0.766136839
		AscendingNode   4.12763268
		ArgOfPericenter -95.1724186
		MeanAnomaly     32.7670776
	}
}

Asteroid	"4.S60"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.5673e-14
	Radius          0.28822
	InertiaMoment   0.39829
	Oblateness      0.054678
	Obliquity       0.72621
	EqAscendNode    -74.059
	TidalLocked     true

	AlbedoBond      0.34066
	AlbedoGeom      0.40879
	Brightness      2.25
	BrightnessReal  1
	Color          (0.764 0.761 0.759)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.47735
		Randomize      (-0.673, 0.627, -0.705)
		colorDistMagn   0.56146
		colorDistFreq   6.6058e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03496
		icecapLatitude  2
		icecapHeight    0.62091
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47109
		heightTempGrad  0.625
		beachWidth      0.00085835
		tropicWidth     0.07
		mainFreq        0.7585
		venusFreq       0.70069
		venusMagn       0.68741
		mareDensity     0
		terraceProb     0.14313
		erosion         0
		montesMagn      0.53761
		montesFreq      3.1451
		montesSpiky     0.88343
		montesFraction  0.60024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00023725
		hillsFraction   0.66286
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23727
		craterFreq      0.18687
		craterDensity   0.9832
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53426
		volcanoTemp     949
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.2594
		BumpOffset      0.1297
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
		Period          0.000794587676
		SemiMajorAxis   0.00133382329
		Eccentricity    0
		Inclination     0.726212588
		AscendingNode   -74.0588962
		ArgOfPericenter 103.855084
		MeanAnomaly     -159.260558
	}
}

Asteroid	"4.S61"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.7014e-16
	Radius          0.061545
	InertiaMoment   0.39992
	Oblateness      0.058398
	Obliquity       0.42422
	EqAscendNode    75.185
	TidalLocked     true

	AlbedoBond      0.34587
	AlbedoGeom      0.41504
	Brightness      2.25
	BrightnessReal  1
	Color          (0.548 0.542 0.538)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.046416
		Randomize      (-0.403, 0.457, -0.372)
		colorDistMagn   0.57545
		colorDistFreq   1.7419e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034092
		icecapLatitude  2
		icecapHeight    0.55731
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3688
		heightTempGrad  0.625
		beachWidth      0.00060621
		tropicWidth     0.07
		mainFreq        0.54273
		venusFreq       0.53648
		venusMagn       0.68199
		mareDensity     0
		terraceProb     0.26335
		erosion         0
		montesMagn      0.37327
		montesFreq      2.4374
		montesSpiky     0.99893
		montesFraction  0.67856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6139e-06
		hillsFraction   0.79281
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19882
		craterFreq      0.24487
		craterDensity   0.81492
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43687
		volcanoTemp     270.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.05539
		BumpOffset      0.027695
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
		Period          0.000802621446
		SemiMajorAxis   0.00134279873
		Eccentricity    0
		Inclination     0.424215237
		AscendingNode   75.1850639
		ArgOfPericenter 75.2636568
		MeanAnomaly     -16.4801668
	}
}

Asteroid	"4.S62"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.71e-11
	Radius          1.9561
	InertiaMoment   0.3988
	Oblateness      0.052892
	Obliquity       -0.030101
	EqAscendNode    30.416
	TidalLocked     true

	AlbedoBond      0.35162
	AlbedoGeom      0.42195
	Brightness      2.25
	BrightnessReal  1
	Color          (0.728 0.724 0.721)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.61548
		Randomize      (-0.132, 0.287, -0.039)
		colorDistMagn   0.58935
		colorDistFreq   0.0028575
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034303
		icecapLatitude  2
		icecapHeight    0.48269
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26651
		heightTempGrad  0.625
		beachWidth      0.0015541
		tropicWidth     0.07
		mainFreq        0.374
		venusFreq       0.56238
		venusMagn       0.67663
		mareDensity     0
		terraceProb     0.4165
		erosion         0
		montesMagn      0.50863
		montesFreq      3.1877
		montesSpiky     0.96671
		montesFraction  0.78549
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0087835
		hillsFraction   0.53633
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24468
		craterFreq      0.20275
		craterDensity   0.91886
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49413
		volcanoTemp     944.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7605
		BumpOffset      0.88026
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
		Period          0.000803913452
		SemiMajorAxis   0.00134423937
		Eccentricity    0
		Inclination     -0.0301006506
		AscendingNode   30.4164132
		ArgOfPericenter -32.7212218
		MeanAnomaly     5.12139036
	}
}

Asteroid	"4.S63"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.4708e-13
	Radius          0.60474
	InertiaMoment   0.39693
	Oblateness      0.048779
	Obliquity       -1.1398
	EqAscendNode    149.01
	TidalLocked     true

	AlbedoBond      0.35816
	AlbedoGeom      0.4298
	Brightness      2.25
	BrightnessReal  1
	Color          (0.651 0.533 0.360)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.18455
		Randomize      (0.138, 0.117, 0.294)
		colorDistMagn   0.60317
		colorDistFreq   0.00015524
		detailScale     8
		snowLevel       2
		tropicLatitude  0.041712
		icecapLatitude  2
		icecapHeight    0.31773
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16422
		heightTempGrad  0.625
		beachWidth      0.0016019
		tropicWidth     0.07
		mainFreq        0.61647
		venusFreq       0.58072
		venusMagn       0.67132
		mareDensity     0
		terraceProb     0.15205
		erosion         0
		montesMagn      0.68277
		montesFreq      2.5076
		montesSpiky     0.93048
		montesFraction  0.22124
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00074529
		hillsFraction   0.64702
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22065
		craterFreq      0.26063
		craterDensity   1.0666
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54266
		volcanoTemp     992.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.54427
		BumpOffset      0.27213
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
		Period          0.000811050125
		SemiMajorAxis   0.00135218323
		Eccentricity    0
		Inclination     -1.13983452
		AscendingNode   149.012852
		ArgOfPericenter -143.658741
		MeanAnomaly     22.9776611
	}
}

Asteroid	"4.S64"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.4753e-14
	Radius          0.19716
	InertiaMoment   0.39924
	Oblateness      0.058124
	Obliquity       0.36773
	EqAscendNode    -150.56
	TidalLocked     true

	AlbedoBond      0.36589
	AlbedoGeom      0.43906
	Brightness      2.25
	BrightnessReal  1
	Color          (0.727 0.667 0.646)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.75362
		Randomize      (0.408, -0.053, 0.627)
		colorDistMagn   0.61691
		colorDistFreq   2.74e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034018
		icecapLatitude  2
		icecapHeight    0.73059
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46192
		heightTempGrad  0.625
		beachWidth      0.0010498
		tropicWidth     0.07
		mainFreq        0.45376
		venusFreq       0.59672
		venusMagn       0.66605
		mareDensity     0
		terraceProb     0.27248
		erosion         0
		montesMagn      0.48036
		montesFreq      3.2316
		montesSpiky     0.88116
		montesFraction  0.37499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.2013e-05
		hillsFraction   0.76454
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25283
		craterFreq      0.216
		craterDensity   0.86209
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44886
		volcanoTemp     1240
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.17744
		BumpOffset      0.088721
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
		Period          0.0008126089
		SemiMajorAxis   0.0013539152
		Eccentricity    0
		Inclination     0.367732067
		AscendingNode   -150.561492
		ArgOfPericenter -30.0021311
		MeanAnomaly     -2.60427148
	}
}

Asteroid	"4.S65"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.6362e-10
	Radius          5.9007
	InertiaMoment   0.39784
	Oblateness      0.056588
	Obliquity       0.36731
	EqAscendNode    -33.99
	TidalLocked     true

	AlbedoBond      0.37561
	AlbedoGeom      0.45074
	Brightness      2.25
	BrightnessReal  1
	Color          (0.544 0.443 0.391)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.32269
		Randomize      (0.679, -0.223, 0.960)
		colorDistMagn   0.63059
		colorDistFreq   0.013455
		detailScale     16
		snowLevel       2
		tropicLatitude  0.034018
		icecapLatitude  2
		icecapHeight    0.6522
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35963
		heightTempGrad  0.625
		beachWidth      0.0010976
		tropicWidth     0.07
		mainFreq        0.71556
		venusFreq       0.61239
		venusMagn       0.66078
		mareDensity     0
		terraceProb     0.43271
		erosion         0
		montesMagn      0.60536
		montesFreq      2.5692
		montesSpiky     0.9978
		montesFraction  0.46281
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.098561
		hillsFraction   0.51271
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23028
		craterFreq      0.15071
		craterDensity   0.96118
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50039
		volcanoTemp     1187.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.3106
		BumpOffset      2.6553
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
		Period          0.000821375638
		SemiMajorAxis   0.00136363548
		Eccentricity    0
		Inclination     0.367307278
		AscendingNode   -33.9904426
		ArgOfPericenter 122.291957
		MeanAnomaly     103.509336
	}
}

Asteroid	"4.S66"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.152e-12
	Radius          1.348
	InertiaMoment   0.39964
	Oblateness      0.055004
	Obliquity       -0.40074
	EqAscendNode    176.16
	TidalLocked     true

	AlbedoBond      0.38954
	AlbedoGeom      0.46744
	Brightness      2.25
	BrightnessReal  1
	Color          (0.718 0.637 0.579)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.89175
		Randomize      (0.949, -0.393, -0.707)
		colorDistMagn   0.64421
		colorDistFreq   0.0012121
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035798
		icecapLatitude  2
		icecapHeight    0.58813
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25734
		heightTempGrad  0.625
		beachWidth      0.0011455
		tropicWidth     0.07
		mainFreq        0.52304
		venusFreq       0.62941
		venusMagn       0.65552
		mareDensity     0
		terraceProb     0.16089
		erosion         0
		montesMagn      0.45039
		montesFreq      3.2774
		montesSpiky     0.96551
		montesFraction  0.536
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0045842
		hillsFraction   0.63128
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26415
		craterFreq      0.22849
		craterDensity   0.78726
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55248
		volcanoTemp     1035.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.2132
		BumpOffset      0.60661
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
		Period          0.000823566097
		SemiMajorAxis   0.00136605878
		Eccentricity    0
		Inclination     -0.400739088
		AscendingNode   176.159854
		ArgOfPericenter 161.65408
		MeanAnomaly     45.7320116
	}
}

Asteroid	"4.S67"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.8638e-13
	Radius          0.43574
	InertiaMoment   0.39844
	Oblateness      0.051318
	Obliquity       0.3708
	EqAscendNode    140.21
	TidalLocked     true

	AlbedoBond      0.42021
	AlbedoGeom      0.50425
	Brightness      2.25
	BrightnessReal  1
	Color          (0.530 0.429 0.330)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46082
		Randomize      (-0.781, -0.563, -0.374)
		colorDistMagn   0.6578
		colorDistFreq   6.5364e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034021
		icecapLatitude  2
		icecapHeight    0.52132
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15505
		heightTempGrad  0.625
		beachWidth      0.0011933
		tropicWidth     0.07
		mainFreq        0.34598
		venusFreq       0.65092
		venusMagn       0.65025
		mareDensity     0
		terraceProb     0.28178
		erosion         0
		montesMagn      0.56487
		montesFreq      2.6249
		montesSpiky     0.92903
		montesFraction  0.6073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0004331
		hillsFraction   0.74133
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23801
		craterFreq      0.18198
		craterDensity   0.90179
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45846
		volcanoTemp     1283.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.39217
		BumpOffset      0.19608
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
		Period          0.000834130704
		SemiMajorAxis   0.00137771637
		Eccentricity    0
		Inclination     0.370796262
		AscendingNode   140.206551
		ArgOfPericenter -8.70737163
		MeanAnomaly     -165.289806
	}
}

Asteroid	"4.S68"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.8354e-15
	Radius          0.1113
	InertiaMoment   0.39505
	Oblateness      0.040448
	Obliquity       -0.30538
	EqAscendNode    33.616
	TidalLocked     true

	AlbedoBond      0.19781
	AlbedoGeom      0.23738
	Brightness      2.25
	BrightnessReal  1
	Color          (0.715 0.626 0.507)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.029889
		Randomize      (-0.510, -0.733, -0.041)
		colorDistMagn   0.67135
		colorDistFreq   7.827e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035306
		icecapLatitude  2
		icecapHeight    0.42671
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45276
		heightTempGrad  0.625
		beachWidth      0.00094119
		tropicWidth     0.07
		mainFreq        0.59408
		venusFreq       0.69386
		venusMagn       0.64495
		mareDensity     0
		terraceProb     0.4506
		erosion         0
		montesMagn      0.41501
		montesFreq      3.3257
		montesSpiky     0.87883
		montesFraction  0.68706
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5026e-05
		hillsFraction   0.48368
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20366
		craterFreq      0.24139
		craterDensity   1.0198
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50666
		volcanoTemp     1130.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10017
		BumpOffset      0.050087
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
		Period          0.000844349885
		SemiMajorAxis   0.00138894606
		Eccentricity    0
		Inclination     -0.305378008
		AscendingNode   33.6157293
		ArgOfPericenter -117.915552
		MeanAnomaly     -133.223642
	}
}

Asteroid	"4.S69"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1715e-10
	Radius          3.3272
	InertiaMoment   0.39893
	Oblateness      0.054108
	Obliquity       -0.13488
	EqAscendNode    111.77
	TidalLocked     true

	AlbedoBond      0.2173
	AlbedoGeom      0.26075
	Brightness      2.25
	BrightnessReal  1
	Color          (0.813 0.799 0.771)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.59896
		Randomize      (-0.240, -0.902, 0.292)
		colorDistMagn   0.68489
		colorDistFreq   0.0032692
		detailScale     16
		snowLevel       2
		tropicLatitude  0.03461
		icecapLatitude  2
		icecapHeight    0.78817
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35046
		heightTempGrad  0.625
		beachWidth      0.00098904
		tropicWidth     0.07
		mainFreq        0.43271
		venusFreq       0.53409
		venusMagn       0.63961
		mareDensity     0
		terraceProb     0.16964
		erosion         0
		montesMagn      0.53306
		montesFreq      2.6763
		montesSpiky     0.99666
		montesFraction  0.7997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.017039
		hillsFraction   0.61542
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24545
		craterFreq      0.1991
		craterDensity   0.84309
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56491
		volcanoTemp     978.65
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.9945
		BumpOffset      1.4972
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
		Period          0.000848245895
		SemiMajorAxis   0.00139321538
		Eccentricity    0
		Inclination     -0.134875988
		AscendingNode   111.768018
		ArgOfPericenter -2.03453315
		MeanAnomaly     -54.097864
	}
}

Asteroid	"4.S70"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.6718e-12
	Radius          0.90873
	InertiaMoment   0.39725
	Oblateness      0.046924
	Obliquity       0.47204
	EqAscendNode    27.224
	TidalLocked     true

	AlbedoBond      0.22894
	AlbedoGeom      0.27472
	Brightness      2.25
	BrightnessReal  1
	Color          (0.631 0.552 0.515)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.16802
		Randomize      (0.031, 0.928, 0.625)
		colorDistMagn   0.69841
		colorDistFreq   0.00049395
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034177
		icecapLatitude  2
		icecapHeight    0.68638
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24817
		heightTempGrad  0.625
		beachWidth      0.0013369
		tropicWidth     0.07
		mainFreq        0.68193
		venusFreq       0.561
		venusMagn       0.63421
		mareDensity     0
		terraceProb     0.29125
		erosion         0
		montesMagn      0.36307
		montesFreq      3.3772
		montesSpiky     0.9643
		montesFraction  0.24512
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0023179
		hillsFraction   0.72105
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22181
		craterFreq      0.25624
		craterDensity   0.94179
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46673
		volcanoTemp     1126.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.81786
		BumpOffset      0.40893
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
		Period          0.000858193395
		SemiMajorAxis   0.00140408649
		Eccentricity    0
		Inclination     0.472037353
		AscendingNode   27.224225
		ArgOfPericenter -146.178679
		MeanAnomaly     128.151448
	}
}

Asteroid	"4.S71"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.2401e-14
	Radius          0.29927
	InertiaMoment   0.39935
	Oblateness      0.047933
	Obliquity       -1.1484
	EqAscendNode    59.491
	TidalLocked     true

	AlbedoBond      0.23764
	AlbedoGeom      0.28517
	Brightness      2.25
	BrightnessReal  1
	Color          (0.796 0.745 0.713)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73709
		Randomize      (0.301, 0.758, 0.958)
		colorDistMagn   0.71193
		colorDistFreq   2.0967e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.041799
		icecapLatitude  2
		icecapHeight    0.61838
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14588
		heightTempGrad  0.625
		beachWidth      0.00078475
		tropicWidth     0.07
		mainFreq        0.50349
		venusFreq       0.5796
		venusMagn       0.62874
		mareDensity     0
		terraceProb     0.47076
		erosion         0
		montesMagn      0.50434
		montesFreq      2.7244
		montesSpiky     0.92756
		montesFraction  0.38477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00022457
		hillsFraction   0.44309
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25376
		craterFreq      0.21278
		craterDensity   0.74629
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51303
		volcanoTemp     1074.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.26934
		BumpOffset      0.13467
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
		Period          0.000866330598
		SemiMajorAxis   0.00141294801
		Eccentricity    0
		Inclination     -1.14838196
		AscendingNode   59.4909561
		ArgOfPericenter -134.122023
		MeanAnomaly     148.633623
	}
}

Asteroid	"4.S72"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.9291e-16
	Radius          0.065385
	InertiaMoment   0.39803
	Oblateness      0.050687
	Obliquity       -1.0247
	EqAscendNode    -62.714
	TidalLocked     true

	AlbedoBond      0.24479
	AlbedoGeom      0.29375
	Brightness      2.25
	BrightnessReal  1
	Color          (0.631 0.530 0.441)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30616
		Randomize      (0.571, 0.588, -0.709)
		colorDistMagn   0.72546
		colorDistFreq   2.4172e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.040579
		icecapLatitude  2
		icecapHeight    0.55468
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44359
		heightTempGrad  0.625
		beachWidth      0.00083261
		tropicWidth     0.07
		mainFreq        0.31317
		venusFreq       0.59569
		venusMagn       0.62316
		mareDensity     0
		terraceProb     0.17834
		erosion         0
		montesMagn      0.66365
		montesFreq      3.4331
		montesSpiky     0.87642
		montesFraction  0.47024
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6903e-06
		hillsFraction   0.59916
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23111
		craterFreq      0.27705
		craterDensity   0.88478
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5836
		volcanoTemp     428.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.058846
		BumpOffset      0.029423
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
		Period          0.000873023315
		SemiMajorAxis   0.0014202157
		Eccentricity    0
		Inclination     -1.02468502
		AscendingNode   -62.7137556
		ArgOfPericenter -45.4076399
		MeanAnomaly     -49.0434751
	}
}

Asteroid	"4.S73"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.9413e-11
	Radius          2.0696
	InertiaMoment   0.39975
	Oblateness      0.048138
	Obliquity       -1.2241
	EqAscendNode    -66.695
	TidalLocked     true

	AlbedoBond      0.25095
	AlbedoGeom      0.30114
	Brightness      2.25
	BrightnessReal  1
	Color          (0.785 0.724 0.649)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87523
		Randomize      (0.842, 0.418, -0.376)
		colorDistMagn   0.73901
		colorDistFreq   0.00061903
		detailScale     8
		snowLevel       2
		tropicLatitude  0.042582
		icecapLatitude  2
		icecapHeight    0.4791
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3413
		heightTempGrad  0.625
		beachWidth      0.00058046
		tropicWidth     0.07
		mainFreq        0.57291
		venusFreq       0.61133
		venusMagn       0.61747
		mareDensity     0
		terraceProb     0.30093
		erosion         0
		montesMagn      0.47598
		montesFreq      2.7702
		montesSpiky     0.99552
		montesFraction  0.54282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0085737
		hillsFraction   0.70264
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26577
		craterFreq      0.22534
		craterDensity   0.99034
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47417
		volcanoTemp     1169.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.8626
		BumpOffset      0.93132
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
		Period          0.0008818266
		SemiMajorAxis   0.00142974706
		Eccentricity    0
		Inclination     -1.22405819
		AscendingNode   -66.6948263
		ArgOfPericenter -119.957024
		MeanAnomaly     -120.820321
	}
}

Asteroid	"4.S74"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.0779e-13
	Radius          0.63879
	InertiaMoment   0.39858
	Oblateness      0.045302
	Obliquity       0.91135
	EqAscendNode    -88.514
	TidalLocked     true

	AlbedoBond      0.25645
	AlbedoGeom      0.30774
	Brightness      2.25
	BrightnessReal  1
	Color          (0.635 0.533 0.362)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.44429
		Randomize      (-0.888, 0.248, -0.043)
		colorDistMagn   0.75259
		colorDistFreq   0.00021749
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035866
		icecapLatitude  2
		icecapHeight    0.97826
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.239
		heightTempGrad  0.625
		beachWidth      0.00092832
		tropicWidth     0.07
		mainFreq        0.41051
		venusFreq       0.62819
		venusMagn       0.61164
		mareDensity     0
		terraceProb     0.49412
		erosion         0
		montesMagn      0.59818
		montesFreq      3.495
		montesSpiky     0.96309
		montesFraction  0.61444
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00059911
		hillsFraction   0.35497
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23876
		craterFreq      0.17644
		craterDensity   0.82176
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51962
		volcanoTemp     1017.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.57491
		BumpOffset      0.28746
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
		Period          0.000885336691
		SemiMajorAxis   0.0014335386
		Eccentricity    0
		Inclination     0.91134879
		AscendingNode   -88.5144968
		ArgOfPericenter -130.179461
		MeanAnomaly     172.267395
	}
}

Asteroid	"4.S75"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.694e-14
	Radius          0.20282
	InertiaMoment   0.39619
	Oblateness      0.048287
	Obliquity       -1.0344
	EqAscendNode    -73.227
	TidalLocked     true

	AlbedoBond      0.26146
	AlbedoGeom      0.31376
	Brightness      2.25
	BrightnessReal  1
	Color          (0.714 0.665 0.644)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.013362
		Randomize      (-0.617, 0.078, 0.290)
		colorDistMagn   0.7662
		colorDistFreq   3.5793e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.040672
		icecapLatitude  2
		icecapHeight    0.72677
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13671
		heightTempGrad  0.625
		beachWidth      0.00067617
		tropicWidth     0.07
		mainFreq        0.65342
		venusFreq       0.64922
		venusMagn       0.60564
		mareDensity     0
		terraceProb     0.187
		erosion         0
		montesMagn      0.44549
		montesFreq      2.814
		montesSpiky     0.92607
		montesFraction  0.69581
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00011453
		hillsFraction   0.58222
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20699
		craterFreq      0.23803
		craterDensity   0.92387
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.3603
		volcanoTemp     1265.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.18254
		BumpOffset      0.09127
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
		Period          0.000886598924
		SemiMajorAxis   0.00143490081
		Eccentricity    0
		Inclination     -1.03440531
		AscendingNode   -73.2267067
		ArgOfPericenter 99.4185946
		MeanAnomaly     121.041891
	}
}

Asteroid	"4.S76"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.5771e-10
	Radius          6.1174
	InertiaMoment   0.39905
	Oblateness      0.046904
	Obliquity       -0.91238
	EqAscendNode    -142.61
	TidalLocked     true

	AlbedoBond      0.26612
	AlbedoGeom      0.31934
	Brightness      2.25
	BrightnessReal  1
	Color          (0.464 0.460 0.457)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.58243
		Randomize      (-0.347, -0.092, 0.623)
		colorDistMagn   0.77987
		colorDistFreq   0.018724
		detailScale     16
		snowLevel       2
		tropicLatitude  0.03954
		icecapLatitude  2
		icecapHeight    0.64952
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43442
		heightTempGrad  0.625
		beachWidth      0.001024
		tropicWidth     0.07
		mainFreq        0.48383
		venusFreq       0.68843
		venusMagn       0.59944
		mareDensity     0
		terraceProb     0.31085
		erosion         0
		montesMagn      0.55968
		montesFreq      3.5656
		montesSpiky     0.87395
		montesFraction  0.81531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.093272
		hillsFraction   0.68544
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24623
		craterFreq      0.19525
		craterDensity   1.0906
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48108
		volcanoTemp     1012.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.5057
		BumpOffset      2.7528
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
		Period          0.000893288472
		SemiMajorAxis   0.00144210949
		Eccentricity    0
		Inclination     -0.912381354
		AscendingNode   -142.61147
		ArgOfPericenter 105.124145
		MeanAnomaly     127.636425
	}
}

Asteroid	"4.S77"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.7794e-12
	Radius          1.3852
	InertiaMoment   0.3975
	Oblateness      0.046061
	Obliquity       -0.93259
	EqAscendNode    -130.41
	TidalLocked     true

	AlbedoBond      0.27049
	AlbedoGeom      0.32459
	Brightness      2.25
	BrightnessReal  1
	Color          (0.645 0.641 0.638)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.1515
		Randomize      (-0.077, -0.262, 0.956)
		colorDistMagn   0.7936
		colorDistFreq   0.0015471
		detailScale     8
		snowLevel       2
		tropicLatitude  0.039722
		icecapLatitude  2
		icecapHeight    0.58561
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33213
		heightTempGrad  0.625
		beachWidth      0.00077188
		tropicWidth     0.07
		mainFreq        0.27184
		venusFreq       0.53154
		venusMagn       0.593
		mareDensity     0
		terraceProb     0.52238
		erosion         0
		montesMagn      0.4087
		montesFreq      2.8565
		montesSpiky     0.99438
		montesFraction  0.2653
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0043214
		hillsFraction   0.8525
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22291
		craterFreq      0.25218
		craterDensity   0.8673
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52658
		volcanoTemp     960.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.2467
		BumpOffset      0.62334
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
		Period          0.000899734276
		SemiMajorAxis   0.0014490385
		Eccentricity    0
		Inclination     -0.932587971
		AscendingNode   -130.40925
		ArgOfPericenter -70.5917258
		MeanAnomaly     -172.55159
	}
}

Asteroid	"4.S78"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.0738e-13
	Radius          0.44568
	InertiaMoment   0.39947
	Oblateness      0.043963
	Obliquity       -0.15031
	EqAscendNode    -85.055
	TidalLocked     true

	AlbedoBond      0.27466
	AlbedoGeom      0.32959
	Brightness      2.25
	BrightnessReal  1
	Color          (0.427 0.423 0.418)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.72056
		Randomize      (0.194, -0.432, -0.711)
		colorDistMagn   0.80739
		colorDistFreq   9.2735e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034663
		icecapLatitude  2
		icecapHeight    0.51837
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22984
		heightTempGrad  0.625
		beachWidth      0.00081974
		tropicWidth     0.07
		mainFreq        0.55255
		venusFreq       0.55958
		venusMagn       0.58626
		mareDensity     0
		terraceProb     0.19563
		erosion         0
		montesMagn      0.52857
		montesFreq      3.6497
		montesSpiky     0.96187
		montesFraction  0.39418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00039384
		hillsFraction   0.56419
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25472
		craterFreq      0.20949
		craterDensity   0.9672
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41892
		volcanoTemp     1208.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.40111
		BumpOffset      0.20055
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
		Period          0.000901533237
		SemiMajorAxis   0.00145096936
		Eccentricity    0
		Inclination     -0.150309659
		AscendingNode   -85.0553349
		ArgOfPericenter 118.816775
		MeanAnomaly     -166.407453
	}
}

Asteroid	"4.S79"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.4643e-15
	Radius          0.12499
	InertiaMoment   0.3982
	Oblateness      0.045111
	Obliquity       1.4851
	EqAscendNode    60.086
	TidalLocked     true

	AlbedoBond      0.27865
	AlbedoGeom      0.33438
	Brightness      2.25
	BrightnessReal  1
	Color          (0.609 0.605 0.599)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28963
		Randomize      (0.464, -0.602, -0.378)
		colorDistMagn   0.82127
		colorDistFreq   1.181e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.040219
		icecapLatitude  2
		icecapHeight    0.42119
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12754
		heightTempGrad  0.625
		beachWidth      0.00056759
		tropicWidth     0.07
		mainFreq        0.38662
		venusFreq       0.57848
		venusMagn       0.57917
		mareDensity     0
		terraceProb     0.32105
		erosion         0
		montesMagn      0.35121
		montesFreq      2.898
		montesSpiky     0.92457
		montesFraction  0.47757
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.138e-05
		hillsFraction   0.66902
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23193
		craterFreq      0.2707
		craterDensity   0.79607
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48764
		volcanoTemp     1056
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.11249
		BumpOffset      0.056244
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
		Period          0.000909276759
		SemiMajorAxis   0.00145926604
		Eccentricity    0
		Inclination     1.48506508
		AscendingNode   60.0857896
		ArgOfPericenter -145.63923
		MeanAnomaly     -96.1460541
	}
}

Asteroid	"4.S80"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.2923e-10
	Radius          3.4206
	InertiaMoment   0.39986
	Oblateness      0.045716
	Obliquity       -1.4813
	EqAscendNode    -151.01
	TidalLocked     true

	AlbedoBond      0.28251
	AlbedoGeom      0.33901
	Brightness      2.25
	BrightnessReal  1
	Color          (0.788 0.784 0.782)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.8587
		Randomize      (0.734, -0.772, -0.045)
		colorDistMagn   0.83524
		colorDistFreq   0.0050534
		detailScale     16
		snowLevel       2
		tropicLatitude  0.045429
		icecapLatitude  2
		icecapHeight    0.78217
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42525
		heightTempGrad  0.625
		beachWidth      0.0012154
		tropicWidth     0.07
		mainFreq        0.62811
		venusFreq       0.59465
		venusMagn       0.57165
		mareDensity     0
		terraceProb     0.55909
		erosion         0
		montesMagn      0.50006
		montesFreq      3.7579
		montesSpiky     0.87139
		montesFraction  0.54964
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.032323
		hillsFraction   0.80592
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26758
		craterFreq      0.2222
		craterDensity   0.9067
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53409
		volcanoTemp     1103.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.0785
		BumpOffset      1.5393
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
		Period          0.000917489923
		SemiMajorAxis   0.00146804021
		Eccentricity    0
		Inclination     -1.48128439
		AscendingNode   -151.013938
		ArgOfPericenter 54.4073407
		MeanAnomaly     10.1412532
	}
}

Asteroid	"4.S81"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.8664e-12
	Radius          0.95516
	InertiaMoment   0.39872
	Oblateness      0.044161
	Obliquity       -1.1834
	EqAscendNode    -62.281
	TidalLocked     true

	AlbedoBond      0.28627
	AlbedoGeom      0.34352
	Brightness      2.25
	BrightnessReal  1
	Color          (0.569 0.566 0.564)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.42777
		Randomize      (-0.995, -0.942, 0.288)
		colorDistMagn   0.84932
		colorDistFreq   0.00065056
		detailScale     8
		snowLevel       2
		tropicLatitude  0.042158
		icecapLatitude  2
		icecapHeight    0.68337
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32296
		heightTempGrad  0.625
		beachWidth      0.0003633
		tropicWidth     0.07
		mainFreq        0.46383
		venusFreq       0.61027
		venusMagn       0.5636
		mareDensity     0
		terraceProb     0.20426
		erosion         0
		montesMagn      0.64913
		montesFreq      2.9388
		montesSpiky     0.99325
		montesFraction  0.62166
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0022603
		hillsFraction   0.54451
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23951
		craterFreq      0.16992
		craterDensity   1.0305
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43656
		volcanoTemp     951.51
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.85965
		BumpOffset      0.42982
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
		Period          0.000922912576
		SemiMajorAxis   0.00147381891
		Eccentricity    0
		Inclination     -1.18343895
		AscendingNode   -62.2805272
		ArgOfPericenter -69.9298505
		MeanAnomaly     -9.56022584
	}
}

Asteroid	"4.S82"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.9616e-14
	Radius          0.31057
	InertiaMoment   0.39671
	Oblateness      0.042792
	Obliquity       -0.17107
	EqAscendNode    -118.27
	TidalLocked     true

	AlbedoBond      0.28995
	AlbedoGeom      0.34794
	Brightness      2.25
	BrightnessReal  1
	Color          (0.749 0.747 0.746)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99683
		Randomize      (-0.725, 0.888, 0.621)
		colorDistMagn   0.86352
		colorDistFreq   3.8051e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034737
		icecapLatitude  2
		icecapHeight    0.61586
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22067
		heightTempGrad  0.625
		beachWidth      0.0010112
		tropicWidth     0.07
		mainFreq        0.73513
		venusFreq       0.62699
		venusMagn       0.55486
		mareDensity     0
		terraceProb     0.33158
		erosion         0
		montesMagn      0.47155
		montesFreq      3.9214
		montesSpiky     0.96064
		montesFraction  0.70485
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00021581
		hillsFraction   0.65308
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2096
		craterFreq      0.23475
		craterDensity   0.84876
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.494
		volcanoTemp     1099.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.27951
		BumpOffset      0.13975
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
		Period          0.000928925167
		SemiMajorAxis   0.00148021307
		Eccentricity    0
		Inclination     -0.171067878
		AscendingNode   -118.272313
		ArgOfPericenter -46.8999339
		MeanAnomaly     -56.7354001
	}
}

Asteroid	"4.S83"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0306e-15
	Radius          0.066768
	InertiaMoment   0.39917
	Oblateness      0.04125
	Obliquity       0.29174
	EqAscendNode    -4.4143
	TidalLocked     true

	AlbedoBond      0.29358
	AlbedoGeom      0.3523
	Brightness      2.25
	BrightnessReal  1
	Color          (0.533 0.529 0.524)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5659
		Randomize      (-0.454, 0.719, 0.954)
		colorDistMagn   0.87785
		colorDistFreq   3.0071e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.033963
		icecapLatitude  2
		icecapHeight    0.55203
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11838
		heightTempGrad  0.625
		beachWidth      0.00075901
		tropicWidth     0.07
		mainFreq        0.53271
		venusFreq       0.64757
		venusMagn       0.54524
		mareDensity     0
		terraceProb     0.61459
		erosion         0
		montesMagn      0.59147
		montesFreq      2.9792
		montesSpiky     0.92305
		montesFraction  0.83273
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.7524e-06
		hillsFraction   0.77462
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24701
		craterFreq      0.19114
		craterDensity   0.9472
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54246
		volcanoTemp     235.89
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.060092
		BumpOffset      0.030046
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
		Period          0.000931517304
		SemiMajorAxis   0.00148296545
		Eccentricity    0
		Inclination     0.291743068
		AscendingNode   -4.41432863
		ArgOfPericenter 76.2757924
		MeanAnomaly     -75.3862686
	}
}

Asteroid	"4.S84"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.1946e-11
	Radius          2.0562
	InertiaMoment   0.39773
	Oblateness      0.037797
	Obliquity       -0.63484
	EqAscendNode    85.267
	TidalLocked     true

	AlbedoBond      0.29718
	AlbedoGeom      0.35661
	Brightness      2.25
	BrightnessReal  1
	Color          (0.713 0.710 0.707)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13497
		Randomize      (-0.184, 0.549, -0.713)
		colorDistMagn   0.89233
		colorDistFreq   0.0014939
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037292
		icecapLatitude  2
		icecapHeight    0.47542
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41608
		heightTempGrad  0.625
		beachWidth      0.0014069
		tropicWidth     0.07
		mainFreq        0.36026
		venusFreq       0.68387
		venusMagn       0.53442
		mareDensity     0
		terraceProb     0.21289
		erosion         0
		montesMagn      0.44045
		montesFreq      4.6237
		montesSpiky     0.86875
		montesFraction  0.28294
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.004998
		hillsFraction   0.52226
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22395
		craterFreq      0.24836
		craterDensity   0.76062
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44863
		volcanoTemp     894.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.8506
		BumpOffset      0.92529
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
		Period          0.00094206274
		SemiMajorAxis   0.00149413658
		Eccentricity    0
		Inclination     -0.634836513
		AscendingNode   85.267318
		ArgOfPericenter 46.2944872
		MeanAnomaly     27.421205
	}
}

Asteroid	"4.S85"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.7285e-13
	Radius          0.66885
	InertiaMoment   0.39958
	Oblateness      0.042029
	Obliquity       1.2098
	EqAscendNode    92.911
	TidalLocked     true

	AlbedoBond      0.30076
	AlbedoGeom      0.36091
	Brightness      2.25
	BrightnessReal  1
	Color          (0.497 0.493 0.485)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70404
		Randomize      (0.086, 0.379, -0.380)
		colorDistMagn   0.90698
		colorDistFreq   0.00028579
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037864
		icecapLatitude  2
		icecapHeight    0.9227
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31379
		heightTempGrad  0.625
		beachWidth      0.00085472
		tropicWidth     0.07
		mainFreq        0.60493
		venusFreq       0.52881
		venusMagn       0.52189
		mareDensity     0
		terraceProb     0.34249
		erosion         0
		montesMagn      0.55464
		montesFreq      3.0194
		montesSpiky     0.99211
		montesFraction  0.40325
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0012265
		hillsFraction   0.63733
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25571
		craterFreq      0.20611
		craterDensity   0.88972
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50026
		volcanoTemp     1142.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.60196
		BumpOffset      0.30098
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
		Period          0.00095305543
		SemiMajorAxis   0.00150573723
		Eccentricity    0
		Inclination     1.20979022
		AscendingNode   92.9110698
		ArgOfPericenter 9.16239129
		MeanAnomaly     123.510217
	}
}

Asteroid	"4.S86"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.9298e-14
	Radius          0.20296
	InertiaMoment   0.39836
	Oblateness      0.038114
	Obliquity       1.0003
	EqAscendNode    134.09
	TidalLocked     true

	AlbedoBond      0.30435
	AlbedoGeom      0.36521
	Brightness      2.25
	BrightnessReal  1
	Color          (0.677 0.671 0.667)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.2731
		Randomize      (0.357, 0.209, -0.047)
		colorDistMagn   0.9218
		colorDistFreq   1.2608e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036395
		icecapLatitude  2
		icecapHeight    0.72304
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2115
		heightTempGrad  0.625
		beachWidth      0.00090257
		tropicWidth     0.07
		mainFreq        0.44321
		venusFreq       0.55814
		venusMagn       0.5067
		mareDensity     0
		terraceProb     0.77937
		erosion         0
		montesMagn      0.402
		montesFreq      2.0708
		montesSpiky     0.95941
		montesFraction  0.4848
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00010144
		hillsFraction   0.74982
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23273
		craterFreq      0.26528
		craterDensity   0.99798
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55225
		volcanoTemp     1090.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.18266
		BumpOffset      0.091332
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
		Period          0.000961811686
		SemiMajorAxis   0.00151494587
		Eccentricity    0
		Inclination     1.00031925
		AscendingNode   134.085546
		ArgOfPericenter -31.9145474
		MeanAnomaly     -11.9537507
	}
}

Asteroid	"4.S87"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.6826e-10
	Radius          6.4913
	InertiaMoment   0.39997
	Oblateness      0.041763
	Obliquity       0.37672
	EqAscendNode    -72.445
	TidalLocked     true

	AlbedoBond      0.30795
	AlbedoGeom      0.36954
	Brightness      2.25
	BrightnessReal  1
	Color          (0.456 0.453 0.451)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84217
		Randomize      (0.627, 0.039, 0.286)
		colorDistMagn   0.93682
		colorDistFreq   0.02549
		detailScale     16
		snowLevel       2
		tropicLatitude  0.034028
		icecapLatitude  2
		icecapHeight    0.64687
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10921
		heightTempGrad  0.625
		beachWidth      0.00065043
		tropicWidth     0.07
		mainFreq        0.69769
		venusFreq       0.57734
		venusMagn       0.48683
		mareDensity     0
		terraceProb     0.22155
		erosion         0
		montesMagn      0.52414
		montesFreq      3.0598
		montesSpiky     0.92152
		montesFraction  0.55645
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.093664
		hillsFraction   0.49571
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26965
		craterFreq      0.21906
		craterDensity   0.82825
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45827
		volcanoTemp     1137.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.8422
		BumpOffset      2.9211
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
		Period          0.000968330335
		SemiMajorAxis   0.00152178316
		Eccentricity    0
		Inclination     0.376717529
		AscendingNode   -72.4448347
		ArgOfPericenter -106.140049
		MeanAnomaly     166.490193
	}
}

Asteroid	"4.S88"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.4584e-12
	Radius          1.3621
	InertiaMoment   0.39885
	Oblateness      0.034959
	Obliquity       1.3329
	EqAscendNode    137.55
	TidalLocked     true

	AlbedoBond      0.3116
	AlbedoGeom      0.37392
	Brightness      2.25
	BrightnessReal  1
	Color          (0.637 0.634 0.632)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.41124
		Randomize      (0.898, -0.131, 0.619)
		colorDistMagn   0.95206
		colorDistFreq   0.00046031
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038862
		icecapLatitude  2
		icecapHeight    0.58309
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40692
		heightTempGrad  0.625
		beachWidth      0.00099828
		tropicWidth     0.07
		mainFreq        0.51312
		venusFreq       0.59361
		venusMagn       0.45603
		mareDensity     0
		terraceProb     0.35384
		erosion         0
		montesMagn      0.33678
		montesFreq      2.2376
		montesSpiky     0.86601
		montesFraction  0.62898
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.003605
		hillsFraction   0.62154
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24025
		craterFreq      0.16175
		craterDensity   0.92895
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50652
		volcanoTemp     985.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.2259
		BumpOffset      0.61294
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
		Period          0.000972656044
		SemiMajorAxis   0.00152631184
		Eccentricity    0
		Inclination     1.3328949
		AscendingNode   137.545774
		ArgOfPericenter 127.763123
		MeanAnomaly     -15.9485242
	}
}

Asteroid	"4.S89"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.2987e-13
	Radius          0.46714
	InertiaMoment   0.39708
	Oblateness      0.039775
	Obliquity       -0.45712
	EqAscendNode    -131.49
	TidalLocked     true

	AlbedoBond      0.31532
	AlbedoGeom      0.37838
	Brightness      2.25
	BrightnessReal  1
	Color          (0.420 0.416 0.412)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98031
		Randomize      (-0.832, -0.301, 0.952)
		colorDistMagn   0.96753
		colorDistFreq   0.00012484
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036121
		icecapLatitude  2
		icecapHeight    0.51538
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30462
		heightTempGrad  0.625
		beachWidth      0.0010461
		tropicWidth     0.07
		mainFreq        0.33011
		venusFreq       0.60922
		venusMagn       0.96605
		mareDensity     0
		terraceProb     0.10863
		erosion         0
		montesMagn      0.49578
		montesFreq      3.1006
		montesSpiky     0.99097
		montesFraction  0.71421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00075675
		hillsFraction   0.72858
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21178
		craterFreq      0.23154
		craterDensity   0.68037
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5646
		volcanoTemp     1233.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.42042
		BumpOffset      0.21021
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
		Period          0.000977431922
		SemiMajorAxis   0.00153130403
		Eccentricity    0
		Inclination     -0.457124067
		AscendingNode   -131.489733
		ArgOfPericenter -83.0562113
		MeanAnomaly     -102.358816
	}
}

Asteroid	"4.S90"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.1498e-15
	Radius          0.12542
	InertiaMoment   0.39929
	Oblateness      0.03554
	Obliquity       1.1245
	EqAscendNode    32.394
	TidalLocked     true

	AlbedoBond      0.31912
	AlbedoGeom      0.38294
	Brightness      2.25
	BrightnessReal  1
	Color          (0.601 0.598 0.592)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.54937
		Randomize      (-0.562, -0.471, -0.715)
		colorDistMagn   0.98326
		colorDistFreq   2.6276e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037229
		icecapLatitude  2
		icecapHeight    0.41538
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20233
		heightTempGrad  0.625
		beachWidth      0.001094
		tropicWidth     0.07
		mainFreq        0.58322
		venusFreq       0.6258
		venusMagn       0.86126
		mareDensity     0
		terraceProb     0.23024
		erosion         0
		montesMagn      0.63721
		montesFreq      2.3469
		montesSpiky     0.95817
		montesFraction  0.85259
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2811e-05
		hillsFraction   0.46085
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24781
		craterFreq      0.1867
		craterDensity   0.87243
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46656
		volcanoTemp     981.15
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.11288
		BumpOffset      0.05644
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
		Period          0.00098115587
		SemiMajorAxis   0.00153519101
		Eccentricity    0
		Inclination     1.12447184
		AscendingNode   32.3942178
		ArgOfPericenter -157.687027
		MeanAnomaly     -89.6748097
	}
}

Asteroid	"4.S91"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.4276e-10
	Radius          3.3457
	InertiaMoment   0.39792
	Oblateness      0.03315
	Obliquity       -0.15955
	EqAscendNode    -11.599
	TidalLocked     true

	AlbedoBond      0.32303
	AlbedoGeom      0.38763
	Brightness      2.25
	BrightnessReal  1
	Color          (0.781 0.777 0.775)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.11844
		Randomize      (-0.291, -0.641, -0.382)
		colorDistMagn   0.99929
		colorDistFreq   0.0060406
		detailScale     16
		snowLevel       2
		tropicLatitude  0.034696
		icecapLatitude  2
		icecapHeight    0.77648
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10004
		heightTempGrad  0.625
		beachWidth      0.0011418
		tropicWidth     0.07
		mainFreq        0.42163
		venusFreq       0.64597
		venusMagn       0.83163
		mareDensity     0
		terraceProb     0.3657
		erosion         0
		montesMagn      0.46706
		montesFreq      3.142
		montesSpiky     0.91996
		montesFraction  0.29871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.027402
		hillsFraction   0.60547
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22496
		craterFreq      0.24474
		craterDensity   0.97347
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51289
		volcanoTemp     1228.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.0112
		BumpOffset      1.5056
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
		Period          0.000988040553
		SemiMajorAxis   0.00154236417
		Eccentricity    0
		Inclination     -0.159547673
		AscendingNode   -11.5985021
		ArgOfPericenter -141.065465
		MeanAnomaly     168.277277
	}
}

Asteroid	"4.S92"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.0756e-12
	Radius          0.98358
	InertiaMoment   0.39969
	Oblateness      0.039233
	Obliquity       -1.2628
	EqAscendNode    55.26
	TidalLocked     true

	AlbedoBond      0.32709
	AlbedoGeom      0.39251
	Brightness      2.25
	BrightnessReal  1
	Color          (0.566 0.558 0.553)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.68751
		Randomize      (-0.021, -0.811, -0.049)
		colorDistMagn   0.032897
		colorDistFreq   0.00085717
		detailScale     8
		snowLevel       2
		tropicLatitude  0.042993
		icecapLatitude  2
		icecapHeight    0.6804
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39775
		heightTempGrad  0.625
		beachWidth      0.0011897
		tropicWidth     0.07
		mainFreq        0.66698
		venusFreq       0.67993
		venusMagn       0.81218
		mareDensity     0
		terraceProb     0.1181
		erosion         0
		montesMagn      0.58515
		montesFreq      2.4317
		montesSpiky     0.86317
		montesFraction  0.41203
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0021361
		hillsFraction   0.70954
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25675
		craterFreq      0.20261
		craterDensity   0.80414
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58305
		volcanoTemp     1076.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.88522
		BumpOffset      0.44261
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
		Period          0.000989566933
		SemiMajorAxis   0.00154395225
		Eccentricity    0
		Inclination     -1.26278255
		AscendingNode   55.2599061
		ArgOfPericenter 148.915788
		MeanAnomaly     140.232261
	}
}

Asteroid	"4.S93"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0735e-13
	Radius          0.3191
	InertiaMoment   0.3985
	Oblateness      0.03784
	Obliquity       1.221
	EqAscendNode    175.99
	TidalLocked     true

	AlbedoBond      0.33133
	AlbedoGeom      0.3976
	Brightness      2.25
	BrightnessReal  1
	Color          (0.742 0.740 0.739)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25658
		Randomize      (0.249, -0.981, 0.284)
		colorDistMagn   0.064476
		colorDistFreq   5.1632e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037951
		icecapLatitude  2
		icecapHeight    0.61334
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29546
		heightTempGrad  0.625
		beachWidth      0.0012376
		tropicWidth     0.07
		mainFreq        0.49355
		venusFreq       0.52584
		venusMagn       0.79722
		mareDensity     0
		terraceProb     0.239
		erosion         0
		montesMagn      0.43526
		montesFreq      3.1844
		montesSpiky     0.98983
		montesFraction  0.49194
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00019572
		hillsFraction   0.40257
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23352
		craterFreq      0.26046
		craterDensity   0.91162
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47401
		volcanoTemp     1024.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.28719
		BumpOffset      0.14359
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
		Period          0.000994385347
		SemiMajorAxis   0.00154896008
		Eccentricity    0
		Inclination     1.22096954
		AscendingNode   175.986792
		ArgOfPericenter 106.798131
		MeanAnomaly     -20.5608796
	}
}

Asteroid	"4.S94"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1846e-15
	Radius          0.06988
	InertiaMoment   0.39571
	Oblateness      0.03519
	Obliquity       -1.4286
	EqAscendNode    135.15
	TidalLocked     true

	AlbedoBond      0.33582
	AlbedoGeom      0.40299
	Brightness      2.25
	BrightnessReal  1
	Color          (0.526 0.522 0.518)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.82564
		Randomize      (0.520, 0.849, 0.617)
		colorDistMagn   0.093705
		colorDistFreq   3.994e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.044824
		icecapLatitude  2
		icecapHeight    0.54937
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19316
		heightTempGrad  0.625
		beachWidth      0.00098541
		tropicWidth     0.07
		mainFreq        0.29367
		venusFreq       0.55665
		venusMagn       0.78482
		mareDensity     0
		terraceProb     0.37818
		erosion         0
		montesMagn      0.54974
		montesFreq      2.5027
		montesSpiky     0.95693
		montesFraction  0.56328
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6128e-05
		hillsFraction   0.58883
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27209
		craterFreq      0.21588
		craterDensity   1.043
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51948
		volcanoTemp     253.47
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.062892
		BumpOffset      0.031446
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
		Period          0.00100070321
		SemiMajorAxis   0.00155551407
		Eccentricity    0
		Inclination     -1.42861498
		AscendingNode   135.15468
		ArgOfPericenter 137.447667
		MeanAnomaly     108.114118
	}
}

Asteroid	"4.S95"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.4721e-11
	Radius          2.1501
	InertiaMoment   0.39898
	Oblateness      0.034882
	Obliquity       -1.1072
	EqAscendNode    -111.34
	TidalLocked     true

	AlbedoBond      0.34062
	AlbedoGeom      0.40874
	Brightness      2.25
	BrightnessReal  1
	Color          (0.706 0.703 0.700)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39471
		Randomize      (0.790, 0.679, 0.950)
		colorDistMagn   0.121
		colorDistFreq   0.0021904
		detailScale     8
		snowLevel       2
		tropicLatitude  0.041384
		icecapLatitude  2
		icecapHeight    0.47166
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49087
		heightTempGrad  0.625
		beachWidth      0.0010333
		tropicWidth     0.07
		mainFreq        0.56251
		venusFreq       0.57619
		venusMagn       0.77409
		mareDensity     0
		terraceProb     0.1274
		erosion         0
		montesMagn      0.39483
		montesFreq      3.2283
		montesSpiky     0.91839
		montesFraction  0.6364
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012492
		hillsFraction   0.69193
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.241
		craterFreq      0.15016
		craterDensity   0.85427
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.35178
		volcanoTemp     1019.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.9351
		BumpOffset      0.96754
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
		Period          0.00100815463
		SemiMajorAxis   0.00156322628
		Eccentricity    0
		Inclination     -1.10721367
		AscendingNode   -111.343104
		ArgOfPericenter 146.445832
		MeanAnomaly     104.393927
	}
}

Asteroid	"4.S96"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0426e-12
	Radius          0.67728
	InertiaMoment   0.39736
	Oblateness      0.035677
	Obliquity       -1.4972
	EqAscendNode    5.9732
	TidalLocked     true

	AlbedoBond      0.34582
	AlbedoGeom      0.41498
	Brightness      2.25
	BrightnessReal  1
	Color          (0.490 0.481 0.478)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.96378
		Randomize      (-0.939, 0.509, -0.717)
		colorDistMagn   0.14667
		colorDistFreq   0.00035117
		detailScale     8
		snowLevel       2
		tropicLatitude  0.045614
		icecapLatitude  2
		icecapHeight    0.89447
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38858
		heightTempGrad  0.625
		beachWidth      0.0010811
		tropicWidth     0.07
		mainFreq        0.39865
		venusFreq       0.59257
		venusMagn       0.76453
		mareDensity     0
		terraceProb     0.24783
		erosion         0
		montesMagn      0.51976
		montesFreq      2.5648
		montesSpiky     0.86022
		montesFraction  0.72395
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0011162
		hillsFraction   0.88146
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21367
		craterFreq      0.22837
		craterDensity   0.95276
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48093
		volcanoTemp     867.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.60955
		BumpOffset      0.30477
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
		Period          0.00101397677
		SemiMajorAxis   0.00156923897
		Eccentricity    0
		Inclination     -1.49718622
		AscendingNode   5.97319163
		ArgOfPericenter 122.98002
		MeanAnomaly     131.788755
	}
}

Asteroid	"4.S97"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.1838e-14
	Radius          0.20861
	InertiaMoment   0.3994
	Oblateness      0.034024
	Obliquity       0.7586
	EqAscendNode    64.935
	TidalLocked     true

	AlbedoBond      0.35157
	AlbedoGeom      0.42188
	Brightness      2.25
	BrightnessReal  1
	Color          (0.670 0.664 0.661)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53285
		Randomize      (-0.669, 0.340, -0.384)
		colorDistMagn   0.17095
		colorDistFreq   1.9114e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035098
		icecapLatitude  2
		icecapHeight    0.7194
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28629
		heightTempGrad  0.625
		beachWidth      0.001429
		tropicWidth     0.07
		mainFreq        0.64027
		venusFreq       0.60817
		venusMagn       0.75585
		mareDensity     0
		terraceProb     0.3914
		erosion         0
		montesMagn      0.31782
		montesFreq      3.2739
		montesSpiky     0.98868
		montesFraction  0.876
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.544e-05
		hillsFraction   0.57127
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24862
		craterFreq      0.18179
		craterDensity   0.77255
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52642
		volcanoTemp     1115.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.18775
		BumpOffset      0.093875
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
		Period          0.00101958333
		SemiMajorAxis   0.00157501816
		Eccentricity    0
		Inclination     0.758597406
		AscendingNode   64.9353696
		ArgOfPericenter -64.7657935
		MeanAnomaly     -128.864529
	}
}

Asteroid	"4.S98"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.9884e-10
	Radius          6.5013
	InertiaMoment   0.3981
	Oblateness      0.032474
	Obliquity       1.3204
	EqAscendNode    38.993
	TidalLocked     true

	AlbedoBond      0.3581
	AlbedoGeom      0.42972
	Brightness      2.25
	BrightnessReal  1
	Color          (0.449 0.446 0.444)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.10192
		Randomize      (-0.399, 0.170, -0.051)
		colorDistMagn   0.19405
		colorDistFreq   0.030493
		detailScale     16
		snowLevel       2
		tropicLatitude  0.038756
		icecapLatitude  2
		icecapHeight    0.64423
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.184
		heightTempGrad  0.625
		beachWidth      0.0014768
		tropicWidth     0.07
		mainFreq        0.47375
		venusFreq       0.62463
		venusMagn       0.74783
		mareDensity     0
		terraceProb     0.13653
		erosion         0
		montesMagn      0.49149
		montesFreq      2.6209
		montesSpiky     0.95568
		montesFraction  0.31306
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.08032
		hillsFraction   0.67526
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22593
		craterFreq      0.24126
		craterDensity   0.89463
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41841
		volcanoTemp     863.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.8512
		BumpOffset      2.9256
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
		Period          0.0010226241
		SemiMajorAxis   0.00157814813
		Eccentricity    0
		Inclination     1.32042889
		AscendingNode   38.9929079
		ArgOfPericenter 138.279573
		MeanAnomaly     -4.94927184
	}
}

Asteroid	"4.S99"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0194e-11
	Radius          1.4337
	InertiaMoment   0.3998
	Oblateness      0.033789
	Obliquity       -0.14707
	EqAscendNode    -3.0214
	TidalLocked     true

	AlbedoBond      0.36581
	AlbedoGeom      0.43897
	Brightness      2.25
	BrightnessReal  1
	Color          (0.630 0.627 0.625)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67098
		Randomize      (-0.128, -0.000, 0.281)
		colorDistMagn   0.21612
		colorDistFreq   0.0008272
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034651
		icecapLatitude  2
		icecapHeight    0.58057
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4817
		heightTempGrad  0.625
		beachWidth      0.0015247
		tropicWidth     0.07
		mainFreq        0.75779
		venusFreq       0.64442
		venusMagn       0.74034
		mareDensity     0
		terraceProb     0.25675
		erosion         0
		montesMagn      0.62698
		montesFreq      3.322
		montesSpiky     0.91679
		montesFraction  0.42055
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0065956
		hillsFraction   0.82104
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25783
		craterFreq      0.19896
		craterDensity   1.0062
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4875
		volcanoTemp     1310.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.2904
		BumpOffset      0.64519
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
		Period          0.00103100475
		SemiMajorAxis   0.0015867586
		Eccentricity    0
		Inclination     -0.147066595
		AscendingNode   -3.02141458
		ArgOfPericenter -165.534867
		MeanAnomaly     64.8840897
	}
}

Asteroid	"4.S100"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.5393e-13
	Radius          0.45419
	InertiaMoment   0.39864
	Oblateness      0.030697
	Obliquity       -0.83626
	EqAscendNode    -84.626
	TidalLocked     true

	AlbedoBond      0.37551
	AlbedoGeom      0.45062
	Brightness      2.25
	BrightnessReal  1
	Color          (0.479 0.421 0.338)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.24005
		Randomize      (0.142, -0.170, 0.614)
		colorDistMagn   0.23728
		colorDistFreq   0.00014072
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038877
		icecapLatitude  2
		icecapHeight    0.51236
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37941
		heightTempGrad  0.625
		beachWidth      0.0012725
		tropicWidth     0.07
		mainFreq        0.54245
		venusFreq       0.67642
		venusMagn       0.73328
		mareDensity     0
		terraceProb     0.40551
		erosion         0
		montesMagn      0.46251
		montesFreq      2.6726
		montesSpiky     0.85713
		montesFraction  0.49902
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00055353
		hillsFraction   0.55231
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2343
		craterFreq      0.25608
		craterDensity   0.83445
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53392
		volcanoTemp     1158.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.40877
		BumpOffset      0.20438
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
		Period          0.00103278367
		SemiMajorAxis   0.00158858329
		Eccentricity    0
		Inclination     -0.836258519
		AscendingNode   -84.6258932
		ArgOfPericenter -133.69164
		MeanAnomaly     50.1711547
	}
}

Asteroid	"4.S101"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.8962e-15
	Radius          0.13472
	InertiaMoment   0.39645
	Oblateness      0.035068
	Obliquity       0.77966
	EqAscendNode    -36.924
	TidalLocked     true

	AlbedoBond      0.38938
	AlbedoGeom      0.46725
	Brightness      2.25
	BrightnessReal  1
	Color          (0.675 0.547 0.505)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.80912
		Randomize      (0.413, -0.340, 0.947)
		colorDistMagn   0.25764
		colorDistFreq   6.5729e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035193
		icecapLatitude  2
		icecapHeight    0.40923
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27712
		heightTempGrad  0.625
		beachWidth      0.0013204
		tropicWidth     0.07
		mainFreq        0.37363
		venusFreq       0.52259
		venusMagn       0.72657
		mareDensity     0
		terraceProb     0.14554
		erosion         0
		montesMagn      0.57916
		montesFreq      3.3732
		montesSpiky     0.98754
		montesFraction  0.57011
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3902e-05
		hillsFraction   0.65917
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27514
		craterFreq      0.21266
		craterDensity   0.9341
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43626
		volcanoTemp     1106.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.12125
		BumpOffset      0.060624
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
		Period          0.00104079549
		SemiMajorAxis   0.00159678833
		Eccentricity    0
		Inclination     0.779660905
		AscendingNode   -36.9242723
		ArgOfPericenter -178.114195
		MeanAnomaly     70.586682
	}
}

Asteroid	"4.S102"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.5795e-10
	Radius          3.643
	InertiaMoment   0.3991
	Oblateness      0.034872
	Obliquity       -0.039651
	EqAscendNode    178.66
	TidalLocked     true

	AlbedoBond      0.41964
	AlbedoGeom      0.50357
	Brightness      2.25
	BrightnessReal  1
	Color          (0.826 0.752 0.716)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.37819
		Randomize      (0.683, -0.510, -0.720)
		colorDistMagn   0.2773
		colorDistFreq   0.0085732
		detailScale     16
		snowLevel       2
		tropicLatitude  0.034327
		icecapLatitude  2
		icecapHeight    0.77107
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17483
		heightTempGrad  0.625
		beachWidth      0.0013682
		tropicWidth     0.07
		mainFreq        0.61614
		venusFreq       0.55513
		venusMagn       0.72014
		mareDensity     0
		terraceProb     0.26579
		erosion         0
		montesMagn      0.42989
		montesFreq      2.7209
		montesSpiky     0.95442
		montesFraction  0.64394
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.028906
		hillsFraction   0.78562
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24174
		craterFreq      0.27679
		craterDensity   0.71694
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49386
		volcanoTemp     1254
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.2787
		BumpOffset      1.6394
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
		Period          0.00104289565
		SemiMajorAxis   0.00159893564
		Eccentricity    0
		Inclination     -0.0396514158
		AscendingNode   178.659879
		ArgOfPericenter 12.7237299
		MeanAnomaly     160.397716
	}
}

Asteroid	"4.S103"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.3007e-12
	Radius          0.99293
	InertiaMoment   0.3976
	Oblateness      0.033209
	Obliquity       1.1495
	EqAscendNode    -99.851
	TidalLocked     true

	AlbedoBond      0.19755
	AlbedoGeom      0.23707
	Brightness      2.25
	BrightnessReal  1
	Color          (0.676 0.529 0.428)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94725
		Randomize      (0.953, -0.680, -0.387)
		colorDistMagn   0.29632
		colorDistFreq   0.00031195
		detailScale     8
		snowLevel       2
		tropicLatitude  0.03741
		icecapLatitude  2
		icecapHeight    0.67746
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47254
		heightTempGrad  0.625
		beachWidth      0.0011161
		tropicWidth     0.07
		mainFreq        0.45347
		venusFreq       0.57503
		venusMagn       0.71395
		mareDensity     0
		terraceProb     0.42073
		erosion         0
		montesMagn      0.54495
		montesFreq      3.4287
		montesSpiky     0.91518
		montesFraction  0.73413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.001851
		hillsFraction   0.53119
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21534
		craterFreq      0.22522
		craterDensity   0.87749
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54227
		volcanoTemp     1101.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.89364
		BumpOffset      0.44682
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
		Period          0.0010489946
		SemiMajorAxis   0.00160516341
		Eccentricity    0
		Inclination     1.14948242
		AscendingNode   -99.8512065
		ArgOfPericenter 144.188727
		MeanAnomaly     55.41671
	}
}

Asteroid	"4.S104"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1565e-13
	Radius          0.32172
	InertiaMoment   0.39952
	Oblateness      0.032097
	Obliquity       -0.13657
	EqAscendNode    -172.72
	TidalLocked     true

	AlbedoBond      0.21717
	AlbedoGeom      0.2606
	Brightness      2.25
	BrightnessReal  1
	Color          (0.763 0.732 0.704)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.51632
		Randomize      (-0.776, -0.850, -0.054)
		colorDistMagn   0.31478
		colorDistFreq   6.332e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034615
		icecapLatitude  2
		icecapHeight    0.61083
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37024
		heightTempGrad  0.625
		beachWidth      0.00056396
		tropicWidth     0.07
		mainFreq        0.71504
		venusFreq       0.59152
		venusMagn       0.70797
		mareDensity     0
		terraceProb     0.15444
		erosion         0
		montesMagn      0.38708
		montesFreq      2.7668
		montesSpiky     0.85391
		montesFraction  0.90497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00032501
		hillsFraction   0.64337
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24944
		craterFreq      0.17622
		craterDensity   0.98005
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4484
		volcanoTemp     949.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.28955
		BumpOffset      0.14477
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
		Period          0.00105509951
		SemiMajorAxis   0.00161138517
		Eccentricity    0
		Inclination     -0.136566814
		AscendingNode   -172.723872
		ArgOfPericenter 78.3783446
		MeanAnomaly     82.4546543
	}
}

Asteroid	"4.S105"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.3564e-15
	Radius          0.07487
	InertiaMoment   0.39827
	Oblateness      0.033736
	Obliquity       0.017436
	EqAscendNode    -123.75
	TidalLocked     true

	AlbedoBond      0.22885
	AlbedoGeom      0.27462
	Brightness      2.25
	BrightnessReal  1
	Color          (0.585 0.524 0.444)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.085388
		Randomize      (-0.506, 0.980, 0.279)
		colorDistMagn   0.33272
		colorDistFreq   1.4643e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034195
		icecapLatitude  2
		icecapHeight    0.54668
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26795
		heightTempGrad  0.625
		beachWidth      0.00091181
		tropicWidth     0.07
		mainFreq        0.52276
		venusFreq       0.60713
		venusMagn       0.70214
		mareDensity     0
		terraceProb     0.27497
		erosion         0
		montesMagn      0.51541
		montesFreq      3.4901
		montesSpiky     0.98639
		montesFraction  0.32629
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4939e-05
		hillsFraction   0.75882
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22687
		craterFreq      0.2379
		craterDensity   0.81163
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50012
		volcanoTemp     411.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.067383
		BumpOffset      0.033692
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
		Period          0.00106433343
		SemiMajorAxis   0.00162077309
		Eccentricity    0
		Inclination     0.0174364024
		AscendingNode   -123.747408
		ArgOfPericenter 169.511715
		MeanAnomaly     -88.7258019
	}
}

Asteroid	"4.S106"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.7766e-11
	Radius          2.1725
	InertiaMoment   0.39991
	Oblateness      0.02962
	Obliquity       0.68926
	EqAscendNode    27.032
	TidalLocked     true

	AlbedoBond      0.23758
	AlbedoGeom      0.28509
	Brightness      2.25
	BrightnessReal  1
	Color          (0.750 0.711 0.641)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.65446
		Randomize      (-0.236, 0.810, 0.612)
		colorDistMagn   0.35021
		colorDistFreq   0.0027316
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034812
		icecapLatitude  2
		icecapHeight    0.4678
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16566
		heightTempGrad  0.625
		beachWidth      0.00065967
		tropicWidth     0.07
		mainFreq        0.34556
		venusFreq       0.62347
		venusMagn       0.69646
		mareDensity     0
		terraceProb     0.43734
		erosion         0
		montesMagn      0.2884
		montesFreq      2.8108
		montesSpiky     0.95316
		montesFraction  0.42884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011349
		hillsFraction   0.50659
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25896
		craterFreq      0.1951
		craterDensity   0.91657
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55201
		volcanoTemp     1045
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.9553
		BumpOffset      0.97764
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
		Period          0.00106734962
		SemiMajorAxis   0.00162383369
		Eccentricity    0
		Inclination     0.689264209
		AscendingNode   27.03157
		ArgOfPericenter 91.8201774
		MeanAnomaly     -150.957224
	}
}

Asteroid	"4.S107"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1173e-12
	Radius          0.70179
	InertiaMoment   0.39878
	Oblateness      0.033377
	Obliquity       0.3204
	EqAscendNode    -156.93
	TidalLocked     true

	AlbedoBond      0.24473
	AlbedoGeom      0.29367
	Brightness      2.25
	BrightnessReal  1
	Color          (0.579 0.437 0.375)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22352
		Randomize      (0.035, 0.640, 0.945)
		colorDistMagn   0.36728
		colorDistFreq   9.2019e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.033978
		icecapLatitude  2
		icecapHeight    0.87475
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46337
		heightTempGrad  0.625
		beachWidth      0.0013075
		tropicWidth     0.07
		mainFreq        0.59377
		venusFreq       0.64291
		venusMagn       0.6909
		mareDensity     0
		terraceProb     0.16325
		erosion         0
		montesMagn      0.48718
		montesFreq      3.5599
		montesSpiky     0.91354
		montesFraction  0.50603
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0010652
		hillsFraction   0.62763
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23507
		craterFreq      0.25203
		craterDensity   1.0582
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45807
		volcanoTemp     1092.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.63161
		BumpOffset      0.31581
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
		Period          0.0010709909
		SemiMajorAxis   0.00162752475
		Eccentricity    0
		Inclination     0.320397242
		AscendingNode   -156.925254
		ArgOfPericenter 119.937901
		MeanAnomaly     -2.71426686
	}
}

Asteroid	"4.S108"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.4575e-14
	Radius          0.2198
	InertiaMoment   0.39688
	Oblateness      0.032528
	Obliquity       0.3547
	EqAscendNode    -96.382
	TidalLocked     true

	AlbedoBond      0.2509
	AlbedoGeom      0.30108
	Brightness      2.25
	BrightnessReal  1
	Color          (0.743 0.638 0.573)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.79259
		Randomize      (0.305, 0.470, -0.722)
		colorDistMagn   0.38396
		colorDistFreq   2.639e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034005
		icecapLatitude  2
		icecapHeight    0.71583
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36108
		heightTempGrad  0.625
		beachWidth      0.00075538
		tropicWidth     0.07
		mainFreq        0.43241
		venusFreq       0.67326
		venusMagn       0.68543
		mareDensity     0
		terraceProb     0.28431
		erosion         0
		montesMagn      0.61792
		montesFreq      2.8534
		montesSpiky     0.85052
		montesFraction  0.57698
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.954e-05
		hillsFraction   0.73642
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27934
		craterFreq      0.20937
		craterDensity   0.85965
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50638
		volcanoTemp     1340.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.19782
		BumpOffset      0.098908
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
		Period          0.00107711361
		SemiMajorAxis   0.00163372175
		Eccentricity    0
		Inclination     0.354696509
		AscendingNode   -96.3822674
		ArgOfPericenter -178.207486
		MeanAnomaly     151.339449
	}
}

Asteroid	"4.S109"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1539e-09
	Radius          7.0638
	InertiaMoment   0.39922
	Oblateness      0.032478
	Obliquity       -0.68542
	EqAscendNode    108.44
	TidalLocked     true

	AlbedoBond      0.2564
	AlbedoGeom      0.30768
	Brightness      2.25
	BrightnessReal  1
	Color          (0.564 0.430 0.315)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36166
		Randomize      (0.576, 0.300, -0.389)
		colorDistMagn   0.40031
		colorDistFreq   0.0024465
		detailScale     32
		snowLevel       2
		tropicLatitude  0.037666
		icecapLatitude  2
		icecapHeight    0.6416
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25878
		heightTempGrad  0.625
		beachWidth      0.0011032
		tropicWidth     0.07
		mainFreq        0.6815
		venusFreq       0.51896
		venusMagn       0.68003
		mareDensity     0
		terraceProb     0.45577
		erosion         0
		montesMagn      0.45787
		montesFreq      3.6428
		montesSpiky     0.98525
		montesFraction  0.65162
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15395
		hillsFraction   0.4757
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24249
		craterFreq      0.27049
		craterDensity   0.95848
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56429
		volcanoTemp     1088.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.3574
		BumpOffset      3.1787
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
		Period          0.00107971976
		SemiMajorAxis   0.00163635596
		Eccentricity    0
		Inclination     -0.685424735
		AscendingNode   108.43569
		ArgOfPericenter -76.0042734
		MeanAnomaly     82.3044646
	}
}

Asteroid	"4.S110"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0991e-11
	Radius          1.526
	InertiaMoment   0.39781
	Oblateness      0.033775
	Obliquity       1.3147
	EqAscendNode    -104.89
	TidalLocked     true

	AlbedoBond      0.26142
	AlbedoGeom      0.3137
	Brightness      2.25
	BrightnessReal  1
	Color          (0.665 0.624 0.576)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.93073
		Randomize      (0.846, 0.130, -0.056)
		colorDistMagn   0.41633
		colorDistFreq   0.0011964
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038708
		icecapLatitude  2
		icecapHeight    0.57804
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15649
		heightTempGrad  0.625
		beachWidth      0.00055109
		tropicWidth     0.07
		mainFreq        0.50321
		venusFreq       0.55356
		venusMagn       0.67469
		mareDensity     0
		terraceProb     0.17199
		erosion         0
		montesMagn      0.57343
		montesFreq      2.8949
		montesSpiky     0.95189
		montesFraction  0.7448
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0061645
		hillsFraction   0.6117
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21686
		craterFreq      0.22209
		craterDensity   0.78289
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46638
		volcanoTemp     1135.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.3734
		BumpOffset      0.6867
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
		Period          0.0010864668
		SemiMajorAxis   0.00164316581
		Eccentricity    0
		Inclination     1.31467088
		AscendingNode   -104.891043
		ArgOfPericenter 149.733954
		MeanAnomaly     -158.501395
	}
}

Asteroid	"4.S111"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.797e-13
	Radius          0.48443
	InertiaMoment   0.39963
	Oblateness      0.03087
	Obliquity       0.013017
	EqAscendNode    8.7887
	TidalLocked     true

	AlbedoBond      0.26608
	AlbedoGeom      0.31929
	Brightness      2.25
	BrightnessReal  1
	Color          (0.463 0.416 0.340)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49979
		Randomize      (-0.884, -0.040, 0.277)
		colorDistMagn   0.43208
		colorDistFreq   0.00019481
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034204
		icecapLatitude  2
		icecapHeight    0.50929
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4542
		heightTempGrad  0.625
		beachWidth      0.00059894
		tropicWidth     0.07
		mainFreq        0.31267
		venusFreq       0.57385
		venusMagn       0.6694
		mareDensity     0
		terraceProb     0.29383
		erosion         0
		montesMagn      0.42431
		montesFreq      3.7486
		montesSpiky     0.91187
		montesFraction  0.94418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00056089
		hillsFraction   0.71665
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25028
		craterFreq      0.16965
		craterDensity   0.89953
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51275
		volcanoTemp     1083.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.43598
		BumpOffset      0.21799
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
		Period          0.00109728986
		SemiMajorAxis   0.00165406025
		Eccentricity    0
		Inclination     0.0130167366
		AscendingNode   8.7886709
		ArgOfPericenter -130.841054
		MeanAnomaly     87.4101045
	}
}

Asteroid	"4.S112"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.7081e-15
	Radius          0.13057
	InertiaMoment   0.39842
	Oblateness      0.025703
	Obliquity       0.99971
	EqAscendNode    64.462
	TidalLocked     true

	AlbedoBond      0.27046
	AlbedoGeom      0.32455
	Brightness      2.25
	BrightnessReal  1
	Color          (0.661 0.549 0.505)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.06886
		Randomize      (-0.613, -0.209, 0.610)
		colorDistMagn   0.44756
		colorDistFreq   8.1948e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036391
		icecapLatitude  2
		icecapHeight    0.40268
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35191
		heightTempGrad  0.625
		beachWidth      0.0012468
		tropicWidth     0.07
		mainFreq        0.57262
		venusFreq       0.59047
		venusMagn       0.66413
		mareDensity     0
		terraceProb     0.47668
		erosion         0
		montesMagn      0.54026
		montesFreq      2.9358
		montesSpiky     0.84696
		montesFraction  0.3386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.6605e-05
		hillsFraction   0.43024
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22778
		craterFreq      0.23463
		craterDensity   1.0153
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58252
		volcanoTemp     931.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.11751
		BumpOffset      0.058755
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
		Period          0.00110860913
		SemiMajorAxis   0.00166541593
		Eccentricity    0
		Inclination     0.999714066
		AscendingNode   64.4623963
		ArgOfPericenter 122.278408
		MeanAnomaly     -84.8492649
	}
}

Asteroid	"4.S113"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.7503e-10
	Radius          3.7839
	InertiaMoment   0.39465
	Oblateness      0.030189
	Obliquity       -1.3769
	EqAscendNode    -178.28
	TidalLocked     true

	AlbedoBond      0.27462
	AlbedoGeom      0.32954
	Brightness      2.25
	BrightnessReal  1
	Color          (0.766 0.763 0.761)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.63793
		Randomize      (-0.343, -0.379, 0.943)
		colorDistMagn   0.4628
		colorDistFreq   0.011103
		detailScale     16
		snowLevel       2
		tropicLatitude  0.044241
		icecapLatitude  2
		icecapHeight    0.76591
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24962
		heightTempGrad  0.625
		beachWidth      0.0012946
		tropicWidth     0.07
		mainFreq        0.41019
		venusFreq       0.60608
		venusMagn       0.65887
		mareDensity     0
		terraceProb     0.18068
		erosion         0
		montesMagn      0.37858
		montesFreq      3.9054
		montesSpiky     0.9841
		montesFraction  0.43693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.026174
		hillsFraction   0.59531
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26017
		craterFreq      0.19098
		craterDensity   0.84041
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47386
		volcanoTemp     1179.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.4055
		BumpOffset      1.7028
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
		Period          0.00111775199
		SemiMajorAxis   0.00167456001
		Eccentricity    0
		Inclination     -1.37689614
		AscendingNode   -178.280252
		ArgOfPericenter 174.346628
		MeanAnomaly     108.408927
	}
}

Asteroid	"4.S114"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.5428e-12
	Radius          1.015
	InertiaMoment   0.39891
	Oblateness      0.028975
	Obliquity       0.25344
	EqAscendNode    -147.98
	TidalLocked     true

	AlbedoBond      0.27861
	AlbedoGeom      0.33434
	Brightness      2.25
	BrightnessReal  1
	Color          (0.551 0.544 0.539)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.207
		Randomize      (-0.072, -0.549, -0.724)
		colorDistMagn   0.47782
		colorDistFreq   0.00045993
		detailScale     8
		snowLevel       2
		tropicLatitude  0.033955
		icecapLatitude  2
		icecapHeight    0.67456
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14732
		heightTempGrad  0.625
		beachWidth      0.0007425
		tropicWidth     0.07
		mainFreq        0.65305
		venusFreq       0.62233
		venusMagn       0.65361
		mareDensity     0
		terraceProb     0.30357
		erosion         0
		montesMagn      0.51109
		montesFreq      2.9762
		montesSpiky     0.95061
		montesFraction  0.51298
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.003131
		hillsFraction   0.69856
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23583
		craterFreq      0.24822
		craterDensity   0.93934
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51933
		volcanoTemp     1126.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.9135
		BumpOffset      0.45675
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
		Period          0.00112301981
		SemiMajorAxis   0.00167981721
		Eccentricity    0
		Inclination     0.253438727
		AscendingNode   -147.981983
		ArgOfPericenter 123.7551
		MeanAnomaly     -66.0971035
	}
}

Asteroid	"4.S115"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.2454e-13
	Radius          0.33171
	InertiaMoment   0.39721
	Oblateness      0.028474
	Obliquity       -1.0159
	EqAscendNode    158.45
	TidalLocked     true

	AlbedoBond      0.28248
	AlbedoGeom      0.33897
	Brightness      2.25
	BrightnessReal  1
	Color          (0.730 0.726 0.722)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.77606
		Randomize      (0.198, -0.719, -0.391)
		colorDistMagn   0.49265
		colorDistFreq   8.032e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.040495
		icecapLatitude  2
		icecapHeight    0.60832
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44503
		heightTempGrad  0.625
		beachWidth      0.0010904
		tropicWidth     0.07
		mainFreq        0.48355
		venusFreq       0.64143
		venusMagn       0.64833
		mareDensity     0
		terraceProb     0.50115
		erosion         0
		montesMagn      0.69774
		montesFreq      4.3752
		montesSpiky     0.91019
		montesFraction  0.58387
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00028936
		hillsFraction   0.9341
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28671
		craterFreq      0.20598
		craterDensity   0.73848
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.33337
		volcanoTemp     974.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.29854
		BumpOffset      0.14927
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
		Period          0.0011252727
		SemiMajorAxis   0.00168206305
		Eccentricity    0
		Inclination     -1.01594523
		AscendingNode   158.447793
		ArgOfPericenter -157.576849
		MeanAnomaly     78.3337694
	}
}

Asteroid	"4.S116"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.5477e-15
	Radius          0.077378
	InertiaMoment   0.39934
	Oblateness      0.028716
	Obliquity       -0.22996
	EqAscendNode    -12.001
	TidalLocked     true

	AlbedoBond      0.28624
	AlbedoGeom      0.34348
	Brightness      2.25
	BrightnessReal  1
	Color          (0.510 0.508 0.504)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.34513
		Randomize      (0.468, -0.889, -0.058)
		colorDistMagn   0.5073
		colorDistFreq   2.4559e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034969
		icecapLatitude  2
		icecapHeight    0.54398
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34274
		heightTempGrad  0.625
		beachWidth      0.00083821
		tropicWidth     0.07
		mainFreq        0.27117
		venusFreq       0.67037
		venusMagn       0.64301
		mareDensity     0
		terraceProb     0.18932
		erosion         0
		montesMagn      0.48286
		montesFreq      3.0164
		montesSpiky     0.84318
		montesFraction  0.65945
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4225e-05
		hillsFraction   0.57815
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24324
		craterFreq      0.26508
		craterDensity   0.88249
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48078
		volcanoTemp     358.64
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.069641
		BumpOffset      0.03482
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
		Period          0.00113699535
		SemiMajorAxis   0.0016937249
		Eccentricity    0
		Inclination     -0.229956526
		AscendingNode   -12.0014041
		ArgOfPericenter 8.68856499
		MeanAnomaly     -152.161293
	}
}

Asteroid	"4.S117"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.111e-11
	Radius          2.335
	InertiaMoment   0.398
	Oblateness      0.029347
	Obliquity       0.0044236
	EqAscendNode    -83.676
	TidalLocked     true

	AlbedoBond      0.28992
	AlbedoGeom      0.3479
	Brightness      2.25
	BrightnessReal  1
	Color          (0.691 0.687 0.686)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.9142
		Randomize      (0.739, 0.941, 0.275)
		colorDistMagn   0.52178
		colorDistFreq   0.0037614
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034222
		icecapLatitude  2
		icecapHeight    0.46383
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24045
		heightTempGrad  0.625
		beachWidth      0.0014861
		tropicWidth     0.07
		mainFreq        0.55227
		venusFreq       0.51486
		venusMagn       0.63765
		mareDensity     0
		terraceProb     0.31357
		erosion         0
		montesMagn      0.60974
		montesFreq      2.0533
		montesSpiky     0.98294
		montesFraction  0.75606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011621
		hillsFraction   0.68158
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21826
		craterFreq      0.21894
		craterDensity   0.987
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52626
		volcanoTemp     970.09
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.1015
		BumpOffset      1.0507
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
		Period          0.00114109422
		SemiMajorAxis   0.00169779305
		Eccentricity    0
		Inclination     0.00442355359
		AscendingNode   -83.6755081
		ArgOfPericenter -167.301792
		MeanAnomaly     149.944031
	}
}

Asteroid	"4.S118"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1974e-12
	Radius          0.70908
	InertiaMoment   0.39974
	Oblateness      0.028285
	Obliquity       -0.46819
	EqAscendNode    85.01
	TidalLocked     true

	AlbedoBond      0.29355
	AlbedoGeom      0.35226
	Brightness      2.25
	BrightnessReal  1
	Color          (0.474 0.468 0.465)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48327
		Randomize      (-0.991, 0.771, 0.608)
		colorDistMagn   0.53612
		colorDistFreq   0.00018641
		detailScale     8
		snowLevel       2
		tropicLatitude  0.036187
		icecapLatitude  2
		icecapHeight    0.85933
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13816
		heightTempGrad  0.625
		beachWidth      0.00063392
		tropicWidth     0.07
		mainFreq        0.38627
		venusFreq       0.55195
		venusMagn       0.63223
		mareDensity     0
		terraceProb     0.5312
		erosion         0
		montesMagn      0.45315
		montesFreq      3.0568
		montesSpiky     0.94932
		montesFraction  0.13145
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00090557
		hillsFraction   0.83923
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25114
		craterFreq      0.1614
		craterDensity   0.81866
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41789
		volcanoTemp     1117.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.63818
		BumpOffset      0.31909
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
		Period          0.00114342752
		SemiMajorAxis   0.00170010668
		Eccentricity    0
		Inclination     -0.468187145
		AscendingNode   85.0097253
		ArgOfPericenter 114.298653
		MeanAnomaly     18.0183472
	}
}

Asteroid	"4.S119"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.752e-14
	Radius          0.22322
	InertiaMoment   0.39857
	Oblateness      0.027462
	Obliquity       1.0996
	EqAscendNode    -8.6657
	TidalLocked     true

	AlbedoBond      0.29715
	AlbedoGeom      0.35658
	Brightness      2.25
	BrightnessReal  1
	Color          (0.655 0.650 0.647)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.052333
		Randomize      (-0.721, 0.601, 0.941)
		colorDistMagn   0.55032
		colorDistFreq   3.2545e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.037054
		icecapLatitude  2
		icecapHeight    0.71234
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43586
		heightTempGrad  0.625
		beachWidth      0.00068178
		tropicWidth     0.07
		mainFreq        0.62777
		venusFreq       0.57266
		venusMagn       0.62672
		mareDensity     0
		terraceProb     0.19795
		erosion         0
		montesMagn      0.56794
		montesFreq      2.2279
		montesSpiky     0.90847
		montesFraction  0.35016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00014942
		hillsFraction   0.5598
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22866
		craterFreq      0.23142
		craterDensity   0.92156
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48736
		volcanoTemp     1165.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.20089
		BumpOffset      0.10045
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
		Period          0.00115528865
		SemiMajorAxis   0.00171184361
		Eccentricity    0
		Inclination     1.09960022
		AscendingNode   -8.66565943
		ArgOfPericenter 113.426804
		MeanAnomaly     -1.77432694
	}
}

Asteroid	"4.S120"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.3391e-09
	Radius          7.351
	InertiaMoment   0.3961
	Oblateness      0.026797
	Obliquity       1.2466
	EqAscendNode    -169.46
	TidalLocked     true

	AlbedoBond      0.30073
	AlbedoGeom      0.36087
	Brightness      2.25
	BrightnessReal  1
	Color          (0.438 0.432 0.426)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.6214
		Randomize      (-0.450, 0.431, -0.726)
		colorDistMagn   0.5644
		colorDistFreq   0.017635
		detailScale     32
		snowLevel       2
		tropicLatitude  0.038153
		icecapLatitude  2
		icecapHeight    0.63899
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33357
		heightTempGrad  0.625
		beachWidth      0.00072963
		tropicWidth     0.07
		mainFreq        0.46354
		venusFreq       0.58942
		venusMagn       0.6211
		mareDensity     0
		terraceProb     0.32385
		erosion         0
		montesMagn      0.41848
		montesFreq      3.0975
		montesSpiky     0.83917
		montesFraction  0.44484
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14119
		hillsFraction   0.6653
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26144
		craterFreq      0.18652
		craterDensity   1.0783
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53375
		volcanoTemp     1013.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.6159
		BumpOffset      3.3079
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
		Period          0.0011645418
		SemiMajorAxis   0.001720972
		Eccentricity    0
		Inclination     1.24661735
		AscendingNode   -169.460192
		ArgOfPericenter 113.000524
		MeanAnomaly     158.97856
	}
}

Asteroid	"4.S121"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1855e-11
	Radius          1.4952
	InertiaMoment   0.39903
	Oblateness      0.02524
	Obliquity       -1.3707
	EqAscendNode    150.59
	TidalLocked     true

	AlbedoBond      0.30431
	AlbedoGeom      0.36518
	Brightness      2.25
	BrightnessReal  1
	Color          (0.619 0.614 0.607)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19047
		Randomize      (-0.180, 0.261, -0.393)
		colorDistMagn   0.57838
		colorDistFreq   0.001383
		detailScale     8
		snowLevel       2
		tropicLatitude  0.044172
		icecapLatitude  2
		icecapHeight    0.5755
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23128
		heightTempGrad  0.625
		beachWidth      0.0010775
		tropicWidth     0.07
		mainFreq        0.73453
		venusFreq       0.60505
		venusMagn       0.61537
		mareDensity     0
		terraceProb     0.57139
		erosion         0
		montesMagn      0.53566
		montesFreq      2.3398
		montesSpiky     0.98179
		montesFraction  0.51989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0052792
		hillsFraction   0.79781
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23659
		craterFreq      0.24461
		craterDensity   0.86491
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43595
		volcanoTemp     1261
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.3456
		BumpOffset      0.67282
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
		Period          0.00117631291
		SemiMajorAxis   0.00173254952
		Eccentricity    0
		Inclination     -1.37068929
		AscendingNode   150.594649
		ArgOfPericenter -45.6907438
		MeanAnomaly     -77.1087792
	}
}

Asteroid	"4.S122"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.0728e-13
	Radius          0.48704
	InertiaMoment   0.39747
	Oblateness      0.025098
	Obliquity       -1.2146
	EqAscendNode    179.46
	TidalLocked     true

	AlbedoBond      0.30792
	AlbedoGeom      0.36951
	Brightness      2.25
	BrightnessReal  1
	Color          (0.796 0.795 0.793)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.75954
		Randomize      (0.091, 0.091, -0.060)
		colorDistMagn   0.59226
		colorDistFreq   6.49e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.042482
		icecapLatitude  2
		icecapHeight    0.50618
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12899
		heightTempGrad  0.625
		beachWidth      0.0011253
		tropicWidth     0.07
		mainFreq        0.53244
		venusFreq       0.62119
		venusMagn       0.60948
		mareDensity     0
		terraceProb     0.20658
		erosion         0
		montesMagn      0.36909
		montesFreq      3.1389
		montesSpiky     0.94803
		montesFraction  0.5908
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00050183
		hillsFraction   0.53963
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19026
		craterFreq      0.20248
		craterDensity   0.96439
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49372
		volcanoTemp     1108.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.43833
		BumpOffset      0.21917
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
		Period          0.00117975235
		SemiMajorAxis   0.0017359251
		Eccentricity    0
		Inclination     -1.21458662
		AscendingNode   179.46006
		ArgOfPericenter 24.9046522
		MeanAnomaly     81.2326519
	}
}

Asteroid	"4.S123"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.5905e-15
	Radius          0.14373
	InertiaMoment   0.39945
	Oblateness      0.027306
	Obliquity       0.33512
	EqAscendNode    -135.14
	TidalLocked     true

	AlbedoBond      0.31157
	AlbedoGeom      0.37388
	Brightness      2.25
	BrightnessReal  1
	Color          (0.579 0.574 0.572)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.3286
		Randomize      (0.361, -0.079, 0.273)
		colorDistMagn   0.60606
		colorDistFreq   1.2094e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.033988
		icecapLatitude  2
		icecapHeight    0.39568
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4267
		heightTempGrad  0.625
		beachWidth      0.0008732
		tropicWidth     0.07
		mainFreq        0.35986
		venusFreq       0.64
		venusMagn       0.60341
		mareDensity     0
		terraceProb     0.33448
		erosion         0
		montesMagn      0.5068
		montesFreq      2.426
		montesSpiky     0.90673
		montesFraction  0.66746
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.6611e-05
		hillsFraction   0.64942
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.244
		craterFreq      0.26029
		craterDensity   0.79212
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54208
		volcanoTemp     956.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.12936
		BumpOffset      0.06468
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
		Period          0.00118606124
		SemiMajorAxis   0.00174210832
		Eccentricity    0
		Inclination     0.335116936
		AscendingNode   -135.144461
		ArgOfPericenter 18.9911947
		MeanAnomaly     150.879761
	}
}

Asteroid	"4.S124"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.9428e-10
	Radius          3.9172
	InertiaMoment   0.39818
	Oblateness      0.026819
	Obliquity       -1.3803
	EqAscendNode    -133.48
	TidalLocked     true

	AlbedoBond      0.31528
	AlbedoGeom      0.37834
	Brightness      2.25
	BrightnessReal  1
	Color          (0.759 0.756 0.754)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.89767
		Randomize      (0.631, -0.249, 0.606)
		colorDistMagn   0.61978
		colorDistFreq   0.0031395
		detailScale     16
		snowLevel       2
		tropicLatitude  0.044279
		icecapLatitude  2
		icecapHeight    0.76096
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3244
		heightTempGrad  0.625
		beachWidth      0.00092105
		tropicWidth     0.07
		mainFreq        0.60462
		venusFreq       0.66769
		venusMagn       0.59712
		mareDensity     0
		terraceProb     0.63694
		erosion         0
		montesMagn      0.67384
		montesFreq      3.1812
		montesSpiky     0.83489
		montesFraction  0.76801
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.045466
		hillsFraction   0.76845
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21956
		craterFreq      0.21576
		craterDensity   0.90443
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44816
		volcanoTemp     1204.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.5255
		BumpOffset      1.7627
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
		Period          0.00119347653
		SemiMajorAxis   0.00174936192
		Eccentricity    0
		Inclination     -1.38025669
		AscendingNode   -133.475491
		ArgOfPericenter 150.316824
		MeanAnomaly     73.7704903
	}
}

Asteroid	"4.S125"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.8035e-12
	Radius          1.0407
	InertiaMoment   0.39985
	Oblateness      0.025423
	Obliquity       0.77792
	EqAscendNode    -139
	TidalLocked     true

	AlbedoBond      0.31908
	AlbedoGeom      0.3829
	Brightness      2.25
	BrightnessReal  1
	Color          (0.543 0.538 0.532)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46674
		Randomize      (0.902, -0.419, 0.939)
		colorDistMagn   0.63345
		colorDistFreq   0.00059884
		detailScale     8
		snowLevel       2
		tropicLatitude  0.035185
		icecapLatitude  2
		icecapHeight    0.67169
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22211
		heightTempGrad  0.625
		beachWidth      0.00096891
		tropicWidth     0.07
		mainFreq        0.44291
		venusFreq       0.51009
		venusMagn       0.59058
		mareDensity     0
		terraceProb     0.21522
		erosion         0
		montesMagn      0.4785
		montesFreq      2.4978
		montesSpiky     0.98063
		montesFraction  0.17894
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0028119
		hillsFraction   0.51658
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25202
		craterFreq      0.1496
		craterDensity   1.0254
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49998
		volcanoTemp     1052
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.93666
		BumpOffset      0.46833
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
		Period          0.00120351305
		SemiMajorAxis   0.00175915572
		Eccentricity    0
		Inclination     0.777916709
		AscendingNode   -139.000055
		ArgOfPericenter 137.563562
		MeanAnomaly     138.856943
	}
}

Asteroid	"4.S126"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.3407e-13
	Radius          0.34538
	InertiaMoment   0.3987
	Oblateness      0.026037
	Obliquity       1.2592
	EqAscendNode    -161.13
	TidalLocked     true

	AlbedoBond      0.32299
	AlbedoGeom      0.38759
	Brightness      2.25
	BrightnessReal  1
	Color          (0.723 0.719 0.715)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.035806
		Randomize      (-0.828, -0.588, -0.728)
		colorDistMagn   0.64707
		colorDistFreq   1.0728e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.038253
		icecapLatitude  2
		icecapHeight    0.60581
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11982
		heightTempGrad  0.625
		beachWidth      0.0010168
		tropicWidth     0.07
		mainFreq        0.69722
		venusFreq       0.55028
		venusMagn       0.58372
		mareDensity     0
		terraceProb     0.3455
		erosion         0
		montesMagn      0.60224
		montesFreq      3.2249
		montesSpiky     0.94672
		montesFraction  0.36109
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00028
		hillsFraction   0.63369
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22953
		craterFreq      0.22825
		craterDensity   0.84617
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55178
		volcanoTemp     999.73
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.31084
		BumpOffset      0.15542
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
		Period          0.00120840276
		SemiMajorAxis   0.0017639173
		Eccentricity    0
		Inclination     1.25923543
		AscendingNode   -161.130003
		ArgOfPericenter -77.7618626
		MeanAnomaly     -153.441494
	}
}

Asteroid	"4.S127"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.76e-15
	Radius          0.079382
	InertiaMoment   0.39666
	Oblateness      0.023839
	Obliquity       -1.2246
	EqAscendNode    74.544
	TidalLocked     true

	AlbedoBond      0.32705
	AlbedoGeom      0.39246
	Brightness      2.25
	BrightnessReal  1
	Color          (0.503 0.501 0.498)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60487
		Randomize      (-0.557, -0.758, -0.395)
		colorDistMagn   0.66065
		colorDistFreq   3.2796e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.042587
		icecapLatitude  2
		icecapHeight    0.54126
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41753
		heightTempGrad  0.625
		beachWidth      0.00076462
		tropicWidth     0.07
		mainFreq        0.51285
		venusFreq       0.57145
		venusMagn       0.57649
		mareDensity     0
		terraceProb     0.10158
		erosion         0
		montesMagn      0.44832
		montesFreq      2.5604
		montesSpiky     0.90496
		montesFraction  0.45258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3229e-05
		hillsFraction   0.74464
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26282
		craterFreq      0.18159
		craterDensity   0.94469
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45788
		volcanoTemp     306.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.071444
		BumpOffset      0.035722
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
		Period          0.00120986297
		SemiMajorAxis   0.00176533801
		Eccentricity    0
		Inclination     -1.2245562
		AscendingNode   74.543615
		ArgOfPericenter -40.9373879
		MeanAnomaly     35.7149782
	}
}

Asteroid	"4.S128"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.4786e-11
	Radius          2.4026
	InertiaMoment   0.39915
	Oblateness      0.025731
	Obliquity       0.6891
	EqAscendNode    128.52
	TidalLocked     true

	AlbedoBond      0.3313
	AlbedoGeom      0.39756
	Brightness      2.25
	BrightnessReal  1
	Color          (0.684 0.680 0.679)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.17394
		Randomize      (-0.287, -0.928, -0.062)
		colorDistMagn   0.6742
		colorDistFreq   0.0048668
		detailScale     8
		snowLevel       2
		tropicLatitude  0.034811
		icecapLatitude  2
		icecapHeight    0.45976
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31524
		heightTempGrad  0.625
		beachWidth      0.0011125
		tropicWidth     0.07
		mainFreq        0.32965
		venusFreq       0.58836
		venusMagn       0.56879
		mareDensity     0
		terraceProb     0.22388
		erosion         0
		montesMagn      0.56264
		montesFreq      3.2704
		montesSpiky     0.83028
		montesFraction  0.52677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.010049
		hillsFraction   0.48862
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23734
		craterFreq      0.24114
		craterDensity   0.75439
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50625
		volcanoTemp     995.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.1623
		BumpOffset      1.0811
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
		Period          0.0012212107
		SemiMajorAxis   0.00177635931
		Eccentricity    0
		Inclination     0.68910398
		AscendingNode   128.516176
		ArgOfPericenter -1.13499602
		MeanAnomaly     -6.96030767
	}
}

Moon	"4.1"
{
	ParentBody     "4"
	Class          "Terra"
	Mass            0.0040488
	Radius          1044.3
	InertiaMoment   0.39455
	Oblateness      0.0071778
	Obliquity       0.74035
	EqAscendNode    50.676
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.586 0.584 0.581)

	Surface
	{
		Preset         "terra_airless_io.cfg"
		SurfStyle       0.32738
		Randomize      (-0.579, 0.679, 0.003)
		colorDistMagn   0.063724
		colorDistFreq   119.36
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.13145
		snowLevel       2
		tropicLatitude  0.035019
		icecapLatitude  2
		icecapHeight    0.40754
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14155
		heightTempGrad  0.625
		beachWidth      0.0009115
		tropicWidth     0.07
		mainFreq        1.7576
		venusFreq       0.85267
		venusMagn       0
		mareFreq        0.32644
		mareDensity     0.16565
		terraceProb     0.4195
		erosion         0
		montesMagn      0.06104
		montesFreq      33.489
		montesSpiky     0.96828
		montesFraction  0.7782
		dunesMagn       0.031736
		dunesFreq       10.523
		dunesFraction   0.91128
		hillsMagn       0.11795
		hillsFreq       128.3
		hillsFraction   0.65381
		hills2Fraction  0
		riversMagn      58.364
		riversFreq      2.3778
		riversSin       4.6827
		riftsMagn       48.429
		riftsFreq       2.4153
		riftsSin        7.4181
		canyonsMagn     0.36334
		canyonsFreq     0.36088
		canyonsFraction 0.075061
		cracksMagn      0.047268
		cracksFreq      0.26823
		cracksOctaves   0
		craterMagn      0.59679
		craterFreq      3.5393
		craterDensity   0.81441
		craterOctaves   18
		craterRayedFactor 0.24924
		volcanoMagn     0.19234
		volcanoFreq     0.49865
		volcanoDensity  0.22622
		volcanoOctaves  3
		volcanoActivity 1.0208
		volcanoFlows    0.29746
		volcanoRadius   0.16097
		volcanoTemp     1120
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		PeriodDays      0.79801675
		SemiMajorAxisKm 391636.961
		Eccentricity    0.000110932597
		Inclination     0.740352935
		AscendingNode   50.6757404
		ArgOfPericenter 73.2095304
		MeanAnomaly     -118.163663
	}
}

Moon	"4.2"
{
	ParentBody     "4"
	Class          "Terra"
	Mass            0.0012758
	Radius          728.85
	InertiaMoment   0.39819
	Oblateness      0.0024612
	Obliquity       -0.5052
	EqAscendNode    -109.75
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.766 0.764 0.763)

	Surface
	{
		Preset         "terra_airless_vesta_natural.cfg"
		SurfStyle       0.89645
		Randomize      (-0.308, 0.509, 0.336)
		colorDistMagn   0.064425
		colorDistFreq   98.688
		detailScale     2048
		drivenDarkening 0
		seaLevel        0.12398
		snowLevel       2
		tropicLatitude  0.036416
		icecapLatitude  2
		icecapHeight    0.62798
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43926
		heightTempGrad  0.625
		beachWidth      0.00065935
		tropicWidth     0.07
		mainFreq        2.0907
		venusFreq       0.97456
		venusMagn       0
		mareFreq        0.11343
		mareDensity     0.13082
		terraceProb     0.15376
		erosion         0
		montesMagn      0.065621
		montesFreq      39.802
		montesSpiky     0.94002
		montesFraction  0.74259
		dunesMagn       0.040167
		dunesFreq       5.9186
		dunesFraction   0.41481
		hillsMagn       0.14249
		hillsFreq       79.785
		hillsFraction   0.38523
		hills2Fraction  0
		riversMagn      56.288
		riversFreq      2.5179
		riversSin       5.0347
		riftsMagn       54.768
		riftsFreq       2.701
		riftsSin        6.7
		canyonsMagn     0.63011
		canyonsFreq     0.28938
		canyonsFraction 0.61024
		cracksMagn      0.063236
		cracksFreq      0.34668
		cracksOctaves   0
		craterMagn      0.55478
		craterFreq      2.0589
		craterDensity   0.89881
		craterOctaves   18
		craterRayedFactor 0.16341
		volcanoMagn     0.19111
		volcanoFreq     0.66653
		volcanoDensity  0.3508
		volcanoOctaves  3
		volcanoActivity 0.69394
		volcanoFlows    0.15328
		volcanoRadius   0.14532
		volcanoTemp     1111.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		PeriodDays      1.42516648
		SemiMajorAxisKm 576481.991
		Eccentricity    0.0007682906
		Inclination     -0.505200607
		AscendingNode   -109.752389
		ArgOfPericenter 168.781285
		MeanAnomaly     88.9761366
	}
}

Moon	"4.3"
{
	ParentBody     "4"
	Class          "Ferria"
	Mass            0.0043242
	Radius          1031.5
	InertiaMoment   0.39268
	Obliquity       -1.469
	EqAscendNode    -15.698
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.550 0.545 0.542)

	Surface
	{
		Preset         "ferria_airless_mercury.cfg"
		SurfStyle       0.46551
		Randomize      (-0.038, 0.339, 0.669)
		colorDistMagn   0.065131
		colorDistFreq   114.97
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.11427
		snowLevel       2
		tropicLatitude  0.045287
		icecapLatitude  2
		icecapHeight    0.51245
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33697
		heightTempGrad  0.625
		beachWidth      0.00070721
		tropicWidth     0.07
		mainFreq        1.836
		venusFreq       1.0941
		venusMagn       0
		mareFreq        0.30245
		mareDensity     0.16821
		terraceProb     0.27426
		erosion         0
		montesMagn      0.070632
		montesFreq      49.045
		montesSpiky     0.9058
		montesFraction  0.70698
		dunesMagn       0.048744
		dunesFreq       11.531
		dunesFraction   0.91834
		hillsMagn       0.12336
		hillsFreq       141.3
		hillsFraction   0.11665
		hills2Fraction  0
		riversMagn      53.173
		riversFreq      2.6408
		riversSin       5.2954
		riftsMagn       57.16
		riftsFreq       2.943
		riftsSin        6.2382
		canyonsMagn     0.55856
		canyonsFreq     0.30788
		canyonsFraction 0.14543
		cracksMagn      0.03168
		cracksFreq      0.26546
		cracksOctaves   0
		craterMagn      0.65095
		craterFreq      2.3589
		craterDensity   0.98222
		craterOctaves   18
		craterRayedFactor 0.087863
		volcanoMagn     0.18996
		volcanoFreq     0.75705
		volcanoDensity  0.3534
		volcanoOctaves  3
		volcanoActivity 1.0413
		volcanoFlows    0.28547
		volcanoRadius   0.18352
		volcanoTemp     1003.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
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
		PeriodDays      2.54517806
		SemiMajorAxisKm 848570.28
		Eccentricity    0.00229744008
		Inclination     -1.46897141
		AscendingNode   -15.6977301
		ArgOfPericenter -23.8577427
		MeanAnomaly     -19.20987
	}
}

Moon	"4.4"
{
	ParentBody     "4"
	Class          "Terra"
	Mass            0.11561
	Radius          3147.4
	InertiaMoment   0.32873
	Obliquity       0.68598
	EqAscendNode    -32.433
	TidalLocked     true

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.730 0.727 0.724)

	Surface
	{
		Preset         "terra_arid_earth_green.cfg"
		SurfStyle       0.034582
		Randomize      (0.233, 0.169, -0.998)
		colorDistMagn   0.090771
		colorDistFreq   351.94
		detailScale     8192
		seaLevel        0.12933
		snowLevel       2
		tropicLatitude  0.034799
		icecapLatitude  0.88127
		icecapHeight    0.060733
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23467
		heightTempGrad  0.625
		beachWidth      0.0010551
		tropicWidth     0.07
		mainFreq        1.1642
		venusFreq       1.284
		venusMagn       0
		mareFreq        1.103
		mareDensity     0.20268
		terraceProb     0.15344
		erosion         0
		montesMagn      0.15282
		montesFreq      156.93
		montesSpiky     0.93848
		montesFraction  0.84808
		dunesMagn       0.060241
		dunesFreq       27.447
		dunesFraction   0.68061
		hillsMagn       0.14117
		hillsFreq       369.47
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.1782
		riversSin       5.8243
		riftsMagn       52.442
		riftsFreq       3.1713
		riftsSin        7.4433
		canyonsMagn     0.052241
		canyonsFreq     78.886
		canyonsFraction 0
		cracksMagn      0.12726
		cracksFreq      0.30958
		cracksOctaves   0
		craterMagn      0.53065
		craterFreq      10.028
		craterDensity   0.31527
		craterOctaves   8.061
		volcanoMagn     0.77907
		volcanoFreq     0.66487
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.64843
		volcanoRadius   0.44555
		volcanoTemp     942.78
		lavaCoverTidal  0.039175
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.5296
		stripeTwist     0.24863
		cycloneMagn     2.8042
		cycloneFreq     0.44194
		cycloneDensity  0.37409
		cycloneOctaves  4
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      2.1987
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.474
		Velocity        48.056
		BumpHeight      2.2371
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.6917
		mainOctaves     10
		Coverage        0.11331
		stripeZones     1.5296
		stripeTwist     0.24863
	}

	Clouds
	{
		Height          18.948
		Velocity        90.251
		BumpHeight      2.2371
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.6917
		mainOctaves     10
		Coverage        0.11331
		stripeZones     1.5296
		stripeTwist     0.24863
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          64.502
		Density         0.11029
		Pressure        0.055803
		Greenhouse      0.99005
		Bright          8.8988
		Opacity         1
		SkyLight        2.9663
		Hue             0.095186
		Saturation      0.94891

		Composition
		{
			CO2       	99.902
			H2S       	0.037026
			C3H8      	0.030453
			SO2       	0.028091
			C8H18     	0.002769
			Ar        	2.2995e-05
		}
	}

	Aurora
	{
		Height         20.64
		NorthLat       88.756
		NorthLon       31.474
		NorthRadius    1043.7
		NorthWidth     341.56
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 70.089
		NorthMoveSpeed 0.85799
		NorthParticles 50000
		SouthLat       -80.561
		SouthLon       -143.89
		SouthRadius    747.04
		SouthWidth     192.88
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 66.33
		SouthMoveSpeed 1.4549
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.54518917
		SemiMajorAxisKm 1249078.95
		Eccentricity    0.00392890628
		Inclination     0.685980556
		AscendingNode   -32.43285
		ArgOfPericenter -165.929093
		MeanAnomaly     35.2553125
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.2817e-08
	Radius          17.994
	InertiaMoment   0.39719
	Obliquity       130.4
	EqAscendNode    144.79
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.514 0.509 0.502)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60365
		Randomize      (0.503, -0.001, -0.665)
		colorDistMagn   0.6385
		colorDistFreq   0.10496
		detailScale     64
		snowLevel       2
		tropicLatitude  0.76472
		icecapLatitude  2
		icecapHeight    0.55189
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13238
		heightTempGrad  0.625
		beachWidth      0.0017029
		tropicWidth     0.07
		mainFreq        0.61745
		venusFreq       0.65083
		venusMagn       0.36672
		mareDensity     0
		terraceProb     0.16257
		erosion         0
		montesMagn      0.42013
		montesFreq      3.3934
		montesSpiky     0.6921
		montesFraction  0.29411
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.99498
		hillsFraction   0.62647
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20911
		craterFreq      0.22896
		craterDensity   0.97595
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55392
		volcanoTemp     1106.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.194
		BumpOffset      8.0971
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
		PeriodDays      36.5808728
		SemiMajorAxisKm 5016235.41
		Eccentricity    0.367206486
		Inclination     130.395038
		AscendingNode   144.787433
		ArgOfPericenter -178.814632
		MeanAnomaly     26.8961633
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.0966e-08
	Radius          20.262
	InertiaMoment   0.39903
	RotationPeriod  301.36
	Obliquity       228.03
	EqAscendNode    -45.613

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.694 0.691 0.685)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.17272
		Randomize      (0.773, -0.171, -0.332)
		colorDistMagn   0.6521
		colorDistFreq   0.25335
		detailScale     64
		snowLevel       2
		tropicLatitude  0.74095
		icecapLatitude  2
		icecapHeight    0.47522
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43009
		heightTempGrad  0.625
		beachWidth      0.0011508
		tropicWidth     0.07
		mainFreq        0.45463
		venusFreq       0.69354
		venusMagn       0.86513
		mareDensity     0
		terraceProb     0.28358
		erosion         0
		montesMagn      0.53694
		montesFreq      2.7383
		montesSpiky     0.96811
		montesFraction  0.4094
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.085
		hillsFraction   0.73489
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24685
		craterFreq      0.18275
		craterDensity   0.80707
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4596
		volcanoTemp     1054.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.236
		BumpOffset      9.1179
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
		PeriodDays      37.6703742
		SemiMajorAxisKm 5115347.68
		Eccentricity    0.499728621
		Inclination     228.031344
		AscendingNode   -45.6130501
		ArgOfPericenter 127.752733
		MeanAnomaly     22.8482737
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.2021e-08
	Radius          23.521
	InertiaMoment   0.39667
	RotationPeriod  618.02
	Obliquity       39.49
	EqAscendNode    -152.02

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.473 0.469 0.468)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.74179
		Randomize      (-0.956, -0.341, 0.001)
		colorDistMagn   0.66567
		colorDistFreq   0.14987
		detailScale     64
		snowLevel       2
		tropicLatitude  0.63313
		icecapLatitude  2
		icecapHeight    0.9208
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3278
		heightTempGrad  0.625
		beachWidth      0.0011986
		tropicWidth     0.07
		mainFreq        0.71714
		venusFreq       0.53396
		venusMagn       0.83382
		mareDensity     0
		terraceProb     0.45427
		erosion         0
		montesMagn      0.37185
		montesFreq      3.4508
		montesSpiky     0.93216
		montesFraction  0.48979
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3203
		hillsFraction   0.47303
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22374
		craterFreq      0.24191
		craterDensity   0.91351
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50748
		volcanoTemp     1102.3
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
		PeriodDays      38.6263076
		SemiMajorAxisKm 5201524.69
		Eccentricity    0.141766795
		Inclination     39.4899324
		AscendingNode   -152.021097
		ArgOfPericenter 114.844484
		MeanAnomaly     89.212496
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.707e-08
	Radius          26.04
	InertiaMoment   0.39884
	RotationPeriod  476.8
	Obliquity       175.41
	EqAscendNode    163.37

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.654 0.651 0.649)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.31085
		Randomize      (-0.686, -0.511, 0.334)
		colorDistMagn   0.67921
		colorDistFreq   0.39596
		detailScale     64
		snowLevel       2
		tropicLatitude  0.090827
		icecapLatitude  2
		icecapHeight    0.72284
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22551
		heightTempGrad  0.625
		beachWidth      0.00064648
		tropicWidth     0.07
		mainFreq        0.52387
		venusFreq       0.56093
		venusMagn       0.81376
		mareDensity     0
		terraceProb     0.17132
		erosion         0
		montesMagn      0.50799
		montesFreq      2.7834
		montesSpiky     0.88381
		montesFraction  0.56121
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4534
		hillsFraction   0.61051
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25551
		craterFreq      0.19966
		craterDensity   1.0484
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56686
		volcanoTemp     1050
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
		PeriodDays      39.7329793
		SemiMajorAxisKm 5300407.85
		Eccentricity    0.280332797
		Inclination     175.414018
		AscendingNode   163.370825
		ArgOfPericenter 79.9119348
		MeanAnomaly     -92.8794732
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.7639e-08
	Radius          28.545
	InertiaMoment   0.39567
	RotationPeriod  642.8
	Obliquity       212.35
	EqAscendNode    -67.897

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.437 0.433 0.429)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87992
		Randomize      (-0.416, -0.681, 0.667)
		colorDistMagn   0.69273
		colorDistFreq   0.16361
		detailScale     128
		snowLevel       2
		tropicLatitude  0.53212
		icecapLatitude  2
		icecapHeight    0.64672
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12321
		heightTempGrad  0.625
		beachWidth      0.0012943
		tropicWidth     0.07
		mainFreq        0.34725
		venusFreq       0.57954
		venusMagn       0.79849
		mareDensity     0
		terraceProb     0.29309
		erosion         0
		montesMagn      0.67951
		montesFreq      3.515
		montesSpiky     0.99912
		montesFraction  0.63414
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4841
		hillsFraction   0.71527
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23256
		craterFreq      0.25688
		craterDensity   0.85634
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46774
		volcanoTemp     997.78
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
		PeriodDays      40.1752467
		SemiMajorAxisKm 5339667.76
		Eccentricity    0.165799394
		Inclination     212.345528
		AscendingNode   -67.8973022
		ArgOfPericenter -92.0903942
		MeanAnomaly     -71.9771809
	}
}

DwarfMoon	"4.D6"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.059e-07
	Radius          31.623
	InertiaMoment   0.39864
	RotationPeriod  492.92
	Obliquity       -37.168
	EqAscendNode    -48.446

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.618 0.614 0.610)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.44899
		Randomize      (-0.145, -0.851, 1.000)
		colorDistMagn   0.70626
		colorDistFreq   0.55141
		detailScale     128
		snowLevel       2
		tropicLatitude  0.60821
		icecapLatitude  2
		icecapHeight    0.58296
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42092
		heightTempGrad  0.625
		beachWidth      0.0013422
		tropicWidth     0.07
		mainFreq        0.59499
		venusFreq       0.59563
		venusMagn       0.7859
		mareDensity     0
		terraceProb     0.47496
		erosion         0
		montesMagn      0.47971
		montesFreq      2.8268
		montesSpiky     0.96691
		montesFraction  0.72096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0287
		hillsFraction   0.42569
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26919
		craterFreq      0.21327
		craterDensity   0.95492
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51388
		volcanoTemp     1145.5
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
		PeriodDays      41.0770615
		SemiMajorAxisKm 5419278.2
		Eccentricity    0.267436221
		Inclination     -37.1677313
		AscendingNode   -48.4461078
		ArgOfPericenter -120.133002
		MeanAnomaly     -32.6712817
	}
}

DwarfMoon	"4.D7"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.4495e-07
	Radius          34.974
	InertiaMoment   0.39991
	RotationPeriod  403.66
	Obliquity       201.9
	EqAscendNode    152.25

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.848 0.808 0.742)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.018055
		Randomize      (0.125, 0.979, -0.667)
		colorDistMagn   0.71978
		colorDistFreq   0.10014
		detailScale     128
		snowLevel       2
		tropicLatitude  0.37037
		icecapLatitude  2
		icecapHeight    0.51522
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31863
		heightTempGrad  0.625
		beachWidth      0.00169
		tropicWidth     0.07
		mainFreq        0.43362
		venusFreq       0.61127
		venusMagn       0.77504
		mareDensity     0
		terraceProb     0.18001
		erosion         0
		montesMagn      0.60427
		montesFreq      3.589
		montesSpiky     0.93073
		montesFraction  0.86845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2115
		hillsFraction   0.59408
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2401
		craterFreq      0.27812
		craterDensity   0.77666
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5871
		volcanoTemp     1193.3
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
		PeriodDays      42.0475499
		SemiMajorAxisKm 5504302.97
		Eccentricity    0.33294957
		Inclination     201.904391
		AscendingNode   152.24541
		ArgOfPericenter 9.46818257
		MeanAnomaly     135.585662
	}
}

DwarfMoon	"4.D8"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.9932e-07
	Radius          39.523
	InertiaMoment   0.39843
	RotationPeriod  339.15
	Obliquity       173.89
	EqAscendNode    -15.288

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.701 0.521 0.452)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.58712
		Randomize      (0.396, 0.810, -0.334)
		colorDistMagn   0.73332
		colorDistFreq   0.81065
		detailScale     128
		snowLevel       2
		tropicLatitude  0.11585
		icecapLatitude  2
		icecapHeight    0.41505
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21634
		heightTempGrad  0.625
		beachWidth      0.0008379
		tropicWidth     0.07
		mainFreq        0.68323
		venusFreq       0.62813
		venusMagn       0.76539
		mareDensity     0
		terraceProb     0.30281
		erosion         0
		montesMagn      0.44967
		montesFreq      2.869
		montesSpiky     0.88155
		montesFraction  0.30885
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7056
		hillsFraction   0.69728
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21136
		craterFreq      0.22581
		craterDensity   0.89651
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4751
		volcanoTemp     1241
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
		PeriodDays      42.3938388
		SemiMajorAxisKm 5534482.66
		Eccentricity    0.481713599
		Inclination     173.88623
		AscendingNode   -15.2875571
		ArgOfPericenter -72.9857928
		MeanAnomaly     164.072442
	}
}

DwarfMoon	"4.D9"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.7566e-07
	Radius          44.008
	InertiaMoment   0.39975
	RotationPeriod  417.22
	Obliquity       208.25
	EqAscendNode    -159.68

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.789 0.749 0.726)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15619
		Randomize      (0.666, 0.640, -0.001)
		colorDistMagn   0.74688
		colorDistFreq   1.6272
		detailScale     128
		snowLevel       2
		tropicLatitude  0.47039
		icecapLatitude  2
		icecapHeight    0.77618
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11405
		heightTempGrad  0.625
		beachWidth      0.0011858
		tropicWidth     0.07
		mainFreq        0.50431
		venusFreq       0.64913
		venusMagn       0.75663
		mareDensity     0
		terraceProb     0.4991
		erosion         0
		montesMagn      0.5641
		montesFreq      3.6787
		montesSpiky     0.99799
		montesFraction  0.418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1206
		hillsFraction   0.91987
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24764
		craterFreq      0.17733
		craterDensity   1.0096
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52051
		volcanoTemp     1088.7
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
		PeriodDays      43.4605866
		SemiMajorAxisKm 5626939.65
		Eccentricity    0.386380432
		Inclination     208.246915
		AscendingNode   -159.677754
		ArgOfPericenter -19.8566936
		MeanAnomaly     111.681528
	}
}

Moon	"4.5"
{
	ParentBody     "4"
	Class          "Aquaria"
	Mass            0.47195
	Radius          5663.7
	InertiaMoment   0.33135
	Obliquity       222.95
	EqAscendNode    170.41
	TidalLocked     true

	AlbedoBond      0.6405
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.629 0.525 0.449)

	Surface
	{
		Preset         "aquaria_arid_white.cfg"
		SurfStyle       0.72526
		Randomize      (0.936, 0.470, 0.332)
		colorDistMagn   0.05933
		colorDistFreq   753.79
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.19102
		snowLevel       0.85
		tropicLatitude  0.67865
		icecapLatitude  2
		icecapHeight    0.61814
		climatePole     0.4375
		climateTropic   0.38227
		climateEquator  0.65262
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41175
		heightTempGrad  0.55523
		beachWidth      0.0012336
		tropicWidth     0.10349
		mainFreq        1.6825
		venusFreq       0.68064
		venusMagn       0
		mareFreq        1.6654
		mareDensity     0.067603
		terraceProb     0.14472
		erosion         0
		montesMagn      0.22192
		montesFreq      304.49
		montesSpiky     0.9633
		montesFraction  0.1623
		dunesMagn       0.021397
		dunesFreq       65.369
		dunesFraction   0.03243
		hillsMagn       0.12903
		hillsFreq       646.44
		hillsFraction   0.62315
		hills2Fraction  0.20303
		riversMagn      0
		riversFreq      3.5536
		riversSin       5.7734
		riftsMagn       0
		riftsFreq       3.3557
		riftsSin        5.1597
		canyonsMagn     0.36479
		canyonsFreq     2.5238
		canyonsFraction 0
		cracksMagn      0.035579
		cracksFreq      2.4458
		cracksOctaves   5
		craterMagn      0.60438
		craterFreq      17.338
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.68172
		volcanoFreq     0.53545
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.39772
		volcanoRadius   0.51468
		volcanoTemp     336.26
		lavaCoverTidal  0.0080591
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.265
		stripeTwist     0.35108
		cycloneMagn     3.3674
		cycloneFreq     0.98729
		cycloneDensity  0.41762
		cycloneOctaves  3
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      2.2539
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.921
		Velocity        52.971
		BumpHeight      2.4606
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.71726
		mainOctaves     10
		Coverage        1
		stripeZones     1.265
		stripeTwist     0.35108
	}

	Clouds
	{
		Height          19.842
		Velocity        145.56
		BumpHeight      2.4606
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.71726
		mainOctaves     10
		Coverage        1
		stripeZones     1.265
		stripeTwist     0.35108
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          58.528
		Density         3.2832
		Pressure        1.3789
		Greenhouse      2.9235
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0.003659
		Saturation      0.9946

		Composition
		{
			CO2       	98.952
			C2H2      	0.37787
			CO        	0.21105
			CH4       	0.187
			N2        	0.099912
			C2H6      	0.056149
			C2H4      	0.037222
			C3H8      	0.035123
			H2S       	0.029238
			NH3       	0.0088543
			H2O       	0.0043422
			SO2       	0.0010239
		}
	}

	Aurora
	{
		Height         81.94
		NorthLat       58.372
		NorthLon       14.548
		NorthRadius    2065.5
		NorthWidth     611.48
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 82.309
		NorthMoveSpeed 0.96166
		NorthParticles 50000
		SouthLat       -73.999
		SouthLon       -161.13
		SouthRadius    1348.2
		SouthWidth     202.74
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 74.491
		SouthMoveSpeed 0.81234
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      43.8109415
		SemiMajorAxisKm 5657851.07
		Eccentricity    0.222556678
		Inclination     222.95131
		AscendingNode   170.412319
		ArgOfPericenter -9.31606846
		MeanAnomaly     129.965453
	}
}

DwarfMoon	"4.D10"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.393e-07
	Radius          54.102
	InertiaMoment   0.39958
	RotationPeriod  535.36
	Obliquity       161.58
	EqAscendNode    98.124

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.775 0.721 0.665)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.29433
		Randomize      (-0.793, 0.300, 0.665)
		colorDistMagn   0.77413
		colorDistFreq   2.293
		detailScale     256
		snowLevel       2
		tropicLatitude  0.32171
		icecapLatitude  2
		icecapHeight    0.6132
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30946
		heightTempGrad  0.625
		beachWidth      0.0012815
		tropicWidth     0.07
		mainFreq        0.57378
		venusFreq       0.53141
		venusMagn       0.74103
		mareDensity     0
		terraceProb     0.31279
		erosion         0
		montesMagn      0.53239
		montesFreq      3.7981
		montesSpiky     0.92928
		montesFraction  0.56804
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.7505
		hillsFraction   0.68036
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25653
		craterFreq      0.19584
		craterDensity   0.93609
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48195
		volcanoTemp     984.21
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
		PeriodDays      44.6129417
		SemiMajorAxisKm 5725970.53
		Eccentricity    0.191233848
		Inclination     161.580352
		AscendingNode   98.1239022
		ArgOfPericenter 117.01559
		MeanAnomaly     -66.7777342
	}
}

DwarfMoon	"4.D11"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.6529e-07
	Radius          61.408
	InertiaMoment   0.39794
	Obliquity       150.88
	EqAscendNode    -72.694
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.617 0.523 0.385)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.86339
		Randomize      (-0.523, 0.130, 0.998)
		colorDistMagn   0.78783
		colorDistFreq   1.7045
		detailScale     256
		snowLevel       2
		tropicLatitude  0.49131
		icecapLatitude  2
		icecapHeight    0.54922
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20717
		heightTempGrad  0.625
		beachWidth      0.0010293
		tropicWidth     0.07
		mainFreq        0.41147
		venusFreq       0.55951
		venusMagn       0.73393
		mareDensity     0
		terraceProb     0.5286
		erosion         0
		montesMagn      0.36144
		montesFreq      2.9509
		montesSpiky     0.87923
		montesFraction  0.64165
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.8368
		hillsFraction   0.83544
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23336
		craterFreq      0.25277
		craterDensity   0.72615
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52752
		volcanoTemp     1131.9
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
		PeriodDays      45.1919929
		SemiMajorAxisKm 5775410.58
		Eccentricity    0.0436601827
		Inclination     150.881101
		AscendingNode   -72.6942128
		ArgOfPericenter 81.3124958
		MeanAnomaly     150.49504
	}
}

DwarfMoon	"4.D12"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0993e-06
	Radius          69.784
	InertiaMoment   0.39942
	RotationPeriod  730.92
	Obliquity       207.44
	EqAscendNode    162.86

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.767 0.641 0.598)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43246
		Randomize      (-0.252, -0.040, -0.669)
		colorDistMagn   0.80159
		colorDistFreq   3.588
		detailScale     256
		snowLevel       2
		tropicLatitude  0.45792
		icecapLatitude  2
		icecapHeight    0.47145
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10488
		heightTempGrad  0.625
		beachWidth      0.0010772
		tropicWidth     0.07
		mainFreq        0.65455
		venusFreq       0.57842
		venusMagn       0.72718
		mareDensity     0
		terraceProb     0.19729
		erosion         0
		montesMagn      0.5037
		montesFreq      3.9967
		montesSpiky     0.99685
		montesFraction  0.731
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.483
		hillsFraction   0.55839
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27155
		craterFreq      0.20999
		craterDensity   0.87941
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42182
		volcanoTemp     979.69
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
		PeriodDays      45.6825464
		SemiMajorAxisKm 5817129.57
		Eccentricity    0.163341384
		Inclination     207.437882
		AscendingNode   162.863436
		ArgOfPericenter -48.9549613
		MeanAnomaly     -93.6395512
	}
}

DwarfMoon	"4.D13"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.6024e-06
	Radius          79.457
	InertiaMoment   0.39764
	RotationPeriod  448.88
	Obliquity       213.78
	EqAscendNode    -173.07

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.510 0.448 0.416)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0015279
		Randomize      (0.018, -0.210, -0.336)
		colorDistMagn   0.81543
		colorDistFreq   2.6271
		detailScale     256
		snowLevel       2
		tropicLatitude  0.55307
		icecapLatitude  2
		icecapHeight    0.89324
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40259
		heightTempGrad  0.625
		beachWidth      0.001125
		tropicWidth     0.07
		mainFreq        0.48467
		venusFreq       0.5946
		venusMagn       0.72073
		mareDensity     0
		terraceProb     0.32305
		erosion         0
		montesMagn      0.66129
		montesFreq      2.9912
		montesSpiky     0.9645
		montesFraction  0.89543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.331
		hillsFraction   0.66412
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24084
		craterFreq      0.27159
		craterDensity   0.98266
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48848
		volcanoTemp     1127.4
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
		PeriodDays      46.7582931
		SemiMajorAxisKm 5908097.23
		Eccentricity    0.384857754
		Inclination     213.777021
		AscendingNode   -173.071584
		ArgOfPericenter -5.88594289
		MeanAnomaly     -172.618597
	}
}

DwarfMoon	"4.D14"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.3772e-06
	Radius          88.432
	InertiaMoment   0.39924
	Obliquity       159.22
	EqAscendNode    -174.78
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.693 0.636 0.596)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5706
		Randomize      (0.288, -0.380, -0.003)
		colorDistMagn   0.82937
		colorDistFreq   5.4429
		detailScale     256
		snowLevel       2
		tropicLatitude  0.36028
		icecapLatitude  2
		icecapHeight    0.7192
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30029
		heightTempGrad  0.625
		beachWidth      0.0011729
		tropicWidth     0.07
		mainFreq        0.27385
		venusFreq       0.61021
		venusMagn       0.71452
		mareDensity     0
		terraceProb     0.56772
		erosion         0
		montesMagn      0.47532
		montesFreq      1.8177
		montesSpiky     0.92781
		montesFraction  0.32239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.799
		hillsFraction   0.79537
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2133
		craterFreq      0.27209
		craterDensity   0.81437
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53513
		volcanoTemp     1075.2
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
		PeriodDays      47.9031369
		SemiMajorAxisKm 6004144.98
		Eccentricity    0.354185241
		Inclination     159.217676
		AscendingNode   -174.776855
		ArgOfPericenter 96.9929301
		MeanAnomaly     -38.9012529
	}
}

DwarfMoon	"4.D15"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.6031e-06
	Radius          99.741
	InertiaMoment   0.39727
	Obliquity       215.78
	EqAscendNode    -72.004
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.498 0.424 0.353)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13966
		Randomize      (0.559, -0.550, 0.330)
		colorDistMagn   0.8434
		colorDistFreq   3.7534
		detailScale     256
		snowLevel       2
		tropicLatitude  0.58182
		icecapLatitude  2
		icecapHeight    0.64409
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.198
		heightTempGrad  0.625
		beachWidth      0.00092074
		tropicWidth     0.07
		mainFreq        0.5534
		venusFreq       0.62693
		venusMagn       0.70852
		mareDensity     0
		terraceProb     0.20591
		erosion         0
		montesMagn      0.59716
		montesFreq      3.0314
		montesSpiky     0.87684
		montesFraction  0.42635
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.392
		hillsFraction   0.53805
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24845
		craterFreq      0.26579
		craterDensity   0.91847
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43835
		volcanoTemp     1122.9
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
		PeriodDays      48.7781281
		SemiMajorAxisKm 6077038.03
		Eccentricity    0.360207888
		Inclination     215.78126
		AscendingNode   -72.0040495
		ArgOfPericenter 45.2524795
		MeanAnomaly     -175.562974
	}
}

DwarfMoon	"4.D16"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.6067e-06
	Radius          115.38
	InertiaMoment   0.39906
	Obliquity       194.47
	EqAscendNode    -20.099
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.687 0.618 0.526)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70873
		Randomize      (0.829, -0.720, 0.663)
		colorDistMagn   0.85755
		colorDistFreq   8.7709
		detailScale     512
		snowLevel       2
		tropicLatitude  0.24789
		icecapLatitude  2
		icecapHeight    0.58043
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49571
		heightTempGrad  0.625
		beachWidth      0.0012686
		tropicWidth     0.07
		mainFreq        0.38767
		venusFreq       0.64749
		venusMagn       0.70268
		mareDensity     0
		terraceProb     0.33364
		erosion         0
		montesMagn      0.44476
		montesFreq      2.1311
		montesSpiky     0.99571
		montesFraction  0.50391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       34.506
		hillsFraction   0.64826
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22573
		craterFreq      0.48932
		craterDensity   1.0651
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49482
		volcanoTemp     1070.6
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
		PeriodDays      49.3970742
		SemiMajorAxisKm 6128337.65
		Eccentricity    0.192109192
		Inclination     194.471958
		AscendingNode   -20.0985606
		ArgOfPericenter -104.156315
		MeanAnomaly     -31.6006964
	}
}

DwarfMoon	"4.D17"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.7602e-11
	Radius          1.7141
	InertiaMoment   0.39678
	Obliquity       202.24
	EqAscendNode    -156.8
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.839 0.803 0.737)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.2778
		Randomize      (-0.901, -0.890, 0.996)
		colorDistMagn   0.87182
		colorDistFreq   0.0009809
		detailScale     8
		snowLevel       2
		tropicLatitude  0.37579
		icecapLatitude  2
		icecapHeight    0.51219
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39342
		heightTempGrad  0.625
		beachWidth      0.0013164
		tropicWidth     0.07
		mainFreq        0.62913
		venusFreq       0.68366
		venusMagn       0.69699
		mareDensity     0
		terraceProb     0.62996
		erosion         0
		montesMagn      0.55893
		montesFreq      3.0719
		montesSpiky     0.96329
		montesFraction  0.5749
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0068859
		hillsFraction   0.76655
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2576
		craterFreq      0.19178
		craterDensity   0.86167
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54365
		volcanoTemp     1018.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.5427
		BumpOffset      0.77134
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
		PeriodDays      50.0491657
		SemiMajorAxisKm 6182153.2
		Eccentricity    0.202329868
		Inclination     202.240839
		AscendingNode   -156.798816
		ArgOfPericenter 120.513209
		MeanAnomaly     -144.073946
	}
}

DwarfMoon	"4.D18"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.4113e-11
	Radius          2.0769
	InertiaMoment   0.39888
	Obliquity       194.95
	EqAscendNode    -131.34
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.687 0.524 0.451)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84687
		Randomize      (-0.630, 0.940, -0.671)
		colorDistMagn   0.88624
		colorDistFreq   0.0026917
		detailScale     8
		snowLevel       2
		tropicLatitude  0.25582
		icecapLatitude  2
		icecapHeight    0.40888
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29113
		heightTempGrad  0.625
		beachWidth      0.0007643
		tropicWidth     0.07
		mainFreq        0.46468
		venusFreq       0.52866
		venusMagn       0.69142
		mareDensity     0
		terraceProb     0.21455
		erosion         0
		montesMagn      0.40774
		montesFreq      2.2739
		montesSpiky     0.92633
		montesFraction  0.64928
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0090378
		hillsFraction   0.51473
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23414
		craterFreq      0.24892
		craterDensity   0.96071
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44999
		volcanoTemp     966.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.8692
		BumpOffset      0.93459
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
		PeriodDays      50.8254558
		SemiMajorAxisKm 6245914.8
		Eccentricity    0.379779518
		Inclination     194.946064
		AscendingNode   -131.340283
		ArgOfPericenter -150.273258
		MeanAnomaly     -100.206891
	}
}

DwarfMoon	"4.D19"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.1045e-11
	Radius          2.6631
	InertiaMoment   0.39594
	RotationPeriod  493.43
	Obliquity       196.62
	EqAscendNode    178.51

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.752 0.750 0.749)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.41593
		Randomize      (-0.360, 0.770, -0.338)
		colorDistMagn   0.90081
		colorDistFreq   0.0020056
		detailScale     8
		snowLevel       2
		tropicLatitude  0.28376
		icecapLatitude  2
		icecapHeight    0.77079
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18883
		heightTempGrad  0.625
		beachWidth      0.00021216
		tropicWidth     0.07
		mainFreq        0.73693
		venusFreq       0.55806
		venusMagn       0.68594
		mareDensity     0
		terraceProb     0.34463
		erosion         0
		montesMagn      0.52791
		montesFreq      3.1128
		montesSpiky     0.87437
		montesFraction  0.74151
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012288
		hillsFraction   0.63253
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27445
		craterFreq      0.20663
		craterDensity   0.78654
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50107
		volcanoTemp     1013.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3968
		BumpOffset      1.1984
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
		PeriodDays      51.3991657
		SemiMajorAxisKm 6292828.77
		Eccentricity    0.362989709
		Inclination     196.621679
		AscendingNode   178.510838
		ArgOfPericenter -83.5248506
		MeanAnomaly     117.423668
	}
}

DwarfMoon	"4.D20"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0311e-10
	Radius          3.1627
	InertiaMoment   0.39868
	Obliquity       130.37
	EqAscendNode    15.869
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.535 0.531 0.528)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.985
		Randomize      (-0.089, 0.600, -0.005)
		colorDistMagn   0.91555
		colorDistFreq   0.005908
		detailScale     8
		snowLevel       2
		tropicLatitude  0.76503
		icecapLatitude  2
		icecapHeight    0.67731
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48654
		heightTempGrad  0.625
		beachWidth      0.00086001
		tropicWidth     0.07
		mainFreq        0.53354
		venusFreq       0.57728
		venusMagn       0.68053
		mareDensity     0
		terraceProb     0.10082
		erosion         0
		montesMagn      0.34927
		montesFreq      2.3741
		montesSpiky     0.99458
		montesFraction  0.93073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.029234
		hillsFraction   0.74304
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24159
		craterFreq      0.26605
		craterDensity   0.90141
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55368
		volcanoTemp     961.59
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.8464
		BumpOffset      1.4232
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
		PeriodDays      51.8762559
		SemiMajorAxisKm 6331709.06
		Eccentricity    0.447895951
		Inclination     130.367513
		AscendingNode   15.8692387
		ArgOfPericenter -150.661562
		MeanAnomaly     -170.510624
	}
}

DwarfMoon	"4.D21"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.6674e-10
	Radius          3.5968
	InertiaMoment   0.39994
	RotationPeriod  629.56
	Obliquity       181.17
	EqAscendNode    -55.038

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.715 0.713 0.710)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.55407
		Randomize      (0.181, 0.430, 0.328)
		colorDistMagn   0.93049
		colorDistFreq   0.0028112
		detailScale     16
		snowLevel       2
		tropicLatitude  0.037582
		icecapLatitude  2
		icecapHeight    0.61069
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38425
		heightTempGrad  0.625
		beachWidth      0.00090787
		tropicWidth     0.07
		mainFreq        0.36143
		venusFreq       0.59356
		venusMagn       0.67519
		mareDensity     0
		terraceProb     0.22321
		erosion         0
		montesMagn      0.49942
		montesFreq      3.1545
		montesSpiky     0.96207
		montesFraction  0.33496
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.033322
		hillsFraction   0.48627
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21501
		craterFreq      0.21953
		craterDensity   1.019
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45941
		volcanoTemp     1209.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.2371
		BumpOffset      1.6186
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
		PeriodDays      52.46358
		SemiMajorAxisKm 6379409.53
		Eccentricity    0.269936091
		Inclination     181.172659
		AscendingNode   -55.0375668
		ArgOfPericenter 14.1825354
		MeanAnomaly     39.175458
	}
}

DwarfMoon	"4.D22"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.6059e-10
	Radius          4.1785
	InertiaMoment   0.39847
	RotationPeriod  429.49
	Obliquity       185.99
	EqAscendNode    56.558

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.499 0.495 0.489)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12314
		Randomize      (0.451, 0.261, 0.660)
		colorDistMagn   0.94563
		colorDistFreq   0.0097431
		detailScale     16
		snowLevel       2
		tropicLatitude  0.1055
		icecapLatitude  2
		icecapHeight    0.54654
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28196
		heightTempGrad  0.625
		beachWidth      0.00095572
		tropicWidth     0.07
		mainFreq        0.60588
		venusFreq       0.60916
		venusMagn       0.66989
		mareDensity     0
		terraceProb     0.35607
		erosion         0
		montesMagn      0.64724
		montesFreq      2.454
		montesSpiky     0.92483
		montesFraction  0.4345
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.04067
		hillsFraction   0.61668
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24927
		craterFreq      0.16314
		craterDensity   0.84264
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50735
		volcanoTemp     957.07
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.7606
		BumpOffset      1.8803
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
		PeriodDays      53.6858642
		SemiMajorAxisKm 6478112.71
		Eccentricity    0.465152605
		Inclination     185.985059
		AscendingNode   56.5580054
		ArgOfPericenter 33.8638767
		MeanAnomaly     138.984917
	}
}

DwarfMoon	"4.D23"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.9636e-10
	Radius          4.9689
	InertiaMoment   0.39978
	Obliquity       45.474
	EqAscendNode    22.961
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.679 0.673 0.671)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.6922
		Randomize      (0.722, 0.091, 0.993)
		colorDistMagn   0.961
		colorDistFreq   0.0028376
		detailScale     16
		snowLevel       2
		tropicLatitude  0.71027
		icecapLatitude  2
		icecapHeight    0.46758
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17967
		heightTempGrad  0.625
		beachWidth      0.00070358
		tropicWidth     0.07
		mainFreq        0.44409
		venusFreq       0.62574
		venusMagn       0.66462
		mareDensity     0
		terraceProb     0.11046
		erosion         0
		montesMagn      0.47089
		montesFreq      3.1974
		montesSpiky     0.87183
		montesFraction  0.51088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.051325
		hillsFraction   0.72258
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22668
		craterFreq      0.23202
		craterDensity   0.94137
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56653
		volcanoTemp     1104.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.4721
		BumpOffset      2.236
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
		PeriodDays      54.5102584
		SemiMajorAxisKm 6544262.26
		Eccentricity    0.239986299
		Inclination     45.4736445
		AscendingNode   22.9611673
		ArgOfPericenter -174.683191
		MeanAnomaly     121.956799
	}
}

DwarfMoon	"4.D24"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.8972e-10
	Radius          5.5352
	InertiaMoment   0.39824
	RotationPeriod  532.16
	Obliquity       -50.756
	EqAscendNode    96.958

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.463 0.455 0.450)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.26127
		Randomize      (0.992, -0.079, -0.674)
		colorDistMagn   0.97663
		colorDistFreq   0.016104
		detailScale     16
		snowLevel       2
		tropicLatitude  0.7775
		icecapLatitude  2
		icecapHeight    0.87382
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47737
		heightTempGrad  0.625
		beachWidth      0.00045143
		tropicWidth     0.07
		mainFreq        0.69911
		venusFreq       0.64589
		venusMagn       0.65936
		mareDensity     0
		terraceProb     0.23192
		erosion         0
		montesMagn      0.59052
		montesFreq      2.522
		montesSpiky     0.99344
		montesFraction  0.58178
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.052011
		hillsFraction   0.44706
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25873
		craterFreq      0.18739
		craterDensity   0.74503
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46757
		volcanoTemp     1052.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.9817
		BumpOffset      2.4908
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
		PeriodDays      55.4336087
		SemiMajorAxisKm 6617957.43
		Eccentricity    0.404448917
		Inclination     -50.7564609
		AscendingNode   96.9576301
		ArgOfPericenter -36.6011934
		MeanAnomaly     124.173514
	}
}

DwarfMoon	"4.D25"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            8.6164e-10
	Radius          6.3104
	InertiaMoment   0.39961
	Obliquity       133.93
	EqAscendNode    79.077
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.640 0.637 0.635)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83034
		Randomize      (-0.737, -0.249, -0.341)
		colorDistMagn   0.99252
		colorDistFreq   0.034
		detailScale     16
		snowLevel       2
		tropicLatitude  0.72358
		icecapLatitude  2
		icecapHeight    0.71564
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37508
		heightTempGrad  0.625
		beachWidth      0.0010993
		tropicWidth     0.07
		mainFreq        0.51395
		venusFreq       0.67974
		venusMagn       0.6541
		mareDensity     0
		terraceProb     0.36805
		erosion         0
		montesMagn      0.4397
		montesFreq      3.2417
		montesSpiky     0.96085
		montesFraction  0.65707
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11521
		hillsFraction   0.60047
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23491
		craterFreq      0.24527
		craterDensity   0.88439
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51374
		volcanoTemp     1000.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.6794
		BumpOffset      2.8397
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
		PeriodDays      56.6087434
		SemiMajorAxisKm 6711159.25
		Eccentricity    0.0483621557
		Inclination     133.929718
		AscendingNode   79.0767879
		ArgOfPericenter -29.1315045
		MeanAnomaly     15.4322259
	}
}

DwarfMoon	"4.D26"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.2402e-09
	Radius          7.3885
	InertiaMoment   0.39799
	RotationPeriod  915.66
	Obliquity       147.89
	EqAscendNode    -152.45

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.422 0.419 0.416)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39941
		Randomize      (-0.467, -0.419, -0.008)
		colorDistMagn   0.018812
		colorDistFreq   0.026904
		detailScale     32
		snowLevel       2
		tropicLatitude  0.53593
		icecapLatitude  2
		icecapHeight    0.64146
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27279
		heightTempGrad  0.625
		beachWidth      0.00084714
		tropicWidth     0.07
		mainFreq        0.33149
		venusFreq       0.52568
		venusMagn       0.64882
		mareDensity     0
		terraceProb     0.1199
		erosion         0
		montesMagn      0.55391
		montesFreq      2.5821
		montesSpiky     0.92331
		montesFraction  0.75258
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13974
		hillsFraction   0.70404
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27833
		craterFreq      0.20315
		craterDensity   0.98977
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58649
		volcanoTemp     1048
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.6496
		BumpOffset      3.3248
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
		PeriodDays      57.2289571
		SemiMajorAxisKm 6760089.14
		Eccentricity    0.165350583
		Inclination     147.894048
		AscendingNode   -152.449786
		ArgOfPericenter 63.8714964
		MeanAnomaly     44.9552989
	}
}

DwarfMoon	"4.D27"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.7627e-09
	Radius          7.9569
	InertiaMoment   0.39945
	Obliquity       199.02
	EqAscendNode    95.34
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.604 0.601 0.596)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.96847
		Randomize      (-0.197, -0.589, 0.325)
		colorDistMagn   0.051534
		colorDistFreq   0.050269
		detailScale     32
		snowLevel       2
		tropicLatitude  0.32347
		icecapLatitude  2
		icecapHeight    0.5779
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1705
		heightTempGrad  0.625
		beachWidth      0.00089499
		tropicWidth     0.07
		mainFreq        0.58411
		venusFreq       0.55657
		venusMagn       0.64351
		mareDensity     0
		terraceProb     0.24069
		erosion         0
		montesMagn      0.40097
		montesFreq      3.288
		montesSpiky     0.86921
		montesFraction  0.11095
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14658
		hillsFraction   0.36819
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24233
		craterFreq      0.26115
		craterDensity   0.82124
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47494
		volcanoTemp     995.76
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.1612
		BumpOffset      3.5806
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
		PeriodDays      58.1411271
		SemiMajorAxisKm 6831732.17
		Eccentricity    0.154275965
		Inclination     199.024913
		AscendingNode   95.3404689
		ArgOfPericenter 92.3090754
		MeanAnomaly     39.0148104
	}
}

DwarfMoon	"4.D28"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.4795e-09
	Radius          9.1588
	InertiaMoment   0.3977
	Obliquity       162.64
	EqAscendNode    -151.38
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.783 0.780 0.779)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53754
		Randomize      (0.074, -0.759, 0.658)
		colorDistMagn   0.081692
		colorDistFreq   0.03851
		detailScale     32
		snowLevel       2
		tropicLatitude  0.30424
		icecapLatitude  2
		icecapHeight    0.50912
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46821
		heightTempGrad  0.625
		beachWidth      0.00094285
		tropicWidth     0.07
		mainFreq        0.42256
		venusFreq       0.57613
		venusMagn       0.63816
		mareDensity     0
		terraceProb     0.38066
		erosion         0
		montesMagn      0.52349
		montesFreq      2.6367
		montesSpiky     0.9923
		montesFraction  0.34673
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17295
		hillsFraction   0.58359
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21656
		craterFreq      0.21636
		craterDensity   0.92348
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52036
		volcanoTemp     1043.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.2429
		BumpOffset      4.1215
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
		PeriodDays      59.0967624
		SemiMajorAxisKm 6906388.33
		Eccentricity    0.252800498
		Inclination     162.640767
		AscendingNode   -151.384778
		ArgOfPericenter -55.535391
		MeanAnomaly     137.346125
	}
}

DwarfMoon	"4.D29"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.4573e-09
	Radius          10.227
	InertiaMoment   0.39927
	Obliquity       215.65
	EqAscendNode    31.042
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.568 0.560 0.557)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.10661
		Randomize      (0.344, -0.929, 0.991)
		colorDistMagn   0.10975
		colorDistFreq   0.078005
		detailScale     32
		snowLevel       2
		tropicLatitude  0.57991
		icecapLatitude  2
		icecapHeight    0.40232
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36591
		heightTempGrad  0.625
		beachWidth      0.0003907
		tropicWidth     0.07
		mainFreq        0.66819
		venusFreq       0.59251
		venusMagn       0.63274
		mareDensity     0
		terraceProb     0.12916
		erosion         0
		montesMagn      0.33434
		montesFreq      3.3369
		montesSpiky     0.95962
		montesFraction  0.44246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17347
		hillsFraction   0.68676
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25011
		craterFreq      0.15228
		craterDensity   1.0883
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.37963
		volcanoTemp     1091.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.2046
		BumpOffset      4.6023
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
		PeriodDays      60.1440804
		SemiMajorAxisKm 6987746.27
		Eccentricity    0.0827664465
		Inclination     215.6466
		AscendingNode   31.0416847
		ArgOfPericenter 15.2628621
		MeanAnomaly     25.225533
	}
}

DwarfMoon	"4.D30"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.7861e-09
	Radius          11.347
	InertiaMoment   0.39734
	Obliquity       175.82
	EqAscendNode    108.28
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.747 0.743 0.740)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67568
		Randomize      (0.614, 0.901, -0.676)
		colorDistMagn   0.13607
		colorDistFreq   0.054545
		detailScale     32
		snowLevel       2
		tropicLatitude  0.084285
		icecapLatitude  2
		icecapHeight    0.76563
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26362
		heightTempGrad  0.625
		beachWidth      0.0010386
		tropicWidth     0.07
		mainFreq        0.49438
		venusFreq       0.60811
		venusMagn       0.62724
		mareDensity     0
		terraceProb     0.24954
		erosion         0
		montesMagn      0.49514
		montesFreq      2.6873
		montesSpiky     0.92178
		montesFraction  0.51781
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.36897
		hillsFraction   0.8576
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22759
		craterFreq      0.22884
		craterDensity   0.8669
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48181
		volcanoTemp     1039
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.212
		BumpOffset      5.106
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
		PeriodDays      61.3258737
		SemiMajorAxisKm 7078985.63
		Eccentricity    0.11207969
		Inclination     175.822262
		AscendingNode   108.276357
		ArgOfPericenter 67.537077
		MeanAnomaly     -171.913055
	}
}

Moon	"4.6"
{
	ParentBody     "4"
	Class          "Terra"
	Mass            0.15249
	Radius          3375.7
	InertiaMoment   0.33063
	RotationPeriod  494.63
	Obliquity       201.17
	EqAscendNode    137.03

	AlbedoBond      0.59499
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.527 0.525 0.522)

	Surface
	{
		Preset         "terra_arid_mars2_green.cfg"
		SurfStyle       0.24474
		Randomize      (0.885, 0.731, -0.343)
		colorDistMagn   0.067148
		colorDistFreq   363.93
		detailScale     16384
		seaLevel        0.063214
		snowLevel       0.85
		tropicLatitude  0.35847
		icecapLatitude  2
		icecapHeight    0.63688
		climatePole     0.84807
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16133
		heightTempGrad  0.375
		beachWidth      0.0010864
		tropicWidth     0.5
		mainFreq        1.0977
		venusFreq       1.546
		venusMagn       0
		mareFreq        1.3469
		mareDensity     0.18214
		terraceProb     0.34706
		erosion         0
		montesMagn      0.16699
		montesFreq      134.83
		montesSpiky     0.96135
		montesFraction  0.2536
		dunesMagn       0.065472
		dunesFreq       30.755
		dunesFraction   0.80644
		hillsMagn       0.14205
		hillsFreq       448.75
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.7897
		riversSin       5.0548
		riftsMagn       58.314
		riftsFreq       2.1507
		riftsSin        8.9675
		canyonsMagn     0.066731
		canyonsFreq     72.001
		canyonsFraction 0
		cracksMagn      0.068337
		cracksFreq      0.39552
		cracksOctaves   0
		craterMagn      0.55672
		craterFreq      10.423
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.68283
		volcanoFreq     0.62987
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.84771
		volcanoRadius   0.4246
		volcanoTemp     1015.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.1511
		stripeTwist     0.34711
		cycloneMagn     2.757
		cycloneFreq     0.71699
		cycloneDensity  0.23913
		cycloneOctaves  2
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      2.0648
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.04
		Velocity        108.18
		BumpHeight      2.0199
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.71362
		mainOctaves     10
		Coverage        0.30638
		stripeZones     1.1511
		stripeTwist     0.34711
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          115.52
		Density         9.2468
		Pressure        4.1614
		Greenhouse      4.8587
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0.016554
		Saturation      0.89102

		Composition
		{
			CO2       	99.286
			N2        	0.39172
			SO2       	0.29871
			CO        	0.015497
			C2H4      	0.0059856
			H2S       	0.0007864
			C2H6      	0.00068753
			C3H8      	0.00017071
			Ar        	2.0295e-05
		}
	}

	Aurora
	{
		Height         30.793
		NorthLat       49.946
		NorthLon       -102.34
		NorthRadius    728.44
		NorthWidth     170.29
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 73.528
		NorthMoveSpeed 1.0627
		NorthParticles 50000
		SouthLat       -67.819
		SouthLon       79.569
		SouthRadius    688.16
		SouthWidth     253.86
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 75.355
		SouthMoveSpeed 0.91821
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      61.8290629
		SemiMajorAxisKm 7117944.81
		Eccentricity    0.462784672
		Inclination     201.169391
		AscendingNode   137.025086
		ArgOfPericenter -54.3211238
		MeanAnomaly     165.55266
	}
}

DwarfMoon	"4.D31"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.0209e-09
	Radius          13.842
	InertiaMoment   0.39688
	Obliquity       194.63
	EqAscendNode    113.05
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.708 0.706 0.703)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.81381
		Randomize      (-0.845, 0.561, -0.010)
		colorDistMagn   0.18449
		colorDistFreq   0.073866
		detailScale     64
		snowLevel       2
		tropicLatitude  0.25052
		icecapLatitude  2
		icecapHeight    0.60818
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45904
		heightTempGrad  0.625
		beachWidth      0.0011343
		tropicWidth     0.07
		mainFreq        0.56336
		venusFreq       0.64434
		venusMagn       0.61591
		mareDensity     0
		terraceProb     0.13827
		erosion         0
		montesMagn      0.46639
		montesFreq      2.7348
		montesSpiky     0.99116
		montesFraction  0.66502
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.44082
		hillsFraction   0.6703
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23568
		craterFreq      0.24178
		craterDensity   0.79541
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42135
		volcanoTemp     1134.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.458
		BumpOffset      6.2288
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
		PeriodDays      62.7272624
		SemiMajorAxisKm 7186422.68
		Eccentricity    0.12001826
		Inclination     194.629429
		AscendingNode   113.048435
		ArgOfPericenter -68.9540227
		MeanAnomaly     31.7531825
	}
}

DwarfMoon	"4.D32"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.231e-08
	Radius          15.687
	InertiaMoment   0.39891
	Obliquity       -50.066
	EqAscendNode    122.49
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.492 0.488 0.482)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.38288
		Randomize      (-0.574, 0.391, 0.323)
		colorDistMagn   0.20697
		colorDistFreq   0.16395
		detailScale     64
		snowLevel       2
		tropicLatitude  0.76988
		icecapLatitude  2
		icecapHeight    0.54383
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35675
		heightTempGrad  0.625
		beachWidth      0.00058212
		tropicWidth     0.07
		mainFreq        0.39965
		venusFreq       0.67625
		venusMagn       0.61004
		mareDensity     0
		terraceProb     0.25848
		erosion         0
		montesMagn      0.58425
		montesFreq      3.4463
		montesSpiky     0.95838
		montesFraction  0.76431
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.50312
		hillsFraction   0.80884
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28464
		craterFreq      0.19952
		craterDensity   0.90631
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48834
		volcanoTemp     1082.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.118
		BumpOffset      7.0591
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
		PeriodDays      63.1439603
		SemiMajorAxisKm 7218213.87
		Eccentricity    0.221530006
		Inclination     -50.0662458
		AscendingNode   122.487373
		ArgOfPericenter 58.5027201
		MeanAnomaly     -101.188884
	}
}

DwarfMoon	"4.D33"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.6752e-08
	Radius          17.307
	InertiaMoment   0.39615
	Obliquity       225.76
	EqAscendNode    -149.12
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.672 0.667 0.664)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.95195
		Randomize      (-0.304, 0.221, 0.656)
		colorDistMagn   0.2285
		colorDistFreq   0.10281
		detailScale     64
		snowLevel       2
		tropicLatitude  0.71376
		icecapLatitude  2
		icecapHeight    0.46361
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25445
		heightTempGrad  0.625
		beachWidth      0.00062998
		tropicWidth     0.07
		mainFreq        0.64134
		venusFreq       0.52241
		venusMagn       0.60399
		mareDensity     0
		terraceProb     0.40834
		erosion         0
		montesMagn      0.43448
		montesFreq      2.7801
		montesSpiky     0.92023
		montesFraction  0.16675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.48341
		hillsFraction   0.54614
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24309
		craterFreq      0.25672
		craterDensity   1.0296
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53495
		volcanoTemp     1229.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.576
		BumpOffset      7.7881
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
		PeriodDays      64.1872985
		SemiMajorAxisKm 7297508.34
		Eccentricity    0.23245632
		Inclination     225.758776
		AscendingNode   -149.115738
		ArgOfPericenter -36.5315934
		MeanAnomaly     -109.635891
	}
}

DwarfMoon	"4.D34"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.2755e-08
	Radius          18.999
	InertiaMoment   0.39872
	RotationPeriod  628.44
	Obliquity       142.92
	EqAscendNode    54.274

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.455 0.448 0.443)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.52101
		Randomize      (-0.034, 0.051, 0.989)
		colorDistMagn   0.24919
		colorDistFreq   0.22777
		detailScale     64
		snowLevel       2
		tropicLatitude  0.60703
		icecapLatitude  2
		icecapHeight    0.85858
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15216
		heightTempGrad  0.625
		beachWidth      0.00097783
		tropicWidth     0.07
		mainFreq        0.47459
		venusFreq       0.55505
		venusMagn       0.59772
		mareDensity     0
		terraceProb     0.14726
		erosion         0
		montesMagn      0.54902
		montesFreq      3.5099
		montesSpiky     0.86366
		montesFraction  0.35784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0252
		hillsFraction   0.65433
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21798
		craterFreq      0.21315
		craterDensity   0.84832
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43806
		volcanoTemp     1177.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.099
		BumpOffset      8.5496
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
		PeriodDays      65.4621535
		SemiMajorAxisKm 7393817.5
		Eccentricity    0.435036041
		Inclination     142.917461
		AscendingNode   54.2741725
		ArgOfPericenter -161.151547
		MeanAnomaly     -117.998135
	}
}

DwarfMoon	"4.D35"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.0881e-08
	Radius          20.924
	InertiaMoment   0.39997
	RotationPeriod  801.18
	Obliquity       32.122
	EqAscendNode    46.722

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.636 0.630 0.625)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.090081
		Randomize      (0.237, -0.118, -0.678)
		colorDistMagn   0.26913
		colorDistFreq   0.12876
		detailScale     64
		snowLevel       2
		tropicLatitude  0.52882
		icecapLatitude  2
		icecapHeight    0.71216
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44987
		heightTempGrad  0.625
		beachWidth      0.0013257
		tropicWidth     0.07
		mainFreq        0.75992
		venusFreq       0.57496
		venusMagn       0.5912
		mareDensity     0
		terraceProb     0.26755
		erosion         0
		montesMagn      0.39373
		montesFreq      2.8236
		montesSpiky     0.99002
		montesFraction  0.45026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.107
		hillsFraction   0.77681
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25096
		craterFreq      0.27785
		craterDensity   0.94677
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49468
		volcanoTemp     1125.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.832
		BumpOffset      9.416
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
		PeriodDays      66.7653032
		SemiMajorAxisKm 7491620.19
		Eccentricity    0.287954926
		Inclination     32.1216429
		AscendingNode   46.7215034
		ArgOfPericenter -68.7766442
		MeanAnomaly     -164.507781
	}
}

DwarfMoon	"4.D36"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.1907e-08
	Radius          23.249
	InertiaMoment   0.39851
	Obliquity       132.88
	EqAscendNode    108.68
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.414 0.412 0.409)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.65915
		Randomize      (0.507, -0.288, -0.345)
		colorDistMagn   0.28841
		colorDistFreq   0.3229
		detailScale     64
		snowLevel       2
		tropicLatitude  0.73603
		icecapLatitude  2
		icecapHeight    0.63885
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34758
		heightTempGrad  0.625
		beachWidth      0.0013735
		tropicWidth     0.07
		mainFreq        0.54328
		venusFreq       0.59147
		venusMagn       0.58438
		mareDensity     0
		terraceProb     0.4238
		erosion         0
		montesMagn      0.51911
		montesFreq      3.583
		montesSpiky     0.95714
		montesFraction  0.52469
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2359
		hillsFraction   0.52414
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22848
		craterFreq      0.2257
		craterDensity   0.7596
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54345
		volcanoTemp     1173.1
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
		PeriodDays      67.7144318
		SemiMajorAxisKm 7562453.09
		Eccentricity    0.335006534
		Inclination     132.884881
		AscendingNode   108.676913
		ArgOfPericenter 55.670467
		MeanAnomaly     -156.328724
	}
}

DwarfMoon	"4.D37"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.6914e-08
	Radius          24.866
	InertiaMoment   0.39981
	RotationPeriod  550.52
	Obliquity       17.361
	EqAscendNode    170.53

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.596 0.594 0.589)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22822
		Randomize      (0.778, -0.458, -0.012)
		colorDistMagn   0.3071
		colorDistFreq   0.14375
		detailScale     64
		snowLevel       2
		tropicLatitude  0.29602
		icecapLatitude  2
		icecapHeight    0.57536
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24529
		heightTempGrad  0.625
		beachWidth      0.0014214
		tropicWidth     0.07
		mainFreq        0.37474
		venusFreq       0.60707
		venusMagn       0.57718
		mareDensity     0
		terraceProb     0.15614
		erosion         0
		montesMagn      0.3144
		montesFreq      2.8659
		montesSpiky     0.91866
		montesFraction  0.59567
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2532
		hillsFraction   0.63857
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26117
		craterFreq      0.17711
		craterDensity   0.88933
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44977
		volcanoTemp     1220.9
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
		PeriodDays      68.815359
		SemiMajorAxisKm 7644201.4
		Eccentricity    0.467757023
		Inclination     17.3607594
		AscendingNode   170.529567
		ArgOfPericenter -21.4064143
		MeanAnomaly     172.872605
	}
}

DwarfMoon	"4.D38"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.7425e-08
	Radius          28.825
	InertiaMoment   0.39829
	Obliquity       133.35
	EqAscendNode    -113.64
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.776 0.773 0.772)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.79728
		Randomize      (-0.952, -0.628, 0.321)
		colorDistMagn   0.32525
		colorDistFreq   0.46919
		detailScale     128
		snowLevel       2
		tropicLatitude  0.73051
		icecapLatitude  2
		icecapHeight    0.50601
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14299
		heightTempGrad  0.625
		beachWidth      0.0014693
		tropicWidth     0.07
		mainFreq        0.61712
		venusFreq       0.62341
		venusMagn       0.56953
		mareDensity     0
		terraceProb     0.27675
		erosion         0
		montesMagn      0.49085
		montesFreq      3.6713
		montesSpiky     0.86073
		montesFraction  0.67315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2975
		hillsFraction   0.75163
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23643
		craterFreq      0.2384
		craterDensity   0.99736
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50094
		volcanoTemp     1068.6
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
		PeriodDays      70.7417446
		SemiMajorAxisKm 7786202.82
		Eccentricity    0.0973009669
		Inclination     133.351289
		AscendingNode   -113.640402
		ArgOfPericenter -86.8572623
		MeanAnomaly     114.401399
	}
}

DwarfMoon	"4.D39"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.056e-07
	Radius          31.963
	InertiaMoment   0.39964
	Obliquity       185.51
	EqAscendNode    -147.63
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.560 0.554 0.550)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36635
		Randomize      (-0.682, -0.798, 0.654)
		colorDistMagn   0.34292
		colorDistFreq   0.14487
		detailScale     128
		snowLevel       2
		tropicLatitude  0.0978
		icecapLatitude  2
		icecapHeight    0.39528
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4407
		heightTempGrad  0.625
		beachWidth      0.0009171
		tropicWidth     0.07
		mainFreq        0.45434
		venusFreq       0.64283
		venusMagn       0.56131
		mareDensity     0
		terraceProb     0.44072
		erosion         0
		montesMagn      0.62558
		montesFreq      2.9072
		montesSpiky     0.98888
		montesFraction  0.77683
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8766
		hillsFraction   0.49803
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.18583
		craterFreq      0.1957
		craterDensity   0.82776
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55344
		volcanoTemp     1016.4
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
		PeriodDays      71.169882
		SemiMajorAxisKm 7817586.56
		Eccentricity    0.0621510736
		Inclination     185.514583
		AscendingNode   -147.631433
		ArgOfPericenter -70.1778695
		MeanAnomaly     -125.380078
	}
}

DwarfMoon	"4.D40"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.4454e-07
	Radius          34.359
	InertiaMoment   0.39804
	Obliquity       -49.895
	EqAscendNode    137.36
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.740 0.736 0.733)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.93542
		Randomize      (-0.411, -0.968, 0.987)
		colorDistMagn   0.36016
		colorDistFreq   0.62834
		detailScale     128
		snowLevel       2
		tropicLatitude  0.76797
		icecapLatitude  2
		icecapHeight    0.76069
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33841
		heightTempGrad  0.625
		beachWidth      0.001265
		tropicWidth     0.07
		mainFreq        0.71661
		venusFreq       0.6731
		venusMagn       0.55235
		mareDensity     0
		terraceProb     0.16493
		erosion         0
		montesMagn      0.46183
		montesFreq      3.7876
		montesSpiky     0.95589
		montesFraction  0.20274
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9668
		hillsFraction   0.6228
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24384
		craterFreq      0.25262
		craterDensity   0.92855
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45922
		volcanoTemp     1164.1
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
		PeriodDays      71.8364062
		SemiMajorAxisKm 7866319.82
		Eccentricity    0.0813534713
		Inclination     -49.8953317
		AscendingNode   137.364077
		ArgOfPericenter -36.5852766
		MeanAnomaly     -53.9410832
	}
}

DwarfMoon	"4.D41"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.9875e-07
	Radius          39.448
	InertiaMoment   0.39948
	Obliquity       147.39
	EqAscendNode    53.532
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.520 0.518 0.515)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.50449
		Randomize      (-0.141, 0.862, -0.680)
		colorDistMagn   0.377
		colorDistFreq   1.3514
		detailScale     128
		snowLevel       2
		tropicLatitude  0.54326
		icecapLatitude  2
		icecapHeight    0.67154
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23612
		heightTempGrad  0.625
		beachWidth      0.0013128
		tropicWidth     0.07
		mainFreq        0.52359
		venusFreq       0.51876
		venusMagn       0.54244
		mareDensity     0
		terraceProb     0.28612
		erosion         0
		montesMagn      0.57829
		montesFreq      2.9478
		montesSpiky     0.91706
		montesFraction  0.36838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.5356
		hillsFraction   0.73016
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2193
		craterFreq      0.20987
		craterDensity   0.67587
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50721
		volcanoTemp     1111.8
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
		PeriodDays      73.3735572
		SemiMajorAxisKm 7978138.74
		Eccentricity    0.0150340032
		Inclination     147.394524
		AscendingNode   53.5316591
		ArgOfPericenter -170.083559
		MeanAnomaly     -170.126958
	}
}

DwarfMoon	"4.D42"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.7486e-07
	Radius          43.806
	InertiaMoment   0.39775
	Obliquity       136.28
	EqAscendNode    -7.3284
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.740 0.708 0.657)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.073554
		Randomize      (0.129, 0.692, -0.347)
		colorDistMagn   0.39349
		colorDistFreq   0.95872
		detailScale     128
		snowLevel       2
		tropicLatitude  0.69466
		icecapLatitude  2
		icecapHeight    0.60567
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13383
		heightTempGrad  0.625
		beachWidth      0.0013607
		tropicWidth     0.07
		mainFreq        0.34683
		venusFreq       0.55348
		venusMagn       0.53122
		mareDensity     0
		terraceProb     0.45957
		erosion         0
		montesMagn      0.42908
		montesFreq      3.9757
		montesSpiky     0.85767
		montesFraction  0.4579
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.8546
		hillsFraction   0.4641
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25184
		craterFreq      0.27137
		craterDensity   0.87203
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5662
		volcanoTemp     1159.6
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
		PeriodDays      73.9662448
		SemiMajorAxisKm 8021044.3
		Eccentricity    0.186172956
		Inclination     136.283046
		AscendingNode   -7.32842015
		ArgOfPericenter -56.0667998
		MeanAnomaly     -13.5674148
	}
}

DwarfMoon	"4.D43"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.8279e-07
	Radius          46.64
	InertiaMoment   0.39931
	RotationPeriod  896.26
	Obliquity       34.475
	EqAscendNode    100.71

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.562 0.442 0.397)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64262
		Randomize      (0.400, 0.522, -0.014)
		colorDistMagn   0.40964
		colorDistFreq   1.7511
		detailScale     128
		snowLevel       2
		tropicLatitude  0.56315
		icecapLatitude  2
		icecapHeight    0.54111
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43153
		heightTempGrad  0.625
		beachWidth      0.0011085
		tropicWidth     0.07
		mainFreq        0.59469
		venusFreq       0.57379
		venusMagn       0.51809
		mareDensity     0
		terraceProb     0.17366
		erosion         0
		montesMagn      0.54425
		montesFreq      2.9882
		montesSpiky     0.98773
		montesFraction  0.53155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2566
		hillsFraction   0.60676
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22935
		craterFreq      0.22256
		craterDensity   0.97297
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4674
		volcanoTemp     1007.3
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
		PeriodDays      74.6880518
		SemiMajorAxisKm 8073142.57
		Eccentricity    0.265426201
		Inclination     34.4747316
		AscendingNode   100.71113
		ArgOfPericenter 139.50386
		MeanAnomaly     119.13867
	}
}

DwarfMoon	"4.D44"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.3765e-07
	Radius          54.98
	InertiaMoment   0.39741
	RotationPeriod  1206.8
	Obliquity       193.24
	EqAscendNode    130.71

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.731 0.640 0.591)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.21169
		Randomize      (0.670, 0.352, 0.319)
		colorDistMagn   0.4255
		colorDistFreq   1.4089
		detailScale     256
		snowLevel       2
		tropicLatitude  0.22719
		icecapLatitude  2
		icecapHeight    0.45953
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32924
		heightTempGrad  0.625
		beachWidth      0.00085638
		tropicWidth     0.07
		mainFreq        0.43332
		venusFreq       0.59042
		venusMagn       0.50192
		mareDensity     0
		terraceProb     0.29568
		erosion         0
		montesMagn      0.38587
		montesFreq      1.7617
		montesSpiky     0.95464
		montesFraction  0.60269
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.4414
		hillsFraction   0.71098
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26252
		craterFreq      0.17073
		craterDensity   0.80353
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51359
		volcanoTemp     1055.1
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
		PeriodDays      75.4260304
		SemiMajorAxisKm 8126234.84
		Eccentricity    0.100632973
		Inclination     193.238584
		AscendingNode   130.707094
		ArgOfPericenter -78.4059966
		MeanAnomaly     30.8398352
	}
}

DwarfMoon	"4.D45"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.6286e-07
	Radius          61.021
	InertiaMoment   0.39913
	RotationPeriod  915.25
	Obliquity       184.51
	EqAscendNode    44.782

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.549 0.427 0.335)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.78076
		Randomize      (0.941, 0.182, 0.652)
		colorDistMagn   0.44109
		colorDistFreq   2.8112
		detailScale     256
		snowLevel       2
		tropicLatitude  0.081665
		icecapLatitude  2
		icecapHeight    0.84589
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22695
		heightTempGrad  0.625
		beachWidth      0.0015042
		tropicWidth     0.07
		mainFreq        0.68279
		venusFreq       0.60603
		venusMagn       0.48007
		mareDensity     0
		terraceProb     0.48106
		erosion         0
		montesMagn      0.51477
		montesFreq      3.0284
		montesSpiky     0.91545
		montesFraction  0.6815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.3017
		hillsFraction   0.4092
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23719
		craterFreq      0.23512
		craterDensity   0.91123
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58589
		volcanoTemp     1002.8
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
		PeriodDays      76.2706237
		SemiMajorAxisKm 8186785.28
		Eccentricity    0.307403278
		Inclination     184.511024
		AscendingNode   44.7819594
		ArgOfPericenter 122.741995
		MeanAnomaly     -104.089348
	}
}

DwarfMoon	"4.D46"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.0957e-06
	Radius          64.815
	InertiaMoment   0.39698
	Obliquity       171.89
	EqAscendNode    107.39
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.727 0.625 0.519)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.34982
		Randomize      (-0.789, 0.012, 0.985)
		colorDistMagn   0.45643
		colorDistFreq   1.811
		detailScale     256
		snowLevel       2
		tropicLatitude  0.14918
		icecapLatitude  2
		icecapHeight    0.70874
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12466
		heightTempGrad  0.625
		beachWidth      0.0012521
		tropicWidth     0.07
		mainFreq        0.50404
		venusFreq       0.62227
		venusMagn       0.44301
		mareDensity     0
		terraceProb     0.18234
		erosion         0
		montesMagn      0.28206
		montesFreq      2.1172
		montesSpiky     0.85446
		montesFraction  0.79031
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.4841
		hillsFraction   0.59017
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19816
		craterFreq      0.19162
		craterDensity   1.0419
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47479
		volcanoTemp     950.53
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
		PeriodDays      77.8118968
		SemiMajorAxisKm 8296709.22
		Eccentricity    0.00201387133
		Inclination     171.891845
		AscendingNode   107.392202
		ArgOfPericenter 47.9230274
		MeanAnomaly     169.570732
	}
}

DwarfMoon	"4.D47"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.5969e-06
	Radius          77.274
	InertiaMoment   0.39895
	Obliquity       207.69
	EqAscendNode    119.16
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.449 0.412 0.360)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91889
		Randomize      (-0.519, -0.158, -0.682)
		colorDistMagn   0.47154
		colorDistFreq   4.2524
		detailScale     256
		snowLevel       2
		tropicLatitude  0.46175
		icecapLatitude  2
		icecapHeight    0.63626
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42237
		heightTempGrad  0.625
		beachWidth      0.00099994
		tropicWidth     0.07
		mainFreq        0.31419
		venusFreq       0.64136
		venusMagn       0.90683
		mareDensity     0
		terraceProb     0.30547
		erosion         0
		montesMagn      0.48655
		montesFreq      3.0689
		montesSpiky     0.98659
		montesFraction  0.23009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.883
		hillsFraction   0.69328
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2446
		craterFreq      0.24878
		craterDensity   0.85385
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52021
		volcanoTemp     1098.3
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
		PeriodDays      78.7423582
		SemiMajorAxisKm 8362718.52
		Eccentricity    0.106417566
		Inclination     207.685708
		AscendingNode   119.156318
		ArgOfPericenter 6.96246467
		MeanAnomaly     -5.07630587
	}
}

DwarfMoon	"4.D48"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.3686e-06
	Radius          86.376
	InertiaMoment   0.39632
	Obliquity       214.48
	EqAscendNode    -29.382
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.646 0.605 0.526)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48796
		Randomize      (-0.248, -0.328, -0.349)
		colorDistMagn   0.48645
		colorDistFreq   2.9367
		detailScale     256
		snowLevel       2
		tropicLatitude  0.56326
		icecapLatitude  2
		icecapHeight    0.57281
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32007
		heightTempGrad  0.625
		beachWidth      0.0010478
		tropicWidth     0.07
		mainFreq        0.57349
		venusFreq       0.67022
		venusMagn       0.85147
		mareDensity     0
		terraceProb     0.5064
		erosion         0
		montesMagn      0.61667
		montesFreq      2.2652
		montesSpiky     0.95338
		montesFraction  0.37845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       10.527
		hillsFraction   0.88927
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22053
		craterFreq      0.24072
		craterDensity   0.95232
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.377
		volcanoTemp     1046
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
		PeriodDays      79.7952334
		SemiMajorAxisKm 8437099.43
		Eccentricity    0.0509273381
		Inclination     214.482368
		AscendingNode   -29.3818469
		ArgOfPericenter 90.2869329
		MeanAnomaly     -13.6447543
	}
}

DwarfMoon	"4.D49"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.5893e-06
	Radius          103.52
	InertiaMoment   0.39875
	RotationPeriod  973.31
	Obliquity       170.28
	EqAscendNode    -5.3274

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.809 0.752 0.725)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.057027
		Randomize      (0.022, -0.498, -0.016)
		colorDistMagn   0.50117
		colorDistFreq   7.22
		detailScale     256
		snowLevel       2
		tropicLatitude  0.17634
		icecapLatitude  2
		icecapHeight    0.50285
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21778
		heightTempGrad  0.625
		beachWidth      0.00079565
		tropicWidth     0.07
		mainFreq        0.41115
		venusFreq       0.51463
		venusMagn       0.82572
		mareDensity     0
		terraceProb     0.19098
		erosion         0
		montesMagn      0.45718
		montesFreq      3.1098
		montesSpiky     0.91382
		montesFraction  0.46541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.692
		hillsFraction   0.57271
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25274
		craterFreq      0.44518
		craterDensity   0.77168
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48166
		volcanoTemp     1193.7
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
		PeriodDays      81.1091031
		SemiMajorAxisKm 8529461.25
		Eccentricity    0.301697644
		Inclination     170.278676
		AscendingNode   -5.32736625
		ArgOfPericenter 163.437766
		MeanAnomaly     70.683996
	}
}

DwarfMoon	"4.D50"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            5.5839e-06
	Radius          114.6
	InertiaMoment   0.39328
	RotationPeriod  1317.1
	Obliquity       184.97
	EqAscendNode    -119.22

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.645 0.530 0.451)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.62609
		Randomize      (0.293, -0.667, 0.317)
		colorDistMagn   0.51572
		colorDistFreq   4.6276
		detailScale     512
		snowLevel       2
		tropicLatitude  0.08893
		icecapLatitude  2
		icecapHeight    0.38769
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11549
		heightTempGrad  0.625
		beachWidth      0.0017435
		tropicWidth     0.07
		mainFreq        0.65417
		venusFreq       0.55186
		venusMagn       0.80779
		mareDensity     0
		terraceProb     0.31552
		erosion         0
		montesMagn      0.57261
		montesFreq      2.3675
		montesSpiky     0.85111
		montesFraction  0.53838
		dunesFraction   0
		hillsMagn       0
		hillsFreq       32.613
		hillsFraction   0.67655
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2302
		craterFreq      0.45028
		craterDensity   0.89425
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52721
		volcanoTemp     1141.5
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
		PeriodDays      82.3160465
		SemiMajorAxisKm 8613867.83
		Eccentricity    0.156977132
		Inclination     184.966547
		AscendingNode   -119.22022
		ArgOfPericenter 92.5509339
		MeanAnomaly     7.8091513
	}
}

DwarfMoon	"4.D51"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.749e-11
	Radius          1.7465
	InertiaMoment   0.39855
	Obliquity       173.53
	EqAscendNode    124.52
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.796 0.727 0.662)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19516
		Randomize      (0.563, -0.837, 0.650)
		colorDistMagn   0.53012
		colorDistFreq   0.0019462
		detailScale     8
		snowLevel       2
		tropicLatitude  0.12173
		icecapLatitude  2
		icecapHeight    0.75595
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4132
		heightTempGrad  0.625
		beachWidth      0.00029136
		tropicWidth     0.07
		mainFreq        0.48439
		venusFreq       0.5726
		venusMagn       0.79365
		mareDensity     0
		terraceProb     0.53791
		erosion         0
		montesMagn      0.42347
		montesFreq      3.1514
		montesSpiky     0.98544
		montesFraction  0.60978
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0068417
		hillsFraction   0.82449
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26399
		craterFreq      0.1628
		craterDensity   1.0056
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42088
		volcanoTemp     989.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.5718
		BumpOffset      0.78592
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
		PeriodDays      83.7100796
		SemiMajorAxisKm 8710846.71
		Eccentricity    0.0672685554
		Inclination     173.532425
		AscendingNode   124.522811
		ArgOfPericenter 32.1768642
		MeanAnomaly     -23.7841143
	}
}

DwarfMoon	"4.D52"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.3925e-11
	Radius          2.1133
	InertiaMoment   0.39984
	RotationPeriod  1017.2
	Obliquity       188.92
	EqAscendNode    91.268

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.649 0.527 0.372)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.76423
		Randomize      (0.833, 0.993, 0.983)
		colorDistMagn   0.54437
		colorDistFreq   0.0013617
		detailScale     8
		snowLevel       2
		tropicLatitude  0.15453
		icecapLatitude  2
		icecapHeight    0.6687
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31091
		heightTempGrad  0.625
		beachWidth      0.0012392
		tropicWidth     0.07
		mainFreq        0.27318
		venusFreq       0.58937
		venusMagn       0.78177
		mareDensity     0
		terraceProb     0.19961
		erosion         0
		montesMagn      0.53958
		montesFreq      2.4486
		montesSpiky     0.95211
		montesFraction  0.69008
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0088011
		hillsFraction   0.55388
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23794
		craterFreq      0.2319
		craterDensity   0.83398
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4882
		volcanoTemp     1137
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.902
		BumpOffset      0.95098
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
		PeriodDays      84.7707858
		SemiMajorAxisKm 8784276.7
		Eccentricity    0.327070716
		Inclination     188.924713
		AscendingNode   91.2678132
		ArgOfPericenter 176.264332
		MeanAnomaly     161.801025
	}
}

DwarfMoon	"4.D53"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.0746e-11
	Radius          2.5716
	InertiaMoment   0.39833
	RotationPeriod  1363.3
	Obliquity       191.15
	EqAscendNode    -134.2

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.728 0.702 0.655)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.3333
		Randomize      (-0.896, 0.823, -0.684)
		colorDistMagn   0.5585
		colorDistFreq   0.0039956
		detailScale     8
		snowLevel       2
		tropicLatitude  0.19205
		icecapLatitude  2
		icecapHeight    0.60317
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20861
		heightTempGrad  0.625
		beachWidth      0.00068707
		tropicWidth     0.07
		mainFreq        0.55312
		venusFreq       0.60499
		venusMagn       0.7714
		mareDensity     0
		terraceProb     0.32587
		erosion         0
		montesMagn      0.37724
		montesFreq      3.1941
		montesSpiky     0.91216
		montesFraction  0.80497
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0084169
		hillsFraction   0.66042
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20325
		craterFreq      0.18722
		craterDensity   0.93369
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53478
		volcanoTemp     984.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3145
		BumpOffset      1.1572
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
		PeriodDays      85.2076911
		SemiMajorAxisKm 8814433.37
		Eccentricity    0.161639937
		Inclination     191.151675
		AscendingNode   -134.200027
		ArgOfPericenter -100.816595
		MeanAnomaly     64.3940429
	}
}

Planet	"5"
{
	ParentBody     "Asim"
	Class          "Terra"
	Mass            1.9285
	Radius          9109.6
	InertiaMoment   0.33247
	Oblateness      0.011647
	RotationPeriod  15.816
	RotationEpoch   0
	Obliquity       -66.166
	EqAscendNode    -86.405

	AlbedoBond      0.52329
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.633 0.629 0.622)

	Surface
	{
		Preset         "aquaria_wet_default.cfg"
		SurfStyle       0.20083
		Randomize      (0.008, 0.196, 0.630)
		colorDistMagn   0.076189
		colorDistFreq   974.7
		detailScale     32768
		seaLevel        0.20478
		snowLevel       0.949
		tropicLatitude  0.91506
		icecapLatitude  2
		icecapHeight    0.64841
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.94034
		heightTempGrad  0.375
		beachWidth      0.0012288
		tropicWidth     0.5
		mainFreq        1.5253
		venusFreq       0.97173
		venusMagn       -1
		mareFreq        1.3075
		mareDensity     0
		terraceProb     0.32923
		erosion         0.10343
		montesMagn      0.18863
		montesFreq      467.66
		montesSpiky     0.96974
		montesFraction  0.76477
		dunesMagn       0.04936
		dunesFreq       83.81
		dunesFraction   0.074891
		hillsMagn       0.10489
		hillsFreq       940.78
		hillsFraction   0.08841
		hills2Fraction  0.12449
		riversMagn      64.077
		riversFreq      3.477
		riversSin       5.3077
		riftsMagn       0
		riftsFreq       2.2747
		riftsSin        6.8013
		canyonsMagn     0.027786
		canyonsFreq     211.35
		canyonsFraction 0.42758
		cracksMagn      0.050183
		cracksFreq      4.0543
		cracksOctaves   7
		craterMagn      0.65854
		craterFreq      19.915
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.58277
		volcanoFreq     0.63842
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.442
		volcanoFlows    0.60074
		volcanoRadius   0.5468
		volcanoTemp     280.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.3308
		stripeTwist     0.12283
		cycloneMagn     2.7509
		cycloneFreq     0.97495
		cycloneDensity  0.2456
		cycloneOctaves  4
		BumpHeight      20
		BumpOffset      4.0955
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.4372
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           4.0955
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			CO2       	99.427
			SO2       	0.57306
		}
	}

	Clouds
	{
		Height          11.125
		Velocity        118.57
		BumpHeight      2.61
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.8239
		mainOctaves     10
		Coverage        1
		stripeZones     2.3308
		stripeTwist     0.12283
	}

	Clouds
	{
		Height          16.345
		Velocity        146.61
		BumpHeight      2.61
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.8239
		mainOctaves     10
		Coverage        1
		stripeZones     2.3308
		stripeTwist     0.12283
	}

	Clouds
	{
		Height          21.564
		Velocity        20.94
		BumpHeight      2.61
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.8239
		mainOctaves     10
		Coverage        1
		stripeZones     2.3308
		stripeTwist     0.12283
	}

	NoLava          true

	Atmosphere
	{
		Model          "Thick"
		Height          75.067
		Density         139.81
		Pressure        79.324
		Greenhouse      69.681
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.45815
		Saturation      0.99682

		Composition
		{
			N2        	69.228
			CO2       	28.779
			CO        	1.48
			SO2       	0.50693
			Ar        	0.0044036
			Ne        	0.00089361
			H2O       	0.00058949
		}
	}

	Aurora
	{
		Height         51.622
		NorthLat       72.62
		NorthLon       -151.37
		NorthRadius    3146.1
		NorthWidth     882.01
		NorthRings     5
		NorthBright    0.59636
		NorthFlashFreq 67.25
		NorthMoveSpeed 1.4514
		NorthParticles 50000
		SouthLat       -48.961
		SouthLon       32.808
		SouthRadius    2932.8
		SouthWidth     669.73
		SouthRings     4
		SouthBright    0.59636
		SouthFlashFreq 68.891
		SouthMoveSpeed 1.1218
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     11719
		OuterRadius     45449
		EdgeRadius      23924
		MeanRadius      15783
		Thickness       25
		ChartRadius     23924
		RotationPeriod  4.736
		FrontBright     0.71663
		BackBright      2.7253
		Density         0.65232
		Opacity         0.65232
		Brightness      1
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.2904
		densityScale    1.291
		densityOffset   -0.42943
		densityPower    4.743
		colorContrast   0.15315
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
//		Period          6.45770184
//		SemiMajorAxis   3.80418547
		SemiMajorAxis   2.1
		Eccentricity    0.00357404784
		Inclination     -1.23165463
		AscendingNode   -88.0386384
		ArgOfPericenter 135.090219
		MeanAnomaly     229.608453
	}
}

DwarfMoon	"5.D1"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.2259e-11
	Radius          1.8422
	InertiaMoment   0.39816
	Oblateness      0.15434
	Obliquity       -0.0096056
	EqAscendNode    34.113
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.697 0.693 0.688)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.92924
		Randomize      (-0.377, -0.336, -0.816)
		colorDistMagn   0.36699
		colorDistFreq   0.0011616
		detailScale     8
		snowLevel       2
		tropicLatitude  0.021501
		icecapLatitude  0.51384
		icecapHeight    0.093904
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37171
		heightTempGrad  0.625
		beachWidth      0.0013098
		tropicWidth     0.07
		mainFreq        0.46707
		venusFreq       0.64545
		venusMagn       0.0023088
		mareDensity     0
		terraceProb     0.27767
		erosion         0
		montesMagn      0.64477
		montesFreq      3.2264
		montesSpiky     0.82538
		montesFraction  0.63931
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0044657
		hillsFraction   0.7024
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28292
		craterFreq      0.26846
		craterDensity   0.69675
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47907
		volcanoTemp     209.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6579
		BumpOffset      0.82897
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
		PeriodDays      0.233274507
		SemiMajorAxisKm 19924.9131
		Eccentricity    4.2257298e-05
		Inclination     -0.00960562888
		AscendingNode   34.1133982
		ArgOfPericenter 40.5057026
		MeanAnomaly     -110.932647
	}
}

DwarfMoon	"5.D2"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            2.5002e-11
	Radius          2.4312
	InertiaMoment   0.39956
	Oblateness      0.09307
	Obliquity       0.0047763
	EqAscendNode    -84.281
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.477 0.474 0.471)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49831
		Randomize      (-0.107, -0.506, -0.483)
		colorDistMagn   0.38369
		colorDistFreq   0.0037257
		detailScale     8
		snowLevel       2
		tropicLatitude  0.021492
		icecapLatitude  0.49246
		icecapHeight    0.41741
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26942
		heightTempGrad  0.625
		beachWidth      0.00045764
		tropicWidth     0.07
		mainFreq        0.7421
		venusFreq       0.67872
		venusMagn       0.0039822
		mareDensity     0
		terraceProb     0.4425
		erosion         0
		montesMagn      0.47
		montesFreq      2.5624
		montesSpiky     0.97834
		montesFraction  0.72785
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016282
		hillsFraction   0.3524
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24293
		craterFreq      0.22095
		craterDensity   0.87425
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52446
		volcanoTemp     313.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.1881
		BumpOffset      1.0941
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
		PeriodDays      0.319775527
		SemiMajorAxisKm 24587.5391
		Eccentricity    2.45251594e-05
		Inclination     0.00477625465
		AscendingNode   -84.280552
		ArgOfPericenter 143.066852
		MeanAnomaly     -40.9074192
	}
}

DwarfMoon	"5.D3"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            4.6354e-11
	Radius          2.8961
	InertiaMoment   0.3979
	Oblateness      0.045876
	Obliquity       -0.0045254
	EqAscendNode    87.464
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.710 0.671 0.601)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.067377
		Randomize      (0.164, -0.676, -0.150)
		colorDistMagn   0.40003
		colorDistFreq   0.0024572
		detailScale     8
		snowLevel       2
		tropicLatitude  0.021498
		icecapLatitude  0.4711
		icecapHeight    0.36588
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16712
		heightTempGrad  0.625
		beachWidth      0.00080549
		tropicWidth     0.07
		mainFreq        0.53587
		venusFreq       0.52479
		venusMagn       0.005593
		mareDensity     0
		terraceProb     0.1658
		erosion         0
		montesMagn      0.58924
		montesFreq      3.272
		montesSpiky     0.94411
		montesFraction  0.88643
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.020732
		hillsFraction   0.58198
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21769
		craterFreq      0.16693
		craterDensity   0.9758
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41106
		volcanoTemp     206.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.6065
		BumpOffset      1.3032
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
		PeriodDays      0.43353468
		SemiMajorAxisKm 30118.5559
		Eccentricity    1.48118326e-05
		Inclination     -0.00452542776
		AscendingNode   87.464446
		ArgOfPericenter 23.47607
		MeanAnomaly     -37.9648137
	}
}

Moon	"5.1"
{
	ParentBody     "5"
	Class          "Aquaria"
	Mass            0.015821
	Radius          2056
	InertiaMoment   0.37076
	Oblateness      0.0073758
	Obliquity       0.47078
	EqAscendNode    -153.18
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.541 0.388 0.332)

	Surface
	{
		Preset         "aquaria_airless_white.cfg"
		SurfStyle       0.63644
		Randomize      (0.434, -0.846, 0.183)
		colorDistMagn   0.068865
		colorDistFreq   254.25
		detailScale     8192
		drivenDarkening 0
		seaLevel        0.17616
		snowLevel       2
		tropicLatitude  0.022747
		icecapLatitude  0.94874
		icecapHeight    0.037523
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46483
		heightTempGrad  0.625
		beachWidth      0.00055335
		tropicWidth     0.07
		mainFreq        1.6308
		venusFreq       0.66951
		venusMagn       0.16856
		mareFreq        0.96887
		mareDensity     0.11978
		terraceProb     0.19939
		erosion         0
		montesMagn      0.10292
		montesFreq      92.12
		montesSpiky     0.9532
		montesFraction  0.23348
		dunesMagn       0.045149
		dunesFreq       19.392
		dunesFraction   0.64029
		hillsMagn       0.13864
		hillsFreq       234
		hillsFraction   0.39382
		hills2Fraction  0.22391
		riversMagn      0
		riversFreq      2.8282
		riversSin       6.4111
		riftsMagn       0
		riftsFreq       4.2681
		riftsSin        6.5293
		canyonsMagn     0.47143
		canyonsFreq     0.71493
		canyonsFraction 0
		cracksMagn      0.076044
		cracksFreq      0.93868
		cracksOctaves   2
		craterMagn      0.50025
		craterFreq      6.6163
		craterDensity   0.93897
		craterOctaves   19
		craterRayedFactor 0.066957
		volcanoMagn     0.33431
		volcanoFreq     0.8174
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.907
		volcanoFlows    0.29078
		volcanoRadius   0.30867
		volcanoTemp     333.65
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
		PeriodDays      1.05224687
		SemiMajorAxisKm 54543.8877
		Eccentricity    0.000145483122
		Inclination     0.470776084
		AscendingNode   -153.184502
		ArgOfPericenter -144.629032
		MeanAnomaly     11.1511515
	}
}

Moon	"5.2"
{
	ParentBody     "5"
	Class          "Aquaria"
	Mass            0.00045812
	Radius          621.13
	InertiaMoment   0.39455
	Oblateness      0.0016345
	Obliquity       0.74431
	EqAscendNode    -151.65
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.729 0.587 0.506)

	Surface
	{
		Preset         "aquaria_airless_europa.cfg"
		SurfStyle       0.20551
		Randomize      (0.704, 0.984, 0.516)
		colorDistMagn   0.045771
		colorDistFreq   87.366
		detailScale     2048
		drivenDarkening 0
		seaLevel        0.17849
		snowLevel       2
		tropicLatitude  0.02473
		icecapLatitude  0.70239
		icecapHeight    0.18283
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36254
		heightTempGrad  0.625
		beachWidth      0.0015012
		tropicWidth     0.07
		mainFreq        1.9105
		venusFreq       0.8159
		venusMagn       0.16543
		mareFreq        0.01736
		mareDensity     0.13321
		terraceProb     0.37173
		erosion         0
		montesMagn      0.047382
		montesFreq      24.203
		montesSpiky     0.99455
		montesFraction  0.73701
		dunesMagn       0.034455
		dunesFreq       4.6205
		dunesFraction   0.37171
		hillsMagn       0.12238
		hillsFreq       66.81
		hillsFraction   0.929
		hills2Fraction  0.28244
		riversMagn      0
		riversFreq      2.9324
		riversSin       6.6214
		riftsMagn       0
		riftsFreq       2.1271
		riftsSin        6.9733
		canyonsMagn     0.56357
		canyonsFreq     0.2482
		canyonsFraction 0
		cracksMagn      0.048531
		cracksFreq      0.20767
		cracksOctaves   0
		craterMagn      0.61599
		craterFreq      1.4405
		craterDensity   0.86124
		craterOctaves   17
		craterRayedFactor 0.060178
		volcanoMagn     0.19418
		volcanoFreq     0.693
		volcanoDensity  0.33749
		volcanoOctaves  3
		volcanoActivity 0.45667
		volcanoFlows    0.25426
		volcanoRadius   0.1494
		volcanoTemp     383.38
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
		PeriodDays      2.2804174
		SemiMajorAxisKm 91102.1982
		Eccentricity    0.00299038878
		Inclination     0.744313986
		AscendingNode   -151.648214
		ArgOfPericenter -103.553677
		MeanAnomaly     121.524502
	}
}

Moon	"5.3"
{
	ParentBody     "5"
	Class          "Aquaria"
	Mass            0.00083467
	Radius          776.25
	InertiaMoment   0.3962
	Obliquity       0.75954
	EqAscendNode    -3.2843
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.868 0.793 0.730)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.77458
		Randomize      (0.975, 0.814, 0.849)
		colorDistMagn   0.057251
		colorDistFreq   97.578
		detailScale     2048
		drivenDarkening 0
		seaLevel        0.15995
		snowLevel       2
		tropicLatitude  0.024863
		icecapLatitude  0.45418
		icecapHeight    0.43352
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26025
		heightTempGrad  0.625
		beachWidth      0.00094906
		tropicWidth     0.07
		mainFreq        1.7252
		venusFreq       0.94063
		venusMagn       0
		mareFreq        0.11306
		mareDensity     0.13237
		terraceProb     0.17452
		erosion         0
		montesMagn      0.057784
		montesFreq      43.844
		montesSpiky     0.66008
		montesFraction  0.24054
		dunesMagn       0.03428
		dunesFreq       8.2523
		dunesFraction   0.10313
		hillsMagn       0.13636
		hillsFreq       72.853
		hillsFraction   0.46418
		hills2Fraction  0.040968
		riversMagn      0
		riversFreq      2.7764
		riversSin       6.0502
		riftsMagn       0
		riftsFreq       3.6034
		riftsSin        5.3024
		canyonsMagn     0.38657
		canyonsFreq     0.21695
		canyonsFraction 0
		cracksMagn      0.03411
		cracksFreq      0.51834
		cracksOctaves   0
		craterMagn      0.66907
		craterFreq      1.9328
		craterDensity   0.88852
		craterOctaves   18
		craterRayedFactor 0
		volcanoMagn     0.16296
		volcanoFreq     0.60702
		volcanoDensity  0.21632
		volcanoOctaves  3
		volcanoActivity 0.40346
		volcanoFlows    0.20722
		volcanoRadius   0.15368
		volcanoTemp     286.39
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
		PeriodDays      4.92205082
		SemiMajorAxisKm 152163.897
		Eccentricity    0.0114355223
		Inclination     0.759536932
		AscendingNode   -3.2842999
		ArgOfPericenter 118.992211
		MeanAnomaly     -114.298533
	}
}

Moon	"5.4"
{
	ParentBody     "5"
	Class          "Aquaria"
	Mass            0.0010286
	Radius          788.56
	InertiaMoment   0.39679
	Obliquity       -0.73298
	EqAscendNode    140.61
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.746 0.597 0.414)

	Surface
	{
		Preset         "aquaria_airless_pluto.cfg"
		SurfStyle       0.34365
		Randomize      (-0.755, 0.645, -0.819)
		colorDistMagn   0.057942
		colorDistFreq   75.437
		detailScale     2048
		drivenDarkening 0
		seaLevel        0.15621
		snowLevel       2
		tropicLatitude  0.025385
		icecapLatitude  0.80636
		icecapHeight    0.047825
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15796
		heightTempGrad  0.625
		beachWidth      0.00099691
		tropicWidth     0.07
		mainFreq        2.0208
		venusFreq       1.0597
		venusMagn       0
		mareFreq        0.14695
		mareDensity     0.16977
		terraceProb     0.29664
		erosion         0
		montesMagn      0.062204
		montesFreq      38.787
		montesSpiky     0.97444
		montesFraction  0.74406
		dunesMagn       0.042174
		dunesFreq       6.7054
		dunesFraction   0.83456
		hillsMagn       0.11853
		hillsFreq       94.24
		hillsFraction   0.99937
		hills2Fraction  0.099496
		riversMagn      0
		riversFreq      2.488
		riversSin       6.1983
		riftsMagn       0
		riftsFreq       3.8186
		riftsSin        5.6942
		canyonsMagn     0.66058
		canyonsFreq     0.27015
		canyonsFraction 0
		cracksMagn      0.050688
		cracksFreq      0.33593
		cracksOctaves   0
		craterMagn      0.61592
		craterFreq      2.6927
		craterDensity   0.96857
		craterOctaves   18
		craterRayedFactor 0.16965
		volcanoMagn     0.16111
		volcanoFreq     0.7058
		volcanoDensity  0.27474
		volcanoOctaves  3
		volcanoActivity 0.29623
		volcanoFlows    0.33642
		volcanoRadius   0.14745
		volcanoTemp     361.14
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
		PeriodDays      10.6242537
		SemiMajorAxisKm 254152.502
		Eccentricity    0.0491483653
		Inclination     -0.732984454
		AscendingNode   140.609162
		ArgOfPericenter 33.1683123
		MeanAnomaly     29.9021211
	}
}

DwarfMoon	"5.D4"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            4.8711e-10
	Radius          6.3383
	InertiaMoment   0.39904
	Obliquity       170.07
	EqAscendNode    147.16
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.793 0.769 0.730)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91271
		Randomize      (-0.484, 0.475, -0.486)
		colorDistMagn   0.47757
		colorDistFreq   0.021356
		detailScale     16
		snowLevel       2
		tropicLatitude  0.17447
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
		humidity        0.45566
		heightTempGrad  0.625
		beachWidth      0.00074477
		tropicWidth     0.07
		mainFreq        0.51626
		venusFreq       0.62425
		venusMagn       0.56454
		mareDensity     0
		terraceProb     0.48338
		erosion         0
		montesMagn      0.33088
		montesFreq      2.719
		montesSpiky     0.8995
		montesFraction  0.64691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.098712
		hillsFraction   0.80543
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.17055
		craterFreq      0.2633
		craterDensity   0.95479
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53986
		volcanoTemp     233.72
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.7045
		BumpOffset      2.8522
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
		PeriodDays      121.146758
		SemiMajorAxisKm 1287338.57
		Eccentricity    0.395861585
		Inclination     170.069236
		AscendingNode   147.164558
		ArgOfPericenter -109.373287
		MeanAnomaly     50.4785003
	}
}

DwarfMoon	"5.D5"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            7.1772e-10
	Radius          7.1536
	InertiaMoment   0.3967
	RotationPeriod  1022.9
	Obliquity       182.75
	EqAscendNode    8.7897

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.618 0.509 0.466)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48178
		Randomize      (-0.214, 0.305, -0.153)
		colorDistMagn   0.4924
		colorDistFreq   0.044361
		detailScale     32
		snowLevel       2
		tropicLatitude  0.051851
		icecapLatitude  0.97326
		icecapHeight    0.016964
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35337
		heightTempGrad  0.625
		beachWidth      0.00079262
		tropicWidth     0.07
		mainFreq        0.33528
		venusFreq       0.64391
		venusMagn       0.55589
		mareDensity     0
		terraceProb     0.1832
		erosion         0
		montesMagn      0.49429
		montesFreq      3.4264
		montesSpiky     0.81383
		montesFraction  0.73821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11347
		hillsFraction   0.54423
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24368
		craterFreq      0.2178
		craterDensity   0.77641
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44538
		volcanoTemp     267.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.4383
		BumpOffset      3.2191
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
		PeriodDays      127.862789
		SemiMajorAxisKm 1334487.05
		Eccentricity    0.469284048
		Inclination     182.747679
		AscendingNode   8.78971486
		ArgOfPericenter 126.701185
		MeanAnomaly     25.1176772
	}
}

DwarfMoon	"5.D6"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.0403e-09
	Radius          8.0718
	InertiaMoment   0.39885
	Obliquity       198.87
	EqAscendNode    72.71
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.779 0.708 0.668)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.05085
		Randomize      (0.056, 0.135, 0.180)
		colorDistMagn   0.50705
		colorDistFreq   0.032506
		detailScale     32
		snowLevel       2
		tropicLatitude  0.32337
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
		humidity        0.25108
		heightTempGrad  0.625
		beachWidth      0.0011405
		tropicWidth     0.07
		mainFreq        0.58662
		venusFreq       0.67534
		venusMagn       0.54638
		mareDensity     0
		terraceProb     0.30646
		erosion         0
		montesMagn      0.63351
		montesFreq      2.765
		montesSpiky     0.97601
		montesFraction  0.91856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12609
		hillsFraction   0.65287
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21903
		craterFreq      0.15773
		craterDensity   0.89639
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4984
		volcanoTemp     370.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.2646
		BumpOffset      3.6323
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
		PeriodDays      135.220258
		SemiMajorAxisKm 1385200.87
		Eccentricity    0.180324703
		Inclination     198.870571
		AscendingNode   72.7098707
		ArgOfPericenter 154.628861
		MeanAnomaly     162.576152
	}
}

DwarfMoon	"5.D7"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            1.4872e-09
	Radius          9.1089
	InertiaMoment   0.39575
	RotationPeriod  1699
	Obliquity       17.835
	EqAscendNode    -97.298

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.621 0.491 0.388)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.61992
		Randomize      (0.327, -0.035, 0.513)
		colorDistMagn   0.52154
		colorDistFreq   0.066699
		detailScale     32
		snowLevel       2
		tropicLatitude  0.30626
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
		humidity        0.14879
		heightTempGrad  0.625
		beachWidth      0.00088833
		tropicWidth     0.07
		mainFreq        0.42517
		venusFreq       0.52143
		venusMagn       0.53571
		mareDensity     0
		terraceProb     0.5092
		erosion         0
		montesMagn      0.46549
		montesFreq      3.4874
		montesSpiky     0.94144
		montesFraction  0.33117
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28126
		hillsFraction   0.77426
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25165
		craterFreq      0.23027
		craterDensity   1.0094
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54915
		volcanoTemp     263.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.198
		BumpOffset      4.099
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
		PeriodDays      141.582679
		SemiMajorAxisKm 1428318.3
		Eccentricity    0.308823422
		Inclination     17.8350719
		AscendingNode   -97.2978617
		ArgOfPericenter 36.3062854
		MeanAnomaly     1.80502625
	}
}

DwarfMoon	"5.D8"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            2.1021e-09
	Radius          10.542
	InertiaMoment   0.39865
	Obliquity       -30.117
	EqAscendNode    -73.38
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.771 0.689 0.601)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.18898
		Randomize      (0.597, -0.205, 0.846)
		colorDistMagn   0.53588
		colorDistFreq   0.051724
		detailScale     32
		snowLevel       2
		tropicLatitude  0.50274
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
		humidity        0.4465
		heightTempGrad  0.625
		beachWidth      0.00063618
		tropicWidth     0.07
		mainFreq        0.67159
		venusFreq       0.55461
		venusMagn       0.52341
		mareDensity     0
		terraceProb     0.19184
		erosion         0
		montesMagn      0.58304
		montesFreq      2.809
		montesSpiky     0.8976
		montesFraction  0.43201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.30165
		hillsFraction   0.52194
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22917
		craterFreq      0.18481
		craterDensity   0.83662
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45558
		volcanoTemp     297.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.4881
		BumpOffset      4.7441
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
		PeriodDays      155.09312
		SemiMajorAxisKm 1517795.54
		Eccentricity    0.340142617
		Inclination     -30.1167443
		AscendingNode   -73.380289
		ArgOfPericenter -17.6686746
		MeanAnomaly     79.3538201
	}
}

DwarfMoon	"5.D9"
{
	ParentBody     "5"
	Class          "Asteroid"
	Mass            2.9431e-09
	Radius          11.777
	InertiaMoment   0.39992
	Obliquity       176.28
	EqAscendNode    -101.8
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.516 0.476 0.418)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.75805
		Randomize      (0.867, -0.375, -0.821)
		colorDistMagn   0.55008
		colorDistFreq   0.10458
		detailScale     32
		snowLevel       2
		tropicLatitude  0.068949
		icecapLatitude  0.9049
		icecapHeight    0.07762
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3442
		heightTempGrad  0.625
		beachWidth      0.00098404
		tropicWidth     0.07
		mainFreq        0.4967
		venusFreq       0.57464
		venusMagn       0.50859
		mareDensity     0
		terraceProb     0.31653
		erosion         0
		montesMagn      0.43343
		montesFreq      3.5568
		montesSpiky     0.80698
		montesFraction  0.50873
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.33875
		hillsFraction   0.63712
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26223
		craterFreq      0.24334
		craterDensity   0.93597
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50465
		volcanoTemp     330.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.599
		BumpOffset      5.2995
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
		PeriodDays      159.882914
		SemiMajorAxisKm 1548886.59
		Eccentricity    0.200122069
		Inclination     176.284786
		AscendingNode   -101.803939
		ArgOfPericenter -110.587158
		MeanAnomaly     124.075063
	}
}

Planet	"6"
{
	ParentBody     "Asim"
	Class          "Jupiter"
	Mass            3829.3
	Radius          70296
	InertiaMoment   0.25081
	Oblateness      0.0074068
	RotationPeriod  8.2571
	RotationEpoch   0
	Obliquity       -27.513
	EqAscendNode    96.401

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_Class_I_a.cfg"
		SurfStyle       0.34637
		Randomize      (0.646, -0.875, -0.546)
		detailScale     256
		tropicLatitude  0.4672
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.6757
		stripeFluct     0.32509
		stripeTwist     12.114
		cycloneMagn     7.7015
		cycloneFreq     0.9349
		cycloneDensity  0.31569
		cycloneOctaves  5
		cycloneMagn2     0.78202
		cycloneFreq2     0.81368
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      3.5661
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.85352
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          13.211
		Velocity        -30.167
		BumpHeight      4.8217
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.85352
		ModulateBright  1
		mainFreq        1.4586
		mainOctaves     12
		Coverage        0.40385
		stripeZones     4.6757
		stripeFluct     0.32509
		stripeTwist     12.114
	}

	Clouds
	{
		Height          22.852
		Velocity        -62.86
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.85352
		ModulateBright  1
		Opacity         0.61549
		mainFreq        1.4586
		mainOctaves     12
		Coverage        0.40385
		stripeZones     4.6757
		stripeFluct     0.32509
		stripeTwist     12.114
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         7122.9
		Pressure        1e+06
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.0006093
		Saturation      0.91833

		Composition
		{
			H2        	90.91
			He        	6.0955
			CH4       	2.0625
			C8H18     	0.25705
			C3H8      	0.23837
			C2H2      	0.2361
			C2H4      	0.086804
			C2H6      	0.042931
			N2        	0.036269
			NH3       	0.024461
			O2        	0.0078393
			Ne        	0.0010209
			Ar        	0.00079545
			CO2       	0.00010585
			H2S       	1.3844e-06
			H2O       	1.1294e-06
			Kr        	4.0028e-07
			Xe        	3.8043e-08
			CO        	2.0923e-08
			SO2       	9.1108e-09
			Cl2       	3.1855e-10
		}
	}

	Aurora
	{
		Height         41.049
		NorthLat       87.629
		NorthLon       68.884
		NorthRadius    16195
		NorthWidth     8123.6
		NorthRings     5
		NorthBright    1
		NorthFlashFreq 69.337
		NorthMoveSpeed 0.99815
		NorthParticles 10000
		SouthLat       -86.586
		SouthLon       -113.93
		SouthRadius    16955
		SouthWidth     11894
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 76.182
		SouthMoveSpeed 1.0634
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     1.105e+05
		OuterRadius     1.9494e+05
		EdgeRadius      1.2477e+05
		MeanRadius      1.1525e+05
		Thickness       25
		ChartRadius     1.2477e+05
		RotationPeriod  1.8024
		FrontBright     0.50709
		BackBright      3.0722
		Density         0.85352
		Opacity         0.85352
		Brightness      1
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6934.8
		densityScale    1.97
		densityOffset   -1.4328
		densityPower    0.99824
		colorContrast   0.06309
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          18.008771
		SemiMajorAxis   7.55882265
		Eccentricity    0.0241630066
		Inclination     -4.98036916
		AscendingNode   90.853429
		ArgOfPericenter 185.270696
		MeanAnomaly     26.9500189
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            5.8148e-08
	Radius          33.443
	InertiaMoment   0.39661
	Oblateness     (0.290, 0.004, 0.000)
	Obliquity       -0.0015468
	EqAscendNode    165.01
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.485 0.477 0.472)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.51335
		Randomize      (0.777, 0.217, 0.425)
		colorDistMagn   0.19329
		colorDistFreq   0.28439
		detailScale     128
		snowLevel       2
		tropicLatitude  0.086814
		icecapLatitude  0.92217
		icecapHeight    0.057433
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40067
		heightTempGrad  0.625
		beachWidth      0.00088135
		tropicWidth     0.07
		mainFreq        0.6125
		venusFreq       0.6286
		venusMagn       0.57615
		mareDensity     0
		terraceProb     0.38578
		erosion         0
		montesMagn      0.48603
		montesFreq      3.4896
		montesSpiky     0.79927
		montesFraction  0.62004
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6191
		hillsFraction   0.45301
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2352
		craterFreq      0.27214
		craterDensity   0.92246
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47733
		volcanoTemp     200.95
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
		PeriodDays      0.367207095
		SemiMajorAxisKm 338890.701
		Eccentricity    3.41811093e-05
		Inclination     -0.00154675468
		AscendingNode   165.010406
		ArgOfPericenter -118.866805
		MeanAnomaly     -128.654339
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            7.9115e-08
	Radius          34.417
	InertiaMoment   0.39883
	Oblateness     (0.157, 0.011, 0.000)
	Obliquity       -0.98228
	EqAscendNode    37.713
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.665 0.659 0.655)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.08242
		Randomize      (-0.952, 0.047, 0.758)
		colorDistMagn   0.21539
		colorDistFreq   0.6813
		detailScale     128
		snowLevel       2
		tropicLatitude  0.088228
		icecapLatitude  0.90222
		icecapHeight    0.061093
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29838
		heightTempGrad  0.625
		beachWidth      0.0012292
		tropicWidth     0.07
		mainFreq        0.4502
		venusFreq       0.64979
		venusMagn       0.56842
		mareDensity     0
		terraceProb     0.13273
		erosion         0
		montesMagn      0.61567
		montesFreq      2.8105
		montesSpiky     0.97369
		montesFraction  0.7028
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4795
		hillsFraction   0.60254
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28024
		craterFreq      0.22296
		craterDensity   1.0828
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5227
		volcanoTemp     304.37
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
		PeriodDays      0.871196322
		SemiMajorAxisKm 602832
		Eccentricity    0.00512798829
		Inclination     -0.982283304
		AscendingNode   37.7129468
		ArgOfPericenter -98.5073086
		MeanAnomaly     -52.2362016
	}
}

Moon	"6.1"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            0.87549
	Radius          7134.5
	InertiaMoment   0.33386
	Oblateness      0.002003
	Obliquity       0.59422
	EqAscendNode    -166.13
	TidalLocked     true

	AlbedoBond      0.60062
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.444 0.441 0.438)

	Surface
	{
		Preset         "aquaria_arid_triton.cfg"
		SurfStyle       0.65149
		Randomize      (-0.682, -0.123, -0.909)
		colorDistMagn   0.048391
		colorDistFreq   700.05
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.14999
		snowLevel       2
		tropicLatitude  0.08758
		icecapLatitude  2
		icecapHeight    0.49629
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19609
		heightTempGrad  0.625
		beachWidth      0.0012771
		tropicWidth     0.07
		mainFreq        2.0281
		venusFreq       1.6327
		venusMagn       0
		mareFreq        1.688
		mareDensity     1.1531e-05
		terraceProb     0.25301
		erosion         0
		montesMagn      0.25306
		montesFreq      345.7
		montesSpiky     0.83228
		montesFraction  0.65438
		dunesMagn       0.04499
		dunesFreq       64.542
		dunesFraction   0.92794
		hillsMagn       0.10669
		hillsFreq       843.53
		hillsFraction   0.43351
		hills2Fraction  0.13504
		riversMagn      0
		riversFreq      2.8428
		riversSin       5.0461
		riftsMagn       0
		riftsFreq       2.2448
		riftsSin        5.8582
		canyonsMagn     0.46996
		canyonsFreq     1.7674
		canyonsFraction 0
		cracksMagn      0.06552
		cracksFreq      3.8985
		cracksOctaves   5
		craterMagn      0.68655
		craterFreq      22.656
		craterDensity   0.47541
		craterOctaves   12.445
		craterRayedFactor 0.055373
		volcanoMagn     0.64868
		volcanoFreq     0.57688
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.060068
		volcanoRadius   0.45411
		volcanoTemp     318.23
		lavaCoverTidal  0.14908
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.83552
		SpotBright      2.4589
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          40
		Density         0.029587
		Pressure        0.010965
		Greenhouse      1.1227
		Bright          6.4269
		Opacity         1
		SkyLight        2.1423
		Hue             0
		Saturation      1

		Composition
		{
			N2        	53.813
			CH4       	27.026
			C2H4      	8.9253
			CO2       	5.1469
			C2H6      	4.2296
			CO        	0.31574
			C2H2      	0.26184
			H2S       	0.16615
			C3H8      	0.069046
			NH3       	0.04165
			SO2       	0.0051392
			Ar        	9.1974e-05
			Ne        	1.7769e-05
		}
	}

	Aurora
	{
		Height         56
		NorthLat       53.494
		NorthLon       28.704
		NorthRadius    2198.5
		NorthWidth     571.84
		NorthRings     4
		NorthBright    0.38034
		NorthFlashFreq 77.995
		NorthMoveSpeed 0.76304
		NorthParticles 50000
		SouthLat       -55.358
		SouthLon       -167
		SouthRadius    2089.9
		SouthWidth     699.32
		SouthRings     3
		SouthBright    0.38034
		SouthFlashFreq 66.839
		SouthMoveSpeed 0.85954
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.63882583
		SemiMajorAxisKm 918700.409
		Eccentricity    0.00013930157
		Inclination     0.59422277
		AscendingNode   -166.129756
		ArgOfPericenter -107.835928
		MeanAnomaly     112.658619
	}
}

Moon	"6.2"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            0.28989
	Radius          5157.2
	InertiaMoment   0.33284
	Obliquity       -0.02125
	EqAscendNode    13.127
	TidalLocked     true

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.626 0.623 0.618)

	Surface
	{
		Preset         "aquaria_arid_pluto.cfg"
		SurfStyle       0.22056
		Randomize      (-0.411, -0.292, -0.576)
		colorDistMagn   0.045057
		colorDistFreq   585.26
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.18531
		snowLevel       0.85
		tropicLatitude  0.08681
		icecapLatitude  2
		icecapHeight    0.71023
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4938
		heightTempGrad  0.625
		beachWidth      0.0010249
		tropicWidth     0.07
		mainFreq        1.9248
		venusFreq       1.2939
		venusMagn       0
		mareFreq        1.3414
		mareDensity     0.12042
		terraceProb     0.4874
		erosion         0
		montesMagn      0.21856
		montesFreq      206.62
		montesSpiky     0.87169
		montesFraction  0.16493
		dunesMagn       0.036962
		dunesFreq       37.285
		dunesFraction   0.98532
		hillsMagn       0.11542
		hillsFreq       618.77
		hillsFraction   0.87436
		hills2Fraction  0.20869
		riversMagn      0
		riversFreq      1.5169
		riversSin       5.2818
		riftsMagn       0
		riftsFreq       1.6393
		riftsSin        5.0394
		canyonsMagn     0.47508
		canyonsFreq     1.9324
		canyonsFraction 0
		cracksMagn      0.073029
		cracksFreq      2.9283
		cracksOctaves   5
		craterMagn      0.59464
		craterFreq      9.7478
		craterDensity   0.051029
		craterOctaves   1.2136
		craterRayedFactor 0
		volcanoMagn     0.56271
		volcanoFreq     0.62052
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.26984
		volcanoRadius   0.51725
		volcanoTemp     319.77
		lavaCoverTidal  0.089078
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.0261
		stripeTwist     0.22335
		cycloneMagn     1.8496
		cycloneFreq     0.57309
		cycloneDensity  0.26828
		cycloneOctaves  3
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.5868
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          15.319
		Velocity        23.714
		BumpHeight      2.6596
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.71928
		mainOctaves     10
		Coverage        0.28435
		stripeZones     2.0261
		stripeTwist     0.22335
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          46.525
		Density         2.4292
		Pressure        0.64792
		Greenhouse      1.1297
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.015443
		Saturation      0.81888

		Composition
		{
			N2        	93.142
			CO        	6.8581
			CO2       	0.00013269
			Ar        	0.00012981
			Ne        	1.3454e-05
		}
	}

	Aurora
	{
		Height         65.135
		NorthLat       87.844
		NorthLon       -83.986
		NorthRadius    1217.9
		NorthWidth     314.17
		NorthRings     2
		NorthBright    0.3
		NorthFlashFreq 66.248
		NorthMoveSpeed 0.91894
		NorthParticles 50000
		SouthLat       -90
		SouthLon       98.04
		SouthRadius    1518.3
		SouthWidth     398.66
		SouthRings     5
		SouthBright    0.3
		SouthFlashFreq 74.315
		SouthMoveSpeed 1.1737
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.08341817
		SemiMajorAxisKm 1400075.71
		Eccentricity    0.000906793226
		Inclination     -0.0212500915
		AscendingNode   13.1266297
		ArgOfPericenter 19.3681752
		MeanAnomaly     -151.632055
	}
}

Moon	"6.3"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            4.2023
	Radius          10922
	InertiaMoment   0.33226
	Obliquity       -1.1008
	EqAscendNode    -29.059
	TidalLocked     true

	AlbedoBond      0.81998
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.499 0.352 0.307)

	Surface
	{
		Preset         "aquaria_arid_white.cfg"
		SurfStyle       0.78962
		Randomize      (-0.141, -0.462, -0.243)
		colorDistMagn   0.05208
		colorDistFreq   1038.1
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.26421
		snowLevel       0.85
		tropicLatitude  0.08862
		icecapLatitude  2
		icecapHeight    0.44669
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39151
		heightTempGrad  0.375
		beachWidth      0.0010728
		tropicWidth     0.5
		mainFreq        1.6038
		venusFreq       0.7131
		venusMagn       0
		mareFreq        1.6842
		mareDensity     0
		terraceProb     0.35762
		erosion         0
		montesMagn      0.17421
		montesFreq      628.78
		montesSpiky     0.76128
		montesFraction  0.89635
		dunesMagn       0.04567
		dunesFreq       97.148
		dunesFraction   0.52051
		hillsMagn       0.1361
		hillsFreq       1197.6
		hillsFraction   0.069457
		hills2Fraction  0.20521
		riversMagn      0
		riversFreq      3.723
		riversSin       7.1221
		riftsMagn       0
		riftsFreq       3.2381
		riftsSin        5.4621
		canyonsMagn     0.31583
		canyonsFreq     2.8271
		canyonsFraction 0
		cracksMagn      0.052773
		cracksFreq      6.0735
		cracksOctaves   6
		craterMagn      0.76546
		craterFreq      32.198
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.57184
		volcanoFreq     0.64372
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.30547
		volcanoRadius   0.48508
		volcanoTemp     295.1
		lavaCoverTidal  0.23424
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.3896
		stripeTwist     0.26449
		cycloneMagn     2.1179
		cycloneFreq     0.55455
		cycloneDensity  0.27403
		cycloneOctaves  2
		BumpHeight      16.725
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.593
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          16.248
		Velocity        59.232
		BumpHeight      3.9427
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.6511
		mainOctaves     10
		Coverage        1
		stripeZones     1.3896
		stripeTwist     0.26449
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          33.451
		Density         40.28
		Pressure        9.2946
		Greenhouse      5.3792
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.019758
		Saturation      1.7089

		Composition
		{
			N2        	96.148
			CO        	3.8512
			Ne        	0.00023511
			He        	7.8209e-05
			Ar        	2.2676e-05
		}
	}

	Aurora
	{
		Height         18.18
		NorthLat       82.213
		NorthLon       17.149
		NorthRadius    3277.1
		NorthWidth     1068.4
		NorthRings     4
		NorthBright    0.79459
		NorthFlashFreq 75.367
		NorthMoveSpeed 1.1748
		NorthParticles 50000
		SouthLat       -76.556
		SouthLon       -159.05
		SouthRadius    2691.8
		SouthWidth     703
		SouthRings     3
		SouthBright    0.79459
		SouthFlashFreq 73.328
		SouthMoveSpeed 1.0215
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      5.79798522
		SemiMajorAxisKm 2133679.25
		Eccentricity    0.00269246078
		Inclination     -1.10081739
		AscendingNode   -29.0586143
		ArgOfPericenter 162.089492
		MeanAnomaly     174.941414
	}
}

DwarfMoon	"6.4"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.0675e-06
	Radius          141.08
	InertiaMoment   0.39954
	Obliquity       -0.81657
	EqAscendNode    -167.99
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.589 0.583 0.580)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.35869
		Randomize      (0.129, -0.632, 0.090)
		colorDistMagn   0.29569
		colorDistFreq   10.154
		detailScale     512
		snowLevel       2
		tropicLatitude  0.087759
		icecapLatitude  0.81629
		icecapHeight    0.14743
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28921
		heightTempGrad  0.625
		beachWidth      0.0011206
		tropicWidth     0.07
		mainFreq        0.59036
		venusFreq       0.57886
		venusMagn       0.52953
		mareDensity     0
		terraceProb     0.262
		erosion         0
		montesMagn      0.53903
		montesFreq      2.8946
		montesSpiky     0.97251
		montesFraction  0.48319
		dunesFraction   0
		hillsMagn       0
		hillsFreq       46.326
		hillsFraction   0.68888
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22793
		craterFreq      0.77519
		craterDensity   0.90531
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42797
		volcanoTemp     228.03
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
		PeriodDays      10.9139435
		SemiMajorAxisKm 3251672.1
		Eccentricity    0.0444107718
		Inclination     -0.816569676
		AscendingNode   -167.994173
		ArgOfPericenter -92.5927661
		MeanAnomaly     -55.0402413
	}
}

Moon	"6.5"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            0.00087604
	Radius          723.82
	InertiaMoment   0.39941
	Obliquity       -0.90947
	EqAscendNode    -51.238
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.770 0.765 0.762)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.92776
		Randomize      (0.400, -0.802, 0.423)
		colorDistMagn   0.051509
		colorDistFreq   107.13
		detailScale     2048
		drivenDarkening 0.1986
		seaLevel        0.12789
		snowLevel       2
		tropicLatitude  0.088011
		icecapLatitude  0.88969
		icecapHeight    0.092616
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18692
		heightTempGrad  0.625
		beachWidth      0.0017685
		tropicWidth     0.07
		mainFreq        1.705
		venusFreq       0.96182
		venusMagn       0
		mareFreq        0.076581
		mareDensity     0.18699
		terraceProb     0.41422
		erosion         0
		montesMagn      0.061074
		montesFreq      34.895
		montesSpiky     0.89281
		montesFraction  0.94204
		dunesMagn       0.056085
		dunesFreq       7.6616
		dunesFraction   0.3592
		hillsMagn       0.11942
		hillsFreq       69.864
		hillsFraction   0.59087
		hills2Fraction  0.13789
		riversMagn      0
		riversFreq      3.688
		riversSin       5.7577
		riftsMagn       0
		riftsFreq       2.8822
		riftsSin        8.4204
		canyonsMagn     0.53908
		canyonsFreq     0.24674
		canyonsFraction 0
		cracksMagn      0.036474
		cracksFreq      0.39604
		cracksOctaves   0
		craterMagn      0.63322
		craterFreq      1.8368
		craterDensity   0.93965
		craterOctaves   18
		craterRayedFactor 0.20405
		volcanoMagn     0.18959
		volcanoFreq     0.69952
		volcanoDensity  0.22462
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.39654
		volcanoRadius   0.15083
		volcanoTemp     267.25
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
		PeriodDays      20.5327948
		SemiMajorAxisKm 4955464.35
		Eccentricity    0.00113903731
		Inclination     -0.909474024
		AscendingNode   -51.2379412
		ArgOfPericenter -166.163526
		MeanAnomaly     130.958291
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            5.5076e-07
	Radius          69.821
	InertiaMoment   0.39818
	RotationPeriod  2398.7
	RotationEpoch   0
	Obliquity       179.42
	EqAscendNode    16.306

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.553 0.547 0.540)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49683
		Randomize      (0.670, -0.972, 0.756)
		colorDistMagn   0.33213
		colorDistFreq   2.3254
		detailScale     256
		snowLevel       2
		tropicLatitude  0.087249
		icecapLatitude  0.77305
		icecapHeight    0.12921
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48463
		heightTempGrad  0.625
		beachWidth      0.0012163
		tropicWidth     0.07
		mainFreq        0.67672
		venusFreq       0.61062
		venusMagn       0.49931
		mareDensity     0
		terraceProb     0.15074
		erosion         0
		montesMagn      0.50995
		montesFreq      2.9354
		montesSpiky     0.89171
		montesFraction  0.62734
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.2522
		hillsFraction   0.56799
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23596
		craterFreq      0.26652
		craterDensity   0.84718
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53773
		volcanoTemp     294.87
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
		PeriodDays      328.850785
		SemiMajorAxisKm 31486051.2
		Eccentricity    0.129416961
		Inclination     182.81044
		AscendingNode   16.3934654
		ArgOfPericenter 85.4767319
		MeanAnomaly     137.916968
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            7.8208e-07
	Radius          71.43
	InertiaMoment   0.39957
	RotationPeriod  218.21
	RotationEpoch   0
	Obliquity       179.85
	EqAscendNode    107.75

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.730 0.728 0.726)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.065893
		Randomize      (0.940, 0.858, -0.911)
		colorDistMagn   0.34963
		colorDistFreq   3.9293
		detailScale     256
		snowLevel       2
		tropicLatitude  0.086814
		icecapLatitude  0.75125
		icecapHeight    0.11323
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38234
		heightTempGrad  0.625
		beachWidth      0.00096419
		tropicWidth     0.07
		mainFreq        0.50011
		venusFreq       0.62739
		venusMagn       0.47625
		mareDensity     0
		terraceProb     0.27112
		erosion         0
		montesMagn      0.69026
		montesFreq      3.9038
		montesSpiky     0.77825
		montesFraction  0.71209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.743
		hillsFraction   0.67234
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28887
		craterFreq      0.21982
		craterDensity   0.94566
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44241
		volcanoTemp     328.29
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
		PeriodDays      330.164434
		SemiMajorAxisKm 31569846.4
		Eccentricity    0.134154963
		Inclination     208.014266
		AscendingNode   102.49204
		ArgOfPericenter 31.9376092
		MeanAnomaly     -112.886507
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.1243e-06
	Radius          88.786
	InertiaMoment   0.39791
	RotationPeriod  1372.5
	RotationEpoch   0
	Obliquity       -39.251
	EqAscendNode    -64.406

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.513 0.507 0.505)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.63496
		Randomize      (-0.789, 0.688, -0.578)
		colorDistMagn   0.36671
		colorDistFreq   3.4888
		detailScale     256
		snowLevel       2
		tropicLatitude  0.63529
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
		humidity        0.28005
		heightTempGrad  0.625
		beachWidth      0.001012
		tropicWidth     0.07
		mainFreq        0.30682
		venusFreq       0.64812
		venusMagn       0.43457
		mareDensity     0
		terraceProb     0.43021
		erosion         0
		montesMagn      0.4817
		montesFreq      2.9759
		montesSpiky     0.97133
		montesFraction  0.8479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.162
		hillsFraction   0.81368
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24337
		craterFreq      0.20193
		craterDensity   0.75687
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49682
		volcanoTemp     291.7
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
		PeriodDays      331.530658
		SemiMajorAxisKm 31656877.3
		Eccentricity    0.480464522
		Inclination     -40.6657003
		AscendingNode   -66.1486748
		ArgOfPericenter 24.9820374
		MeanAnomaly     -37.8828435
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.6405e-06
	Radius          93.813
	InertiaMoment   0.3994
	RotationPeriod  191.72
	RotationEpoch   0
	Obliquity       171.48
	EqAscendNode    -130.1

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.693 0.689 0.687)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.20403
		Randomize      (-0.519, 0.518, -0.245)
		colorDistMagn   0.38341
		colorDistFreq   6.3839
		detailScale     256
		snowLevel       2
		tropicLatitude  0.17009
		icecapLatitude  0.7918
		icecapHeight    0.18421
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17775
		heightTempGrad  0.625
		beachWidth      0.0010599
		tropicWidth     0.07
		mainFreq        0.56935
		venusFreq       0.68533
		venusMagn       0.89375
		mareDensity     0
		terraceProb     0.15958
		erosion         0
		montesMagn      0.60768
		montesFreq      4.362
		montesSpiky     0.93598
		montesFraction  0.29533
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.359
		hillsFraction   0.54871
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21848
		craterFreq      0.31946
		craterDensity   0.88833
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54664
		volcanoTemp     325.12
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
		PeriodDays      332.719978
		SemiMajorAxisKm 31732541.9
		Eccentricity    0.205432544
		Inclination     209.905068
		AscendingNode   -132.89031
		ArgOfPericenter 175.11821
		MeanAnomaly     -38.7002838
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.4366e-06
	Radius          117.15
	InertiaMoment   0.39761
	RotationPeriod  2821.6
	RotationEpoch   0
	Obliquity       214.5
	EqAscendNode    169.38

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.477 0.470 0.466)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.7731
		Randomize      (-0.248, 0.348, 0.088)
		colorDistMagn   0.39976
		colorDistFreq   5.5719
		detailScale     512
		snowLevel       2
		tropicLatitude  0.57202
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
		humidity        0.47546
		heightTempGrad  0.625
		beachWidth      0.0014078
		tropicWidth     0.07
		mainFreq        0.40653
		venusFreq       0.52975
		venusMagn       0.84709
		mareDensity     0
		terraceProb     0.28039
		erosion         0
		montesMagn      0.45187
		montesFreq      3.0161
		montesSpiky     0.88965
		montesFraction  0.41009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       28.264
		hillsFraction   0.65632
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25129
		craterFreq      0.40271
		craterDensity   0.99577
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45318
		volcanoTemp     288.54
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
		PeriodDays      333.682739
		SemiMajorAxisKm 31793726.7
		Eccentricity    0.435887976
		Inclination     218.723351
		AscendingNode   169.949486
		ArgOfPericenter -59.328467
		MeanAnomaly     132.974065
	}
}

DwarfMoon	"6.D8"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.6985e-06
	Radius          124.31
	InertiaMoment   0.39923
	RotationPeriod  172.68
	RotationEpoch   0
	Obliquity       -19.1
	EqAscendNode    17.474

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.657 0.652 0.648)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.34216
		Randomize      (0.022, 0.178, 0.421)
		colorDistMagn   0.4158
		colorDistFreq   10.596
		detailScale     512
		snowLevel       2
		tropicLatitude  0.33617
		icecapLatitude  0.91514
		icecapHeight    0.052659
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37317
		heightTempGrad  0.625
		beachWidth      0.0011556
		tropicWidth     0.07
		mainFreq        0.64887
		venusFreq       0.55863
		venusMagn       0.8229
		mareDensity     0
		terraceProb     0.44782
		erosion         0
		montesMagn      0.56651
		montesFreq      2.0515
		montesSpiky     0.76245
		montesFraction  0.49036
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.544
		hillsFraction   0.78036
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22881
		craterFreq      0.59299
		craterDensity   0.82645
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50307
		volcanoTemp     391.95
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
		PeriodDays      334.269391
		SemiMajorAxisKm 31830980.5
		Eccentricity    0.177960489
		Inclination     -48.4862818
		AscendingNode   17.2704361
		ArgOfPericenter -104.61901
		MeanAnomaly     77.7124347
	}
}

DwarfMoon	"6.D9"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            5.7656e-06
	Radius          153.66
	InertiaMoment   0.39723
	RotationPeriod  384.07
	RotationEpoch   0
	Obliquity       0.30932
	EqAscendNode    -157.44

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.436 0.434 0.431)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91123
		Randomize      (0.292, 0.008, 0.754)
		colorDistMagn   0.43155
		colorDistFreq   8.6451
		detailScale     512
		snowLevel       2
		tropicLatitude  0.087061
		icecapLatitude  0.64467
		icecapHeight    0.18203
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27088
		heightTempGrad  0.625
		beachWidth      0.0015035
		tropicWidth     0.07
		mainFreq        0.48042
		venusFreq       0.57772
		venusMagn       0.80565
		mareDensity     0
		terraceProb     0.16835
		erosion         0
		montesMagn      0.41688
		montesFreq      3.0565
		montesSpiky     0.97014
		montesFraction  0.56175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       67.582
		hillsFraction   0.52709
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26167
		craterFreq      0.75063
		craterDensity   0.92751
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55737
		volcanoTemp     355.37
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
		PeriodDays      335.405731
		SemiMajorAxisKm 31903078.7
		Eccentricity    0.162263754
		Inclination     9.6378518
		AscendingNode   -158.346469
		ArgOfPericenter -43.722087
		MeanAnomaly     -91.5323523
	}
}

DwarfMoon	"6.D10"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.8379e-11
	Radius          2.1917
	InertiaMoment   0.39905
	RotationPeriod  1565.6
	RotationEpoch   0
	Obliquity       -0.78481
	EqAscendNode    -122.37

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.618 0.616 0.612)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4803
		Randomize      (0.563, -0.162, -0.913)
		colorDistMagn   0.44704
		colorDistFreq   0.003119
		detailScale     8
		snowLevel       2
		tropicLatitude  0.087679
		icecapLatitude  0.62392
		icecapHeight    0.1441
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16859
		heightTempGrad  0.625
		beachWidth      0.00065132
		tropicWidth     0.07
		mainFreq        0.26331
		venusFreq       0.59396
		venusMagn       0.79189
		mareDensity     0
		terraceProb     0.28983
		erosion         0
		montesMagn      0.53445
		montesFreq      2.2268
		montesSpiky     0.93458
		montesFraction  0.63473
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012211
		hillsFraction   0.64055
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23672
		craterFreq      0.26158
		craterDensity   0.66143
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46212
		volcanoTemp     388.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.9726
		BumpOffset      0.98628
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
		PeriodDays      336.306754
		SemiMajorAxisKm 31960188.7
		Eccentricity    0.0961976495
		Inclination     -17.2315406
		AscendingNode   -128.345703
		ArgOfPericenter -12.9376458
		MeanAnomaly     -106.376352
	}
}

DwarfMoon	"6.D11"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.5415e-11
	Radius          2.574
	InertiaMoment   0.39673
	RotationPeriod  1304.6
	RotationEpoch   0
	Obliquity       201.33
	EqAscendNode    -131.12

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.798 0.795 0.794)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.049366
		Randomize      (0.833, -0.332, -0.580)
		colorDistMagn   0.46229
		colorDistFreq   0.0021272
		detailScale     8
		snowLevel       2
		tropicLatitude  0.37372
		icecapLatitude  0.8886
		icecapHeight    0.011241
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46629
		heightTempGrad  0.625
		beachWidth      0.00039917
		tropicWidth     0.07
		mainFreq        0.54911
		venusFreq       0.60957
		venusMagn       0.78025
		mareDensity     0
		terraceProb     0.4676
		erosion         0
		montesMagn      0.36636
		montesFreq      3.0972
		montesSpiky     0.88753
		montesFraction  0.72175
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015232
		hillsFraction   0.75455
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19262
		craterFreq      0.21665
		craterDensity   0.87099
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50937
		volcanoTemp     212.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3166
		BumpOffset      1.1583
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
		PeriodDays      336.803703
		SemiMajorAxisKm 31991665.3
		Eccentricity    0.0479048362
		Inclination     189.399657
		AscendingNode   -133.919465
		ArgOfPericenter -35.9441994
		MeanAnomaly     147.409549
	}
}

DwarfMoon	"6.D12"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.312e-11
	Radius          3.5543
	InertiaMoment   0.39886
	Obliquity       151.72
	EqAscendNode    40.547
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.582 0.576 0.573)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.61843
		Randomize      (-0.896, -0.502, -0.247)
		colorDistMagn   0.47732
		colorDistFreq   0.0077686
		detailScale     16
		snowLevel       2
		tropicLatitude  0.47886
		icecapLatitude  0.97237
		icecapHeight    0.022013
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.364
		heightTempGrad  0.625
		beachWidth      0.00074703
		tropicWidth     0.07
		mainFreq        0.38228
		venusFreq       0.6262
		venusMagn       0.77005
		mareDensity     0
		terraceProb     0.17705
		erosion         0
		montesMagn      0.50565
		montesFreq      2.3391
		montesSpiky     0.73669
		montesFraction  0.87039
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0258
		hillsFraction   0.50164
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24412
		craterFreq      0.15348
		craterDensity   0.97168
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57171
		volcanoTemp     385.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.1989
		BumpOffset      1.5994
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
		PeriodDays      338.197217
		SemiMajorAxisKm 32079847.6
		Eccentricity    0.196367828
		Inclination     151.715315
		AscendingNode   40.5469823
		ArgOfPericenter 138.116497
		MeanAnomaly     -169.368503
	}
}

DwarfMoon	"6.D13"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.063e-10
	Radius          3.6941
	InertiaMoment   0.39582
	RotationPeriod  1049.3
	RotationEpoch   0
	Obliquity       -15.511
	EqAscendNode    -181.59

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.761 0.758 0.756)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.1875
		Randomize      (-0.626, -0.671, 0.086)
		colorDistMagn   0.49216
		colorDistFreq   0.003644
		detailScale     16
		snowLevel       2
		tropicLatitude  0.27902
		icecapLatitude  0.75116
		icecapHeight    0.16739
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26171
		heightTempGrad  0.625
		beachWidth      0.00079488
		tropicWidth     0.07
		mainFreq        0.62399
		venusFreq       0.6465
		venusMagn       0.76088
		mareDensity     0
		terraceProb     0.29948
		erosion         0
		montesMagn      0.66889
		montesFreq      3.1386
		montesSpiky     0.96895
		montesFraction  0.30997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.021938
		hillsFraction   0.62479
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21976
		craterFreq      0.22913
		craterDensity   0.80193
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46999
		volcanoTemp     139.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.3246
		BumpOffset      1.6623
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
		PeriodDays      339.283812
		SemiMajorAxisKm 32148523.8
		Eccentricity    0.367695833
		Inclination     -52.6463525
		AscendingNode   -178.409147
		ArgOfPericenter -179.343954
		MeanAnomaly     119.772821
	}
}

DwarfMoon	"6.D14"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.7149e-10
	Radius          4.7021
	InertiaMoment   0.39866
	Obliquity       133.19
	EqAscendNode    117.14
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.546 0.540 0.533)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.75657
		Randomize      (-0.356, -0.841, 0.419)
		colorDistMagn   0.50681
		colorDistFreq   0.012864
		detailScale     16
		snowLevel       2
		tropicLatitude  0.73066
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
		humidity        0.15942
		heightTempGrad  0.625
		beachWidth      0.0011427
		tropicWidth     0.07
		mainFreq        0.46033
		venusFreq       0.6812
		venusMagn       0.75249
		mareDensity     0
		terraceProb     0.4904
		erosion         0
		montesMagn      0.47733
		montesFreq      2.4254
		montesSpiky     0.93317
		montesFraction  0.41867
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.062721
		hillsFraction   0.73272
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25217
		craterFreq      0.18303
		craterDensity   0.91023
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51582
		volcanoTemp     242.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.2319
		BumpOffset      2.1159
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
		PeriodDays      339.814693
		SemiMajorAxisKm 32182050.5
		Eccentricity    0.45105443
		Inclination     133.186995
		AscendingNode   117.143409
		ArgOfPericenter 96.8618128
		MeanAnomaly     -22.8772221
	}
}

DwarfMoon	"6.D15"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.6753e-10
	Radius          5.101
	InertiaMoment   0.39993
	RotationPeriod  893.65
	RotationEpoch   0
	Obliquity       170.87
	EqAscendNode    -110.78

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.722 0.721 0.719)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.32564
		Randomize      (-0.085, 0.989, 0.752)
		colorDistMagn   0.5213
		colorDistFreq   0.0050811
		detailScale     16
		snowLevel       2
		tropicLatitude  0.17917
		icecapLatitude  0.60859
		icecapHeight    0.1762
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45713
		heightTempGrad  0.625
		beachWidth      0.00059059
		tropicWidth     0.07
		mainFreq        0.728
		venusFreq       0.52687
		venusMagn       0.7447
		mareDensity     0
		terraceProb     0.18572
		erosion         0
		montesMagn      0.60033
		montesFreq      3.1809
		montesSpiky     0.88537
		montesFraction  0.49745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.065739
		hillsFraction   0.46905
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22967
		craterFreq      0.24209
		craterDensity   1.0392
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59721
		volcanoTemp     205.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.5909
		BumpOffset      2.2954
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
		PeriodDays      341.384909
		SemiMajorAxisKm 32281112.2
		Eccentricity    0.401912579
		Inclination     207.703515
		AscendingNode   -109.434943
		ArgOfPericenter 106.803171
		MeanAnomaly     6.43492998
	}
}

DwarfMoon	"6.D16"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.0632e-10
	Radius          6.2254
	InertiaMoment   0.39845
	RotationPeriod  1003.2
	RotationEpoch   0
	Obliquity       182.01
	EqAscendNode    140.93

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.574 0.471 0.430)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.8947
		Randomize      (0.185, 0.819, -0.915)
		colorDistMagn   0.53564
		colorDistFreq   0.021289
		detailScale     16
		snowLevel       2
		tropicLatitude  0.094086
		icecapLatitude  0.50214
		icecapHeight    0.14237
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35483
		heightTempGrad  0.625
		beachWidth      0.00063844
		tropicWidth     0.07
		mainFreq        0.52933
		venusFreq       0.55715
		venusMagn       0.7374
		mareDensity     0
		terraceProb     0.30936
		erosion         0
		montesMagn      0.44701
		montesFreq      2.4972
		montesSpiky     0.99992
		montesFraction  0.56859
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.08854
		hillsFraction   0.6088
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26306
		craterFreq      0.19986
		craterDensity   0.85273
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47718
		volcanoTemp     239.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.6028
		BumpOffset      2.8014
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
		PeriodDays      342.203391
		SemiMajorAxisKm 32332688.3
		Eccentricity    0.0285339431
		Inclination     157.013243
		AscendingNode   137.261469
		ArgOfPericenter -138.817083
		MeanAnomaly     152.076332
	}
}

DwarfMoon	"6.D17"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.038e-10
	Radius          6.4374
	InertiaMoment   0.39976
	RotationPeriod  704.51
	RotationEpoch   0
	Obliquity       113.86
	EqAscendNode    -124.31

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.740 0.668 0.626)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46377
		Randomize      (0.455, 0.649, -0.582)
		colorDistMagn   0.54984
		colorDistFreq   0.0028825
		detailScale     16
		snowLevel       2
		tropicLatitude  0.91469
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
		humidity        0.25254
		heightTempGrad  0.625
		beachWidth      0.0009863
		tropicWidth     0.07
		mainFreq        0.35538
		venusFreq       0.57658
		venusMagn       0.73049
		mareDensity     0
		terraceProb     0.51777
		erosion         0
		montesMagn      0.56126
		montesFreq      3.2246
		montesSpiky     0.96776
		montesFraction  0.64225
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.083894
		hillsFraction   0.7133
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23747
		craterFreq      0.25711
		craterDensity   0.95117
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52255
		volcanoTemp     202.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.7936
		BumpOffset      2.8968
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
		PeriodDays      342.857002
		SemiMajorAxisKm 32373845.6
		Eccentricity    0.492682402
		Inclination     165.403328
		AscendingNode   -134.601911
		ArgOfPericenter -30.7538067
		MeanAnomaly     -1.30876721
	}
}

DwarfMoon	"6.D18"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            8.8133e-10
	Radius          8.432
	InertiaMoment   0.39822
	RotationPeriod  4127.8
	Obliquity       131.67
	EqAscendNode    92.292

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.564 0.453 0.365)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.032839
		Randomize      (0.726, 0.479, -0.249)
		colorDistMagn   0.56393
		colorDistFreq   0.036748
		detailScale     32
		snowLevel       2
		tropicLatitude  0.74835
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
		humidity        0.15025
		heightTempGrad  0.625
		beachWidth      0.0010342
		tropicWidth     0.07
		mainFreq        0.6011
		venusFreq       0.59292
		venusMagn       0.7239
		mareDensity     0
		terraceProb     0.19435
		erosion         0
		montesMagn      0.41068
		montesFreq      2.56
		montesSpiky     0.93174
		montesFraction  0.73182
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11049
		hillsFraction   0.41861
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20037
		craterFreq      0.21344
		craterDensity   0.76937
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40108
		volcanoTemp     306.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.5888
		BumpOffset      3.7944
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
		PeriodDays      343.985549
		SemiMajorAxisKm 32444847.8
		Eccentricity    0.323989855
		Inclination     131.671023
		AscendingNode   92.2920784
		ArgOfPericenter -46.1639457
		MeanAnomaly     116.857691
	}
}

DwarfMoon	"6.D19"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.2675e-09
	Radius          8.6749
	InertiaMoment   0.3996
	RotationPeriod  636.57
	RotationEpoch   0
	Obliquity       148.57
	EqAscendNode    -24.906

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.734 0.649 0.557)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60191
		Randomize      (0.996, 0.309, 0.084)
		colorDistMagn   0.57791
		colorDistFreq   0.062918
		detailScale     32
		snowLevel       2
		tropicLatitude  0.52555
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
		humidity        0.44796
		heightTempGrad  0.625
		beachWidth      0.00018201
		tropicWidth     0.07
		mainFreq        0.43957
		venusFreq       0.60852
		venusMagn       0.71758
		mareDensity     0
		terraceProb     0.31952
		erosion         0
		montesMagn      0.52994
		montesFreq      3.2701
		montesSpiky     0.88315
		montesFraction  0.89786
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.21166
		hillsFraction   0.5923
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24489
		craterFreq      0.27851
		craterDensity   0.89325
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48392
		volcanoTemp     199.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.8074
		BumpOffset      3.9037
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
		PeriodDays      345.201304
		SemiMajorAxisKm 32521249.8
		Eccentricity    0.308258123
		Inclination     132.978424
		AscendingNode   -18.3096139
		ArgOfPericenter -1.46762707
		MeanAnomaly     154.838932
	}
}

DwarfMoon	"6.D20"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.8003e-09
	Radius          10.8
	InertiaMoment   0.39796
	RotationPeriod  6213.3
	RotationEpoch   0
	Obliquity       -41.441
	EqAscendNode    -138.52

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.547 0.450 0.306)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.17097
		Randomize      (-0.733, 0.139, 0.417)
		colorDistMagn   0.59179
		colorDistFreq   0.05644
		detailScale     32
		snowLevel       2
		tropicLatitude  0.66408
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
		humidity        0.34567
		heightTempGrad  0.625
		beachWidth      0.0014299
		tropicWidth     0.07
		mainFreq        0.69203
		venusFreq       0.62502
		venusMagn       0.71147
		mareDensity     0
		terraceProb     0.55286
		erosion         0
		montesMagn      0.35508
		montesFreq      2.6165
		montesSpiky     0.99879
		montesFraction  0.32342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.29291
		hillsFraction   0.69545
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22097
		craterFreq      0.22598
		craterDensity   1.0038
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52971
		volcanoTemp     232.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.72
		BumpOffset      4.86
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
		PeriodDays      346.728665
		SemiMajorAxisKm 32617107.2
		Eccentricity    0.282524851
		Inclination     -42.1026246
		AscendingNode   -138.762939
		ArgOfPericenter -69.259044
		MeanAnomaly     -95.3639472
	}
}

DwarfMoon	"6.D21"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.5308e-09
	Radius          11.504
	InertiaMoment   0.39943
	RotationPeriod  1788.5
	RotationEpoch   0
	Obliquity       187.2
	EqAscendNode    156.02

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.654 0.586 0.562)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.74004
		Randomize      (-0.463, -0.031, 0.750)
		colorDistMagn   0.60559
		colorDistFreq   0.10324
		detailScale     32
		snowLevel       2
		tropicLatitude  0.15307
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
		humidity        0.24337
		heightTempGrad  0.625
		beachWidth      0.0011777
		tropicWidth     0.07
		mainFreq        0.50976
		venusFreq       0.64494
		venusMagn       0.70556
		mareDensity     0
		terraceProb     0.20298
		erosion         0
		montesMagn      0.50137
		montesFreq      3.3179
		montesSpiky     0.96656
		montesFraction  0.42701
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.30043
		hillsFraction   0.90401
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25308
		craterFreq      0.17764
		craterDensity   0.83273
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42759
		volcanoTemp     196.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.353
		BumpOffset      5.1767
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
		PeriodDays      347.868195
		SemiMajorAxisKm 32688532.6
		Eccentricity    0.183491818
		Inclination     163.707206
		AscendingNode   155.812104
		ArgOfPericenter 76.7559383
		MeanAnomaly     -133.349399
	}
}

DwarfMoon	"6.D22"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.5272e-09
	Radius          11.894
	InertiaMoment   0.39767
	RotationPeriod  461.35
	RotationEpoch   0
	Obliquity       231.26
	EqAscendNode    39.061

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.821 0.779 0.757)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30911
		Randomize      (-0.193, -0.201, -0.917)
		colorDistMagn   0.61932
		colorDistFreq   0.063629
		detailScale     32
		snowLevel       2
		tropicLatitude  0.78266
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
		humidity        0.14108
		heightTempGrad  0.625
		beachWidth      0.0012256
		tropicWidth     0.07
		mainFreq        0.32438
		venusFreq       0.67756
		venusMagn       0.6998
		mareDensity     0
		terraceProb     0.33
		erosion         0
		montesMagn      0.65326
		montesFreq      2.6684
		montesSpiky     0.9303
		montesFraction  0.50447
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28383
		hillsFraction   0.57497
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23051
		craterFreq      0.23871
		craterDensity   0.93264
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49038
		volcanoTemp     299.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.705
		BumpOffset      5.3524
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
		PeriodDays      349.098797
		SemiMajorAxisKm 32765578.8
		Eccentricity    0.0817512868
		Inclination     229.743054
		AscendingNode   37.5179216
		ArgOfPericenter -159.440759
		MeanAnomaly     43.4799331
	}
}

DwarfMoon	"6.D23"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.8809e-09
	Radius          14.629
	InertiaMoment   0.39926
	RotationPeriod  6738.7
	RotationEpoch   0
	Obliquity       168.16
	EqAscendNode    87.838

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.650 0.557 0.490)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87818
		Randomize      (0.078, -0.371, -0.584)
		colorDistMagn   0.63299
		colorDistFreq   0.15708
		detailScale     64
		snowLevel       2
		tropicLatitude  0.22094
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
		humidity        0.43879
		heightTempGrad  0.625
		beachWidth      0.00067343
		tropicWidth     0.07
		mainFreq        0.57959
		venusFreq       0.52371
		venusMagn       0.69417
		mareDensity     0
		terraceProb     0.6042
		erosion         0
		montesMagn      0.47291
		montesFreq      3.3689
		montesSpiky     0.88087
		montesFraction  0.57544
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.31832
		hillsFraction   0.67862
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26457
		craterFreq      0.19605
		craterDensity   0.70901
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53754
		volcanoTemp     263.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.166
		BumpOffset      6.5829
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
		PeriodDays      349.978249
		SemiMajorAxisKm 32820584.6
		Eccentricity    0.0535020613
		Inclination     167.052861
		AscendingNode   87.9061403
		ArgOfPericenter 93.1619042
		MeanAnomaly     53.2037237
	}
}

DwarfMoon	"6.D24"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.7147e-09
	Radius          14.09
	InertiaMoment   0.39731
	RotationPeriod  436.84
	RotationEpoch   0
	Obliquity       229.62
	EqAscendNode    47.797

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.806 0.751 0.696)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.44724
		Randomize      (0.348, -0.541, -0.251)
		colorDistMagn   0.64661
		colorDistFreq   0.08214
		detailScale     64
		snowLevel       2
		tropicLatitude  0.76472
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
		humidity        0.3365
		heightTempGrad  0.625
		beachWidth      0.0013213
		tropicWidth     0.07
		mainFreq        0.41778
		venusFreq       0.55564
		venusMagn       0.68865
		mareDensity     0
		terraceProb     0.21161
		erosion         0
		montesMagn      0.59349
		montesFreq      2.7171
		montesSpiky     0.99765
		montesFraction  0.6499
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.55387
		hillsFraction   0.83026
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23822
		craterFreq      0.25299
		craterDensity   0.87607
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44214
		volcanoTemp     296.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      12.681
		BumpOffset      6.3407
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
		PeriodDays      350.764283
		SemiMajorAxisKm 32869708.4
		Eccentricity    0.229438555
		Inclination     160.933256
		AscendingNode   44.0336153
		ArgOfPericenter -78.9024387
		MeanAnomaly     -141.430068
	}
}

DwarfMoon	"6.D25"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            9.1943e-09
	Radius          18.481
	InertiaMoment   0.39908
	RotationPeriod  1789.3
	RotationEpoch   0
	Obliquity       142.93
	EqAscendNode    -86.733

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.652 0.550 0.413)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.016311
		Randomize      (0.619, -0.711, 0.081)
		colorDistMagn   0.66019
		colorDistFreq   0.23688
		detailScale     64
		snowLevel       2
		tropicLatitude  0.60574
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
		humidity        0.23421
		heightTempGrad  0.625
		beachWidth      0.0010691
		tropicWidth     0.07
		mainFreq        0.66215
		venusFreq       0.57542
		venusMagn       0.68321
		mareDensity     0
		terraceProb     0.34084
		erosion         0
		montesMagn      0.44202
		montesFreq      3.424
		montesSpiky     0.96535
		montesFraction  0.74237
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.85257
		hillsFraction   0.55634
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20466
		craterFreq      0.21017
		craterDensity   0.97816
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49668
		volcanoTemp     260.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.633
		BumpOffset      8.3166
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
		PeriodDays      351.981877
		SemiMajorAxisKm 32945730.8
		Eccentricity    0.108352315
		Inclination     148.332138
		AscendingNode   -84.7331742
		ArgOfPericenter -107.836917
		MeanAnomaly     38.1508762
	}
}

DwarfMoon	"6.D26"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.2544e-08
	Radius          18.271
	InertiaMoment   0.39683
	RotationPeriod  405.74
	RotationEpoch   0
	Obliquity       181.52
	EqAscendNode    -92.312

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.797 0.739 0.630)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.58538
		Randomize      (0.889, -0.881, 0.414)
		colorDistMagn   0.67374
		colorDistFreq   0.12507
		detailScale     64
		snowLevel       2
		tropicLatitude  0.091146
		icecapLatitude  0.88554
		icecapHeight    0.050942
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13191
		heightTempGrad  0.625
		beachWidth      0.001117
		tropicWidth     0.07
		mainFreq        0.49016
		venusFreq       0.59187
		venusMagn       0.67784
		mareDensity     0
		terraceProb     0.72339
		erosion         0
		montesMagn      0.55617
		montesFreq      2.7631
		montesSpiky     0.92884
		montesFraction  0.9341
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.75304
		hillsFraction   0.66243
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24566
		craterFreq      0.27191
		craterDensity   0.80957
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54643
		volcanoTemp     363.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.444
		BumpOffset      8.222
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
		PeriodDays      353.03662
		SemiMajorAxisKm 33011514.3
		Eccentricity    0.291759419
		Inclination     198.834451
		AscendingNode   -93.5188038
		ArgOfPericenter -169.708956
		MeanAnomaly     58.1675765
	}
}

DwarfMoon	"6.D27"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.7068e-08
	Radius          22.172
	InertiaMoment   0.3989
	RotationPeriod  3455.5
	RotationEpoch   0
	Obliquity       194.15
	EqAscendNode    157.19

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.557 0.472 0.433)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15445
		Randomize      (-0.841, 0.950, 0.747)
		colorDistMagn   0.68727
		colorDistFreq   0.32276
		detailScale     64
		snowLevel       2
		tropicLatitude  0.25969
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
		humidity        0.42962
		heightTempGrad  0.625
		beachWidth      0.00026485
		tropicWidth     0.07
		mainFreq        0.28642
		venusFreq       0.60748
		venusMagn       0.67252
		mareDensity     0
		terraceProb     0.22026
		erosion         0
		montesMagn      0.4041
		montesFreq      3.4848
		montesSpiky     0.87853
		montesFraction  0.33592
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.97704
		hillsFraction   0.79195
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22211
		craterFreq      0.22285
		craterDensity   0.91517
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45297
		volcanoTemp     256.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.955
		BumpOffset      9.9774
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
		PeriodDays      354.564969
		SemiMajorAxisKm 33106720.3
		Eccentricity    0.0278026633
		Inclination     191.715275
		AscendingNode   157.557426
		ArgOfPericenter -33.2840796
		MeanAnomaly     159.236708
	}
}

DwarfMoon	"6.D28"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.3183e-08
	Radius          22.994
	InertiaMoment   0.39605
	RotationPeriod  364.92
	RotationEpoch   0
	Obliquity       -32.446
	EqAscendNode    48.769

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.728 0.665 0.624)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.72351
		Randomize      (-0.570, 0.780, -0.920)
		colorDistMagn   0.70079
		colorDistFreq   0.17493
		detailScale     64
		snowLevel       2
		tropicLatitude  0.54041
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
		humidity        0.32733
		heightTempGrad  0.625
		beachWidth      0.0012127
		tropicWidth     0.07
		mainFreq        0.55901
		venusFreq       0.62386
		venusMagn       0.66723
		mareDensity     0
		terraceProb     0.35212
		erosion         0
		montesMagn      0.5255
		montesFreq      2.8073
		montesSpiky     0.99652
		montesFraction  0.43514
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.73877
		hillsFraction   0.53575
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25402
		craterFreq      0.17136
		craterDensity   1.0535
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50293
		volcanoTemp     220.29
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
		PeriodDays      355.826093
		SemiMajorAxisKm 33185176.9
		Eccentricity    0.0406691767
		Inclination     -5.08803291
		AscendingNode   50.1274678
		ArgOfPericenter -164.889414
		MeanAnomaly     -131.626242
	}
}

DwarfMoon	"6.D29"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.1461e-08
	Radius          27.14
	InertiaMoment   0.3987
	RotationPeriod  1754.9
	RotationEpoch   0
	Obliquity       227.07
	EqAscendNode    28.314

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.462 0.457 0.453)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.29258
		Randomize      (-0.300, 0.610, -0.587)
		colorDistMagn   0.71432
		colorDistFreq   0.45805
		detailScale     128
		snowLevel       2
		tropicLatitude  0.73541
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
		humidity        0.22504
		heightTempGrad  0.625
		beachWidth      0.00096056
		tropicWidth     0.07
		mainFreq        0.39451
		venusFreq       0.64341
		venusMagn       0.66197
		mareDensity     0
		terraceProb     0.10721
		erosion         0
		montesMagn      0.34157
		montesFreq      3.5538
		montesSpiky     0.96415
		montesFraction  0.51143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0387
		hillsFraction   0.6466
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23134
		craterFreq      0.23541
		craterDensity   0.85815
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55711
		volcanoTemp     393.71
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
		PeriodDays      357.389276
		SemiMajorAxisKm 33282296.6
		Eccentricity    0.0670632516
		Inclination     210.837302
		AscendingNode   30.1169515
		ArgOfPericenter 9.12425456
		MeanAnomaly     143.669265
	}
}

DwarfMoon	"6.D30"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.2695e-08
	Radius          28.546
	InertiaMoment   0.39996
	RotationPeriod  343.82
	RotationEpoch   0
	Obliquity       128.47
	EqAscendNode    -80.529

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.642 0.639 0.634)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.86165
		Randomize      (-0.030, 0.440, -0.254)
		colorDistMagn   0.72785
		colorDistFreq   0.22744
		detailScale     128
		snowLevel       2
		tropicLatitude  0.78396
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
		humidity        0.12275
		heightTempGrad  0.625
		beachWidth      0.0013084
		tropicWidth     0.07
		mainFreq        0.63596
		venusFreq       0.67429
		venusMagn       0.65671
		mareDensity     0
		terraceProb     0.22895
		erosion         0
		montesMagn      0.49709
		montesFreq      2.8499
		montesSpiky     0.92737
		montesFraction  0.58233
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0218
		hillsFraction   0.76387
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26623
		craterFreq      0.19201
		craterDensity   0.95684
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46194
		volcanoTemp     217.12
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
		PeriodDays      358.04621
		SemiMajorAxisKm 33323069.3
		Eccentricity    0.179257943
		Inclination     164.724494
		AscendingNode   -81.4340738
		ArgOfPericenter -54.9982015
		MeanAnomaly     33.2580526
	}
}

DwarfMoon	"6.D31"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            5.7989e-08
	Radius          33.279
	InertiaMoment   0.39849
	Obliquity       172.69
	EqAscendNode    -11.629
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.425 0.421 0.414)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43072
		Randomize      (0.241, 0.270, 0.079)
		colorDistMagn   0.7414
		colorDistFreq   0.65181
		detailScale     128
		snowLevel       2
		tropicLatitude  0.15254
		icecapLatitude  0.8401
		icecapHeight    0.080459
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42045
		heightTempGrad  0.625
		beachWidth      0.0013563
		tropicWidth     0.07
		mainFreq        0.4703
		venusFreq       0.52023
		venusMagn       0.65144
		mareDensity     0
		terraceProb     0.36391
		erosion         0
		montesMagn      0.64067
		montesFreq      3.6353
		montesSpiky     0.87612
		montesFraction  0.65769
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4821
		hillsFraction   0.51202
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23896
		craterFreq      0.24913
		craterDensity   0.7801
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50923
		volcanoTemp     250.54
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
		PeriodDays      359.536446
		SemiMajorAxisKm 33415468.7
		Eccentricity    0.00022137526
		Inclination     172.692734
		AscendingNode   -11.6289069
		ArgOfPericenter 162.815361
		MeanAnomaly     -41.2175499
	}
}

DwarfMoon	"6.D32"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            7.8897e-08
	Radius          36.78
	InertiaMoment   0.39979
	RotationPeriod  1082.7
	RotationEpoch   0
	Obliquity       241.97
	EqAscendNode    -61.589

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.607 0.598 0.595)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99978
		Randomize      (0.511, 0.100, 0.412)
		colorDistMagn   0.75499
		colorDistFreq   0.28714
		detailScale     128
		snowLevel       2
		tropicLatitude  0.88422
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
		humidity        0.31816
		heightTempGrad  0.625
		beachWidth      0.0011041
		tropicWidth     0.07
		mainFreq        0.74944
		venusFreq       0.55409
		venusMagn       0.64615
		mareDensity     0
		terraceProb     0.11671
		erosion         0
		montesMagn      0.46845
		montesFreq      2.8915
		montesSpiky     0.99538
		montesFraction  0.75349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6624
		hillsFraction   0.63086
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20775
		craterFreq      0.20681
		craterDensity   0.89815
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57133
		volcanoTemp     283.96
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
		PeriodDays      360.252889
		SemiMajorAxisKm 33459845
		Eccentricity    0.437379652
		Inclination     226.410649
		AscendingNode   -63.1754163
		ArgOfPericenter 81.7560521
		MeanAnomaly     105.136587
	}
}

DwarfMoon	"6.D33"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.0763e-07
	Radius          37.654
	InertiaMoment   0.39827
	RotationPeriod  363.06
	RotationEpoch   0
	Obliquity       10.6
	EqAscendNode    -45.279

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.783 0.781 0.780)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.56885
		Randomize      (0.782, -0.070, 0.745)
		colorDistMagn   0.76861
		colorDistFreq   0.78826
		detailScale     128
		snowLevel       2
		tropicLatitude  0.20393
		icecapLatitude  0.84876
		icecapHeight    0.14975
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21587
		heightTempGrad  0.625
		beachWidth      0.001152
		tropicWidth     0.07
		mainFreq        0.53904
		venusFreq       0.57425
		venusMagn       0.64082
		mareDensity     0
		terraceProb     0.2377
		erosion         0
		montesMagn      0.58706
		montesFreq      3.7386
		montesSpiky     0.96293
		montesFraction  0.11679
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7665
		hillsFraction   0.74075
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24644
		craterFreq      0.26633
		craterDensity   1.0126
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46983
		volcanoTemp     247.37
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
		PeriodDays      361.831439
		SemiMajorAxisKm 33557516.2
		Eccentricity    0.108626655
		Inclination     22.4743918
		AscendingNode   -35.4332328
		ArgOfPericenter 35.5503077
		MeanAnomaly     103.091219
	}
}

DwarfMoon	"6.D34"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.4735e-07
	Radius          46.409
	InertiaMoment   0.39963
	RotationPeriod  646.96
	RotationEpoch   0
	Obliquity       278.64
	EqAscendNode    -79.233

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.567 0.563 0.559)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13792
		Randomize      (-0.948, -0.240, -0.922)
		colorDistMagn   0.78229
		colorDistFreq   0.22689
		detailScale     128
		snowLevel       2
		tropicLatitude  0.98855
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
		humidity        0.11358
		heightTempGrad  0.625
		beachWidth      0.00089983
		tropicWidth     0.07
		mainFreq        0.36905
		venusFreq       0.59083
		venusMagn       0.63544
		mareDensity     0
		terraceProb     0.37629
		erosion         0
		montesMagn      0.43688
		montesFreq      2.9324
		montesSpiky     0.92589
		montesFraction  0.34764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.9158
		hillsFraction   0.48279
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22319
		craterFreq      0.2197
		craterDensity   0.83876
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51567
		volcanoTemp     280.79
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
		PeriodDays      363.226555
		SemiMajorAxisKm 33643719.5
		Eccentricity    0.32928034
		Inclination     199.403979
		AscendingNode   -75.8466936
		ArgOfPericenter -96.0235537
		MeanAnomaly     127.38261
	}
}

DwarfMoon	"6.D35"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.0268e-07
	Radius          46.686
	InertiaMoment   0.39801
	RotationPeriod  351.53
	RotationEpoch   0
	Obliquity       205.88
	EqAscendNode    72.418

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.747 0.744 0.742)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70699
		Randomize      (-0.678, -0.410, -0.589)
		colorDistMagn   0.79602
		colorDistFreq   1.1411
		detailScale     128
		snowLevel       2
		tropicLatitude  0.44457
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
		humidity        0.41129
		heightTempGrad  0.625
		beachWidth      0.0015477
		tropicWidth     0.07
		mainFreq        0.61218
		venusFreq       0.60643
		venusMagn       0.62998
		mareDensity     0
		terraceProb     0.12603
		erosion         0
		montesMagn      0.55123
		montesFreq      3.8889
		montesSpiky     0.87363
		montesFraction  0.44309
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.3755
		hillsFraction   0.61499
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25498
		craterFreq      0.16361
		craterDensity   0.93785
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59633
		volcanoTemp     314.21
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
		PeriodDays      364.793509
		SemiMajorAxisKm 33740409.1
		Eccentricity    0.334336528
		Inclination     189.976364
		AscendingNode   70.7783179
		ArgOfPericenter -155.596417
		MeanAnomaly     -155.415509
	}
}

DwarfMoon	"6.D36"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.8041e-07
	Radius          57.216
	InertiaMoment   0.39946
	RotationPeriod  629.55
	RotationEpoch   0
	Obliquity       205.89
	EqAscendNode    -13.77

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.531 0.527 0.520)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.27605
		Randomize      (-0.407, -0.580, -0.256)
		colorDistMagn   0.80983
		colorDistFreq   2.7807
		detailScale     256
		snowLevel       2
		tropicLatitude  0.44478
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
		humidity        0.30899
		heightTempGrad  0.625
		beachWidth      0.00069554
		tropicWidth     0.07
		mainFreq        0.44991
		venusFreq       0.62271
		venusMagn       0.62443
		mareDensity     0
		terraceProb     0.24651
		erosion         0
		montesMagn      0.39709
		montesFreq      2.9728
		montesSpiky     0.99424
		montesFraction  0.51835
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.2887
		hillsFraction   0.72054
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23215
		craterFreq      0.23219
		craterDensity   0.73316
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47703
		volcanoTemp     347.62
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
		PeriodDays      365.570568
		SemiMajorAxisKm 33788306.5
		Eccentricity    0.244223649
		Inclination     225.7157
		AscendingNode   -15.9053679
		ArgOfPericenter 41.5461512
		MeanAnomaly     -37.5962653
	}
}

DwarfMoon	"6.D37"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.907e-07
	Radius          55.48
	InertiaMoment   0.39773
	RotationPeriod  211.79
	RotationEpoch   0
	Obliquity       1.2765
	EqAscendNode    -117.54

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.710 0.705 0.703)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84512
		Randomize      (-0.137, -0.750, 0.077)
		colorDistMagn   0.82373
		colorDistFreq   1.5104
		detailScale     256
		snowLevel       2
		tropicLatitude  0.089926
		icecapLatitude  0.6493
		icecapHeight    0.15427
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2067
		heightTempGrad  0.625
		beachWidth      0.0010434
		tropicWidth     0.07
		mainFreq        0.70877
		venusFreq       0.64193
		venusMagn       0.61877
		mareDensity     0
		terraceProb     0.38939
		erosion         0
		montesMagn      0.5211
		montesFreq      4.2676
		montesSpiky     0.96171
		montesFraction  0.58925
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.9965
		hillsFraction   0.44171
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26811
		craterFreq      0.18764
		craterDensity   0.88108
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52239
		volcanoTemp     311.04
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
		PeriodDays      367.167864
		SemiMajorAxisKm 33886656.3
		Eccentricity    0.232445246
		Inclination     -6.12876356
		AscendingNode   -121.593686
		ArgOfPericenter -62.0045044
		MeanAnomaly     -44.9372325
	}
}

DwarfMoon	"6.D38"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            5.4906e-07
	Radius          73.712
	InertiaMoment   0.39929
	RotationPeriod  599.08
	RotationEpoch   0
	Obliquity       162.58
	EqAscendNode    174.25

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.490 0.487 0.485)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.41419
		Randomize      (0.134, -0.920, 0.410)
		colorDistMagn   0.83772
		colorDistFreq   4.2957
		detailScale     256
		snowLevel       2
		tropicLatitude  0.30941
		icecapLatitude  0.84741
		icecapHeight    0.040639
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10441
		heightTempGrad  0.625
		beachWidth      0.00079125
		tropicWidth     0.07
		mainFreq        0.51939
		venusFreq       0.67131
		venusMagn       0.61297
		mareDensity     0
		terraceProb     0.13519
		erosion         0
		montesMagn      0.32434
		montesFreq      3.0131
		montesSpiky     0.92438
		montesFraction  0.66566
		dunesFraction   0
		hillsMagn       0
		hillsFreq       19.251
		hillsFraction   0.59872
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23971
		craterFreq      0.24547
		craterDensity   0.985
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40009
		volcanoTemp     274.46
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
		PeriodDays      367.749474
		SemiMajorAxisKm 33922432.2
		Eccentricity    0.289851739
		Inclination     215.483766
		AscendingNode   170.621891
		ArgOfPericenter -78.5427517
		MeanAnomaly     127.74986
	}
}

DwarfMoon	"6.D39"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            7.796e-07
	Radius          71.391
	InertiaMoment   0.39738
	RotationPeriod  195.24
	RotationEpoch   0
	Obliquity       230.53
	EqAscendNode    -27.668

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.671 0.669 0.667)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98326
		Randomize      (0.404, 0.910, 0.743)
		colorDistMagn   0.85182
		colorDistFreq   2.3285
		detailScale     256
		snowLevel       2
		tropicLatitude  0.77475
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
		humidity        0.40212
		heightTempGrad  0.625
		beachWidth      0.0014391
		tropicWidth     0.07
		mainFreq        0.34031
		venusFreq       0.5163
		venusMagn       0.60701
		mareDensity     0
		terraceProb     0.25542
		erosion         0
		montesMagn      0.49281
		montesFreq      2.0327
		montesSpiky     0.87106
		montesFraction  0.76528
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.896
		hillsFraction   0.70216
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21023
		craterFreq      0.20334
		craterDensity   0.81672
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48378
		volcanoTemp     237.88
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
		PeriodDays      368.427459
		SemiMajorAxisKm 33964112.4
		Eccentricity    0.276919571
		Inclination     193.60215
		AscendingNode   -24.2128013
		ArgOfPericenter 63.2085459
		MeanAnomaly     -8.1738044
	}
}

DwarfMoon	"6.D40"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.1206e-06
	Radius          87.172
	InertiaMoment   0.39911
	RotationPeriod  216.58
	RotationEpoch   0
	Obliquity       189.3
	EqAscendNode    164.6

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.454 0.450 0.446)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.55232
		Randomize      (0.674, 0.740, -0.924)
		colorDistMagn   0.86604
		colorDistFreq   5.6453
		detailScale     256
		snowLevel       2
		tropicLatitude  0.18409
		icecapLatitude  0.67937
		icecapHeight    0.23041
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29983
		heightTempGrad  0.625
		beachWidth      0.001187
		tropicWidth     0.07
		mainFreq        0.59005
		venusFreq       0.5525
		venusMagn       0.60086
		mareDensity     0
		terraceProb     0.40335
		erosion         0
		montesMagn      0.62998
		montesFreq      3.0534
		montesSpiky     0.9931
		montesFraction  0.17009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.629
		hillsFraction   0.34971
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24723
		craterFreq      0.31038
		craterDensity   0.92015
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52955
		volcanoTemp     271.29
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
		PeriodDays      369.296196
		SemiMajorAxisKm 34017482.1
		Eccentricity    0.331028108
		Inclination     157.850683
		AscendingNode   166.860186
		ArgOfPericenter 74.9198919
		MeanAnomaly     156.67734
	}
}

DwarfMoon	"6.D41"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.6348e-06
	Radius          97.181
	InertiaMoment   0.39693
	RotationPeriod  174.87
	RotationEpoch   0
	Obliquity       108.55
	EqAscendNode    29.978

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.635 0.632 0.627)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12139
		Randomize      (0.945, 0.570, -0.591)
		colorDistMagn   0.8804
		colorDistFreq   3.9788
		detailScale     256
		snowLevel       2
		tropicLatitude  0.94802
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
		humidity        0.19753
		heightTempGrad  0.625
		beachWidth      0.00063481
		tropicWidth     0.07
		mainFreq        0.42868
		venusFreq       0.57306
		venusMagn       0.59447
		mareDensity     0
		terraceProb     0.14421
		erosion         0
		montesMagn      0.46391
		montesFreq      2.2168
		montesSpiky     0.96049
		montesFraction  0.3587
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.888
		hillsFraction   0.58175
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22423
		craterFreq      0.31953
		craterDensity   1.0719
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4272
		volcanoTemp     304.71
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
		PeriodDays      370.19394
		SemiMajorAxisKm 34072589.9
		Eccentricity    0.0548345428
		Inclination     160.191984
		AscendingNode   36.0987704
		ArgOfPericenter -16.2625092
		MeanAnomaly     150.732671
	}
}

DwarfMoon	"6.D42"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.4278e-06
	Radius          115.32
	InertiaMoment   0.39893
	RotationPeriod  434.31
	RotationEpoch   0
	Obliquity       240.56
	EqAscendNode    181.21

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.417 0.414 0.407)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.69046
		Randomize      (-0.785, 0.401, -0.258)
		colorDistMagn   0.8949
		colorDistFreq   9.3279
		detailScale     512
		snowLevel       2
		tropicLatitude  0.87252
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
		humidity        0.49524
		heightTempGrad  0.625
		beachWidth      0.0012827
		tropicWidth     0.07
		mainFreq        0.67631
		venusFreq       0.58977
		venusMagn       0.58781
		mareDensity     0
		terraceProb     0.26445
		erosion         0
		montesMagn      0.58097
		montesFreq      3.0941
		montesSpiky     0.92286
		montesFraction  0.45087
		dunesFraction   0
		hillsMagn       0
		hillsFreq       25.63
		hillsFraction   0.68499
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25599
		craterFreq      0.31789
		craterDensity   0.86344
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49024
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
		PeriodDays      370.877877
		SemiMajorAxisKm 34114543.3
		Eccentricity    0.00765891012
		Inclination     223.100688
		AscendingNode   177.411759
		ArgOfPericenter -92.6981919
		MeanAnomaly     -166.738486
	}
}

DwarfMoon	"6.D43"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.6843e-06
	Radius          136.43
	InertiaMoment   0.39624
	RotationPeriod  471.03
	RotationEpoch   0
	Obliquity       203.33
	EqAscendNode    -121.46

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.599 0.592 0.588)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25953
		Randomize      (-0.515, 0.231, 0.075)
		colorDistMagn   0.90958
		colorDistFreq   7.1278
		detailScale     512
		snowLevel       2
		tropicLatitude  0.40512
		icecapLatitude  0.8363
		icecapHeight    0.059587
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39295
		heightTempGrad  0.625
		beachWidth      0.0010305
		tropicWidth     0.07
		mainFreq        0.49984
		venusFreq       0.60539
		venusMagn       0.58081
		mareDensity     0
		terraceProb     0.41839
		erosion         0
		montesMagn      0.43156
		montesFreq      2.3318
		montesSpiky     0.86841
		montesFraction  0.52524
		dunesFraction   0
		hillsMagn       0
		hillsFreq       62.037
		hillsFraction   0.85084
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23294
		craterFreq      0.66601
		craterDensity   0.9627
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53736
		volcanoTemp     301.54
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
		PeriodDays      371.516604
		SemiMajorAxisKm 34153700.2
		Eccentricity    0.0631979338
		Inclination     192.622677
		AscendingNode   -122.149474
		ArgOfPericenter 11.4726309
		MeanAnomaly     31.3613352
	}
}

DwarfMoon	"6.D44"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            5.742e-06
	Radius          141.67
	InertiaMoment   0.39874
	RotationPeriod  170.53
	RotationEpoch   0
	Obliquity       255.52
	EqAscendNode    35.645

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.776 0.774 0.773)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.82859
		Randomize      (-0.244, 0.061, 0.408)
		colorDistMagn   0.92443
		colorDistFreq   13.325
		detailScale     512
		snowLevel       2
		tropicLatitude  0.96879
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
		humidity        0.29066
		heightTempGrad  0.625
		beachWidth      0.0010784
		tropicWidth     0.07
		mainFreq        0.30629
		venusFreq       0.62157
		venusMagn       0.57339
		mareDensity     0
		terraceProb     0.15313
		erosion         0
		montesMagn      0.54641
		montesFreq      3.1354
		montesSpiky     0.99196
		montesFraction  0.59623
		dunesFraction   0
		hillsMagn       0
		hillsFreq       54.328
		hillsFraction   0.56369
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27026
		craterFreq      0.57338
		craterDensity   0.78961
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44188
		volcanoTemp     334.96
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
		PeriodDays      372.369302
		SemiMajorAxisKm 34205939.5
		Eccentricity    0.0755199398
		Inclination     203.998293
		AscendingNode   33.3870375
		ArgOfPericenter -140.295854
		MeanAnomaly     83.6206934
	}
}

DwarfMoon	"6.D45"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.8263e-11
	Radius          2.2911
	InertiaMoment   0.39999
	RotationPeriod  4486.6
	Obliquity       -53.425
	EqAscendNode    -144.19

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.559 0.556 0.553)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39766
		Randomize      (0.026, -0.109, 0.741)
		colorDistMagn   0.93949
		colorDistFreq   0.0017864
		detailScale     8
		snowLevel       2
		tropicLatitude  0.80398
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
		humidity        0.18837
		heightTempGrad  0.625
		beachWidth      0.00052623
		tropicWidth     0.07
		mainFreq        0.56906
		venusFreq       0.64048
		venusMagn       0.56547
		mareDensity     0
		terraceProb     0.2736
		erosion         0
		montesMagn      0.38953
		montesFreq      2.4195
		montesSpiky     0.95926
		montesFraction  0.67381
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012792
		hillsFraction   0.66859
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24045
		craterFreq      0.24196
		craterDensity   0.90305
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49655
		volcanoTemp     298.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.062
		BumpOffset      1.031
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
		PeriodDays      373.879276
		SemiMajorAxisKm 34298348.2
		Eccentricity    0.244216172
		Inclination     -53.4254113
		AscendingNode   -144.193261
		ArgOfPericenter 132.89103
		MeanAnomaly     -122.510814
	}
}

DwarfMoon	"6.D46"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.5222e-11
	Radius          2.4833
	InertiaMoment   0.39853
	RotationPeriod  1685
	RotationEpoch   0
	Obliquity       192.44
	EqAscendNode    -54.051

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.739 0.737 0.735)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.96673
		Randomize      (0.297, -0.279, -0.926)
		colorDistMagn   0.95477
		colorDistFreq   0.0038777
		detailScale     8
		snowLevel       2
		tropicLatitude  0.23259
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
		humidity        0.48607
		heightTempGrad  0.625
		beachWidth      0.00087409
		tropicWidth     0.07
		mainFreq        0.4062
		venusFreq       0.66857
		venusMagn       0.5569
		mareDensity     0
		terraceProb     0.43477
		erosion         0
		montesMagn      0.51674
		montesFreq      3.1777
		montesSpiky     0.92132
		montesFraction  0.77787
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.013547
		hillsFraction   0.80495
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21231
		craterFreq      0.19972
		craterDensity   1.0224
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54623
		volcanoTemp     401.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.235
		BumpOffset      1.1175
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
		PeriodDays      374.463816
		SemiMajorAxisKm 34334087.9
		Eccentricity    0.0863937894
		Inclination     190.213098
		AscendingNode   -46.733759
		ArgOfPericenter -148.370228
		MeanAnomaly     94.8641124
	}
}

DwarfMoon	"6.D47"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.2813e-11
	Radius          3.5651
	InertiaMoment   0.39982
	RotationPeriod  3604.9
	Obliquity       203.07
	EqAscendNode    112.41

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.523 0.520 0.513)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5358
		Randomize      (0.567, -0.449, -0.593)
		colorDistMagn   0.97028
		colorDistFreq   0.0036934
		detailScale     16
		snowLevel       2
		tropicLatitude  0.401
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
		humidity        0.38378
		heightTempGrad  0.625
		beachWidth      0.0012219
		tropicWidth     0.07
		mainFreq        0.6485
		venusFreq       0.51178
		venusMagn       0.5475
		mareDensity     0
		terraceProb     0.16195
		erosion         0
		montesMagn      0.29938
		montesFreq      2.4922
		montesSpiky     0.86566
		montesFraction  0.20516
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.024222
		hillsFraction   0.54395
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24803
		craterFreq      0.25695
		craterDensity   0.84457
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45276
		volcanoTemp     155.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.2086
		BumpOffset      1.6043
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
		PeriodDays      375.505498
		SemiMajorAxisKm 34397732.1
		Eccentricity    0.384943898
		Inclination     203.065377
		AscendingNode   112.407162
		ArgOfPericenter -45.7619595
		MeanAnomaly     16.7984436
	}
}

DwarfMoon	"6.D48"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.0583e-10
	Radius          3.8283
	InertiaMoment   0.39831
	RotationPeriod  1284.9
	RotationEpoch   0
	Obliquity       119.79
	EqAscendNode    49.816

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.703 0.698 0.696)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.10486
		Randomize      (0.837, -0.619, -0.260)
		colorDistMagn   0.98607
		colorDistFreq   0.0087244
		detailScale     16
		snowLevel       2
		tropicLatitude  0.86825
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
		humidity        0.28149
		heightTempGrad  0.625
		beachWidth      0.00066979
		tropicWidth     0.07
		mainFreq        0.48014
		venusFreq       0.55085
		venusMagn       0.53699
		mareDensity     0
		terraceProb     0.28291
		erosion         0
		montesMagn      0.48851
		montesFreq      3.2213
		montesSpiky     0.99082
		montesFraction  0.3692
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.047318
		hillsFraction   0.65265
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22523
		craterFreq      0.21332
		craterDensity   0.94317
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5028
		volcanoTemp     258.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.4455
		BumpOffset      1.7228
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
		PeriodDays      376.822285
		SemiMajorAxisKm 34478100.3
		Eccentricity    0.0575937448
		Inclination     158.534754
		AscendingNode   52.3013779
		ArgOfPericenter 127.523383
		MeanAnomaly     35.9806687
	}
}

DwarfMoon	"6.D49"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.7079e-10
	Radius          4.7898
	InertiaMoment   0.39966
	Obliquity       151.67
	EqAscendNode    87.773
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.487 0.479 0.474)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67393
		Randomize      (-0.892, -0.789, 0.073)
		colorDistMagn   0.0047291
		colorDistFreq   0.0052272
		detailScale     16
		snowLevel       2
		tropicLatitude  0.47956
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
		humidity        0.1792
		heightTempGrad  0.625
		beachWidth      0.00041765
		tropicWidth     0.07
		mainFreq        0.26259
		venusFreq       0.57186
		venusMagn       0.5249
		mareDensity     0
		terraceProb     0.4529
		erosion         0
		montesMagn      0.6206
		montesFreq      2.5556
		montesSpiky     0.95802
		montesFraction  0.4585
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.061666
		hillsFraction   0.7739
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25703
		craterFreq      0.27823
		craterDensity   0.75028
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55685
		volcanoTemp     292.04
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.3108
		BumpOffset      2.1554
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
		PeriodDays      378.1093
		SemiMajorAxisKm 34556561
		Eccentricity    0.108307201
		Inclination     151.668766
		AscendingNode   87.7725404
		ArgOfPericenter -103.983999
		MeanAnomaly     152.815158
	}
}

DwarfMoon	"6.D50"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.665e-10
	Radius          5.2867
	InertiaMoment   0.39806
	RotationPeriod  1430.7
	RotationEpoch   0
	Obliquity       188.76
	EqAscendNode    117.09

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.664 0.662 0.660)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.243
		Randomize      (-0.622, -0.959, 0.406)
		colorDistMagn   0.038657
		colorDistFreq   0.015724
		detailScale     16
		snowLevel       2
		tropicLatitude  0.17598
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
		humidity        0.47691
		heightTempGrad  0.625
		beachWidth      0.0007655
		tropicWidth     0.07
		mainFreq        0.54883
		venusFreq       0.58872
		venusMagn       0.51043
		mareDensity     0
		terraceProb     0.1707
		erosion         0
		montesMagn      0.45931
		montesFreq      3.2666
		montesSpiky     0.91976
		montesFraction  0.53209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.067705
		hillsFraction   0.52161
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23373
		craterFreq      0.22587
		craterDensity   0.88605
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46176
		volcanoTemp     255.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.758
		BumpOffset      2.379
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
		PeriodDays      378.972653
		SemiMajorAxisKm 34609144
		Eccentricity    0.49327826
		Inclination     147.071011
		AscendingNode   117.524474
		ArgOfPericenter -39.7496206
		MeanAnomaly     -49.6166082
	}
}

DwarfMoon	"6.D51"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.0484e-10
	Radius          6.4667
	InertiaMoment   0.39949
	RotationPeriod  3645.4
	Obliquity       186.65
	EqAscendNode    66.977

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.446 0.443 0.440)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.81207
		Randomize      (-0.351, 0.871, 0.739)
		colorDistMagn   0.069786
		colorDistFreq   0.0055977
		detailScale     16
		snowLevel       2
		tropicLatitude  0.14541
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
		humidity        0.37461
		heightTempGrad  0.625
		beachWidth      0.00051336
		tropicWidth     0.07
		mainFreq        0.38192
		venusFreq       0.60436
		venusMagn       0.49191
		mareDensity     0
		terraceProb     0.29241
		erosion         0
		montesMagn      0.57516
		montesFreq      2.6124
		montesSpiky     0.86281
		montesFraction  0.60325
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.091234
		hillsFraction   0.63691
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27284
		craterFreq      0.17742
		craterDensity   0.99226
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50909
		volcanoTemp     288.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.82
		BumpOffset      2.91
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
		PeriodDays      379.727672
		SemiMajorAxisKm 34655096.1
		Eccentricity    0.373430282
		Inclination     186.650185
		AscendingNode   66.9765516
		ArgOfPericenter 178.051228
		MeanAnomaly     149.489622
	}
}

DwarfMoon	"6.D52"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.0172e-10
	Radius          6.8584
	InertiaMoment   0.39778
	RotationPeriod  657.63
	RotationEpoch   0
	Obliquity       234.15
	EqAscendNode    -159.08

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.628 0.625 0.621)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.38113
		Randomize      (-0.081, 0.701, -0.928)
		colorDistMagn   0.098647
		colorDistFreq   0.024938
		detailScale     32
		snowLevel       2
		tropicLatitude  0.81294
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
		humidity        0.27232
		heightTempGrad  0.625
		beachWidth      0.00086121
		tropicWidth     0.07
		mainFreq        0.62366
		venusFreq       0.62044
		venusMagn       0.46471
		mareDensity     0
		terraceProb     0.47339
		erosion         0
		montesMagn      0.42605
		montesFreq      3.3143
		montesSpiky     0.98968
		montesFraction  0.68217
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.08858
		hillsFraction   0.74921
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2412
		craterFreq      0.23858
		craterDensity   0.82346
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57095
		volcanoTemp     322.29
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.1726
		BumpOffset      3.0863
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
		PeriodDays      380.584137
		SemiMajorAxisKm 34707185.6
		Eccentricity    0.451852342
		Inclination     221.474465
		AscendingNode   -155.968822
		ArgOfPericenter -107.956101
		MeanAnomaly     82.0896815
	}
}

DwarfMoon	"6.D53"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            8.7842e-10
	Radius          7.8082
	InertiaMoment   0.39932
	RotationPeriod  717.3
	RotationEpoch   0
	Obliquity       199.45
	EqAscendNode    -147.43

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.496 0.365 0.315)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.9502
		Randomize      (0.189, 0.531, -0.595)
		colorDistMagn   0.12563
		colorDistFreq   0.052658
		detailScale     32
		snowLevel       2
		tropicLatitude  0.34405
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
		humidity        0.17003
		heightTempGrad  0.625
		beachWidth      0.00090907
		tropicWidth     0.07
		mainFreq        0.46004
		venusFreq       0.63906
		venusMagn       0.39836
		mareDensity     0
		terraceProb     0.17939
		erosion         0
		montesMagn      0.54169
		montesFreq      2.6647
		montesSpiky     0.95677
		montesFraction  0.79143
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.19238
		hillsFraction   0.49491
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21414
		craterFreq      0.19591
		craterDensity   0.92517
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46967
		volcanoTemp     285.71
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.0274
		BumpOffset      3.5137
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
		PeriodDays      381.392944
		SemiMajorAxisKm 34756340.7
		Eccentricity    0.496401968
		Inclination     153.820684
		AscendingNode   -154.796354
		ArgOfPericenter -116.263873
		MeanAnomaly     123.955025
	}
}

DwarfMoon	"6.D54"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.2634e-09
	Radius          9.3081
	InertiaMoment   0.39745
	RotationPeriod  1498.7
	RotationEpoch   0
	Obliquity       179.29
	EqAscendNode    -175.24

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.693 0.556 0.480)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.51927
		Randomize      (0.460, 0.361, -0.262)
		colorDistMagn   0.15104
		colorDistFreq   0.043101
		detailScale     32
		snowLevel       2
		tropicLatitude  0.087504
		icecapLatitude  0.88366
		icecapHeight    0.041566
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46774
		heightTempGrad  0.625
		beachWidth      0.0012569
		tropicWidth     0.07
		mainFreq        0.72743
		venusFreq       0.66601
		venusMagn       0.87118
		mareDensity     0
		terraceProb     0.30211
		erosion         0
		montesMagn      0.38128
		montesFreq      3.3649
		montesSpiky     0.91819
		montesFraction  0.23202
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.23128
		hillsFraction   0.62112
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24884
		craterFreq      0.25284
		craterDensity   1.0991
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51553
		volcanoTemp     319.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.3773
		BumpOffset      4.1886
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
		PeriodDays      382.127802
		SemiMajorAxisKm 34800971.4
		Eccentricity    0.259903391
		Inclination     203.575688
		AscendingNode   -177.931421
		ArgOfPericenter -106.440355
		MeanAnomaly     66.1986624
	}
}

DwarfMoon	"6.D55"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.7947e-09
	Radius          9.4853
	InertiaMoment   0.39915
	RotationPeriod  629.42
	RotationEpoch   0
	Obliquity       245.22
	EqAscendNode    33.994

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.836 0.759 0.700)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.088337
		Randomize      (0.730, 0.191, 0.071)
		colorDistMagn   0.17511
		colorDistFreq   0.072111
		detailScale     32
		snowLevel       2
		tropicLatitude  0.90916
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
		humidity        0.36545
		heightTempGrad  0.625
		beachWidth      0.00070478
		tropicWidth     0.07
		mainFreq        0.52905
		venusFreq       0.5064
		venusMagn       0.83704
		mareDensity     0
		terraceProb     0.49724
		erosion         0
		montesMagn      0.51242
		montesFreq      2.7135
		montesSpiky     0.85983
		montesFraction  0.37923
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.21665
		hillsFraction   0.72804
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22619
		craterFreq      0.21005
		craterDensity   0.86863
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59547
		volcanoTemp     212.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.5367
		BumpOffset      4.2684
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
		PeriodDays      383.337268
		SemiMajorAxisKm 34874364.7
		Eccentricity    0.358929684
		Inclination     168.770611
		AscendingNode   43.5191859
		ArgOfPericenter 45.0654192
		MeanAnomaly     17.9454199
	}
}

DwarfMoon	"6.D56"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.5232e-09
	Radius          11.56
	InertiaMoment   0.39703
	RotationPeriod  1029.9
	RotationEpoch   0
	Obliquity       212.3
	EqAscendNode    46.153

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.606 0.550 0.492)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.6574
		Randomize      (-1.000, 0.022, 0.404)
		colorDistMagn   0.19801
		colorDistFreq   0.061995
		detailScale     32
		snowLevel       2
		tropicLatitude  0.54041
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
		humidity        0.26315
		heightTempGrad  0.625
		beachWidth      0.0010526
		tropicWidth     0.07
		mainFreq        0.35498
		venusFreq       0.54915
		venusMagn       0.81606
		mareDensity     0
		terraceProb     0.18804
		erosion         0
		montesMagn      0.24475
		montesFreq      3.4197
		montesSpiky     0.98854
		montesFraction  0.46601
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.28952
		hillsFraction   0.45972
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25813
		craterFreq      0.27169
		craterDensity   0.96879
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47688
		volcanoTemp     315.96
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.404
		BumpOffset      5.2021
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
		PeriodDays      383.94875
		SemiMajorAxisKm 34911441.5
		Eccentricity    0.0568762635
		Inclination     218.022717
		AscendingNode   49.5131493
		ArgOfPericenter 44.351074
		MeanAnomaly     79.8984451
	}
}

DwarfMoon	"6.D57"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            3.5169e-09
	Radius          11.648
	InertiaMoment   0.39896
	RotationPeriod  614.27
	RotationEpoch   0
	Obliquity       126.06
	EqAscendNode    52.908

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.774 0.738 0.686)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22647
		Randomize      (-0.729, -0.148, 0.737)
		colorDistMagn   0.21991
		colorDistFreq   0.10204
		detailScale     32
		snowLevel       2
		tropicLatitude  0.80925
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
		humidity        0.16086
		heightTempGrad  0.625
		beachWidth      0.0011005
		tropicWidth     0.07
		mainFreq        0.60079
		venusFreq       0.57064
		venusMagn       0.80032
		mareDensity     0
		terraceProb     0.31207
		erosion         0
		montesMagn      0.48419
		montesFreq      2.7598
		montesSpiky     0.95552
		montesFraction  0.53892
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.25228
		hillsFraction   0.60503
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23451
		craterFreq      0.22273
		craterDensity   0.79821
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52224
		volcanoTemp     279.38
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.483
		BumpOffset      5.2416
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
		PeriodDays      384.629718
		SemiMajorAxisKm 34952708.4
		Eccentricity    0.253117519
		Inclination     136.135608
		AscendingNode   59.666939
		ArgOfPericenter 159.558242
		MeanAnomaly     36.6011893
	}
}

DwarfMoon	"6.D58"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.8669e-09
	Radius          14.672
	InertiaMoment   0.3964
	RotationPeriod  1068.3
	RotationEpoch   0
	Obliquity       124.8
	EqAscendNode    45.391

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.607 0.464 0.415)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.79554
		Randomize      (-0.459, -0.318, -0.930)
		colorDistMagn   0.24093
		colorDistFreq   0.092302
		detailScale     64
		snowLevel       2
		tropicLatitude  0.82191
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
		humidity        0.45857
		heightTempGrad  0.625
		beachWidth      0.0014483
		tropicWidth     0.07
		mainFreq        0.43927
		venusFreq       0.58766
		venusMagn       0.78744
		mareDensity     0
		terraceProb     0.52626
		erosion         0
		montesMagn      0.61218
		montesFreq      3.48
		montesSpiky     0.91659
		montesFraction  0.61035
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.66691
		hillsFraction   0.70905
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27613
		craterFreq      0.1711
		craterDensity   0.90796
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39907
		volcanoTemp     382.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.205
		BumpOffset      6.6026
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
		PeriodDays      385.255159
		SemiMajorAxisKm 34990588.9
		Eccentricity    0.145925889
		Inclination     169.406554
		AscendingNode   46.4260191
		ArgOfPericenter 0.0920608733
		MeanAnomaly     114.489692
	}
}

DwarfMoon	"6.D59"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.6958e-09
	Radius          15.177
	InertiaMoment   0.39877
	RotationPeriod  533.26
	RotationEpoch   0
	Obliquity       106.11
	EqAscendNode    28.011

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.763 0.669 0.621)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36461
		Randomize      (-0.188, -0.488, -0.597)
		colorDistMagn   0.26116
		colorDistFreq   0.16345
		detailScale     64
		snowLevel       2
		tropicLatitude  0.96065
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
		humidity        0.35628
		heightTempGrad  0.625
		beachWidth      0.0008962
		tropicWidth     0.07
		mainFreq        0.69157
		venusFreq       0.60332
		venusMagn       0.77639
		mareDensity     0
		terraceProb     0.19668
		erosion         0
		montesMagn      0.45461
		montesFreq      2.804
		montesSpiky     0.85673
		montesFraction  0.69077
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.61079
		hillsFraction   0.40018
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24194
		craterFreq      0.23529
		craterDensity   1.0335
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48363
		volcanoTemp     276.21
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.66
		BumpOffset      6.8298
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
		PeriodDays      386.697291
		SemiMajorAxisKm 35077855
		Eccentricity    0.158175537
		Inclination     164.925635
		AscendingNode   32.9570113
		ArgOfPericenter -59.6350526
		MeanAnomaly     -25.8230214
	}
}

DwarfMoon	"6.D60"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            9.1687e-09
	Radius          18.17
	InertiaMoment   0.3946
	RotationPeriod  1279.6
	RotationEpoch   0
	Obliquity       -38.067
	EqAscendNode    -125.05

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.599 0.451 0.348)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.93367
		Randomize      (0.082, -0.658, -0.264)
		colorDistMagn   0.2807
		colorDistFreq   0.12912
		detailScale     64
		snowLevel       2
		tropicLatitude  0.61935
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
		humidity        0.25399
		heightTempGrad  0.625
		beachWidth      0.00094405
		tropicWidth     0.07
		mainFreq        0.50948
		venusFreq       0.61933
		venusMagn       0.7666
		mareDensity     0
		terraceProb     0.32231
		erosion         0
		montesMagn      0.5696
		montesFreq      3.5483
		montesSpiky     0.98739
		montesFraction  0.8062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.79028
		hillsFraction   0.58837
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21577
		craterFreq      0.19185
		craterDensity   0.85019
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52939
		volcanoTemp     309.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.353
		BumpOffset      8.1766
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
		PeriodDays      387.780041
		SemiMajorAxisKm 35143303
		Eccentricity    0.377330274
		Inclination     -46.2610967
		AscendingNode   -131.486989
		ArgOfPericenter -80.77198
		MeanAnomaly     144.512479
	}
}

DwarfMoon	"6.D61"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.2509e-08
	Radius          18.236
	InertiaMoment   0.39857
	RotationPeriod  492.21
	RotationEpoch   0
	Obliquity       236.38
	EqAscendNode    -142.75

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.758 0.653 0.551)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.50274
		Randomize      (0.352, -0.828, 0.069)
		colorDistMagn   0.29962
		colorDistFreq   0.22327
		detailScale     64
		snowLevel       2
		tropicLatitude  0.83481
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
		humidity        0.15169
		heightTempGrad  0.625
		beachWidth      0.0012919
		tropicWidth     0.07
		mainFreq        0.32391
		venusFreq       0.63767
		venusMagn       0.75774
		mareDensity     0
		terraceProb     0.56445
		erosion         0
		montesMagn      0.4203
		montesFreq      2.8468
		montesSpiky     0.95427
		montesFraction  0.25413
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.71537
		hillsFraction   0.69147
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24967
		craterFreq      0.24899
		craterDensity   0.94862
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4268
		volcanoTemp     273.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.413
		BumpOffset      8.2064
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
		PeriodDays      388.95363
		SemiMajorAxisKm 35214173.1
		Eccentricity    0.0116826985
		Inclination     227.511795
		AscendingNode   -144.896879
		ArgOfPericenter 121.719386
		MeanAnomaly     127.419508
	}
}

DwarfMoon	"6.D62"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.7021e-08
	Radius          22.193
	InertiaMoment   0.39985
	RotationPeriod  1702.1
	RotationEpoch   0
	Obliquity       152.12
	EqAscendNode    -128.46

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.494 0.444 0.377)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.07181
		Randomize      (0.623, -0.998, 0.402)
		colorDistMagn   0.31798
		colorDistFreq   0.17215
		detailScale     64
		snowLevel       2
		tropicLatitude  0.47281
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
		humidity        0.4494
		heightTempGrad  0.625
		beachWidth      0.0013398
		tropicWidth     0.07
		mainFreq        0.5793
		venusFreq       0.66362
		venusMagn       0.74959
		mareDensity     0
		terraceProb     0.2053
		erosion         0
		montesMagn      0.53707
		montesFreq      3.6287
		montesSpiky     0.91497
		montesFraction  0.38884
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.90354
		hillsFraction   0.87902
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22712
		craterFreq      0.20668
		craterDensity   0.76387
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4901
		volcanoTemp     236.46
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.974
		BumpOffset      9.9871
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
		PeriodDays      390.058353
		SemiMajorAxisKm 35280819.5
		Eccentricity    0.140066691
		Inclination     165.674739
		AscendingNode   -124.055855
		ArgOfPericenter 150.42517
		MeanAnomaly     -147.717346
	}
}

Barycenter	"7-7.1"
{
	ParentBody     "Asim"
	Mass            0.21943
	Radius          18587
	RotationPeriod  24
	RotationEpoch   0
	Obliquity       -inf
	EqAscendNode    -inf


	Orbit
	{
		RefPlane        "Equator"
		Period          33.9494874
		SemiMajorAxis   11.501768
		Eccentricity    0.0206860045
		Inclination     -4.43731331
		AscendingNode   62.3249252
		ArgOfPericenter 312.894548
		MeanAnomaly     339.581555
	}
}

Planet	"7"
{
	ParentBody     "7-7.1"
	Class          "Aquaria"
	Mass            0.21302
	Radius          4601.6
	InertiaMoment   0.33186
	Obliquity       -0.59202
	EqAscendNode    -146.67
	TidalLocked     true

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.772 0.666 0.472)

	Surface
	{
		Preset         "aquaria_arid_triton.cfg"
		SurfStyle       0.63447
		Randomize      (0.069, 0.417, 0.727)
		colorDistMagn   0.049795
		colorDistFreq   572.4
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.24552
		snowLevel       2
		tropicLatitude  0.082657
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
		humidity        0.19406
		heightTempGrad  0.625
		beachWidth      0.0014523
		tropicWidth     0.07
		mainFreq        1.713
		venusFreq       0.93569
		venusMagn       0
		mareFreq        2.1641
		mareDensity     0.17486
		terraceProb     0.42437
		erosion         0
		montesMagn      0.20305
		montesFreq      212.64
		montesSpiky     0.86773
		montesFraction  0.37462
		dunesMagn       0.034633
		dunesFreq       31.593
		dunesFraction   0.91149
		hillsMagn       0.13134
		hillsFreq       604.97
		hillsFraction   0.33961
		hills2Fraction  0.092879
		riversMagn      0
		riversFreq      3.2318
		riversSin       7.9271
		riftsMagn       0
		riftsFreq       2.4443
		riftsSin        6.2791
		canyonsMagn     0.41845
		canyonsFreq     1.2855
		canyonsFraction 0
		cracksMagn      0.064631
		cracksFreq      3.2272
		cracksOctaves   3
		craterMagn      0.60514
		craterFreq      13.092
		craterDensity   0.23785
		craterOctaves   5.1529
		craterRayedFactor 0
		volcanoMagn     0.609
		volcanoFreq     0.78539
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.1153
		volcanoFlows    0.32235
		volcanoRadius   0.4888
		volcanoTemp     336.93
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.0288
		stripeTwist     0.25853
		cycloneMagn     2.6042
		cycloneFreq     0.71832
		cycloneDensity  0.35373
		cycloneOctaves  4
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.2024
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          15.853
		Velocity        132.07
		BumpHeight      2.9263
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.66803
		mainOctaves     10
		Coverage        0.13875
		stripeZones     2.0288
		stripeTwist     0.25853
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          44.011
		Density         0.69497
		Pressure        0.1836
		Greenhouse      2.8629
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0.015839
		Saturation      0.98621

		Composition
		{
			N2        	99.789
			CO        	0.16133
			Ar        	0.049438
			Ne        	6.2749e-05
			C2H4      	1.2152e-05
		}
	}

	Aurora
	{
		Height         61.616
		NorthLat       62.868
		NorthLon       -91.059
		NorthRadius    921.31
		NorthWidth     194.75
		NorthRings     4
		NorthBright    0.3
		NorthFlashFreq 63.642
		NorthMoveSpeed 0.73269
		NorthParticles 50000
		SouthLat       -90
		SouthLon       125.49
		SouthRadius    854.21
		SouthWidth     243.6
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 63.279
		SouthMoveSpeed 0.69314
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0144868028
		SemiMajorAxis   1.50980932e-05
		Eccentricity    0.00344404129
		Inclination     -0.592023536
		AscendingNode   -146.670704
		ArgOfPericenter 85.5822997
		MeanAnomaly     -88.699142
	}
}

Moon	"7.1"
{
	ParentBody     "7-7.1"
	Class          "Aquaria"
	Mass            0.0064061
	Radius          1442.1
	InertiaMoment   0.38882
	Obliquity       -0.59202
	EqAscendNode    -146.67
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.413 0.410 0.406)

	Life
	{
		Class   "Organic"
		Type    "Unicellular"
		Biome   "Subglacial"
	}

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.96525
		Randomize      (-0.927, -0.745, 0.313)
		colorDistMagn   0.085257
		colorDistFreq   171.83
		detailScale     4096
		drivenDarkening 0.7
		seaLevel        0.26674
		snowLevel       2
		tropicLatitude  0.082657
		icecapLatitude  0.48809
		icecapHeight    0.2272
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30129
		heightTempGrad  0.625
		beachWidth      0.0013328
		tropicWidth     0.07
		mainFreq        1.6252
		venusFreq       1.0544
		venusMagn       0
		mareFreq        0.69216
		mareDensity     0.18225
		terraceProb     0.14682
		erosion         0
		montesMagn      0.067713
		montesFreq      84.438
		montesSpiky     0.95428
		montesFraction  0.31636
		dunesMagn       0.031536
		dunesFreq       16.689
		dunesFraction   0.45499
		hillsMagn       0.1337
		hillsFreq       148.17
		hillsFraction   0.94148
		hills2Fraction  0.10268
		riversMagn      0
		riversFreq      2.6219
		riversSin       5.0286
		riftsMagn       0
		riftsFreq       3.2908
		riftsSin        5.9601
		canyonsMagn     0.42751
		canyonsFreq     0.6075
		canyonsFraction 0
		cracksMagn      0.037743
		cracksFreq      0.36258
		cracksOctaves   0
		craterMagn      0.61416
		craterFreq      3.5731
		craterDensity   0.97814
		craterOctaves   19
		craterRayedFactor 0.14171
		volcanoMagn     0.16581
		volcanoFreq     0.79991
		volcanoDensity  0.28077
		volcanoOctaves  3
		volcanoActivity 0.39309
		volcanoFlows    0.40683
		volcanoRadius   0.146
		volcanoTemp     341.14
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
		PeriodDays      5.29119157
		SemiMajorAxisKm 75106.3565
		Eccentricity    0.00344404129
		Inclination     -0.592023536
		AscendingNode   -146.670704
		ArgOfPericenter -94.4177003
		MeanAnomaly     -88.699142
	}
}

DwarfMoon	"7.2"
{
	ParentBody     "7-7.1"
	Class          "Asteroid"
	Mass            2.6569e-06
	Radius          114.33
	InertiaMoment   0.39666
	Obliquity       -0.19005
	EqAscendNode    67.516
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.559 0.551 0.547)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67245
		Randomize      (-0.115, 0.745, -0.688)
		colorDistMagn   0.95451
		colorDistFreq   9.4572
		detailScale     512
		snowLevel       2
		tropicLatitude  0.078959
		icecapLatitude  0.59677
		icecapHeight    0.28174
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39441
		heightTempGrad  0.625
		beachWidth      0.0011763
		tropicWidth     0.07
		mainFreq        0.69729
		venusFreq       0.67327
		venusMagn       0.76187
		mareDensity     0
		terraceProb     0.15571
		erosion         0
		montesMagn      0.3507
		montesFreq      2.9308
		montesSpiky     0.84657
		montesFraction  0.35201
		dunesFraction   0
		hillsMagn       0
		hillsFreq       20.009
		hillsFraction   0.50126
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2485
		craterFreq      0.43327
		craterDensity   1.0595
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58712
		volcanoTemp     203.7
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
		PeriodDays      35.5524847
		SemiMajorAxisKm 272773.005
		Eccentricity    0.0399493084
		Inclination     -0.190046274
		AscendingNode   67.5164189
		ArgOfPericenter 170.318125
		MeanAnomaly     -147.860942
	}
}

DwarfMoon	"7.3"
{
	ParentBody     "7-7.1"
	Class          "Asteroid"
	Mass            1.2966e-07
	Radius          39.412
	InertiaMoment   0.39709
	Obliquity       -0.089119
	EqAscendNode    -155.72
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.738 0.734 0.730)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.24152
		Randomize      (0.155, 0.575, -0.355)
		colorDistMagn   0.97002
		colorDistFreq   0.6281
		detailScale     128
		snowLevel       2
		tropicLatitude  0.078101
		icecapLatitude  0.57455
		icecapHeight    0.25089
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29212
		heightTempGrad  0.625
		beachWidth      0.0012242
		tropicWidth     0.07
		mainFreq        0.51289
		venusFreq       0.51898
		venusMagn       0.7534
		mareDensity     0
		terraceProb     0.27629
		erosion         0
		montesMagn      0.49989
		montesFreq      3.881
		montesSpiky     0.98398
		montesFraction  0.44613
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3553
		hillsFraction   0.62458
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22579
		craterFreq      0.27573
		craterDensity   0.86006
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4751
		volcanoTemp     237.12
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
		PeriodDays      57.0287485
		SemiMajorAxisKm 373779.605
		Eccentricity    0.00545936022
		Inclination     -0.0891187317
		AscendingNode   -155.715657
		ArgOfPericenter 128.497692
		MeanAnomaly     -78.1734107
	}
}

Comet	"C83"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            3.531e-12
	Radius          0.81975
	InertiaMoment   0.39908
	RotationPeriod  65.504
	RotationEpoch   0
	Obliquity       256.26
	EqAscendNode    328.49

	AbsMagn         7.381
	SlopeParam      7.0644
	AlbedoBond      0.049264
	AlbedoGeom      0.059116
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.617 0.612 0.607)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.71182
		Randomize      (0.618, -0.112, 0.864)
		colorDistMagn   0.31578
		colorDistFreq   0.00048589
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99899
		icecapLatitude  2
		icecapHeight    0.67746
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3949
		heightTempGrad  0.625
		beachWidth      0.0015676
		tropicWidth     0.07
		mainFreq        0.41545
		venusFreq       0.62406
		venusMagn       0.59568
		mareDensity     0
		terraceProb     0.52593
		erosion         0
		montesMagn      0.48146
		montesFreq      3.1278
		montesSpiky     0.99822
		montesFraction  0.60906
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0021065
		hillsFraction   0.7094
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22559
		craterFreq      0.15633
		craterDensity   1.0755
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54575
		volcanoTemp     1062.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6868
		BumpOffset      0.84338
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

	CometTail
	{
		MaxLength   0.044905
		GasToDust   0.25
		Particles   1886
		GasBright   0.01123
		DustBright  0.016527
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          61.3776526
		SemiMajorAxis   17.0693074
		Eccentricity    0.872037552
		Inclination     96.6519013
		AscendingNode   -88.9652835
		ArgOfPericenter 66.5099876
		MeanAnomaly     62.0946061
	}
}

Comet	"C8"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            4.8345e-15
	Radius          0.091027
	InertiaMoment   0.39975
	RotationPeriod  69.056
	RotationEpoch   0
	Obliquity       104.83
	EqAscendNode    20.046

	AbsMagn         14.944
	SlopeParam      7.1957
	AlbedoBond      0.030493
	AlbedoGeom      0.036591
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.653 0.549 0.370)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.2912
		Randomize      (0.311, 0.350, -0.339)
		colorDistMagn   0.9168
		colorDistFreq   4.6192e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.88533
		icecapLatitude  2
		icecapHeight    0.78381
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19994
		heightTempGrad  0.625
		beachWidth      0.0010022
		tropicWidth     0.07
		mainFreq        0.29785
		venusFreq       0.61163
		venusMagn       0.65541
		mareDensity     0
		terraceProb     0.53852
		erosion         0
		montesMagn      0.65381
		montesFreq      2.8373
		montesSpiky     0.88802
		montesFraction  0.44937
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7232e-05
		hillsFraction   0.36264
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22707
		craterFreq      0.17405
		craterDensity   0.77805
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.60486
		volcanoTemp     1241.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.22739
		BumpOffset      0.11369
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

	CometTail
	{
		MaxLength   0.0094688
		GasToDust   0.25
		Particles   1171
		GasBright   0.012119
		DustBright  0.024872
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          61.5061518
		SemiMajorAxis   17.0931231
		Eccentricity    0.948002788
		Inclination     -137.240396
		AscendingNode   174.193143
		ArgOfPericenter -113.172213
		MeanAnomaly     26.7883392
	}
}

Comet	"C39"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.2282e-15
	Radius          0.070313
	InertiaMoment   0.39916
	RotationPeriod  59.266
	RotationEpoch   0
	Obliquity       23.421
	EqAscendNode    257.94

	AbsMagn         7.1195
	SlopeParam      2.4052
	AlbedoBond      0.046228
	AlbedoGeom      0.055474
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.505 0.499 0.494)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.065059
		Randomize      (-0.736, 0.505, -0.748)
		colorDistMagn   0.44142
		colorDistFreq   1.7544e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.62043
		icecapLatitude  2
		icecapHeight    0.51624
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45119
		heightTempGrad  0.625
		beachWidth      0.0012519
		tropicWidth     0.07
		mainFreq        0.36202
		venusFreq       0.60801
		venusMagn       0.77249
		mareDensity     0
		terraceProb     0.12449
		erosion         0
		montesMagn      0.47499
		montesFreq      2.4131
		montesSpiky     0.94393
		montesFraction  0.64411
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6119e-05
		hillsFraction   0.68695
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25469
		craterFreq      0.21185
		craterDensity   0.81643
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53039
		volcanoTemp     1083.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.17215
		BumpOffset      0.086076
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

	CometTail
	{
		MaxLength   0.0053058
		GasToDust   0.25
		Particles   1086
		GasBright   0.0026511
		DustBright  0.037456
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          75.0812516
		SemiMajorAxis   19.5237567
		Eccentricity    0.982718832
		Inclination     -160.328633
		AscendingNode   -53.3918145
		ArgOfPericenter -165.080402
		MeanAnomaly     68.086024
	}
}

Comet	"C98"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.3201e-11
	Radius          1.2723
	InertiaMoment   0.39948
	Oblateness      0.0015234
	RotationPeriod  31.247
	RotationEpoch   0
	Obliquity       286.54
	EqAscendNode    246.18

	AbsMagn         6.2896
	SlopeParam      7.0397
	AlbedoBond      0.036257
	AlbedoGeom      0.043508
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.634 0.632 0.630)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.79594
		Randomize      (-0.920, 0.995, -0.496)
		colorDistMagn   0.88967
		colorDistFreq   0.00063491
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9997
		icecapLatitude  2
		icecapHeight    0.51764
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19389
		heightTempGrad  0.625
		beachWidth      0.00042066
		tropicWidth     0.07
		mainFreq        0.51208
		venusFreq       0.62671
		venusMagn       0.63867
		mareDensity     0
		terraceProb     0.52356
		erosion         0
		montesMagn      0.45438
		montesFreq      2.9329
		montesSpiky     0.90267
		montesFraction  0.54179
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0033738
		hillsFraction   0.43463
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20275
		craterFreq      0.15088
		craterDensity   0.7976
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.612
		volcanoTemp     1066.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.8923
		BumpOffset      1.4461
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

	CometTail
	{
		MaxLength   0.051992
		GasToDust   0.25
		Particles   2030
		GasBright   0.00099627
		DustBright  0.048914
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          77.2424823
		SemiMajorAxis   19.8966457
		Eccentricity    0.913042208
		Inclination     -162.053742
		AscendingNode   -179.885362
		ArgOfPericenter -77.144663
		MeanAnomaly     -15.2553106
	}
}

Comet	"C31"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            6.346e-15
	Radius          0.099667
	InertiaMoment   0.39965
	RotationPeriod  103.25
	RotationEpoch   0
	Obliquity       79.27
	EqAscendNode    277.84

	AbsMagn         3.6346
	SlopeParam      10.018
	AlbedoBond      0.04574
	AlbedoGeom      0.054888
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.523 0.517 0.509)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22019
		Randomize      (-0.982, 0.981, 0.777)
		colorDistMagn   0.54194
		colorDistFreq   2.5559e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96824
		icecapLatitude  2
		icecapHeight    0.5551
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42506
		heightTempGrad  0.625
		beachWidth      0.0013036
		tropicWidth     0.07
		mainFreq        0.39741
		venusFreq       0.53206
		venusMagn       0.59376
		mareDensity     0
		terraceProb     0.81191
		erosion         0
		montesMagn      0.3876
		montesFreq      3.2188
		montesSpiky     0.94629
		montesFraction  0.5137
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.7154e-05
		hillsFraction   0.9416
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23553
		craterFreq      0.24463
		craterDensity   0.82982
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49232
		volcanoTemp     1315
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.23036
		BumpOffset      0.11518
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

	CometTail
	{
		MaxLength   0.010931
		GasToDust   0.25
		Particles   1200
		GasBright   0.00022624
		DustBright  0.049399
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          90.458662
		SemiMajorAxis   22.1059487
		Eccentricity    0.884742046
		Inclination     34.7601094
		AscendingNode   -43.9933783
		ArgOfPericenter -32.9841968
		MeanAnomaly     -55.20148
	}
}

Comet	"C79"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.189e-17
	Radius          0.012287
	InertiaMoment   0.39934
	RotationPeriod  84.391
	RotationEpoch   0
	Obliquity       104.18
	EqAscendNode    158.44

	AbsMagn         11.325
	SlopeParam      3.9446
	AlbedoBond      0.048955
	AlbedoGeom      0.058745
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.426 0.418 0.414)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28939
		Randomize      (0.495, 0.126, -0.374)
		colorDistMagn   0.80136
		colorDistFreq   1.0351e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99965
		icecapLatitude  2
		icecapHeight    0.69873
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18184
		heightTempGrad  0.625
		beachWidth      0.00099344
		tropicWidth     0.07
		mainFreq        0.63198
		venusFreq       0.68061
		venusMagn       0.82577
		mareDensity     0
		terraceProb     0.24037
		erosion         0
		montesMagn      0.57689
		montesFreq      2.8412
		montesSpiky     0.93159
		montesFraction  0.94239
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3203e-07
		hillsFraction   0.79039
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24284
		craterFreq      0.23992
		craterDensity   0.62505
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45331
		volcanoTemp     1028.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.028358
		BumpOffset      0.014179
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.012154
		DustBright  0.020361
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          107.450333
		SemiMajorAxis   24.7940551
		Eccentricity    0.922583433
		Inclination     -112.905716
		AscendingNode   97.8392327
		ArgOfPericenter -146.218055
		MeanAnomaly     -122.274285
	}
}

Comet	"C46"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.3725e-14
	Radius          0.15469
	InertiaMoment   0.39496
	RotationPeriod  54.515
	RotationEpoch   0
	Obliquity       109.55
	EqAscendNode    195.52

	AbsMagn         0.67435
	SlopeParam      9.5293
	AlbedoBond      0.033199
	AlbedoGeom      0.039839
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.540 0.537 0.532)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30432
		Randomize      (-0.520, 0.089, -0.583)
		colorDistMagn   0.19789
		colorDistFreq   1.3564e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.80152
		icecapLatitude  2
		icecapHeight    0.80075
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22406
		heightTempGrad  0.625
		beachWidth      0.00045669
		tropicWidth     0.07
		mainFreq        0.4969
		venusFreq       0.53751
		venusMagn       0.63708
		mareDensity     0
		terraceProb     0.76475
		erosion         0
		montesMagn      0.30921
		montesFreq      3.0186
		montesSpiky     0.99194
		montesFraction  0.44253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3598e-05
		hillsFraction   0.58682
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22368
		craterFreq      0.24313
		craterDensity   0.87755
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51352
		volcanoTemp     1219.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.37267
		BumpOffset      0.18633
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

	CometTail
	{
		MaxLength   0.018018
		GasToDust   0.25
		Particles   1343
		GasBright   0.0038118
		DustBright  0.027967
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          111.077913
		SemiMajorAxis   25.3490016
		Eccentricity    0.909815636
		Inclination     70.5265334
		AscendingNode   143.002472
		ArgOfPericenter -5.97909316
		MeanAnomaly     -65.064679
	}
}

Comet	"C78"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            3.6057e-16
	Radius          0.038316
	InertiaMoment   0.39776
	Oblateness      0.0040924
	RotationPeriod  19.003
	RotationEpoch   0
	Obliquity       246.16
	EqAscendNode    115.93

	AbsMagn         3.7212
	SlopeParam      3.3726
	AlbedoBond      0.035137
	AlbedoGeom      0.042164
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.609 0.494 0.335)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.68378
		Randomize      (0.464, 0.185, -0.683)
		colorDistMagn   0.71113
		colorDistFreq   7.3346e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.55925
		icecapLatitude  2
		icecapHeight    0.60936
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32857
		heightTempGrad  0.625
		beachWidth      0.0005499
		tropicWidth     0.07
		mainFreq        0.3776
		venusFreq       0.48709
		venusMagn       0.77471
		mareDensity     0
		terraceProb     0.19392
		erosion         0
		montesMagn      0.38981
		montesFreq      2.7648
		montesSpiky     0.98375
		montesFraction  0.46564
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.1345e-06
		hillsFraction   0.82287
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24699
		craterFreq      0.20817
		craterDensity   0.83326
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53597
		volcanoTemp     1094.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10142
		BumpOffset      0.05071
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.01234
		DustBright  0.021366
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          117.279112
		SemiMajorAxis   26.2838812
		Eccentricity    0.898259505
		Inclination     132.766453
		AscendingNode   -34.3244925
		ArgOfPericenter -90.9641241
		MeanAnomaly     66.3939575
	}
}

Comet	"C90"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            3.7597e-11
	Radius          1.8034
	InertiaMoment   0.39996
	RotationPeriod  60.478
	RotationEpoch   0
	Obliquity       342.39
	EqAscendNode    266.08

	AbsMagn         1.752
	SlopeParam      6.3545
	AlbedoBond      0.035815
	AlbedoGeom      0.042978
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.651 0.649 0.645)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.95108
		Randomize      (0.834, -0.529, -0.971)
		colorDistMagn   0.99323
		colorDistFreq   0.0010036
		detailScale     8
		snowLevel       2
		tropicLatitude  0.66622
		icecapLatitude  2
		icecapHeight    0.55633
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16776
		heightTempGrad  0.625
		beachWidth      0.00077236
		tropicWidth     0.07
		mainFreq        0.53911
		venusFreq       0.56253
		venusMagn       0.74377
		mareDensity     0
		terraceProb     0.45829
		erosion         0
		montesMagn      0.33873
		montesFreq      4.3077
		montesSpiky     0.90588
		montesFraction  0.40263
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0057716
		hillsFraction   0.60822
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24896
		craterFreq      0.20702
		craterDensity   0.81318
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52595
		volcanoTemp     1097.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.7674
		BumpOffset      2.3837
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

	CometTail
	{
		MaxLength   0.057618
		GasToDust   0.25
		Particles   2143
		GasBright   0.0089062
		DustBright  0.010522
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          120.584019
		SemiMajorAxis   26.7753746
		Eccentricity    0.926624061
		Inclination     46.2313403
		AscendingNode   66.6978134
		ArgOfPericenter -137.176634
		MeanAnomaly     108.153681
	}
}

Comet	"C57"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            7.5024e-08
	Radius          22.701
	InertiaMoment   0.39772
	Oblateness      0.0011771
	RotationPeriod  35.422
	RotationEpoch   0
	Obliquity       347.76
	EqAscendNode    303.16

	AbsMagn         5.7635
	SlopeParam      4.2377
	AlbedoBond      0.047387
	AlbedoGeom      0.056864
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.767 0.764 0.761)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.96601
		Randomize      (-0.182, -0.565, 0.820)
		colorDistMagn   0.43569
		colorDistFreq   0.44081
		detailScale     64
		snowLevel       2
		tropicLatitude  0.93898
		icecapLatitude  2
		icecapHeight    0.6148
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20998
		heightTempGrad  0.625
		beachWidth      0.00083561
		tropicWidth     0.07
		mainFreq        0.40656
		venusFreq       0.58551
		venusMagn       0.59472
		mareDensity     0
		terraceProb     0.26528
		erosion         0
		montesMagn      0.44126
		montesFreq      2.4486
		montesSpiky     0.97317
		montesFraction  0.56106
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1322
		hillsFraction   0.77182
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23085
		craterFreq      0.21017
		craterDensity   0.92556
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44355
		volcanoTemp     1088.8
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

	CometTail
	{
		MaxLength   0.098456
		GasToDust   0.25
		Particles   2968
		GasBright   0.0038236
		DustBright  0.014868
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          121.102347
		SemiMajorAxis   26.8520486
		Eccentricity    0.915880339
		Inclination     -102.394482
		AscendingNode   -49.5926686
		ArgOfPericenter -151.764084
		MeanAnomaly     -147.413328
	}
}

Comet	"C121"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.7328e-11
	Radius          1.3931
	InertiaMoment   0.39938
	RotationPeriod  51.408
	RotationEpoch   0
	Obliquity       260.98
	EqAscendNode    143.97

	AbsMagn         8.0577
	SlopeParam      8.6127
	AlbedoBond      0.052829
	AlbedoGeom      0.063394
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.639 0.636 0.634)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.72493
		Randomize      (-0.212, -0.373, 0.620)
		colorDistMagn   0.51545
		colorDistFreq   0.0014269
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9937
		icecapLatitude  2
		icecapHeight    0.68528
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41901
		heightTempGrad  0.625
		beachWidth      0.001322
		tropicWidth     0.07
		mainFreq        0.57883
		venusFreq       0.55766
		venusMagn       0.57137
		mareDensity     0
		terraceProb     0.67565
		erosion         0
		montesMagn      0.49814
		montesFreq      3.3268
		montesSpiky     0.95584
		montesFraction  0.60284
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0053156
		hillsFraction   0.41935
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22199
		craterFreq      0.23596
		craterDensity   0.8426
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49301
		volcanoTemp     1039.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.5437
		BumpOffset      1.7719
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

	CometTail
	{
		MaxLength   0.053455
		GasToDust   0.25
		Particles   2059
		GasBright   0.0044388
		DustBright  0.018106
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          122.596972
		SemiMajorAxis   27.0725322
		Eccentricity    0.941289902
		Inclination     -5.64173078
		AscendingNode   -116.944847
		ArgOfPericenter -136.010612
		MeanAnomaly     -139.679962
	}
}

Comet	"C42"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.0067e-08
	Radius          14.628
	InertiaMoment   0.39676
	RotationPeriod  69.97
	RotationEpoch   0
	Obliquity       317.48
	EqAscendNode    25.474

	AbsMagn         6.9044
	SlopeParam      4.2455
	AlbedoBond      0.03294
	AlbedoGeom      0.039528
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.795 0.740 0.693)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.88188
		Randomize      (-0.643, 0.327, 0.180)
		colorDistMagn   0.72113
		colorDistFreq   0.11472
		detailScale     64
		snowLevel       2
		tropicLatitude  0.9858
		icecapLatitude  2
		icecapHeight    0.8718
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41099
		heightTempGrad  0.625
		beachWidth      0.00078254
		tropicWidth     0.07
		mainFreq        0.7636
		venusFreq       0.58306
		venusMagn       0.53266
		mareDensity     0
		terraceProb     0.26595
		erosion         0
		montesMagn      0.46966
		montesFreq      2.7224
		montesSpiky     0.92344
		montesFraction  0.62951
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.33042
		hillsFraction   0.64409
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24141
		craterFreq      0.21157
		craterDensity   0.88263
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58863
		volcanoTemp     1084.7
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

	CometTail
	{
		MaxLength   0.091368
		GasToDust   0.25
		Particles   2825
		GasBright   0.0032584
		DustBright  0.03328
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          123.728887
		SemiMajorAxis   27.2389139
		Eccentricity    0.910328873
		Inclination     -129.440513
		AscendingNode   -125.121303
		ArgOfPericenter 107.975816
		MeanAnomaly     -29.6706794
	}
}

Comet	"C115"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.3663e-14
	Radius          0.20305
	InertiaMoment   0.39974
	Oblateness      0.0014843
	RotationPeriod  31.672
	RotationEpoch   0
	Obliquity       32.862
	EqAscendNode    248.89

	AbsMagn         8.4761
	SlopeParam      3.0478
	AlbedoBond      0.05216
	AlbedoGeom      0.062592
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.552 0.548 0.544)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.091284
		Randomize      (-0.397, -0.016, 0.763)
		colorDistMagn   0.79118
		colorDistFreq   1.5631e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.84291
		icecapLatitude  2
		icecapHeight    0.53154
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49941
		heightTempGrad  0.625
		beachWidth      0.0013608
		tropicWidth     0.07
		mainFreq        0.7438
		venusFreq       0.61152
		venusMagn       0.71978
		mareDensity     0
		terraceProb     0.16913
		erosion         0
		montesMagn      0.5084
		montesFreq      2.8798
		montesSpiky     0.99007
		montesFraction  0.63096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00010499
		hillsFraction   0.57402
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24853
		craterFreq      0.23651
		craterDensity   0.98466
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.60011
		volcanoTemp     1038.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.46815
		BumpOffset      0.23408
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

	CometTail
	{
		MaxLength   0.022405
		GasToDust   0.25
		Particles   1432
		GasBright   0.0044743
		DustBright  0.025209
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          125.395646
		SemiMajorAxis   27.4829926
		Eccentricity    0.929429109
		Inclination     105.543757
		AscendingNode   -53.2252882
		ArgOfPericenter -177.911212
		MeanAnomaly     -135.103278
	}
}

Planet	"8"
{
	ParentBody     "Asim"
	Class          "Jupiter"
	Mass            528.01
	Radius          75636
	InertiaMoment   0.20522
	Oblateness      0.06069
	RotationPeriod  8.0366
	RotationEpoch   0
	Obliquity       -52.716
	EqAscendNode    -144.06

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "jupiter_frigid_default.cfg"
		SurfStyle       0.4416
		Randomize      (-0.696, -0.904, 0.670)
		detailScale     256
		tropicLatitude  0.76623
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.8396
		stripeFluct     0.43803
		stripeTwist     9.7934
		cycloneMagn     11.12
		cycloneFreq     0.64044
		cycloneDensity  0.45192
		cycloneOctaves  5
		cycloneMagn2     0.57724
		cycloneFreq2     0.65104
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      10.333
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          19.297
		Velocity        1296
		BumpHeight      4.4833
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.87524
		mainOctaves     12
		Coverage        0.12639
		stripeZones     5.8396
		stripeFluct     0.43803
		stripeTwist     9.7934
	}

	Clouds
	{
		Height          28.266
		Velocity        1952.8
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.87524
		mainOctaves     12
		Coverage        0.12639
		stripeZones     5.8396
		stripeFluct     0.43803
		stripeTwist     9.7934
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         10429
		Pressure        1e+06
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0085068
		Saturation      0.81317

		Composition
		{
			H2        	89.57
			He        	8.1856
			CH4       	1.6475
			C2H2      	0.15747
			C8H18     	0.14028
			C3H8      	0.13886
			C2H4      	0.054252
			N2        	0.040465
			NH3       	0.03021
			C2H6      	0.025269
			O2        	0.0076969
			Ne        	0.0011696
			Ar        	0.00088818
			CO2       	8.1035e-05
			H2O       	1.7739e-06
			H2S       	1.6375e-06
			Kr        	3.925e-07
			Xe        	4.3827e-08
			CO        	1.2905e-08
			SO2       	9.3276e-09
			Cl2       	3.3578e-10
		}
	}

	Aurora
	{
		Height         140
		NorthLat       87.322
		NorthLon       -170.17
		NorthRadius    23286
		NorthWidth     10247
		NorthRings     2
		NorthBright    1
		NorthFlashFreq 64.512
		NorthMoveSpeed 1.2546
		NorthParticles 10000
		SouthLat       -87.022
		SouthLon       15.031
		SouthRadius    19144
		SouthWidth     10538
		SouthRings     5
		SouthBright    1
		SouthFlashFreq 68.483
		SouthMoveSpeed 1.0914
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          126.192554
		SemiMajorAxis   27.6103555
		Eccentricity    0.0318763821
		Inclination     -3.601852
		AscendingNode   -139.46627
		ArgOfPericenter 7.96094715
		MeanAnomaly     279.656817
	}
}

DwarfMoon	"8.D1"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.7926e-10
	Radius          5.1588
	InertiaMoment   0.39891
	Oblateness     (0.346, 0.528, 0.000)
	Obliquity       -0.014827
	EqAscendNode    -42.294
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.605 0.602 0.600)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28961
		Randomize      (-0.746, -0.323, -0.108)
		colorDistMagn   0.63253
		colorDistFreq   0.0072577
		detailScale     16
		snowLevel       2
		tropicLatitude  0.062627
		icecapLatitude  0.62258
		icecapHeight    0.3455
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25547
		heightTempGrad  0.625
		beachWidth      0.00097795
		tropicWidth     0.07
		mainFreq        0.27942
		venusFreq       0.53327
		venusMagn       0.46308
		mareDensity     0
		terraceProb     0.32558
		erosion         0
		montesMagn      0.46724
		montesFreq      2.8496
		montesSpiky     0.9505
		montesFraction  0.29187
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.05791
		hillsFraction   0.46191
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2082
		craterFreq      0.22058
		craterDensity   0.79121
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41649
		volcanoTemp     287.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.643
		BumpOffset      2.3215
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
		PeriodDays      0.300316516
		SemiMajorAxisKm 153113.366
		Eccentricity    2.00423652e-05
		Inclination     -0.0148270504
		AscendingNode   -42.2944375
		ArgOfPericenter 122.555336
		MeanAnomaly     96.4145552
	}
}

DwarfMoon	"8.D2"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.7886e-10
	Radius          5.1346
	InertiaMoment   0.39616
	Oblateness     (0.346, 0.515, 0.000)
	Obliquity       -0.0015018
	EqAscendNode    124.24
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.785 0.783 0.782)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.85868
		Randomize      (-0.476, -0.493, 0.225)
		colorDistMagn   0.64615
		colorDistFreq   0.015421
		detailScale     16
		snowLevel       2
		tropicLatitude  0.062803
		icecapLatitude  0.60139
		icecapHeight    0.29919
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15318
		heightTempGrad  0.625
		beachWidth      0.0010258
		tropicWidth     0.07
		mainFreq        0.55582
		venusFreq       0.56054
		venusMagn       0.3902
		mareDensity     0
		terraceProb     0.57967
		erosion         0
		montesMagn      0.5854
		montesFreq      3.6346
		montesSpiky     0.91004
		montesFraction  0.40815
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.049414
		hillsFraction   0.60589
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24657
		craterFreq      0.16598
		craterDensity   0.90393
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48699
		volcanoTemp     180.43
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.6211
		BumpOffset      2.3106
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
		PeriodDays      0.317846753
		SemiMajorAxisKm 159015.263
		Eccentricity    9.27489381e-05
		Inclination     -0.00150183041
		AscendingNode   124.24219
		ArgOfPericenter 18.529136
		MeanAnomaly     156.5138
	}
}

DwarfMoon	"8.D3"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            4.2255e-10
	Radius          6.9421
	InertiaMoment   0.39872
	Oblateness     (0.345, 0.499, 0.000)
	Obliquity       0.0013983
	EqAscendNode    85.214
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.569 0.565 0.560)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.42775
		Randomize      (-0.205, -0.663, 0.558)
		colorDistMagn   0.65974
		colorDistFreq   0.0097997
		detailScale     32
		snowLevel       2
		tropicLatitude  0.062841
		icecapLatitude  0.58007
		icecapHeight    0.2669
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45088
		heightTempGrad  0.625
		beachWidth      0.0010737
		tropicWidth     0.07
		mainFreq        0.39064
		venusFreq       0.57923
		venusMagn       0.869
		mareDensity     0
		terraceProb     0.208
		erosion         0
		montesMagn      0.43548
		montesFreq      2.8912
		montesSpiky     0.84286
		montesFraction  0.48877
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15095
		hillsFraction   0.71001
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22337
		craterFreq      0.23309
		craterDensity   1.0243
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5333
		volcanoTemp     283.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.2479
		BumpOffset      3.124
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
		PeriodDays      0.338517873
		SemiMajorAxisKm 165836.972
		Eccentricity    5.85124681e-05
		Inclination     0.00139825204
		AscendingNode   85.2144225
		ArgOfPericenter -41.4281561
		MeanAnomaly     -178.475425
	}
}

DwarfMoon	"8.D4"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            6.2674e-10
	Radius          6.9474
	InertiaMoment   0.39997
	Oblateness     (0.343, 0.470, 0.000)
	Obliquity       5.3787e-05
	EqAscendNode    -179.54
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.749 0.747 0.743)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99682
		Randomize      (0.065, -0.833, 0.891)
		colorDistMagn   0.67329
		colorDistFreq   0.026662
		detailScale     32
		snowLevel       2
		tropicLatitude  0.062823
		icecapLatitude  0.55868
		icecapHeight    0.23301
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34859
		heightTempGrad  0.625
		beachWidth      0.00082151
		tropicWidth     0.07
		mainFreq        0.63206
		venusFreq       0.59535
		venusMagn       0.83591
		mareDensity     0
		terraceProb     0.33627
		erosion         0
		montesMagn      0.54994
		montesFreq      3.7376
		montesSpiky     0.98285
		montesFraction  0.56023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12851
		hillsFraction   0.40479
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25515
		craterFreq      0.1889
		craterDensity   0.84559
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43514
		volcanoTemp     247.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.2527
		BumpOffset      3.1263
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
		PeriodDays      0.373634238
		SemiMajorAxisKm 177116.112
		Eccentricity    8.27579668e-06
		Inclination     5.37873572e-05
		AscendingNode   -179.542922
		ArgOfPericenter 168.870754
		MeanAnomaly     43.028542
	}
}

DwarfMoon	"8.D5"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            9.1339e-10
	Radius          8.976
	InertiaMoment   0.39851
	Oblateness     (0.341, 0.438, 0.000)
	Obliquity       0.011256
	EqAscendNode    173.21
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.534 0.524 0.521)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.56588
		Randomize      (0.335, 0.997, -0.776)
		colorDistMagn   0.68682
		colorDistFreq   0.0070335
		detailScale     32
		snowLevel       2
		tropicLatitude  0.062972
		icecapLatitude  0.53747
		icecapHeight    0.18694
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2463
		heightTempGrad  0.625
		beachWidth      0.0011694
		tropicWidth     0.07
		mainFreq        0.46711
		venusFreq       0.61098
		venusMagn       0.81526
		mareDensity     0
		terraceProb     0.65389
		erosion         0
		montesMagn      0.39514
		montesFreq      2.9321
		montesSpiky     0.94921
		montesFraction  0.63307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.19357
		hillsFraction   0.58927
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23228
		craterFreq      0.24647
		craterDensity   0.94414
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49336
		volcanoTemp     350.68
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.0784
		BumpOffset      4.0392
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
		PeriodDays      0.411521747
		SemiMajorAxisKm 188895.735
		Eccentricity    9.14792558e-06
		Inclination     0.0112564249
		AscendingNode   173.20993
		ArgOfPericenter -149.533706
		MeanAnomaly     -136.209594
	}
}

DwarfMoon	"8.D6"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.3118e-09
	Radius          8.3945
	InertiaMoment   0.39981
	Oblateness     (0.340, 0.410, 0.000)
	Obliquity       0.0084112
	EqAscendNode    167.98
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.710 0.708 0.707)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13495
		Randomize      (0.606, 0.827, -0.443)
		colorDistMagn   0.70034
		colorDistFreq   0.03664
		detailScale     32
		snowLevel       2
		tropicLatitude  0.062934
		icecapLatitude  0.51606
		icecapHeight    0.087466
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14401
		heightTempGrad  0.625
		beachWidth      0.00061722
		tropicWidth     0.07
		mainFreq        0.7422
		venusFreq       0.6278
		venusMagn       0.79968
		mareDensity     0
		terraceProb     0.21664
		erosion         0
		montesMagn      0.51994
		montesFreq      3.8874
		montesSpiky     0.90833
		montesFraction  0.71956
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15226
		hillsFraction   0.69237
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26844
		craterFreq      0.20432
		craterDensity   0.75292
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54157
		volcanoTemp     384.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.5551
		BumpOffset      3.7775
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
		PeriodDays      0.443220767
		SemiMajorAxisKm 198475.555
		Eccentricity    1.73768073e-06
		Inclination     0.00841116141
		AscendingNode   167.979736
		ArgOfPericenter -34.2497204
		MeanAnomaly     -44.326447
	}
}

DwarfMoon	"8.D7"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.8613e-09
	Radius          11.38
	InertiaMoment   0.39829
	Oblateness     (0.339, 0.395, 0.000)
	Obliquity       0.0093974
	EqAscendNode    174.73
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.493 0.489 0.486)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70402
		Randomize      (0.876, 0.657, -0.110)
		colorDistMagn   0.71386
		colorDistFreq   0.10906
		detailScale     32
		snowLevel       2
		tropicLatitude  0.062947
		icecapLatitude  0.49471
		icecapHeight    0.4132
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44172
		heightTempGrad  0.625
		beachWidth      0.00096508
		tropicWidth     0.07
		mainFreq        0.53591
		venusFreq       0.64867
		venusMagn       0.78691
		mareDensity     0
		terraceProb     0.34736
		erosion         0
		montesMagn      0.31874
		montesFreq      2.9725
		montesSpiky     0.83883
		montesFraction  0.86503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.23959
		hillsFraction   0.88389
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23983
		craterFreq      0.26273
		craterDensity   0.88693
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44756
		volcanoTemp     347.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.242
		BumpOffset      5.1209
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
		PeriodDays      0.4612457
		SemiMajorAxisKm 203820.805
		Eccentricity    9.82540585e-05
		Inclination     0.00939742413
		AscendingNode   174.725028
		ArgOfPericenter 22.0548326
		MeanAnomaly     -17.3236827
	}
}

Moon	"8.1"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.035945
	Radius          2599
	InertiaMoment   0.35484
	Oblateness      0.0076239
	Obliquity       -1.0331
	EqAscendNode    82.249
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.674 0.671 0.667)

	Surface
	{
		Preset         "aquaria_airless_ganymede.cfg"
		SurfStyle       0.27309
		Randomize      (-0.854, 0.488, 0.223)
		colorDistMagn   0.060668
		colorDistFreq   233.76
		detailScale     8192
		drivenDarkening 0.7
		seaLevel        0.22393
		snowLevel       2
		tropicLatitude  0.050514
		icecapLatitude  0.87001
		icecapHeight    0.03393
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33942
		heightTempGrad  0.625
		beachWidth      0.0010129
		tropicWidth     0.07
		mainFreq        1.6309
		venusFreq       1.6151
		venusMagn       0.25399
		mareFreq        1.903
		mareDensity     0.11843
		terraceProb     0.27078
		erosion         0
		montesMagn      0.19626
		montesFreq      157.98
		montesSpiky     0.89514
		montesFraction  0.50023
		dunesMagn       0.026617
		dunesFreq       22.569
		dunesFraction   0.053939
		hillsMagn       0.11011
		hillsFreq       311.43
		hillsFraction   0.39226
		hills2Fraction  0.20697
		riversMagn      0
		riversFreq      3.4811
		riversSin       7.3977
		riftsMagn       0
		riftsFreq       3.084
		riftsSin        7.143
		canyonsMagn     0.49926
		canyonsFreq     0.92677
		canyonsFraction 0
		cracksMagn      0.045048
		cracksFreq      1.7342
		cracksOctaves   1
		craterMagn      0.54775
		craterFreq      6.7748
		craterDensity   0.79772
		craterOctaves   20
		craterRayedFactor 0.22262
		volcanoMagn     0.48019
		volcanoFreq     0.64574
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.24339
		volcanoRadius   0.35365
		volcanoTemp     235.75
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
		PeriodDays      0.947439865
		SemiMajorAxisKm 329360.297
		Eccentricity    0.000100925063
		Inclination     -1.03314743
		AscendingNode   82.2494024
		ArgOfPericenter -65.200841
		MeanAnomaly     71.5362099
	}
}

Moon	"8.2"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.05219
	Radius          2875
	InertiaMoment   0.34611
	Oblateness      0.0017611
	Obliquity       -0.8296
	EqAscendNode    93.474
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.458 0.453 0.446)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.84215
		Randomize      (-0.583, 0.318, 0.556)
		colorDistMagn   0.072387
		colorDistFreq   413.91
		detailScale     8192
		drivenDarkening 0.7
		seaLevel        0.25314
		snowLevel       2
		tropicLatitude  0.052681
		icecapLatitude  0.62384
		icecapHeight    0.026178
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23713
		heightTempGrad  0.625
		beachWidth      0.0010608
		tropicWidth     0.07
		mainFreq        1.9105
		venusFreq       0.49137
		venusMagn       0
		mareFreq        2.0395
		mareDensity     0.15069
		terraceProb     0.22532
		erosion         0
		montesMagn      0.16658
		montesFreq      144.19
		montesSpiky     0.96686
		montesFraction  0.0037558
		dunesMagn       0.042692
		dunesFreq       27.185
		dunesFraction   0.78536
		hillsMagn       0.10278
		hillsFreq       355.44
		hillsFraction   0.92744
		hills2Fraction  0.2655
		riversMagn      0
		riversFreq      2.694
		riversSin       6.8891
		riftsMagn       0
		riftsFreq       4.6691
		riftsSin        6.4817
		canyonsMagn     0.49695
		canyonsFreq     1.1637
		canyonsFraction 0
		cracksMagn      0.069698
		cracksFreq      1.7538
		cracksOctaves   1
		craterMagn      0.61972
		craterFreq      9.0929
		craterDensity   0.92641
		craterOctaves   20
		craterRayedFactor 0.19638
		volcanoMagn     0.62006
		volcanoFreq     0.77521
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.28477
		volcanoRadius   0.56502
		volcanoTemp     372.98
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
		PeriodDays      1.87285991
		SemiMajorAxisKm 518773.908
		Eccentricity    0.000407856598
		Inclination     -0.829602525
		AscendingNode   93.4743963
		ArgOfPericenter 29.9017279
		MeanAnomaly     -5.43747621
	}
}

Moon	"8.3"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.0075864
	Radius          1547
	InertiaMoment   0.38459
	Obliquity       -0.36682
	EqAscendNode    -107.27
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.639 0.635 0.627)

	Surface
	{
		Preset         "aquaria_airless_titan.cfg"
		SurfStyle       0.41122
		Randomize      (-0.313, 0.148, 0.889)
		colorDistMagn   0.07323
		colorDistFreq   181.8
		detailScale     4096
		drivenDarkening 0.7
		seaLevel        0.24872
		snowLevel       2
		tropicLatitude  0.058114
		icecapLatitude  0.98093
		icecapHeight    0.0048159
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13484
		heightTempGrad  0.625
		beachWidth      0.00080864
		tropicWidth     0.07
		mainFreq        1.7253
		venusFreq       0.69125
		venusMagn       0
		mareFreq        0.67257
		mareDensity     0.10606
		terraceProb     0.35892
		erosion         0
		montesMagn      0.061631
		montesFreq      66.948
		montesSpiky     0.9384
		montesFraction  0.50728
		dunesMagn       0.053314
		dunesFreq       11.614
		dunesFraction   0.51678
		hillsMagn       0.12905
		hillsFreq       170.36
		hillsFraction   0.46262
		hills2Fraction  0.024025
		riversMagn      0
		riversFreq      2.3818
		riversSin       7.1338
		riftsMagn       0
		riftsFreq       1.9614
		riftsSin        6.9236
		canyonsMagn     0.4491
		canyonsFreq     0.47339
		canyonsFraction 0
		cracksMagn      0.037837
		cracksFreq      0.61178
		cracksOctaves   0
		craterMagn      0.58232
		craterFreq      4.1328
		craterDensity   0.76265
		craterOctaves   19
		craterRayedFactor 0.12271
		volcanoMagn     0.21018
		volcanoFreq     0.58362
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.2249
		volcanoFlows    0.13261
		volcanoRadius   0.17527
		volcanoTemp     237.73
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
		PeriodDays      3.7024053
		SemiMajorAxisKm 817118.425
		Eccentricity    0.00425051292
		Inclination     -0.366815628
		AscendingNode   -107.270469
		ArgOfPericenter -50.2348667
		MeanAnomaly     -52.7139305
	}
}

Moon	"8.4"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.11018
	Radius          3759.5
	InertiaMoment   0.33188
	Obliquity       0.52563
	EqAscendNode    140.98
	TidalLocked     true

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.569 0.347 0.259)

	Surface
	{
		Preset         "aquaria_arid_white.cfg"
		SurfStyle       0.98029
		Randomize      (-0.042, -0.022, -0.778)
		colorDistMagn   0.074097
		colorDistFreq   524.97
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.24465
		snowLevel       2
		tropicLatitude  0.070033
		icecapLatitude  0.74451
		icecapHeight    0.086213
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43255
		heightTempGrad  0.625
		beachWidth      0.0008565
		tropicWidth     0.07
		mainFreq        2.0208
		venusFreq       0.83329
		venusMagn       0
		mareFreq        2.027
		mareDensity     0.15288
		terraceProb     0.11277
		erosion         0
		montesMagn      0.20614
		montesFreq      133.35
		montesSpiky     0.90368
		montesFraction  0.010809
		dunesMagn       0.033454
		dunesFreq       38.417
		dunesFraction   0.24821
		hillsMagn       0.11077
		hillsFreq       525.53
		hillsFraction   0.99781
		hills2Fraction  0.082553
		riversMagn      0
		riversFreq      1.8216
		riversSin       7.4767
		riftsMagn       0
		riftsFreq       2.2505
		riftsSin        7.7426
		canyonsMagn     0.38394
		canyonsFreq     1.3424
		canyonsFraction 0
		cracksMagn      0.05362
		cracksFreq      2.2952
		cracksOctaves   2
		craterMagn      0.52634
		craterFreq      7.2259
		craterDensity   0.87051
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.64787
		volcanoFreq     0.69226
		volcanoDensity  0.37582
		volcanoOctaves  3
		volcanoActivity 1.4204
		volcanoFlows    0.27329
		volcanoRadius   0.51908
		volcanoTemp     312.49
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.99985
		SpotBright      2.4999
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          73.084
		Density         5.9289e-05
		Pressure        9.6977e-06
		Greenhouse      0.03726
		Bright          1.5752
		Opacity         0
		SkyLight        0.52506
		Hue             0.013902
		Saturation      0.80052

		Composition
		{
			N2        	94.986
			CO        	5.0126
			Ar        	0.0012075
			O2        	0.00063229
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      7.31816315
		SemiMajorAxisKm 1287039.52
		Eccentricity    0.000363306515
		Inclination     0.525632689
		AscendingNode   140.977036
		ArgOfPericenter -121.178575
		MeanAnomaly     5.54286288
	}
}

Moon	"8.5"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.15835
	Radius          3998.5
	InertiaMoment   0.33151
	Obliquity       0.63482
	EqAscendNode    -16.072
	TidalLocked     true

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.646 0.583 0.544)

	Surface
	{
		Preset         "aquaria_arid_titan.cfg"
		SurfStyle       0.54936
		Randomize      (0.228, -0.192, -0.445)
		colorDistMagn   0.074991
		colorDistFreq   459.53
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.24086
		snowLevel       2
		tropicLatitude  0.071586
		icecapLatitude  0.49772
		icecapHeight    0.2032
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33026
		heightTempGrad  0.625
		beachWidth      0.0012044
		tropicWidth     0.07
		mainFreq        1.8049
		venusFreq       0.95655
		venusMagn       0
		mareFreq        1.6172
		mareDensity     0.11165
		terraceProb     0.23404
		erosion         0
		montesMagn      0.2216
		montesFreq      229.25
		montesSpiky     0.84977
		montesFraction  0.51434
		dunesMagn       0.041478
		dunesFreq       32.914
		dunesFraction   0.97963
		hillsMagn       0.13465
		hillsFreq       470.78
		hillsFraction   0.53299
		hills2Fraction  0.14108
		riversMagn      0
		riversFreq      3.8948
		riversSin       8.2791
		riftsMagn       0
		riftsFreq       2.4485
		riftsSin        4.7136
		canyonsMagn     0.65582
		canyonsFreq     1.6689
		canyonsFraction 0
		cracksMagn      0.072725
		cracksFreq      1.5825
		cracksOctaves   2
		craterMagn      0.63115
		craterFreq      12.028
		craterDensity   0.9477
		craterOctaves   21
		craterRayedFactor 0.17396
		volcanoMagn     0.6433
		volcanoFreq     0.79005
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.10699
		volcanoRadius   0.49803
		volcanoTemp     317.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.99992
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          65.388
		Density         3.0711e-05
		Pressure        5.1088e-06
		Greenhouse      0.033866
		Bright          1.3857
		Opacity         0
		SkyLight        0.46189
		Hue             0.0054595
		Saturation      0.68257

		Composition
		{
			N2        	92.292
			CO        	7.679
			Ar        	0.01399
			Ne        	0.013675
			O2        	0.0017526
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      14.4658052
		SemiMajorAxisKm 2027210.1
		Eccentricity    0.0109603406
		Inclination     0.634815054
		AscendingNode   -16.072314
		ArgOfPericenter 156.731316
		MeanAnomaly     -3.47597558
	}
}

Moon	"8.6"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.022
	Radius          2214.3
	InertiaMoment   0.36188
	Obliquity       -0.08133
	EqAscendNode    -39.537
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.816 0.774 0.737)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.11842
		Randomize      (0.498, -0.362, -0.112)
		colorDistMagn   0.075916
		colorDistFreq   301.46
		detailScale     8192
		drivenDarkening 0.33163
		seaLevel        0.23729
		snowLevel       2
		tropicLatitude  0.061753
		icecapLatitude  0.83955
		icecapHeight    0.074847
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22796
		heightTempGrad  0.625
		beachWidth      0.00095221
		tropicWidth     0.07
		mainFreq        1.5964
		venusFreq       1.0757
		venusMagn       0
		mareFreq        1.3002
		mareDensity     0.15508
		terraceProb     0.37104
		erosion         0
		montesMagn      0.15116
		montesFreq      110.5
		montesSpiky     0.99129
		montesFraction  0.017862
		dunesMagn       0.050853
		dunesFreq       25.423
		dunesFraction   0.71105
		hillsMagn       0.11694
		hillsFreq       230.69
		hillsFraction   0.068171
		hills2Fraction  0.19961
		riversMagn      0
		riversFreq      3.4877
		riversSin       4.3544
		riftsMagn       0
		riftsFreq       2.6097
		riftsSin        5.2818
		canyonsMagn     0.56997
		canyonsFreq     0.69714
		canyonsFraction 0
		cracksMagn      0.039853
		cracksFreq      1.3529
		cracksOctaves   3
		craterMagn      0.59269
		craterFreq      5.5933
		craterDensity   0.80217
		craterOctaves   20
		craterRayedFactor 0.099992
		volcanoMagn     0.40474
		volcanoFreq     0.60231
		volcanoDensity  0.19479
		volcanoOctaves  3
		volcanoActivity 0.082758
		volcanoFlows    0.26211
		volcanoRadius   0.30185
		volcanoTemp     322
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
		PeriodDays      28.5995368
		SemiMajorAxisKm 3193049.42
		Eccentricity    0.00751004503
		Inclination     -0.0813301303
		AscendingNode   -39.5368818
		ArgOfPericenter 124.177714
		MeanAnomaly     116.820594
	}
}

Moon	"8.7"
{
	ParentBody     "8"
	Class          "Aquaria"
	Mass            0.027627
	Radius          2395.2
	InertiaMoment   0.35697
	Obliquity       -0.89854
	EqAscendNode    -41.178
	TidalLocked     true

	AlbedoBond      0.43
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.659 0.571 0.456)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.68749
		Randomize      (0.769, -0.532, 0.221)
		colorDistMagn   0.076876
		colorDistFreq   268.63
		detailScale     8192
		drivenDarkening 0.21055
		seaLevel        0.2339
		snowLevel       2
		tropicLatitude  0.05193
		icecapLatitude  0.58139
		icecapHeight    0.22176
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12567
		heightTempGrad  0.625
		beachWidth      0.0010001
		tropicWidth     0.07
		mainFreq        1.8854
		venusFreq       1.2022
		venusMagn       0
		mareFreq        1.1297
		mareDensity     0.11615
		terraceProb     0.12216
		erosion         0
		montesMagn      0.18588
		montesFreq      103.05
		montesSpiky     0.96524
		montesFraction  0.52139
		dunesMagn       0.031901
		dunesFreq       21.249
		dunesFraction   0.44248
		hillsMagn       0.14115
		hillsFreq       303.65
		hillsFraction   0.60335
		hills2Fraction  0.25814
		riversMagn      0
		riversFreq      3.2038
		riversSin       4.7653
		riftsMagn       0
		riftsFreq       2.7524
		riftsSin        5.6773
		canyonsMagn     0.51903
		canyonsFreq     0.8713
		canyonsFraction 0
		cracksMagn      0.05539
		cracksFreq      0.9487
		cracksOctaves   3
		craterMagn      0.54826
		craterFreq      8.3331
		craterDensity   0.89077
		craterOctaves   20
		craterRayedFactor 0.23306
		volcanoMagn     0.45587
		volcanoFreq     0.70281
		volcanoDensity  0.26034
		volcanoOctaves  3
		volcanoActivity 0.13077
		volcanoFlows    0.065434
		volcanoRadius   0.32255
		volcanoTemp     326.75
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
		PeriodDays      56.5349451
		SemiMajorAxisKm 5029357.63
		Eccentricity    0.0415429672
		Inclination     -0.89854161
		AscendingNode   -41.1775688
		ArgOfPericenter -174.802047
		MeanAnomaly     112.341515
	}
}

DwarfMoon	"8.D8"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.3878e-08
	Radius          24.029
	InertiaMoment   0.39699
	RotationPeriod  433.49
	RotationEpoch   0
	Obliquity       163.24
	EqAscendNode    -78.865

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.797 0.754 0.681)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25656
		Randomize      (-0.961, -0.702, 0.554)
		colorDistMagn   0.82326
		colorDistFreq   0.38104
		detailScale     64
		snowLevel       2
		tropicLatitude  0.24551
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
		humidity        0.42338
		heightTempGrad  0.625
		beachWidth      0.00074792
		tropicWidth     0.07
		mainFreq        0.42522
		venusFreq       0.64704
		venusMagn       0.72128
		mareDensity     0
		terraceProb     0.24282
		erosion         0
		montesMagn      0.51559
		montesFreq      3.1351
		montesSpiky     0.82987
		montesFraction  0.32051
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3706
		hillsFraction   0.64377
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21264
		craterFreq      0.21423
		craterDensity   0.90884
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58066
		volcanoTemp     404.85
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
		PeriodDays      2268.58959
		SemiMajorAxisKm 58947345
		Eccentricity    0.21619629
		Inclination     171.440579
		AscendingNode   -78.2301736
		ArgOfPericenter 71.8175073
		MeanAnomaly     -34.7997736
	}
}

DwarfMoon	"8.D9"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            3.2403e-08
	Radius          29.492
	InertiaMoment   0.39895
	RotationPeriod  653.97
	RotationEpoch   0
	Obliquity       129.36
	EqAscendNode    109.7

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.643 0.470 0.397)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.82563
		Randomize      (-0.690, -0.872, 0.887)
		colorDistMagn   0.83725
		colorDistFreq   0.2916
		detailScale     128
		snowLevel       2
		tropicLatitude  0.74254
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
		humidity        0.32109
		heightTempGrad  0.625
		beachWidth      0.00049577
		tropicWidth     0.07
		mainFreq        0.67165
		venusFreq       0.68252
		venusMagn       0.71505
		mareDensity     0
		terraceProb     0.38382
		erosion         0
		montesMagn      0.29002
		montesFreq      2.4189
		montesSpiky     0.97938
		montesFraction  0.42517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8521
		hillsFraction   0.75944
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24816
		craterFreq      0.14095
		craterDensity   1.0357
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47329
		volcanoTemp     158.27
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
		PeriodDays      2272.32681
		SemiMajorAxisKm 59012066.1
		Eccentricity    0.208495283
		Inclination     142.490519
		AscendingNode   114.161293
		ArgOfPericenter -4.06339536
		MeanAnomaly     -148.01893
	}
}

DwarfMoon	"8.D10"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            4.3975e-08
	Radius          28.811
	InertiaMoment   0.39633
	RotationPeriod  410.57
	RotationEpoch   0
	Obliquity       81.573
	EqAscendNode    22.124

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.788 0.679 0.614)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39469
		Randomize      (-0.420, 0.958, -0.780)
		colorDistMagn   0.85134
		colorDistFreq   0.51886
		detailScale     128
		snowLevel       2
		tropicLatitude  0.99509
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
		humidity        0.2188
		heightTempGrad  0.625
		beachWidth      0.00054362
		tropicWidth     0.07
		mainFreq        0.49674
		venusFreq       0.52786
		venusMagn       0.70903
		mareDensity     0
		terraceProb     0.13138
		erosion         0
		montesMagn      0.48736
		montesFreq      3.1774
		montesSpiky     0.9453
		montesFraction  0.50291
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.492
		hillsFraction   0.50728
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22539
		craterFreq      0.22674
		craterDensity   0.85118
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5188
		volcanoTemp     331.69
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
		PeriodDays      2275.90779
		SemiMajorAxisKm 59074048.3
		Eccentricity    0.270359704
		Inclination     139.642733
		AscendingNode   25.4191594
		ArgOfPericenter 122.304426
		MeanAnomaly     111.255762
	}
}

DwarfMoon	"8.D11"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            5.9735e-08
	Radius          36.161
	InertiaMoment   0.39876
	RotationPeriod  597.31
	RotationEpoch   0
	Obliquity       23.634
	EqAscendNode    -147.6

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.542 0.477 0.422)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.96376
		Randomize      (-0.150, 0.788, -0.447)
		colorDistMagn   0.86556
		colorDistFreq   0.372
		detailScale     128
		snowLevel       2
		tropicLatitude  0.44572
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
		humidity        0.1165
		heightTempGrad  0.625
		beachWidth      0.00089148
		tropicWidth     0.07
		mainFreq        0.3002
		venusFreq       0.55765
		venusMagn       0.70318
		mareDensity     0
		terraceProb     0.25169
		erosion         0
		montesMagn      0.61827
		montesFreq      2.4917
		montesSpiky     0.90301
		montesFraction  0.57391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.9148
		hillsFraction   0.62803
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25721
		craterFreq      0.17901
		craterDensity   0.94961
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.63479
		volcanoTemp     225.1
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
		PeriodDays      2278.4866
		SemiMajorAxisKm 59118664
		Eccentricity    0.0721256685
		Inclination     6.64315952
		AscendingNode   -145.474217
		ArgOfPericenter 151.388275
		MeanAnomaly     -25.3286995
	}
}

DwarfMoon	"8.D12"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            8.1291e-08
	Radius          33.989
	InertiaMoment   0.39366
	RotationPeriod  266.69
	RotationEpoch   0
	Obliquity       154.36
	EqAscendNode    171.72

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.717 0.667 0.610)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53283
		Randomize      (0.121, 0.618, -0.114)
		colorDistMagn   0.87991
		colorDistFreq   0.6835
		detailScale     128
		snowLevel       2
		tropicLatitude  0.39093
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
		humidity        0.41421
		heightTempGrad  0.625
		beachWidth      0.0015393
		tropicWidth     0.07
		mainFreq        0.56582
		venusFreq       0.57696
		venusMagn       0.69748
		mareDensity     0
		terraceProb     0.3974
		erosion         0
		montesMagn      0.45807
		montesFreq      3.2209
		montesSpiky     0.82483
		montesFraction  0.64818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0158
		hillsFraction   0.73696
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23386
		craterFreq      0.23952
		craterDensity   0.76606
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48025
		volcanoTemp     258.52
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
		PeriodDays      2281.00186
		SemiMajorAxisKm 59162164.1
		Eccentricity    0.384552425
		Inclination     222.299092
		AscendingNode   177.672133
		ArgOfPericenter 4.97840859
		MeanAnomaly     151.761085
	}
}

DwarfMoon	"8.D13"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.1093e-07
	Radius          44.445
	InertiaMoment   0.39855
	RotationPeriod  544.87
	RotationEpoch   0
	Obliquity       -14.329
	EqAscendNode    180.35

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.531 0.463 0.358)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.1019
		Randomize      (0.391, 0.448, 0.219)
		colorDistMagn   0.89441
		colorDistFreq   0.43386
		detailScale     128
		snowLevel       2
		tropicLatitude  0.20485
		icecapLatitude  0.95886
		icecapHeight    0.023689
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31192
		heightTempGrad  0.625
		beachWidth      0.00068719
		tropicWidth     0.07
		mainFreq        0.4025
		venusFreq       0.59327
		venusMagn       0.69189
		mareDensity     0
		terraceProb     0.14046
		erosion         0
		montesMagn      0.57366
		montesFreq      2.5551
		montesSpiky     0.97822
		montesFraction  0.73997
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.6611
		hillsFraction   0.47661
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27333
		craterFreq      0.197
		craterDensity   0.89186
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5257
		volcanoTemp     361.94
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
		PeriodDays      2284.71061
		SemiMajorAxisKm 59226275.8
		Eccentricity    0.0669100421
		Inclination     -21.4554866
		AscendingNode   175.131907
		ArgOfPericenter 96.0572535
		MeanAnomaly     82.8668906
	}
}

DwarfMoon	"8.D14"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.5193e-07
	Radius          42.101
	InertiaMoment   0.39984
	RotationPeriod  251.14
	RotationEpoch   0
	Obliquity       133.36
	EqAscendNode    -75.265

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.711 0.587 0.540)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67096
		Randomize      (0.661, 0.278, 0.552)
		colorDistMagn   0.90908
		colorDistFreq   0.99087
		detailScale     128
		snowLevel       2
		tropicLatitude  0.69404
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
		humidity        0.20963
		heightTempGrad  0.625
		beachWidth      0.00073504
		tropicWidth     0.07
		mainFreq        0.64441
		venusFreq       0.60887
		venusMagn       0.68641
		mareDensity     0
		terraceProb     0.26066
		erosion         0
		montesMagn      0.42454
		montesFreq      3.2663
		montesSpiky     0.94397
		montesFraction  0.9249
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7461
		hillsFraction   0.61211
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24132
		craterFreq      0.25396
		craterDensity   1.0015
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41594
		volcanoTemp     325.35
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
		PeriodDays      2286.89911
		SemiMajorAxisKm 59264091.2
		Eccentricity    0.0908772026
		Inclination     131.166582
		AscendingNode   -81.6479944
		ArgOfPericenter 85.4939262
		MeanAnomaly     -2.90504468
	}
}

DwarfMoon	"8.D15"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.0908e-07
	Radius          54.899
	InertiaMoment   0.39833
	RotationPeriod  496.34
	RotationEpoch   0
	Obliquity       123.64
	EqAscendNode    18.587

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.514 0.375 0.300)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.24003
		Randomize      (0.932, 0.108, 0.885)
		colorDistMagn   0.92393
		colorDistFreq   0.35937
		detailScale     256
		snowLevel       2
		tropicLatitude  0.80543
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
		humidity        0.10734
		heightTempGrad  0.625
		beachWidth      0.0007829
		tropicWidth     0.07
		mainFreq        0.47699
		venusFreq       0.62542
		venusMagn       0.681
		mareDensity     0
		terraceProb     0.41196
		erosion         0
		montesMagn      0.54045
		montesFreq      2.612
		montesSpiky     0.90117
		montesFraction  0.33321
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.329
		hillsFraction   0.71713
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21442
		craterFreq      0.21097
		craterDensity   0.83099
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48685
		volcanoTemp     358.77
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
		PeriodDays      2292.63826
		SemiMajorAxisKm 59363201.6
		Eccentricity    0.240481679
		Inclination     166.371202
		AscendingNode   26.0310381
		ArgOfPericenter -160.806755
		MeanAnomaly     158.615698
	}
}

DwarfMoon	"8.D16"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.8945e-07
	Radius          61.184
	InertiaMoment   0.39968
	RotationPeriod  433.57
	RotationEpoch   0
	Obliquity       92.974
	EqAscendNode    162.08

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.711 0.571 0.466)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.8091
		Randomize      (-0.798, -0.061, -0.782)
		colorDistMagn   0.93898
		colorDistFreq   1.9713
		detailScale     256
		snowLevel       2
		tropicLatitude  0.99504
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
		humidity        0.40504
		heightTempGrad  0.625
		beachWidth      0.0014308
		tropicWidth     0.07
		mainFreq        0.7662
		venusFreq       0.64546
		venusMagn       0.67565
		mareDensity     0
		terraceProb     0.14942
		erosion         0
		montesMagn      0.37894
		montesFreq      3.3139
		montesSpiky     0.8193
		montesFraction  0.43334
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.075
		hillsFraction   0.43177
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24898
		craterFreq      0.2734
		craterDensity   0.93119
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53313
		volcanoTemp     322.19
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
		PeriodDays      2297.49508
		SemiMajorAxisKm 59447010.4
		Eccentricity    0.0460196715
		Inclination     20.660303
		AscendingNode   168.353862
		ArgOfPericenter -170.733072
		MeanAnomaly     -102.810024
	}
}

DwarfMoon	"8.D17"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            4.036e-07
	Radius          57.959
	InertiaMoment   0.39809
	RotationPeriod  250.91
	RotationEpoch   0
	Obliquity       163.93
	EqAscendNode    108.86

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.771 0.769 0.768)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.37817
		Randomize      (-0.527, -0.231, -0.449)
		colorDistMagn   0.95425
		colorDistFreq   2.8752
		detailScale     256
		snowLevel       2
		tropicLatitude  0.23391
		icecapLatitude  0.90246
		icecapHeight    0.072233
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30275
		heightTempGrad  0.625
		beachWidth      0.0011786
		tropicWidth     0.07
		mainFreq        0.54567
		venusFreq       0.67873
		venusMagn       0.67035
		mareDensity     0
		terraceProb     0.26976
		erosion         0
		montesMagn      0.51127
		montesFreq      2.6643
		montesSpiky     0.97705
		montesFraction  0.50989
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.7138
		hillsFraction   0.59574
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22634
		craterFreq      0.22361
		craterDensity   0.69965
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43482
		volcanoTemp     215.6
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
		PeriodDays      2299.32953
		SemiMajorAxisKm 59478650.1
		Eccentricity    0.211170804
		Inclination     136.543597
		AscendingNode   113.96653
		ArgOfPericenter -164.487881
		MeanAnomaly     22.5775344
	}
}

DwarfMoon	"8.D18"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            5.6772e-07
	Radius          76.583
	InertiaMoment   0.39951
	RotationPeriod  393.07
	RotationEpoch   0
	Obliquity       83.07
	EqAscendNode    101.35

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.554 0.551 0.547)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94723
		Randomize      (-0.257, -0.401, -0.116)
		colorDistMagn   0.96976
		colorDistFreq   2.8963
		detailScale     256
		snowLevel       2
		tropicLatitude  0.99733
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
		humidity        0.20046
		heightTempGrad  0.625
		beachWidth      0.00092646
		tropicWidth     0.07
		mainFreq        0.37787
		venusFreq       0.52481
		venusMagn       0.66507
		mareDensity     0
		terraceProb     0.42774
		erosion         0
		montesMagn      0.69899
		montesFreq      3.3645
		montesSpiky     0.94264
		montesFraction  0.58079
		dunesFraction   0
		hillsMagn       0
		hillsFreq       13.755
		hillsFraction   0.69901
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25832
		craterFreq      0.17299
		craterDensity   0.87464
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49323
		volcanoTemp     319.02
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
		PeriodDays      2302.69643
		SemiMajorAxisKm 59536698.9
		Eccentricity    0.423775934
		Inclination     140.610197
		AscendingNode   95.2912024
		ArgOfPericenter 44.2643742
		MeanAnomaly     113.727339
	}
}

DwarfMoon	"8.D19"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            8.0696e-07
	Radius          72.482
	InertiaMoment   0.39781
	RotationPeriod  228.79
	RotationEpoch   0
	Obliquity       227.84
	EqAscendNode    7.918

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.734 0.733 0.729)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5163
		Randomize      (0.013, -0.571, 0.217)
		colorDistMagn   0.98553
		colorDistFreq   4.1798
		detailScale     256
		snowLevel       2
		tropicLatitude  0.77298
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
		humidity        0.49817
		heightTempGrad  0.625
		beachWidth      0.00067432
		tropicWidth     0.07
		mainFreq        0.61992
		venusFreq       0.55616
		venusMagn       0.65981
		mareDensity     0
		terraceProb     0.15828
		erosion         0
		montesMagn      0.48303
		montesFreq      2.7132
		montesSpiky     0.89931
		montesFraction  0.65594
		dunesFraction   0
		hillsMagn       0
		hillsFreq       11.018
		hillsFraction   0.94004
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23464
		craterFreq      0.2362
		craterDensity   0.9763
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54138
		volcanoTemp     422.44
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
		PeriodDays      2306.51081
		SemiMajorAxisKm 59602428.4
		Eccentricity    0.081097206
		Inclination     130.32334
		AscendingNode   0.686017284
		ArgOfPericenter -108.696985
		MeanAnomaly     57.9044029
	}
}

DwarfMoon	"8.D20"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.1615e-06
	Radius          97.212
	InertiaMoment   0.39934
	RotationPeriod  353.29
	RotationEpoch   0
	Obliquity       178.93
	EqAscendNode    -138.27

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.519 0.511 0.507)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.08537
		Randomize      (0.284, -0.741, 0.550)
		colorDistMagn   0.0035321
		colorDistFreq   4.3483
		detailScale     256
		snowLevel       2
		tropicLatitude  0.050159
		icecapLatitude  0.65461
		icecapHeight    0.13553
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39588
		heightTempGrad  0.625
		beachWidth      0.0013222
		tropicWidth     0.07
		mainFreq        0.45681
		venusFreq       0.57581
		venusMagn       0.65455
		mareDensity     0
		terraceProb     0.279
		erosion         0
		montesMagn      0.61006
		montesFreq      3.4192
		montesSpiky     0.81316
		montesFraction  0.75096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       16.41
		hillsFraction   0.57861
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27678
		craterFreq      0.285
		craterDensity   0.80747
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44732
		volcanoTemp     175.85
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
		PeriodDays      2311.86923
		SemiMajorAxisKm 59694703.9
		Eccentricity    0.280396608
		Inclination     166.347046
		AscendingNode   -131.674726
		ArgOfPericenter 107.551708
		MeanAnomaly     131.394688
	}
}

DwarfMoon	"8.D21"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.6971e-06
	Radius          95.238
	InertiaMoment   0.39749
	RotationPeriod  207.84
	RotationEpoch   0
	Obliquity       -72.655
	EqAscendNode    -14.833

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.698 0.693 0.690)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.65444
		Randomize      (0.554, -0.911, 0.883)
		colorDistMagn   0.037565
		colorDistFreq   6.7764
		detailScale     256
		snowLevel       2
		tropicLatitude  0.9393
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
		humidity        0.29358
		heightTempGrad  0.625
		beachWidth      0.00107
		tropicWidth     0.07
		mainFreq        0.72119
		venusFreq       0.59223
		venusMagn       0.64928
		mareDensity     0
		terraceProb     0.44509
		erosion         0
		montesMagn      0.45334
		montesFreq      2.7594
		montesSpiky     0.97588
		montesFraction  0.099355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       26.541
		hillsFraction   0.682
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24207
		craterFreq      0.35436
		craterDensity   0.91377
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49949
		volcanoTemp     349.27
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
		PeriodDays      2315.90868
		SemiMajorAxisKm 59764218.7
		Eccentricity    0.222988741
		Inclination     -40.3097989
		AscendingNode   -9.40484882
		ArgOfPericenter 118.612219
		MeanAnomaly     78.9968271
	}
}

DwarfMoon	"8.D22"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.5252e-06
	Radius          125.92
	InertiaMoment   0.39916
	RotationPeriod  313.96
	RotationEpoch   0
	Obliquity       231.64
	EqAscendNode    -110.39

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.478 0.475 0.473)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22351
		Randomize      (0.825, 0.919, -0.784)
		colorDistMagn   0.068779
		colorDistFreq   6.7347
		detailScale     512
		snowLevel       2
		tropicLatitude  0.81326
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
		humidity        0.19129
		heightTempGrad  0.625
		beachWidth      0.00081788
		tropicWidth     0.07
		mainFreq        0.52595
		venusFreq       0.60783
		venusMagn       0.64397
		mareDensity     0
		terraceProb     0.16705
		erosion         0
		montesMagn      0.56816
		montesFreq      3.4795
		montesSpiky     0.94129
		montesFraction  0.34509
		dunesFraction   0
		hillsMagn       0
		hillsFreq       40.869
		hillsFraction   0.84059
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21602
		craterFreq      0.51439
		craterDensity   1.0492
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55095
		volcanoTemp     312.69
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
		PeriodDays      2321.33567
		SemiMajorAxisKm 59857547.9
		Eccentricity    0.393418726
		Inclination     188.927829
		AscendingNode   -111.128525
		ArgOfPericenter 111.941032
		MeanAnomaly     157.733448
	}
}

DwarfMoon	"8.D23"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            3.841e-06
	Radius          119.63
	InertiaMoment   0.39707
	RotationPeriod  188.11
	RotationEpoch   0
	Obliquity       219.76
	EqAscendNode    -156.79

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.659 0.657 0.654)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.79257
		Randomize      (-0.905, 0.749, -0.451)
		colorDistMagn   0.097709
		colorDistFreq   10.092
		detailScale     512
		snowLevel       2
		tropicLatitude  0.67623
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
		humidity        0.489
		heightTempGrad  0.625
		beachWidth      0.0011657
		tropicWidth     0.07
		mainFreq        0.35039
		venusFreq       0.62425
		venusMagn       0.63862
		mareDensity     0
		terraceProb     0.28842
		erosion         0
		montesMagn      0.41873
		montesFreq      2.8037
		montesSpiky     0.8974
		montesFraction  0.44133
		dunesFraction   0
		hillsMagn       0
		hillsFreq       33.36
		hillsFraction   0.56029
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24981
		craterFreq      0.5984
		craterDensity   0.85663
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45718
		volcanoTemp     66.104
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
		PeriodDays      2326.52455
		SemiMajorAxisKm 59946714.4
		Eccentricity    0.460684224
		Inclination     221.973164
		AscendingNode   -158.697437
		ArgOfPericenter 92.4208303
		MeanAnomaly     -6.21625543
	}
}

DwarfMoon	"8.D24"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            6.0035e-06
	Radius          168.02
	InertiaMoment   0.39898
	RotationPeriod  274.83
	RotationEpoch   0
	Obliquity       109.89
	EqAscendNode    -172.85

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.441 0.439 0.434)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36164
		Randomize      (-0.635, 0.579, -0.119)
		colorDistMagn   0.12475
		colorDistFreq   10.919
		detailScale     512
		snowLevel       2
		tropicLatitude  0.92313
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
		humidity        0.38671
		heightTempGrad  0.625
		beachWidth      0.0012136
		tropicWidth     0.07
		mainFreq        0.59731
		venusFreq       0.64392
		venusMagn       0.63321
		mareDensity     0
		terraceProb     0.4645
		erosion         0
		montesMagn      0.53585
		montesFreq      3.5477
		montesSpiky     0.80621
		montesFraction  0.51681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       58.741
		hillsFraction   0.66571
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22727
		craterFreq      0.97251
		craterDensity   0.95523
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50575
		volcanoTemp     309.52
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
		PeriodDays      2328.48824
		SemiMajorAxisKm 59980441.5
		Eccentricity    0.303660785
		Inclination     157.031233
		AscendingNode   -170.927512
		ArgOfPericenter -72.9094178
		MeanAnomaly     8.64107304
	}
}

DwarfMoon	"8.D25"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.9543e-11
	Radius          2.2598
	InertiaMoment   0.39648
	RotationPeriod  1515.5
	RotationEpoch   0
	Obliquity       167.61
	EqAscendNode    -119.79

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.623 0.617 0.615)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.93071
		Randomize      (-0.364, 0.409, 0.214)
		colorDistMagn   0.15021
		colorDistFreq   0.0034078
		detailScale     8
		snowLevel       2
		tropicLatitude  0.17234
		icecapLatitude  0.66997
		icecapHeight    0.15109
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28442
		heightTempGrad  0.625
		beachWidth      0.00096144
		tropicWidth     0.07
		mainFreq        0.4359
		venusFreq       0.67535
		venusMagn       0.62771
		mareDensity     0
		terraceProb     0.17577
		erosion         0
		montesMagn      0.3695
		montesFreq      2.8465
		montesSpiky     0.97471
		montesFraction  0.58771
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0086907
		hillsFraction   0.79868
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25948
		craterFreq      0.16568
		craterDensity   0.77722
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56288
		volcanoTemp     202.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.0338
		BumpOffset      1.0169
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
		PeriodDays      2330.93616
		SemiMajorAxisKm 60022472.1
		Eccentricity    0.425486236
		Inclination     139.701469
		AscendingNode   -124.042563
		ArgOfPericenter -149.852759
		MeanAnomaly     17.7437318
	}
}

DwarfMoon	"8.D26"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            3.7359e-11
	Radius          2.627
	InertiaMoment   0.39879
	RotationPeriod  1121.3
	RotationEpoch   0
	Obliquity       -26.748
	EqAscendNode    -126.02

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.802 0.799 0.797)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49978
		Randomize      (-0.094, 0.239, 0.547)
		colorDistMagn   0.17432
		colorDistFreq   0.002378
		detailScale     8
		snowLevel       2
		tropicLatitude  0.40858
		icecapLatitude  0.88484
		icecapHeight    0.03451
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18212
		heightTempGrad  0.625
		beachWidth      0.0013093
		tropicWidth     0.07
		mainFreq        0.68653
		venusFreq       0.52144
		venusMagn       0.62212
		mareDensity     0
		terraceProb     0.29803
		erosion         0
		montesMagn      0.50697
		montesFreq      3.628
		montesSpiky     0.93994
		montesFraction  0.66386
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019988
		hillsFraction   0.54017
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2354
		craterFreq      0.23297
		craterDensity   0.89677
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4656
		volcanoTemp     236.35
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3643
		BumpOffset      1.1821
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
		PeriodDays      2333.45895
		SemiMajorAxisKm 60065772.8
		Eccentricity    0.312028892
		Inclination     -9.73311166
		AscendingNode   -116.439411
		ArgOfPericenter 173.35139
		MeanAnomaly     -146.179812
	}
}

DwarfMoon	"8.D27"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            6.6208e-11
	Radius          3.7426
	InertiaMoment   0.39505
	RotationPeriod  1675.8
	RotationEpoch   0
	Obliquity       123.37
	EqAscendNode    -49.591

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.587 0.581 0.575)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.068843
		Randomize      (0.176, 0.069, 0.880)
		colorDistMagn   0.19726
		colorDistFreq   0.0088532
		detailScale     16
		snowLevel       2
		tropicLatitude  0.80831
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
		humidity        0.47983
		heightTempGrad  0.625
		beachWidth      0.00075715
		tropicWidth     0.07
		mainFreq        0.50639
		venusFreq       0.55462
		venusMagn       0.61641
		mareDensity     0
		terraceProb     0.48678
		erosion         0
		montesMagn      0.67464
		montesFreq      2.8882
		montesSpiky     0.89546
		montesFraction  0.76259
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.035881
		hillsFraction   0.64982
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28189
		craterFreq      0.18873
		craterDensity   1.0101
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5121
		volcanoTemp     269.77
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.3684
		BumpOffset      1.6842
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
		PeriodDays      2335.28622
		SemiMajorAxisKm 60097126
		Eccentricity    0.160080151
		Inclination     185.262007
		AscendingNode   -51.1798886
		ArgOfPericenter 151.907072
		MeanAnomaly     -79.1068522
	}
}

DwarfMoon	"8.D28"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.1103e-10
	Radius          3.8707
	InertiaMoment   0.39859
	RotationPeriod  951.63
	RotationEpoch   0
	Obliquity       111.49
	EqAscendNode    -102.64

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.764 0.762 0.761)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.63791
		Randomize      (0.447, -0.101, -0.787)
		colorDistMagn   0.21919
		colorDistFreq   0.0044306
		detailScale     16
		snowLevel       2
		tropicLatitude  0.91207
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
		humidity        0.37754
		heightTempGrad  0.625
		beachWidth      0.001105
		tropicWidth     0.07
		mainFreq        0.31846
		venusFreq       0.57464
		venusMagn       0.61055
		mareDensity     0
		terraceProb     0.18443
		erosion         0
		montesMagn      0.47867
		montesFreq      3.7288
		montesSpiky     0.79818
		montesFraction  0.16042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.034711
		hillsFraction   0.76912
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24282
		craterFreq      0.24634
		craterDensity   0.83708
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58017
		volcanoTemp     233.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.4836
		BumpOffset      1.7418
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
		PeriodDays      2337.28555
		SemiMajorAxisKm 60131422
		Eccentricity    0.15397336
		Inclination     178.36899
		AscendingNode   -105.39808
		ArgOfPericenter 169.039852
		MeanAnomaly     65.8806831
	}
}

DwarfMoon	"8.D29"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.7853e-10
	Radius          5.2093
	InertiaMoment   0.39987
	RotationPeriod  1468.9
	RotationEpoch   0
	Obliquity       192.72
	EqAscendNode    61.658

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.547 0.544 0.540)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.20698
		Randomize      (0.717, -0.271, -0.454)
		colorDistMagn   0.24023
		colorDistFreq   0.016238
		detailScale     16
		snowLevel       2
		tropicLatitude  0.26944
		icecapLatitude  0.6816
		icecapHeight    0.19829
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27525
		heightTempGrad  0.625
		beachWidth      0.00085286
		tropicWidth     0.07
		mainFreq        0.57599
		venusFreq       0.59118
		venusMagn       0.60452
		mareDensity     0
		terraceProb     0.30788
		erosion         0
		montesMagn      0.60253
		montesFreq      2.9291
		montesSpiky     0.97354
		montesFraction  0.35628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.056004
		hillsFraction   0.51722
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21749
		craterFreq      0.20419
		craterDensity   0.93637
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47314
		volcanoTemp     266.61
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.6883
		BumpOffset      2.3442
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
		PeriodDays      2340.05736
		SemiMajorAxisKm 60178953.1
		Eccentricity    0.139880229
		Inclination     144.587522
		AscendingNode   57.7327063
		ArgOfPericenter -143.747764
		MeanAnomaly     -62.0879042
	}
}

DwarfMoon	"8.D30"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.778e-10
	Radius          5.0647
	InertiaMoment   0.39837
	RotationPeriod  832.28
	RotationEpoch   0
	Obliquity       133.78
	EqAscendNode    73.823

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.727 0.723 0.722)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.77605
		Randomize      (0.988, -0.440, -0.121)
		colorDistMagn   0.26049
		colorDistFreq   0.0060188
		detailScale     16
		snowLevel       2
		tropicLatitude  0.68871
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
		humidity        0.17296
		heightTempGrad  0.625
		beachWidth      0.00090072
		tropicWidth     0.07
		mainFreq        0.4139
		venusFreq       0.60678
		venusMagn       0.59827
		mareDensity     0
		terraceProb     0.51333
		erosion         0
		montesMagn      0.44852
		montesFreq      3.8732
		montesSpiky     0.93857
		montesFraction  0.44915
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.042664
		hillsFraction   0.63409
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25066
		craterFreq      0.26255
		craterDensity   0.72733
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51866
		volcanoTemp     230.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.5582
		BumpOffset      2.2791
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
		PeriodDays      2343.90544
		SemiMajorAxisKm 60244908.6
		Eccentricity    0.401095267
		Inclination     170.533932
		AscendingNode   78.723309
		ArgOfPericenter -34.8647759
		MeanAnomaly     -119.097616
	}
}

DwarfMoon	"8.D31"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            4.2102e-10
	Radius          6.9338
	InertiaMoment   0.39971
	RotationPeriod  1294.6
	RotationEpoch   0
	Obliquity       120.95
	EqAscendNode    -72.157

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.511 0.504 0.500)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.34511
		Randomize      (-0.742, -0.610, 0.212)
		colorDistMagn   0.28005
		colorDistFreq   0.027196
		detailScale     32
		snowLevel       2
		tropicLatitude  0.83238
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
		humidity        0.47066
		heightTempGrad  0.625
		beachWidth      0.0012486
		tropicWidth     0.07
		mainFreq        0.65742
		venusFreq       0.6231
		venusMagn       0.59178
		mareDensity     0
		terraceProb     0.19307
		erosion         0
		montesMagn      0.56285
		montesFreq      2.9695
		montesSpiky     0.89348
		montesFraction  0.52371
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.13793
		hillsFraction   0.74521
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22817
		craterFreq      0.2173
		craterDensity   0.87967
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.63024
		volcanoTemp     193.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.2404
		BumpOffset      3.1202
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
		PeriodDays      2347.42856
		SemiMajorAxisKm 60305262.9
		Eccentricity    0.319651896
		Inclination     202.575335
		AscendingNode   -68.4291711
		ArgOfPericenter 62.0873605
		MeanAnomaly     -141.038088
	}
}

DwarfMoon	"8.D32"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            6.2459e-10
	Radius          6.8344
	InertiaMoment   0.39813
	RotationPeriod  742.58
	RotationEpoch   0
	Obliquity       171.84
	EqAscendNode    14.307

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.691 0.686 0.683)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91418
		Randomize      (-0.472, -0.780, 0.545)
		colorDistMagn   0.29899
		colorDistFreq   0.0067923
		detailScale     32
		snowLevel       2
		tropicLatitude  0.10284
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
		humidity        0.36837
		heightTempGrad  0.625
		beachWidth      0.00069643
		tropicWidth     0.07
		mainFreq        0.48676
		venusFreq       0.64242
		venusMagn       0.58498
		mareDensity     0
		terraceProb     0.31799
		erosion         0
		montesMagn      0.41262
		montesFreq      4.1986
		montesSpiky     0.78859
		montesFraction  0.59467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11891
		hillsFraction   0.48942
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26071
		craterFreq      0.15598
		craterDensity   0.98303
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48011
		volcanoTemp     296.86
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.1509
		BumpOffset      3.0755
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
		PeriodDays      2350.74254
		SemiMajorAxisKm 60362006.7
		Eccentricity    0.477781396
		Inclination     178.46129
		AscendingNode   16.8675235
		ArgOfPericenter -141.841123
		MeanAnomaly     99.554968
	}
}

DwarfMoon	"8.D33"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            9.1038e-10
	Radius          8.9662
	InertiaMoment   0.39954
	RotationPeriod  1153.8
	RotationEpoch   0
	Obliquity       -30.803
	EqAscendNode    -56.529

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.475 0.468 0.461)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48325
		Randomize      (-0.201, -0.950, 0.878)
		colorDistMagn   0.31737
		colorDistFreq   0.042869
		detailScale     32
		snowLevel       2
		tropicLatitude  0.47184
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
		humidity        0.26608
		heightTempGrad  0.625
		beachWidth      0.0013443
		tropicWidth     0.07
		mainFreq        0.27878
		venusFreq       0.67228
		venusMagn       0.57782
		mareDensity     0
		terraceProb     0.54695
		erosion         0
		montesMagn      0.53132
		montesFreq      3.0098
		montesSpiky     0.97236
		montesFraction  0.67197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.1851
		hillsFraction   0.61826
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23616
		craterFreq      0.22978
		craterDensity   0.81475
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52555
		volcanoTemp     190.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.0696
		BumpOffset      4.0348
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
		PeriodDays      2354.10538
		SemiMajorAxisKm 60419560
		Eccentricity    0.372341352
		Inclination     -19.2527844
		AscendingNode   -50.141024
		ArgOfPericenter 145.625889
		MeanAnomaly     57.068209
	}
}

DwarfMoon	"8.D34"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.3077e-09
	Radius          8.7097
	InertiaMoment   0.39786
	RotationPeriod  672.69
	RotationEpoch   0
	Obliquity       -84.402
	EqAscendNode    -2.7155

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.651 0.650 0.647)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.052315
		Randomize      (0.069, 0.880, -0.789)
		colorDistMagn   0.33525
		colorDistFreq   0.066048
		detailScale     32
		snowLevel       2
		tropicLatitude  0.98945
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
		humidity        0.16379
		heightTempGrad  0.625
		beachWidth      0.00079214
		tropicWidth     0.07
		mainFreq        0.55554
		venusFreq       0.51768
		venusMagn       0.57021
		mareDensity     0
		terraceProb     0.2017
		erosion         0
		montesMagn      0.35874
		montesFreq      2.0102
		montesSpiky     0.9372
		montesFraction  0.77498
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15525
		hillsFraction   0.72451
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2944
		craterFreq      0.18405
		craterDensity   0.91874
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41537
		volcanoTemp     503.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.8388
		BumpOffset      3.9194
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
		PeriodDays      2356.73036
		SemiMajorAxisKm 60464466.1
		Eccentricity    0.437093637
		Inclination     -27.9159972
		AscendingNode   2.50568412
		ArgOfPericenter 164.687468
		MeanAnomaly     -101.15162
	}
}

DwarfMoon	"8.D35"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            1.8556e-09
	Radius          11.368
	InertiaMoment   0.39937
	RotationPeriod  1037.1
	RotationEpoch   0
	Obliquity       129.39
	EqAscendNode    158.97

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.434 0.429 0.427)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.62138
		Randomize      (0.340, 0.710, -0.456)
		colorDistMagn   0.35267
		colorDistFreq   0.064695
		detailScale     32
		snowLevel       2
		tropicLatitude  0.74214
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
		humidity        0.4615
		heightTempGrad  0.625
		beachWidth      0.00144
		tropicWidth     0.07
		mainFreq        0.3903
		venusFreq       0.55304
		venusMagn       0.56204
		mareDensity     0
		terraceProb     0.32842
		erosion         0
		montesMagn      0.50269
		montesFreq      3.0501
		montesSpiky     0.89145
		montesFraction  0.19824
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.20929
		hillsFraction   0.45178
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24357
		craterFreq      0.2428
		craterDensity   1.0661
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48671
		volcanoTemp     257.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.231
		BumpOffset      5.1157
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
		PeriodDays      2361.79045
		SemiMajorAxisKm 60550983.4
		Eccentricity    0.498469453
		Inclination     150.803547
		AscendingNode   158.021312
		ArgOfPericenter 4.09972454
		MeanAnomaly     109.701302
	}
}

DwarfMoon	"8.D36"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            2.6064e-09
	Radius          12.027
	InertiaMoment   0.39755
	RotationPeriod  1089.2
	RotationEpoch   0
	Obliquity       226.14
	EqAscendNode    112.57

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.615 0.610 0.608)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19045
		Randomize      (0.610, 0.540, -0.123)
		colorDistMagn   0.36968
		colorDistFreq   0.11669
		detailScale     32
		snowLevel       2
		tropicLatitude  0.75382
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
		humidity        0.3592
		heightTempGrad  0.625
		beachWidth      0.00088785
		tropicWidth     0.07
		mainFreq        0.63171
		venusFreq       0.57346
		venusMagn       0.55316
		mareDensity     0
		terraceProb     0.5948
		erosion         0
		montesMagn      0.65766
		montesFreq      2.2053
		montesSpiky     0.77654
		montesFraction  0.3669
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.41123
		hillsFraction   0.6021
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21884
		craterFreq      0.20061
		craterDensity   0.86196
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53296
		volcanoTemp     220.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.824
		BumpOffset      5.4121
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
		PeriodDays      2367.51739
		SemiMajorAxisKm 60648827.7
		Eccentricity    0.470705311
		Inclination     212.510163
		AscendingNode   105.455852
		ArgOfPericenter -57.9150228
		MeanAnomaly     147.751038
	}
}

DwarfMoon	"8.D37"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            3.6301e-09
	Radius          12.377
	InertiaMoment   0.3992
	RotationPeriod  508.22
	RotationEpoch   0
	Obliquity       209.99
	EqAscendNode    -88.996

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.795 0.792 0.790)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.75952
		Randomize      (0.880, 0.370, 0.210)
		colorDistMagn   0.38632
		colorDistFreq   0.071562
		detailScale     32
		snowLevel       2
		tropicLatitude  0.54176
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
		humidity        0.25691
		heightTempGrad  0.625
		beachWidth      0.0015357
		tropicWidth     0.07
		mainFreq        0.46683
		venusFreq       0.59013
		venusMagn       0.54334
		mareDensity     0
		terraceProb     0.21033
		erosion         0
		montesMagn      0.47427
		montesFreq      3.0907
		montesSpiky     0.97118
		montesFraction  0.45681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.38762
		hillsFraction   0.70581
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25152
		craterFreq      0.25799
		craterDensity   0.96103
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4345
		volcanoTemp     323.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.139
		BumpOffset      5.5697
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
		PeriodDays      2372.3604
		SemiMajorAxisKm 60731508.6
		Eccentricity    0.329466335
		Inclination     161.283734
		AscendingNode   -92.2839339
		ArgOfPericenter 67.9753358
		MeanAnomaly     -70.1188249
	}
}

DwarfMoon	"8.D38"
{
	ParentBody     "8"
	Class          "Asteroid"
	Mass            5.0205e-09
	Radius          15.841
	InertiaMoment   0.39716
	RotationPeriod  1007.8
	RotationEpoch   0
	Obliquity       139.85
	EqAscendNode    -99.611

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.579 0.574 0.568)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.32859
		Randomize      (-0.849, 0.200, 0.543)
		colorDistMagn   0.40261
		colorDistFreq   0.18979
		detailScale     64
		snowLevel       2
		tropicLatitude  0.60841
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
		humidity        0.15462
		heightTempGrad  0.625
		beachWidth      0.00068356
		tropicWidth     0.07
		mainFreq        0.74157
		venusFreq       0.60574
		venusMagn       0.53225
		mareDensity     0
		terraceProb     0.33921
		erosion         0
		montesMagn      0.59555
		montesFreq      2.3237
		montesSpiky     0.93581
		montesFraction  0.53056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.57415
		hillsFraction   0.38148
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22904
		craterFreq      0.2141
		craterDensity   0.78703
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49309
		volcanoTemp     287.36
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.257
		BumpOffset      7.1283
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
		PeriodDays      2374.68883
		SemiMajorAxisKm 60771240
		Eccentricity    0.438712085
		Inclination     136.079534
		AscendingNode   -84.085368
		ArgOfPericenter 162.108897
		MeanAnomaly     127.764712
	}
}

Comet	"C48"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.5797e-17
	Radius          0.015907
	InertiaMoment   0.39991
	RotationPeriod  104.52
	RotationEpoch   0
	Obliquity       185.59
	EqAscendNode    280.55

	AbsMagn         6.4637
	SlopeParam      3.3888
	AlbedoBond      0.033327
	AlbedoGeom      0.039993
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.435 0.432 0.429)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.51553
		Randomize      (-0.459, -0.030, 0.036)
		colorDistMagn   0.43856
		colorDistFreq   5.9548e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.80605
		icecapLatitude  2
		icecapHeight    0.56759
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33059
		heightTempGrad  0.625
		beachWidth      0.0010438
		tropicWidth     0.07
		mainFreq        0.58746
		venusFreq       0.69784
		venusMagn       0.67594
		mareDensity     0
		terraceProb     0.19519
		erosion         0
		montesMagn      0.45872
		montesFreq      3.1628
		montesSpiky     0.86646
		montesFraction  0.60146
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.832e-07
		hillsFraction   0.55447
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20648
		craterFreq      0.21101
		craterDensity   1.0226
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49104
		volcanoTemp     1086.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.037254
		BumpOffset      0.018627
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.0039787
		DustBright  0.025421
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          129.800274
		SemiMajorAxis   28.1228582
		Eccentricity    0.917568381
		Inclination     59.0469665
		AscendingNode   -163.119754
		ArgOfPericenter -143.29374
		MeanAnomaly     -86.9761051
	}
}

Comet	"C97"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            4.0033e-10
	Radius          3.9675
	InertiaMoment   0.39801
	RotationPeriod  55.685
	RotationEpoch   0
	Obliquity       68.521
	EqAscendNode    203.67

	AbsMagn         9.7842
	SlopeParam      5.8587
	AlbedoBond      0.050423
	AlbedoGeom      0.060508
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.686 0.684 0.682)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19034
		Randomize      (-0.951, -0.945, -0.805)
		colorDistMagn   0.79627
		colorDistFreq   0.0084193
		detailScale     16
		snowLevel       2
		tropicLatitude  0.93441
		icecapLatitude  2
		icecapHeight    0.36286
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34063
		heightTempGrad  0.625
		beachWidth      0.00087712
		tropicWidth     0.07
		mainFreq        0.67965
		venusFreq       0.63675
		venusMagn       0.61837
		mareDensity     0
		terraceProb     0.41166
		erosion         0
		montesMagn      0.54023
		montesFreq      2.8606
		montesSpiky     0.96247
		montesFraction  0.73016
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.032321
		hillsFraction   0.47432
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21562
		craterFreq      0.2382
		craterDensity   0.87523
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50962
		volcanoTemp     1133.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.107
		BumpOffset      5.0534
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

	CometTail
	{
		MaxLength   0.07033
		GasToDust   0.25
		Particles   2400
		GasBright   0.00013618
		DustBright  0.010963
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          130.666607
		SemiMajorAxis   28.247854
		Eccentricity    0.964319974
		Inclination     174.118869
		AscendingNode   94.8286576
		ArgOfPericenter -123.73768
		MeanAnomaly     -96.1653126
	}
}

Comet	"C105"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.4056e-10
	Radius          2.799
	InertiaMoment   0.39698
	Oblateness      0.0021939
	RotationPeriod  25.916
	RotationEpoch   0
	Obliquity       12.673
	EqAscendNode    183.77

	AbsMagn         14.486
	SlopeParam      6.3392
	AlbedoBond      0.051154
	AlbedoGeom      0.061385
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.673 0.666 0.664)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.035202
		Randomize      (-0.705, 0.579, -0.330)
		colorDistMagn   0.70364
		colorDistFreq   0.0046734
		detailScale     8
		snowLevel       2
		tropicLatitude  0.20207
		icecapLatitude  1.4184
		icecapHeight    0.8041
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36675
		heightTempGrad  0.625
		beachWidth      0.00082543
		tropicWidth     0.07
		mainFreq        0.64164
		venusFreq       0.56555
		venusMagn       0.82893
		mareDensity     0
		terraceProb     0.45684
		erosion         0
		montesMagn      0.64538
		montesFreq      3.4998
		montesSpiky     0.96028
		montesFraction  0.29155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.017857
		hillsFraction   0.72144
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23842
		craterFreq      0.20555
		craterDensity   0.86481
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55531
		volcanoTemp     1202
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.2559
		BumpOffset      3.1279
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

	CometTail
	{
		MaxLength   0.064705
		GasToDust   0.25
		Particles   2286
		GasBright   0.0030691
		DustBright  0.038512
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          135.451431
		SemiMajorAxis   28.9333097
		Eccentricity    0.862275239
		Inclination     9.11180818
		AscendingNode   117.502832
		ArgOfPericenter -73.2502957
		MeanAnomaly     96.5242853
	}
}

Comet	"C29"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.8363e-12
	Radius          0.96924
	InertiaMoment   0.39977
	RotationPeriod  54.126
	RotationEpoch   0
	Obliquity       3.2318
	EqAscendNode    192.81

	AbsMagn         11.557
	SlopeParam      5.5077
	AlbedoBond      0.04562
	AlbedoGeom      0.054744
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.622 0.619 0.618)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0089772
		Randomize      (0.957, -0.900, 0.158)
		colorDistMagn   0.33561
		colorDistFreq   0.00054258
		detailScale     8
		snowLevel       2
		tropicLatitude  0.27458
		icecapLatitude  2
		icecapHeight    0.77168
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31853
		heightTempGrad  0.625
		beachWidth      0.0016165
		tropicWidth     0.07
		mainFreq        0.75382
		venusFreq       0.56104
		venusMagn       0.53178
		mareDensity     0
		terraceProb     0.37905
		erosion         0
		montesMagn      0.5823
		montesFreq      3.071
		montesSpiky     0.90562
		montesFraction  0.31696
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0025026
		hillsFraction   0.46846
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24363
		craterFreq      0.17002
		craterDensity   0.96431
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51483
		volcanoTemp     1047.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3028
		BumpOffset      1.1514
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

	CometTail
	{
		MaxLength   0.047606
		GasToDust   0.25
		Particles   1941
		GasBright   0.0058726
		DustBright  0.0061326
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          135.459114
		SemiMajorAxis   28.9344038
		Eccentricity    0.926154241
		Inclination     161.908599
		AscendingNode   -44.3759639
		ArgOfPericenter -16.2800676
		MeanAnomaly     145.462064
	}
}

Comet	"C112"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.4967e-09
	Radius          6.1576
	InertiaMoment   0.39855
	Oblateness      0.0036871
	RotationPeriod  20.049
	RotationEpoch   0
	Obliquity       98.805
	EqAscendNode    121.35

	AbsMagn         8.6869
	SlopeParam      5.8469
	AlbedoBond      0.037013
	AlbedoGeom      0.044416
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.763 0.694 0.645)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.27446
		Randomize      (-0.489, 0.163, -0.165)
		colorDistMagn   0.51812
		colorDistFreq   0.032328
		detailScale     16
		snowLevel       2
		tropicLatitude  0.80456
		icecapLatitude  2
		icecapHeight    0.63371
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13962
		heightTempGrad  0.625
		beachWidth      0.0012302
		tropicWidth     0.07
		mainFreq        0.35038
		venusFreq       0.63987
		venusMagn       0.65852
		mareDensity     0
		terraceProb     0.41055
		erosion         0
		montesMagn      0.51356
		montesFreq      2.6402
		montesSpiky     0.80569
		montesFraction  0.6456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.093403
		hillsFraction   0.61856
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2663
		craterFreq      0.23679
		craterDensity   0.91815
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53277
		volcanoTemp     1337.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.452
		BumpOffset      6.7262
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

	CometTail
	{
		MaxLength   0.077417
		GasToDust   0.25
		Particles   2543
		GasBright   0.004245
		DustBright  0.029008
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          135.620583
		SemiMajorAxis   28.9573927
		Eccentricity    0.940230499
		Inclination     115.019497
		AscendingNode   -126.220261
		ArgOfPericenter 24.8603594
		MeanAnomaly     -145.358805
	}
}

Comet	"C139"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.3228e-15
	Radius          0.071294
	InertiaMoment   0.39808
	Oblateness      0.0020551
	RotationPeriod  26.832
	RotationEpoch   0
	Obliquity       225.32
	EqAscendNode    189.19

	AbsMagn         6.7875
	SlopeParam      3.9137
	AlbedoBond      0.05529
	AlbedoGeom      0.066348
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.505 0.500 0.496)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.62588
		Randomize      (0.341, 0.556, 0.188)
		colorDistMagn   0.51009
		colorDistFreq   2.9224e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.7074
		icecapLatitude  2
		icecapHeight    0.9719
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1778
		heightTempGrad  0.625
		beachWidth      0.00060572
		tropicWidth     0.07
		mainFreq        0.61763
		venusFreq       0.49817
		venusMagn       0.6787
		mareDensity     0
		terraceProb     0.23779
		erosion         0
		montesMagn      0
		montesFreq      3.3502
		montesSpiky     0.98392
		montesFraction  0.52245
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.9316e-06
		hillsFraction   0.55275
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0
		craterFreq      0.23429
		craterDensity   0
		craterOctaves   0.93428
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55087
		volcanoTemp     1044.8
		lavaCoverTidal  0
		lavaCoverSun    0.4647
		lavaCoverYoung  0
		BumpHeight      0.16426
		BumpOffset      0.082129
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

	CometTail
	{
		MaxLength   0.0055293
		GasToDust   0.25
		Particles   1091
		GasBright   0.013793
		DustBright  0.027336
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          139.429711
		SemiMajorAxis   29.4970964
		Eccentricity    0.997814226
		Inclination     173.840628
		AscendingNode   -84.2116393
		ArgOfPericenter -173.930645
		MeanAnomaly     178.444174
	}
}

Comet	"C16"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.6974e-15
	Radius          0.064217
	InertiaMoment   0.39927
	RotationPeriod  39.434
	RotationEpoch   0
	Obliquity       48.985
	EqAscendNode    0.14683

	AbsMagn         5.1954
	SlopeParam      2.0019
	AlbedoBond      0.031116
	AlbedoGeom      0.037339
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.606 0.500 0.386)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13607
		Randomize      (0.557, -0.126, 0.136)
		colorDistMagn   0.81928
		colorDistFreq   2.5561e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.74648
		icecapLatitude  2
		icecapHeight    0.72086
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22607
		heightTempGrad  0.625
		beachWidth      0.00065055
		tropicWidth     0.07
		mainFreq        0.74471
		venusFreq       0.52565
		venusMagn       0.53089
		mareDensity     0
		terraceProb     0.10011
		erosion         0
		montesMagn      0.42704
		montesFreq      3.4644
		montesSpiky     0.88414
		montesFraction  0.58043
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.4913e-06
		hillsFraction   0.69107
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2459
		craterFreq      0.24615
		craterDensity   0.75359
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46957
		volcanoTemp     1110.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.14105
		BumpOffset      0.070524
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

	CometTail
	{
		MaxLength   0.0038437
		GasToDust   0.25
		Particles   1057
		GasBright   0.010691
		DustBright  0.016781
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          141.053616
		SemiMajorAxis   29.7256847
		Eccentricity    0.91770866
		Inclination     26.1580521
		AscendingNode   -103.272686
		ArgOfPericenter 116.894042
		MeanAnomaly     -19.0606953
	}
}

Comet	"C52"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            7.6612e-12
	Radius          1.0612
	InertiaMoment   0.39968
	RotationPeriod  76.342
	RotationEpoch   0
	Obliquity       337.67
	EqAscendNode    90.6

	AbsMagn         16.612
	SlopeParam      5.8947
	AlbedoBond      0.03358
	AlbedoGeom      0.040296
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.666 0.635 0.581)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.93797
		Randomize      (-0.336, -0.268, -0.727)
		colorDistMagn   0.80902
		colorDistFreq   0.00033042
		detailScale     8
		snowLevel       2
		tropicLatitude  0.25908
		icecapLatitude  2
		icecapHeight    0.54935
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14365
		heightTempGrad  0.625
		beachWidth      0.0010179
		tropicWidth     0.07
		mainFreq        0.36733
		venusFreq       0.62812
		venusMagn       0.77322
		mareDensity     0
		terraceProb     0.41502
		erosion         0
		montesMagn      0.67889
		montesFreq      3.525
		montesSpiky     0.95788
		montesFraction  0.41036
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0023098
		hillsFraction   0.45856
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25194
		craterFreq      0.24254
		craterDensity   1.0126
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42752
		volcanoTemp     920.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3264
		BumpOffset      1.1632
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

	CometTail
	{
		MaxLength   0.049068
		GasToDust   0.25
		Particles   1971
		GasBright   0.0040928
		DustBright  0.020547
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          143.643462
		SemiMajorAxis   30.0884369
		Eccentricity    0.96018094
		Inclination     172.678941
		AscendingNode   178.422004
		ArgOfPericenter -149.003834
		MeanAnomaly     38.1059456
	}
}

Comet	"C84"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.1643e-13
	Radius          0.26287
	InertiaMoment   0.39691
	RotationPeriod  41
	RotationEpoch   0
	Obliquity       114.27
	EqAscendNode    11.003

	AbsMagn         2.8911
	SlopeParam      2.3732
	AlbedoBond      0.035479
	AlbedoGeom      0.042574
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.665 0.581 0.455)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.31743
		Randomize      (0.649, -0.172, -0.827)
		colorDistMagn   0.42703
		colorDistFreq   3.982e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.323
		icecapLatitude  2
		icecapHeight    0.82127
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24817
		heightTempGrad  0.625
		beachWidth      0.00081113
		tropicWidth     0.07
		mainFreq        0.67387
		venusFreq       0.6152
		venusMagn       0.61794
		mareDensity     0
		terraceProb     0.12244
		erosion         0
		montesMagn      0.36854
		montesFreq      3.2025
		montesSpiky     0.94882
		montesFraction  0.43556
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00022626
		hillsFraction   0.69374
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21973
		craterFreq      0.2076
		craterDensity   0.95565
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46323
		volcanoTemp     1196.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.61503
		BumpOffset      0.30752
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

	CometTail
	{
		MaxLength   0.026568
		GasToDust   0.25
		Particles   1516
		GasBright   0.010953
		DustBright  0.015614
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          146.330127
		SemiMajorAxis   30.4624538
		Eccentricity    0.928731546
		Inclination     -50.7727061
		AscendingNode   166.421082
		ArgOfPericenter 56.3629646
		MeanAnomaly     -151.388978
	}
}

Comet	"C70"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.0269e-15
	Radius          0.054313
	InertiaMoment   0.39849
	RotationPeriod  50.257
	RotationEpoch   0
	Obliquity       302.01
	EqAscendNode    135.83

	AbsMagn         12.312
	SlopeParam      3.0736
	AlbedoBond      0.034672
	AlbedoGeom      0.041606
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.492 0.486 0.484)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83891
		Randomize      (0.218, 0.661, 0.842)
		colorDistMagn   0.80391
		colorDistFreq   2.3037e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.92928
		icecapLatitude  2
		icecapHeight    0.64499
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30244
		heightTempGrad  0.625
		beachWidth      0.0006016
		tropicWidth     0.07
		mainFreq        0.41104
		venusFreq       0.60444
		venusMagn       0.5952
		mareDensity     0
		terraceProb     0.17105
		erosion         0
		montesMagn      0.59962
		montesFreq      3.5584
		montesSpiky     0.98581
		montesFraction  0.2737
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.5054e-06
		hillsFraction   0.56673
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22832
		craterFreq      0.24078
		craterDensity   0.84524
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49682
		volcanoTemp     1125.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.13075
		BumpOffset      0.065375
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

	CometTail
	{
		MaxLength   0.0011429
		GasToDust   0.25
		Particles   1002
		GasBright   0.013165
		DustBright  0.030059
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          149.428736
		SemiMajorAxis   30.8909881
		Eccentricity    0.918054764
		Inclination     169.253001
		AscendingNode   16.7976576
		ArgOfPericenter 85.9695612
		MeanAnomaly     8.82327802
	}
}

Comet	"C82"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.0708e-10
	Radius          2.5563
	InertiaMoment   0.39725
	RotationPeriod  107.31
	RotationEpoch   0
	Obliquity       38.237
	EqAscendNode    285.98

	AbsMagn         11.038
	SlopeParam      5.8706
	AlbedoBond      0.035365
	AlbedoGeom      0.042438
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.668 0.663 0.660)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.10621
		Randomize      (0.588, -0.053, 0.554)
		colorDistMagn   0.18107
		colorDistFreq   0.0011911
		detailScale     8
		snowLevel       2
		tropicLatitude  0.19612
		icecapLatitude  2
		icecapHeight    0.59191
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14163
		heightTempGrad  0.625
		beachWidth      0.00082405
		tropicWidth     0.07
		mainFreq        0.56678
		venusFreq       0.63376
		venusMagn       0.56963
		mareDensity     0
		terraceProb     0.41277
		erosion         0
		montesMagn      0.57017
		montesFreq      3.0559
		montesSpiky     0.909
		montesFraction  0.87633
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019884
		hillsFraction   0.72618
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23041
		craterFreq      0.23963
		craterDensity   0.8269
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48846
		volcanoTemp     1229
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.1518
		BumpOffset      3.0759
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

	CometTail
	{
		MaxLength   0.063243
		GasToDust   0.25
		Particles   2257
		GasBright   0.011488
		DustBright  0.017458
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          151.782352
		SemiMajorAxis   31.2145134
		Eccentricity    0.916565542
		Inclination     -26.9268681
		AscendingNode   -0.188821731
		ArgOfPericenter 66.4924523
		MeanAnomaly     34.1881388
	}
}

Comet	"C132"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.1814e-16
	Radius          0.032407
	InertiaMoment   0.4
	Oblateness      0.0014468
	RotationPeriod  32.095
	RotationEpoch   0
	Obliquity       139.18
	EqAscendNode    251.61

	AbsMagn         10.829
	SlopeParam      4.1989
	AlbedoBond      0.038065
	AlbedoGeom      0.045678
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.470 0.463 0.459)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.38662
		Randomize      (0.126, 0.973, 0.023)
		colorDistMagn   0.69614
		colorDistFreq   3.8386e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.87906
		icecapLatitude  2
		icecapHeight    0.54479
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40494
		heightTempGrad  0.625
		beachWidth      0.00080095
		tropicWidth     0.07
		mainFreq        0.4927
		venusFreq       0.59735
		venusMagn       0.47922
		mareDensity     0
		terraceProb     0.26194
		erosion         0
		montesMagn      0.56521
		montesFreq      2.8254
		montesSpiky     0.93434
		montesFraction  0.74141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6391e-06
		hillsFraction   0.65671
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22953
		craterFreq      0.20286
		craterDensity   0.89314
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59212
		volcanoTemp     1109.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.075717
		BumpOffset      0.037858
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.013923
		DustBright  0.035534
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          151.985952
		SemiMajorAxis   31.2424212
		Eccentricity    0.924614728
		Inclination     -148.48962
		AscendingNode   -119.55401
		ArgOfPericenter -113.737243
		MeanAnomaly     -159.985077
	}
}

Comet	"C43"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            6.6171e-10
	Radius          4.691
	InertiaMoment   0.3989
	RotationPeriod  44.881
	RotationEpoch   0
	Obliquity       175.5
	EqAscendNode    67.987

	AbsMagn         1.5829
	SlopeParam      4.83
	AlbedoBond      0.046478
	AlbedoGeom      0.055774
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.750 0.704 0.633)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48749
		Randomize      (-0.613, 0.267, 0.489)
		colorDistMagn   0.81158
		colorDistFreq   0.0086658
		detailScale     16
		snowLevel       2
		tropicLatitude  0.050391
		icecapLatitude  2
		icecapHeight    0.4943
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26426
		heightTempGrad  0.625
		beachWidth      0.00092607
		tropicWidth     0.07
		mainFreq        0.55498
		venusFreq       0.57406
		venusMagn       0.56786
		mareDensity     0
		terraceProb     0.31735
		erosion         0
		montesMagn      0.33421
		montesFreq      2.8016
		montesSpiky     0.81675
		montesFraction  0.45758
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.036058
		hillsFraction   0.63014
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23738
		craterFreq      0.24343
		craterDensity   0.80914
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48381
		volcanoTemp     1318.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.839
		BumpOffset      5.4193
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

	CometTail
	{
		MaxLength   0.073031
		GasToDust   0.25
		Particles   2455
		GasBright   0.0034242
		DustBright  0.031924
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          152.426741
		SemiMajorAxis   31.3027981
		Eccentricity    0.961998517
		Inclination     177.431022
		AscendingNode   -143.208511
		ArgOfPericenter -61.8134389
		MeanAnomaly     -129.474655
	}
}

Comet	"C127"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.5955e-09
	Radius          9.5567
	InertiaMoment   0.399
	RotationPeriod  72.322
	RotationEpoch   0
	Obliquity       129.09
	EqAscendNode    39.044

	AbsMagn         7.6399
	SlopeParam      5.8351
	AlbedoBond      0.05356
	AlbedoGeom      0.064271
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.799 0.719 0.650)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.35858
		Randomize      (-0.028, -0.730, 0.476)
		colorDistMagn   0.15917
		colorDistFreq   0.044037
		detailScale     32
		snowLevel       2
		tropicLatitude  0.26085
		icecapLatitude  2
		icecapHeight    0.46268
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33861
		heightTempGrad  0.625
		beachWidth      0.0015833
		tropicWidth     0.07
		mainFreq        0.46135
		venusFreq       0.64316
		venusMagn       0.69842
		mareDensity     0
		terraceProb     0.40945
		erosion         0
		montesMagn      0.48785
		montesFreq      2.3028
		montesSpiky     0.91523
		montesFraction  0.57574
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.27845
		hillsFraction   0.73424
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25056
		craterFreq      0.2354
		craterDensity   0.96489
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56748
		volcanoTemp     1141.4
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

	CometTail
	{
		MaxLength   0.084505
		GasToDust   0.25
		Particles   2686
		GasBright   0.0037443
		DustBright  0.011662
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          152.551507
		SemiMajorAxis   31.3198774
		Eccentricity    0.955888358
		Inclination     36.593528
		AscendingNode   7.1146232
		ArgOfPericenter -6.83640327
		MeanAnomaly     -39.1735967
	}
}

Comet	"C34"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.7154e-08
	Radius          20.733
	InertiaMoment   0.39789
	Oblateness      0.014354
	RotationPeriod  10.147
	RotationEpoch   0
	Obliquity       13.327
	EqAscendNode    45.373

	AbsMagn         3.2345
	SlopeParam      3.9678
	AlbedoBond      0.032406
	AlbedoGeom      0.038887
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.824 0.770 0.696)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.037018
		Randomize      (-0.889, 0.803, -0.295)
		colorDistMagn   0.81414
		colorDistFreq   0.20368
		detailScale     64
		snowLevel       2
		tropicLatitude  0.41486
		icecapLatitude  2
		icecapHeight    0.41357
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38486
		heightTempGrad  0.625
		beachWidth      0.00083423
		tropicWidth     0.07
		mainFreq        0.3126
		venusFreq       0.66154
		venusMagn       0.65619
		mareDensity     0
		terraceProb     0.24231
		erosion         0
		montesMagn      0.37737
		montesFreq      3.4938
		montesSpiky     0.92613
		montesFraction  0.5001
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2286
		hillsFraction   0.77851
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.221
		craterFreq      0.24433
		craterDensity   0.89267
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52234
		volcanoTemp     1015.8
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

	CometTail
	{
		MaxLength   0.096993
		GasToDust   0.25
		Particles   2939
		GasBright   0.0012728
		DustBright  0.044783
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          153.662306
		SemiMajorAxis   31.4717298
		Eccentricity    0.933438041
		Inclination     167.447589
		AscendingNode   142.85191
		ArgOfPericenter -59.8255107
		MeanAnomaly     66.8187188
	}
}

Comet	"C51"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            2.3234e-10
	Radius          3.3094
	InertiaMoment   0.3983
	Oblateness      0.012682
	RotationPeriod  10.806
	RotationEpoch   0
	Obliquity       119.65
	EqAscendNode    48.087

	AbsMagn         6.2365
	SlopeParam      5.1431
	AlbedoBond      0.04699
	AlbedoGeom      0.056388
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.715 0.675 0.636)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33236
		Randomize      (-0.366, -0.209, 0.964)
		colorDistMagn   0.71863
		colorDistFreq   0.0050666
		detailScale     16
		snowLevel       2
		tropicLatitude  0.8684
		icecapLatitude  2
		icecapHeight    0.43945
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29039
		heightTempGrad  0.625
		beachWidth      0.00057438
		tropicWidth     0.07
		mainFreq        0.52766
		venusFreq       0.63836
		venusMagn       0.74213
		mareDensity     0
		terraceProb     0.34562
		erosion         0
		montesMagn      0.45306
		montesFreq      3.4151
		montesSpiky     0.80456
		montesFraction  0.58784
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.022106
		hillsFraction   0.49064
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25718
		craterFreq      0.21073
		craterDensity   0.79289
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52095
		volcanoTemp     1187.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.0994
		BumpOffset      4.0497
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

	CometTail
	{
		MaxLength   0.067406
		GasToDust   0.25
		Particles   2341
		GasBright   0.0040917
		DustBright  0.021738
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          154.463536
		SemiMajorAxis   31.5810355
		Eccentricity    0.933500752
		Inclination     5.6537226
		AscendingNode   87.6000191
		ArgOfPericenter -93.1624408
		MeanAnomaly     -46.7371727
	}
}

Comet	"C143"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            6.8981e-10
	Radius          4.7565
	InertiaMoment   0.39766
	Oblateness      0.042966
	RotationPeriod  5.8635
	RotationEpoch   0
	Obliquity       17.393
	EqAscendNode    359.24

	AbsMagn         -0.030354
	SlopeParam      6.9682
	AlbedoBond      0.055983
	AlbedoGeom      0.06718
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.695 0.693 0.690)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.048314
		Randomize      (0.465, 0.318, -0.574)
		colorDistMagn   0.87632
		colorDistFreq   0.013713
		detailScale     16
		snowLevel       2
		tropicLatitude  0.53891
		icecapLatitude  2
		icecapHeight    0.82547
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39086
		heightTempGrad  0.625
		beachWidth      0.00057987
		tropicWidth     0.07
		mainFreq        0.40154
		venusFreq       0.63518
		venusMagn       0.77855
		mareDensity     0
		terraceProb     0.51671
		erosion         0
		montesMagn      0.2885
		montesFreq      4.0678
		montesSpiky     0.90925
		montesFraction  0.27712
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.047206
		hillsFraction   0.45474
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23579
		craterFreq      0.27524
		craterDensity   0.94188
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49877
		volcanoTemp     1179.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.06
		BumpOffset      7.0299
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

	CometTail
	{
		MaxLength   0.073254
		GasToDust   0.25
		Particles   2459
		GasBright   0.013316
		DustBright  0.023053
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          155.668036
		SemiMajorAxis   31.7450013
		Eccentricity    0.910942034
		Inclination     163.791416
		AscendingNode   152.459329
		ArgOfPericenter 170.214052
		MeanAnomaly     -130.210855
	}
}

Comet	"C99"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            4.3529e-13
	Radius          0.40799
	InertiaMoment   0.3978
	RotationPeriod  108.85
	RotationEpoch   0
	Obliquity       144.56
	EqAscendNode    288.69

	AbsMagn         17.184
	SlopeParam      2.3624
	AlbedoBond      0.050601
	AlbedoGeom      0.060721
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.583 0.581 0.578)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.40155
		Randomize      (-0.889, 0.936, -0.186)
		colorDistMagn   0.99027
		colorDistFreq   2.4656e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.3904
		icecapLatitude  2
		icecapHeight    0.60393
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44716
		heightTempGrad  0.625
		beachWidth      0.0008642
		tropicWidth     0.07
		mainFreq        0.3446
		venusFreq       0.61765
		venusMagn       0.65813
		mareDensity     0
		terraceProb     0.12176
		erosion         0
		montesMagn      0.6851
		montesFreq      3.0037
		montesSpiky     0.99415
		montesFraction  0.34368
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00035191
		hillsFraction   0.34616
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27284
		craterFreq      0.20614
		craterDensity   1.0179
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48716
		volcanoTemp     1000.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.9968
		BumpOffset      0.4984
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

	CometTail
	{
		MaxLength   0.033655
		GasToDust   0.25
		Particles   1659
		GasBright   0.0013473
		DustBright  0.047373
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          159.667462
		SemiMajorAxis   32.2864279
		Eccentricity    0.944843703
		Inclination     -160.924037
		AscendingNode   -37.3404793
		ArgOfPericenter -76.3803149
		MeanAnomaly     21.2610906
	}
}

Comet	"C9"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.5942e-16
	Radius          0.02919
	InertiaMoment   0.39823
	RotationPeriod  44.113
	RotationEpoch   0
	Obliquity       322.85
	EqAscendNode    62.559

	AbsMagn         9.2321
	SlopeParam      2.4264
	AlbedoBond      0.044461
	AlbedoGeom      0.053353
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.589 0.423 0.330)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.89681
		Randomize      (0.341, 0.290, -0.029)
		colorDistMagn   0.042233
		colorDistFreq   3.5681e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.76285
		icecapLatitude  2
		icecapHeight    0.45882
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45321
		heightTempGrad  0.625
		beachWidth      0.00084578
		tropicWidth     0.07
		mainFreq        0.5752
		venusFreq       0.60333
		venusMagn       0.67476
		mareDensity     0
		terraceProb     0.12585
		erosion         0
		montesMagn      0.52686
		montesFreq      2.9103
		montesSpiky     0.98564
		montesFraction  0.87138
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7975e-06
		hillsFraction   0.86297
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2216
		craterFreq      0.21462
		craterDensity   0.99914
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48645
		volcanoTemp     1075.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.065478
		BumpOffset      0.032739
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.012005
		DustBright  0.023796
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          160.421144
		SemiMajorAxis   32.3879498
		Eccentricity    0.898902189
		Inclination     -14.7776941
		AscendingNode   -36.2912884
		ArgOfPericenter -31.7590435
		MeanAnomaly     -156.934285
	}
}

Comet	"C111"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            4.5389e-08
	Radius          19.2
	InertiaMoment   0.39998
	RotationPeriod  46.414
	RotationEpoch   0
	Obliquity       240.79
	EqAscendNode    78.842

	AbsMagn         13.264
	SlopeParam      5.107
	AlbedoBond      0.051743
	AlbedoGeom      0.062092
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.807 0.733 0.706)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.66885
		Randomize      (-0.520, 0.222, -0.474)
		colorDistMagn   0.41829
		colorDistFreq   0.12475
		detailScale     64
		snowLevel       2
		tropicLatitude  0.92489
		icecapLatitude  2
		icecapHeight    0.55061
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28635
		heightTempGrad  0.625
		beachWidth      0.0010867
		tropicWidth     0.07
		mainFreq        0.51587
		venusFreq       0.65243
		venusMagn       0.63907
		mareDensity     0
		terraceProb     0.34234
		erosion         0
		montesMagn      0.62059
		montesFreq      2.5414
		montesSpiky     0.92092
		montesFraction  0.21123
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.89828
		hillsFraction   0.6326
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2839
		craterFreq      0.20496
		craterDensity   0.99202
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47838
		volcanoTemp     1003.7
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

	CometTail
	{
		MaxLength   0.095755
		GasToDust   0.25
		Particles   2914
		GasBright   0.0041319
		DustBright  0.030311
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          161.218161
		SemiMajorAxis   32.495136
		Eccentricity    0.939439467
		Inclination     56.124918
		AscendingNode   -25.8275866
		ArgOfPericenter -98.6700311
		MeanAnomaly     -168.520707
	}
}

Comet	"C17"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.5973e-17
	Radius          0.020593
	InertiaMoment   0.39738
	Oblateness      0.016435
	RotationPeriod  9.476
	RotationEpoch   0
	Obliquity       267
	EqAscendNode    42.659

	AbsMagn         13.043
	SlopeParam      2.7802
	AlbedoBond      0.044916
	AlbedoGeom      0.0539
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.538 0.474 0.349)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.74168
		Randomize      (0.587, -0.186, 0.445)
		colorDistMagn   0.91406
		colorDistFreq   2.0561e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9974
		icecapLatitude  1.7698
		icecapHeight    0.37902
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47934
		heightTempGrad  0.625
		beachWidth      0.00079409
		tropicWidth     0.07
		mainFreq        0.54721
		venusFreq       0.46309
		venusMagn       0.56666
		mareDensity     0
		terraceProb     0.14976
		erosion         0
		montesMagn      0.61582
		montesFreq      3.5872
		montesSpiky     0.98358
		montesFraction  0.40088
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.8707e-07
		hillsFraction   0.67628
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2418
		craterFreq      0.17238
		craterDensity   0.98399
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52374
		volcanoTemp     1044.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.048942
		BumpOffset      0.024471
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.010431
		DustBright  0.015852
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          163.41896
		SemiMajorAxis   32.7901959
		Eccentricity    0.887549679
		Inclination     -118.909167
		AscendingNode   83.605367
		ArgOfPericenter -91.4614408
		MeanAnomaly     -89.7782488
	}
}

Comet	"C123"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.8842e-14
	Radius          0.14325
	InertiaMoment   0.39926
	RotationPeriod  95.765
	RotationEpoch   0
	Obliquity       337.01
	EqAscendNode    228.99

	AbsMagn         11.703
	SlopeParam      3.3483
	AlbedoBond      0.053064
	AlbedoGeom      0.063677
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.535 0.531 0.530)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.93615
		Randomize      (-0.151, -0.492, -0.762)
		colorDistMagn   0.69864
		colorDistFreq   9.231e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.39611
		icecapLatitude  2
		icecapHeight    0.48857
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12554
		heightTempGrad  0.625
		beachWidth      0.0013091
		tropicWidth     0.07
		mainFreq        0.69178
		venusFreq       0.52534
		venusMagn       0.61921
		mareDensity     0
		terraceProb     0.19202
		erosion         0
		montesMagn      0.58568
		montesFreq      3.5314
		montesSpiky     0.98803
		montesFraction  0.81841
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.7857e-05
		hillsFraction   0.84234
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20026
		craterFreq      0.20377
		craterDensity   0.97117
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46887
		volcanoTemp     907.01
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.34969
		BumpOffset      0.17485
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

	CometTail
	{
		MaxLength   0.01678
		GasToDust   0.25
		Particles   1318
		GasBright   0.0042806
		DustBright  0.015885
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          165.673426
		SemiMajorAxis   33.0910809
		Eccentricity    0.927733423
		Inclination     178.675401
		AscendingNode   76.223722
		ArgOfPericenter 135.780871
		MeanAnomaly     -141.538732
	}
}

Comet	"C114"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.6274e-12
	Radius          0.63321
	InertiaMoment   0.39839
	RotationPeriod  56.076
	RotationEpoch   0
	Obliquity       174.84
	EqAscendNode    206.38

	AbsMagn         12.804
	SlopeParam      2.3516
	AlbedoBond      0.037119
	AlbedoGeom      0.044543
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.604 0.599 0.597)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.48568
		Randomize      (-0.428, 0.044, 0.454)
		colorDistMagn   0.70114
		colorDistFreq   0.00021017
		detailScale     8
		snowLevel       2
		tropicLatitude  0.98661
		icecapLatitude  2
		icecapHeight    0.40272
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24615
		heightTempGrad  0.625
		beachWidth      0.00061727
		tropicWidth     0.07
		mainFreq        0.45739
		venusFreq       0.62015
		venusMagn       0.69801
		mareDensity     0
		terraceProb     0.12107
		erosion         0
		montesMagn      0.61059
		montesFreq      2.8055
		montesSpiky     0.89592
		montesFraction  0.13352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0010097
		hillsFraction   0.58949
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2532
		craterFreq      0.20467
		craterDensity   0.75495
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50834
		volcanoTemp     1304.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6697
		BumpOffset      0.83486
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

	CometTail
	{
		MaxLength   0.040742
		GasToDust   0.25
		Particles   1802
		GasBright   0.0044162
		DustBright  0.026457
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          166.834176
		SemiMajorAxis   33.2454639
		Eccentricity    0.916545002
		Inclination     -79.1061224
		AscendingNode   -73.4416129
		ArgOfPericenter -115.723642
		MeanAnomaly     29.1038828
	}
}

Comet	"C2"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.4972e-17
	Radius          0.013268
	InertiaMoment   0.39591
	RotationPeriod  48.726
	RotationEpoch   0
	Obliquity       236.72
	EqAscendNode    124.97

	AbsMagn         -1.6549
	SlopeParam      2.7895
	AlbedoBond      0.03
	AlbedoGeom      0.036
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.484 0.437 0.364)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.65756
		Randomize      (0.126, 0.706, -0.195)
		colorDistMagn   0.34531
		colorDistFreq   1.5107e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.83673
		icecapLatitude  2
		icecapHeight    0.59615
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28035
		heightTempGrad  0.625
		beachWidth      0.001041
		tropicWidth     0.07
		mainFreq        0.45382
		venusFreq       0.70787
		venusMagn       0.45423
		mareDensity     0
		terraceProb     0.15042
		erosion         0
		montesMagn      0.2253
		montesFreq      2.0888
		montesSpiky     0.93643
		montesFraction  0.47853
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2825e-07
		hillsFraction   0.56382
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25288
		craterFreq      0.17512
		craterDensity   0.93311
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50188
		volcanoTemp     1140.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.030254
		BumpOffset      0.015127
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.012421
		DustBright  0.031708
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          171.792702
		SemiMajorAxis   33.9009752
		Eccentricity    0.912727547
		Inclination     -3.26103525
		AscendingNode   90.2810316
		ArgOfPericenter -40.9733686
		MeanAnomaly     168.64034
	}
}

Comet	"C103"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.2927e-07
	Radius          27.215
	InertiaMoment   0.39731
	RotationPeriod  77.934
	RotationEpoch   0
	Obliquity       296.63
	EqAscendNode    98.742

	AbsMagn         9.3338
	SlopeParam      4.7964
	AlbedoBond      0.050966
	AlbedoGeom      0.061159
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.835 0.758 0.709)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.82399
		Randomize      (-0.766, 0.698, -0.949)
		colorDistMagn   0.52079
		colorDistFreq   0.1722
		detailScale     128
		snowLevel       2
		tropicLatitude  0.84048
		icecapLatitude  2
		icecapHeight    0.58647
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26022
		heightTempGrad  0.625
		beachWidth      0.0011384
		tropicWidth     0.07
		mainFreq        0.54296
		venusFreq       0.58423
		venusMagn       0.74433
		mareDensity     0
		terraceProb     0.31435
		erosion         0
		montesMagn      0.52933
		montesFreq      3.3041
		montesSpiky     0.92366
		montesFraction  0.6933
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6487
		hillsFraction   0.75943
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24658
		craterFreq      0.23764
		craterDensity   1.0085
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41434
		volcanoTemp     1234.8
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

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0025684
		DustBright  0.041392
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          171.848563
		SemiMajorAxis   33.9083238
		Eccentricity    0.921795122
		Inclination     11.9077449
		AscendingNode   -55.980275
		ArgOfPericenter 117.796711
		MeanAnomaly     -144.034201
	}
}

Comet	"C122"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.7139e-13
	Radius          0.44672
	InertiaMoment   0.39762
	Oblateness      0.0021232
	RotationPeriod  26.376
	RotationEpoch   0
	Obliquity       118.99
	EqAscendNode    186.48

	AbsMagn         4.1516
	SlopeParam      2.7145
	AlbedoBond      0.037543
	AlbedoGeom      0.045051
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.587 0.585 0.582)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33054
		Randomize      (-0.182, -0.432, 0.929)
		colorDistMagn   0.60859
		colorDistFreq   0.00011688
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99982
		icecapLatitude  2
		icecapHeight    0.84808
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27228
		heightTempGrad  0.625
		beachWidth      0.0011656
		tropicWidth     0.07
		mainFreq        0.42835
		venusFreq       0.54441
		venusMagn       0.59711
		mareDensity     0
		terraceProb     0.14517
		erosion         0
		montesMagn      0.40074
		montesFreq      3.4202
		montesSpiky     0.89236
		montesFraction  0.42845
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0005543
		hillsFraction   0.92306
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21478
		craterFreq      0.27943
		craterDensity   0.71713
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55303
		volcanoTemp     1073.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.0147
		BumpOffset      0.50736
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

	CometTail
	{
		MaxLength   0.035117
		GasToDust   0.25
		Particles   1689
		GasBright   0.0043688
		DustBright  0.016986
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          172.241317
		SemiMajorAxis   33.9599683
		Eccentricity    0.94024447
		Inclination     -103.137092
		AscendingNode   96.1575772
		ArgOfPericenter 56.1048603
		MeanAnomaly     67.5849589
	}
}

Comet	"C35"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.8846e-09
	Radius          6.6493
	InertiaMoment   0.39941
	RotationPeriod  75.824
	RotationEpoch   0
	Obliquity       231.35
	EqAscendNode    87.886

	AbsMagn         10.974
	SlopeParam      4.536
	AlbedoBond      0.045982
	AlbedoGeom      0.055179
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.783 0.678 0.632)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64263
		Randomize      (-0.859, 0.743, 0.014)
		colorDistMagn   0.9086
		colorDistFreq   0.013733
		detailScale     32
		snowLevel       2
		tropicLatitude  0.74293
		icecapLatitude  2
		icecapHeight    0.53628
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23813
		heightTempGrad  0.625
		beachWidth      0.0012778
		tropicWidth     0.07
		mainFreq        0.58334
		venusFreq       0.6468
		venusMagn       0.67554
		mareDensity     0
		terraceProb     0.29125
		erosion         0
		montesMagn      0.56866
		montesFreq      3.6259
		montesSpiky     0.8267
		montesFraction  0.25332
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.1286
		hillsFraction   0.75568
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21329
		craterFreq      0.16877
		craterDensity   0.82329
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43096
		volcanoTemp     1049.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.932
		BumpOffset      6.966
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

	CometTail
	{
		MaxLength   0.078656
		GasToDust   0.25
		Particles   2568
		GasBright   0.0015851
		DustBright  0.043281
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          172.736446
		SemiMajorAxis   34.0250186
		Eccentricity    0.922771429
		Inclination     -127.061019
		AscendingNode   -118.037999
		ArgOfPericenter 84.5092033
		MeanAnomaly     -73.3555919
	}
}

Comet	"C100"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.4354e-14
	Radius          0.13083
	InertiaMoment   0.39936
	RotationPeriod  65.936
	RotationEpoch   0
	Obliquity       2.5778
	EqAscendNode    331.2

	AbsMagn         9.5565
	SlopeParam      3.0564
	AlbedoBond      0.036366
	AlbedoGeom      0.043639
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.531 0.528 0.526)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0071605
		Randomize      (-0.859, 0.877, 0.123)
		colorDistMagn   0.17243
		colorDistFreq   1.2147e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9918
		icecapLatitude  2
		icecapHeight    0.6919
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30042
		heightTempGrad  0.625
		beachWidth      0.0016077
		tropicWidth     0.07
		mainFreq        0.60439
		venusFreq       0.60914
		venusMagn       0.67752
		mareDensity     0
		terraceProb     0.16977
		erosion         0
		montesMagn      0.53472
		montesFreq      3.0747
		montesSpiky     0.94412
		montesFraction  0.71104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.6683e-05
		hillsFraction   0.85697
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26248
		craterFreq      0.23792
		craterDensity   0.93361
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54386
		volcanoTemp     1034
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.28601
		BumpOffset      0.14301
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

	CometTail
	{
		MaxLength   0.015317
		GasToDust   0.25
		Particles   1289
		GasBright   0.00168
		DustBright  0.04585
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          174.889192
		SemiMajorAxis   34.3071282
		Eccentricity    0.921006522
		Inclination     -98.2017306
		AscendingNode   -70.7131834
		ArgOfPericenter 23.4084702
		MeanAnomaly     -171.108745
	}
}

Comet	"C88"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            3.4578e-08
	Radius          17.536
	InertiaMoment   0.39564
	Oblateness      0.0022623
	RotationPeriod  25.453
	RotationEpoch   0
	Obliquity       266.35
	EqAscendNode    181.05

	AbsMagn         10.508
	SlopeParam      4.8048
	AlbedoBond      0.035703
	AlbedoGeom      0.042844
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.755 0.751 0.750)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73986
		Randomize      (0.772, -0.410, 0.411)
		colorDistMagn   0.79881
		colorDistFreq   0.1868
		detailScale     64
		snowLevel       2
		tropicLatitude  0.99162
		icecapLatitude  2
		icecapHeight    0.7742
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46123
		heightTempGrad  0.625
		beachWidth      0.00078528
		tropicWidth     0.07
		mainFreq        0.44939
		venusFreq       0.58177
		venusMagn       0.69717
		mareDensity     0
		terraceProb     0.31509
		erosion         0
		montesMagn      0.55759
		montesFreq      3.5945
		montesSpiky     0.83583
		montesFraction  0.80141
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.50576
		hillsFraction   0.63643
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25935
		craterFreq      0.23906
		craterDensity   0.94992
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5577
		volcanoTemp     930.68
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

	CometTail
	{
		MaxLength   0.094293
		GasToDust   0.25
		Particles   2884
		GasBright   0.0096616
		DustBright  0.012146
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          177.544071
		SemiMajorAxis   34.6534518
		Eccentricity    0.958845458
		Inclination     157.590685
		AscendingNode   79.3491865
		ArgOfPericenter -170.411535
		MeanAnomaly     -95.7740806
	}
}

Comet	"C15"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.1477e-14
	Radius          0.20026
	InertiaMoment   0.39763
	RotationPeriod  63.802
	RotationEpoch   0
	Obliquity       190.97
	EqAscendNode    317.63

	AbsMagn         8.801
	SlopeParam      6.4335
	AlbedoBond      0.044802
	AlbedoGeom      0.053762
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.553 0.546 0.542)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53046
		Randomize      (0.526, -0.067, -0.173)
		colorDistMagn   0.72863
		colorDistFreq   3.14e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.84864
		icecapLatitude  2
		icecapHeight    0.62576
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37281
		heightTempGrad  0.625
		beachWidth      0.00080701
		tropicWidth     0.07
		mainFreq        0.4578
		venusFreq       0.5446
		venusMagn       0.45736
		mareDensity     0
		terraceProb     0.46577
		erosion         0
		montesMagn      0.51635
		montesFreq      3.3647
		montesSpiky     0.95093
		montesFraction  0.7985
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.1247e-05
		hillsFraction   0.70657
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25027
		craterFreq      0.21407
		craterDensity   0.85347
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55407
		volcanoTemp     1177.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.49073
		BumpOffset      0.24537
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

	CometTail
	{
		MaxLength   0.022181
		GasToDust   0.25
		Particles   1427
		GasBright   0.010934
		DustBright  0.017728
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          180.078345
		SemiMajorAxis   34.9824357
		Eccentricity    0.930704606
		Inclination     -61.3093917
		AscendingNode   69.7840774
		ArgOfPericenter -173.555923
		MeanAnomaly     32.6373837
	}
}

Comet	"C26"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.6278e-07
	Radius          29.387
	InertiaMoment   0.39859
	RotationPeriod  44.497
	RotationEpoch   0
	Obliquity       69.175
	EqAscendNode    65.273

	AbsMagn         11.878
	SlopeParam      3.6895
	AlbedoBond      0.031849
	AlbedoGeom      0.038219
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.806 0.762 0.745)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19215
		Randomize      (0.864, -0.721, -0.770)
		colorDistMagn   0.91133
		colorDistFreq   0.35102
		detailScale     128
		snowLevel       2
		tropicLatitude  0.86766
		icecapLatitude  2
		icecapHeight    0.47755
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35873
		heightTempGrad  0.625
		beachWidth      0.0011859
		tropicWidth     0.07
		mainFreq        0.35657
		venusFreq       0.58917
		venusMagn       0.77176
		mareDensity     0
		terraceProb     0.21926
		erosion         0
		montesMagn      0.58973
		montesFreq      2.8568
		montesSpiky     0.92878
		montesFraction  0.34139
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.2204
		hillsFraction   0.54136
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25776
		craterFreq      0.17062
		craterDensity   0.90264
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48514
		volcanoTemp     1046.9
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

	CometTail
	{
		MaxLength   0.1
		GasToDust   0.25
		Particles   3000
		GasBright   0.0072593
		DustBright  0.0083153
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          181.540336
		SemiMajorAxis   35.1715203
		Eccentricity    0.935580314
		Inclination     -128.372248
		AscendingNode   -11.5851175
		ArgOfPericenter 127.348634
		MeanAnomaly     -129.999035
	}
}

Comet	"C87"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            4.1746e-18
	Radius          0.0086681
	InertiaMoment   0.39881
	RotationPeriod  50.641
	RotationEpoch   0
	Obliquity       48.331
	EqAscendNode    138.54

	AbsMagn         2.3784
	SlopeParam      4.2222
	AlbedoBond      0.049582
	AlbedoGeom      0.059498
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.408 0.405 0.400)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13425
		Randomize      (0.741, -0.350, 0.101)
		colorDistMagn   0.70863
		colorDistFreq   5.7474e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.72556
		icecapLatitude  2
		icecapHeight    0.65785
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20796
		heightTempGrad  0.625
		beachWidth      0.00094174
		tropicWidth     0.07
		mainFreq        0.60008
		venusFreq       0.5903
		venusMagn       0.67712
		mareDensity     0
		terraceProb     0.26394
		erosion         0
		montesMagn      0.35524
		montesFreq      3.47
		montesSpiky     0.929
		montesFraction  0.41954
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1666e-07
		hillsFraction   0.65039
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26725
		craterFreq      0.20731
		craterDensity   1.0559
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49556
		volcanoTemp     1097.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.021187
		BumpOffset      0.010593
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

	CometTail
	{
		MaxLength   0.001
		GasToDust   0.25
		Particles   1000
		GasBright   0.010012
		DustBright  0.012986
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          183.550126
		SemiMajorAxis   35.4306274
		Eccentricity    0.96353032
		Inclination     169.838717
		AscendingNode   75.1548925
		ArgOfPericenter 162.445551
		MeanAnomaly     -153.91392
	}
}

Comet	"C108"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            5.0397e-15
	Radius          0.092297
	InertiaMoment   0.39884
	Oblateness      0.0011056
	RotationPeriod  36.635
	RotationEpoch   0
	Obliquity       306.73
	EqAscendNode    311.3

	AbsMagn         13.808
	SlopeParam      3.3564
	AlbedoBond      0.036799
	AlbedoGeom      0.044159
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.518 0.510 0.507)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.85203
		Randomize      (-0.612, 0.401, 0.598)
		colorDistMagn   0.98732
		colorDistFreq   6.78e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.94598
		icecapLatitude  2
		icecapHeight    0.652
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32655
		heightTempGrad  0.625
		beachWidth      0.001256
		tropicWidth     0.07
		mainFreq        0.57478
		venusFreq       0.51733
		venusMagn       0.57079
		mareDensity     0
		terraceProb     0.19265
		erosion         0
		montesMagn      0.63197
		montesFreq      1.8442
		montesSpiky     0.94173
		montesFraction  0.25726
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0085e-05
		hillsFraction   0.67486
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22508
		craterFreq      0.20526
		craterDensity   0.92323
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43569
		volcanoTemp     1102.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.2158
		BumpOffset      0.1079
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

	CometTail
	{
		MaxLength   0.0096923
		GasToDust   0.25
		Particles   1175
		GasBright   0.0036829
		DustBright  0.034329
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          183.697301
		SemiMajorAxis   35.4495643
		Eccentricity    0.962952539
		Inclination     -116.147219
		AscendingNode   -144.781052
		ArgOfPericenter -36.0529574
		MeanAnomaly     -43.932896
	}
}

Comet	"C107"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            1.5284e-13
	Radius          0.28782
	InertiaMoment   0.39655
	RotationPeriod  60.885
	RotationEpoch   0
	Obliquity       88.71
	EqAscendNode    268.79

	AbsMagn         5.5734
	SlopeParam      2.7239
	AlbedoBond      0.051346
	AlbedoGeom      0.061615
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.570 0.565 0.559)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.24642
		Randomize      (-0.643, 0.460, 0.289)
		colorDistMagn   0.88699
		colorDistFreq   2.4124e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.95863
		icecapLatitude  2
		icecapHeight    0.56879
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47329
		heightTempGrad  0.625
		beachWidth      0.0008125
		tropicWidth     0.07
		mainFreq        0.29704
		venusFreq       0.53987
		venusMagn       0.53692
		mareDensity     0
		terraceProb     0.14582
		erosion         0
		montesMagn      0.43651
		montesFreq      3.8424
		montesSpiky     0.99211
		montesFraction  0.50148
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00019316
		hillsFraction   0.68959
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22997
		craterFreq      0.14691
		craterDensity   0.99991
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52451
		volcanoTemp     1069.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.92184
		BumpOffset      0.46092
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

	CometTail
	{
		MaxLength   0.02803
		GasToDust   0.25
		Particles   1546
		GasBright   0.0034966
		DustBright  0.035705
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          184.161943
		SemiMajorAxis   35.5093162
		Eccentricity    0.958119887
		Inclination     -28.090626
		AscendingNode   55.7705639
		ArgOfPericenter -177.07399
		MeanAnomaly     -118.087647
	}
}

Comet	"C74"
{
	ParentBody     "Asim"
	Class          "Asteroid"
	Mass            3.0498e-10
	Radius          3.6235
	InertiaMoment   0.39816
	Oblateness      0.001153
	RotationPeriod  35.828
	RotationEpoch   0
	Obliquity       94.085


	Surface
	{
	}
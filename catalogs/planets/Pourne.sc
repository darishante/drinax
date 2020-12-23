Planet	"1"
{
	ParentBody     "Pourne"
	Class          "Terra"
	Mass            0.67901
	Radius          5392.7
	InertiaMoment   0.33098
	Obliquity       1.4724
	EqAscendNode    108.42
	TidalLocked     true

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.742 0.738 0.734)

	Surface
	{
		Preset         "terra_arid_earth_green.cfg"
		SurfStyle       0.02135
		Randomize      (-0.689, -0.722, -0.738)
		colorDistMagn   0.085564
		colorDistFreq   649.09
		detailScale     16384
		seaLevel        0.13695
		snowLevel       2
		tropicLatitude  0.030052
		icecapLatitude  2
		icecapHeight    0.374
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48145
		heightTempGrad  0.375
		beachWidth      0.00089831
		tropicWidth     0.5
		mainFreq        1.0215
		venusFreq       1.5634
		venusMagn       0
		mareFreq        1.7822
		mareDensity     0
		terraceProb     0.18938
		erosion         0
		montesMagn      0.199
		montesFreq      305.55
		montesSpiky     0.97622
		montesFraction  0.21011
		dunesMagn       0.067325
		dunesFreq       43.726
		dunesFraction   0.65715
		hillsMagn       0.13273
		hillsFreq       546.14
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.6855
		riversSin       6.479
		riftsMagn       56.684
		riftsFreq       1.3927
		riftsSin        6.5048
		canyonsMagn     0.028056
		canyonsFreq     150.2
		canyonsFraction 0
		cracksMagn      0.096495
		cracksFreq      0.47333
		cracksOctaves   0
		craterMagn      0.60154
		craterFreq      13.141
		craterDensity   0.72037
		craterOctaves   17.616
		volcanoMagn     0.70799
		volcanoFreq     0.66843
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.40953
		volcanoRadius   0.48537
		volcanoTemp     1036.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.95434
		SpotBright      2.4844
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Titan"
		Height          85.831
		Density         0.0016896
		Pressure        0.0030441
		Greenhouse      0.86328
		Bright          4.9738
		Opacity         1
		SkyLight        1.6579
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	58.091
			H2O       	23.586
			C2H2      	7.0762
			N2        	5.3174
			CH4       	2.0131
			NH3       	1.7303
			C2H4      	1.2556
			CO        	0.48834
			C2H6      	0.30611
			H2S       	0.075923
			SO2       	0.045161
			C3H8      	0.0097549
			C8H18     	0.0051497
			Ar        	4.1345e-05
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.128305612
		SemiMajorAxis   0.288589922
		Eccentricity    0.0339188812
		Inclination     1.47244498
		AscendingNode   108.418245
		ArgOfPericenter 31.701923
		MeanAnomaly     197.806453
	}
}

Moon	"1.1"
{
	ParentBody     "1"
	Class          "Terra"
	Mass            0.0065888
	Radius          1210.8
	InertiaMoment   0.38489
	Oblateness      0.019878
	Obliquity       -1.1824
	EqAscendNode    -91.399
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.852 0.794 0.737)

	Surface
	{
		Preset         "terra_airless_io.cfg"
		SurfStyle       0.24738
		Randomize      (0.172, -0.427, -0.485)
		colorDistMagn   0.09013
		colorDistFreq   178.23
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.20698
		snowLevel       2
		tropicLatitude  0.037692
		icecapLatitude  2
		icecapHeight    0.47742
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49147
		heightTempGrad  0.625
		beachWidth      0.0011656
		tropicWidth     0.07
		mainFreq        1.9183
		venusFreq       0.85175
		venusMagn       0
		mareFreq        0.41999
		mareDensity     0.15824
		terraceProb     0.28606
		erosion         0
		montesMagn      0.074656
		montesFreq      66.753
		montesSpiky     0.97845
		montesFraction  0.29673
		dunesMagn       0.051769
		dunesFreq       10.108
		dunesFraction   0.81269
		hillsMagn       0.11668
		hillsFreq       135.26
		hillsFraction   0.71822
		hills2Fraction  0
		riversMagn      59.56
		riversFreq      2.1574
		riversSin       6.9929
		riftsMagn       57.067
		riftsFreq       2.5656
		riftsSin        5.9695
		canyonsMagn     0.41034
		canyonsFreq     0.45188
		canyonsFraction 0.49219
		cracksMagn      0.070973
		cracksFreq      0.2855
		cracksOctaves   0
		craterMagn      0.53311
		craterFreq      4.234
		craterDensity   0.99158
		craterOctaves   19
		craterRayedFactor 0.077933
		volcanoMagn     0.18489
		volcanoFreq     0.63401
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.1775
		volcanoFlows    0.23712
		volcanoRadius   0.13414
		volcanoTemp     1024.5
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
		PeriodDays      0.460849629
		SemiMajorAxisKm 22223.2876
		Eccentricity    4.09412824e-05
		Inclination     -1.1823735
		AscendingNode   -91.3987911
		ArgOfPericenter -30.5765996
		MeanAnomaly     152.208759
	}
}

DwarfMoon	"1.D1"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            1.2421e-07
	Radius          32.587
	InertiaMoment   0.39951
	Obliquity       191.91
	EqAscendNode    171.97
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.624 0.583 0.527)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.81645
		Randomize      (0.443, -0.597, -0.152)
		colorDistMagn   0.96577
		colorDistFreq   0.50214
		detailScale     128
		snowLevel       2
		tropicLatitude  0.19987
		icecapLatitude  2
		icecapHeight    0.30803
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38917
		heightTempGrad  0.625
		beachWidth      0.00061346
		tropicWidth     0.07
		mainFreq        0.45273
		venusFreq       0.59656
		venusMagn       0.66867
		mareDensity     0
		terraceProb     0.45944
		erosion         0
		montesMagn      0.5568
		montesFreq      2.4503
		montesSpiky     0.93627
		montesFraction  0.23798
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6496
		hillsFraction   0.54066
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27588
		craterFreq      0.25737
		craterDensity   1.0509
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39065
		volcanoTemp     1144.3
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
		PeriodDays      2.29790259
		SemiMajorAxisKm 64653.4861
		Eccentricity    0.0579541512
		Inclination     191.910732
		AscendingNode   171.968114
		ArgOfPericenter 109.215135
		MeanAnomaly     -49.8522616
	}
}

DwarfMoon	"1.D2"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            1.704e-07
	Radius          35.616
	InertiaMoment   0.39782
	RotationPeriod  64.373
	Obliquity       137.83
	EqAscendNode    62.129

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.793 0.768 0.721)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.38551
		Randomize      (0.713, -0.767, 0.181)
		colorDistMagn   0.98148
		colorDistFreq   0.96945
		detailScale     128
		snowLevel       2
		tropicLatitude  0.67755
		icecapLatitude  2
		icecapHeight    0.72877
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28688
		heightTempGrad  0.625
		beachWidth      0.00066131
		tropicWidth     0.07
		mainFreq        0.71371
		venusFreq       0.61222
		venusMagn       0.6634
		mareDensity     0
		terraceProb     0.1736
		erosion         0
		montesMagn      0.40494
		montesFreq      3.1951
		montesSpiky     0.89007
		montesFraction  0.3817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8602
		hillsFraction   0.65018
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24189
		craterFreq      0.21364
		craterDensity   0.85723
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48265
		volcanoTemp     992.01
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
		PeriodDays      5.36441385
		SemiMajorAxisKm 113776.456
		Eccentricity    0.305073999
		Inclination     137.831461
		AscendingNode   62.128786
		ArgOfPericenter -62.9832376
		MeanAnomaly     -37.487324
	}
}

DwarfMoon	"1.D3"
{
	ParentBody     "1"
	Class          "Asteroid"
	Mass            2.3496e-07
	Radius          40.171
	InertiaMoment   0.39934
	Obliquity       150.76
	EqAscendNode    62.943
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.623 0.507 0.454)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.95458
		Randomize      (0.984, -0.937, 0.514)
		colorDistMagn   0.99747
		colorDistFreq   0.70713
		detailScale     128
		snowLevel       2
		tropicLatitude  0.49596
		icecapLatitude  2
		icecapHeight    0.65093
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18459
		heightTempGrad  0.625
		beachWidth      0.0010092
		tropicWidth     0.07
		mainFreq        0.52206
		venusFreq       0.62921
		venusMagn       0.65815
		mareDensity     0
		terraceProb     0.29562
		erosion         0
		montesMagn      0.52605
		montesFreq      2.5187
		montesSpiky     0.76618
		montesFraction  0.46789
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2051
		hillsFraction   0.76972
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21566
		craterFreq      0.27895
		craterDensity   0.95587
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52829
		volcanoTemp     1039.7
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
		PeriodDays      12.6892671
		SemiMajorAxisKm 201989.4
		Eccentricity    0.157857311
		Inclination     150.761834
		AscendingNode   62.9430735
		ArgOfPericenter 108.921393
		MeanAnomaly     -35.625933
	}
}

Planet	"2"
{
	ParentBody     "Pourne"
	Class          "Neptune"
	Mass            37.532
	Radius          27351
	InertiaMoment   0.23687
	Oblateness      0.035056
	RotationPeriod  9.0878
	RotationEpoch   0
	Obliquity       -71.518
	EqAscendNode    -162.95

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_warm_default.cfg"
		SurfStyle       0.21814
		Randomize      (-0.805, -0.325, 0.363)
		detailScale     256
		tropicLatitude  0.93152
		icecapLatitude  1
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.8999
		stripeFluct     0.32984
		stripeTwist     8.0284
		cycloneMagn     5.205
		cycloneFreq     0.78305
		cycloneDensity  0.14781
		cycloneOctaves  0
		cycloneMagn2     0.54426
		cycloneFreq2     0.7484
		cycloneLatitude2 1
		cycloneOctaves2  0
		BumpHeight      14.015
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
		Height          111.16
		Velocity        -204.38
		BumpHeight      25.339
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.1128
		mainOctaves     12
		Coverage        0.11709
		stripeZones     2.8999
		stripeFluct     0.32984
		stripeTwist     8.0284
	}

	Clouds
	{
		Height          208.3
		Velocity        2369.7
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.28086
		mainFreq        1.1128
		mainOctaves     12
		Coverage        0.11709
		stripeZones     2.8999
		stripeFluct     0.32984
		stripeTwist     8.0284
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          985.45
		Density         7714.8
		Pressure        1e+06
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             -0.016059
		Saturation      1.4542

		Composition
		{
			H2        	89.624
			He        	6.1739
			CH4       	2.9652
			C3H8      	0.35959
			C2H2      	0.35235
			C8H18     	0.27821
			C2H4      	0.11915
			C2H6      	0.05789
			N2        	0.032775
			NH3       	0.028359
			O2        	0.006911
			Ne        	0.001043
			Ar        	0.00079117
			CO2       	0.00016992
			H2S       	1.4368e-06
			Kr        	3.7992e-07
			H2O       	2.7956e-07
			Xe        	4.3853e-08
			CO        	3.2203e-08
			SO2       	8.6581e-09
			Cl2       	3.1516e-10
		}
	}

	Aurora
	{
		Height         382.16
		NorthLat       67.145
		NorthLon       114.05
		NorthRadius    5349.8
		NorthWidth     1623.4
		NorthRings     5
		NorthBright    1
		NorthFlashFreq 72.051
		NorthMoveSpeed 0.87471
		NorthParticles 10000
		SouthLat       -61.065
		SouthLon       -67.429
		SouthRadius    7044.1
		SouthWidth     1896.9
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 61.868
		SouthMoveSpeed 1.0596
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
		Period          0.433094329
		SemiMajorAxis   0.649406596
		Eccentricity    0.0377786416
		Inclination     -2.88822856
		AscendingNode   -170.092422
		ArgOfPericenter 49.2849341
		MeanAnomaly     110.3852
	}
}

DwarfMoon	"2.D1"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.8458e-11
	Radius          1.8166
	InertiaMoment   0.39966
	Oblateness     (0.348, 0.552, 0.000)
	Obliquity       -0.0021444
	EqAscendNode    12.58
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.553 0.550 0.547)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70988
		Randomize      (0.894, -0.344, -0.241)
		colorDistMagn   0.69666
		colorDistFreq   0.0019216
		detailScale     8
		snowLevel       2
		tropicLatitude  0.050351
		icecapLatitude  2
		icecapHeight    0.61399
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24106
		heightTempGrad  0.625
		beachWidth      0.00090648
		tropicWidth     0.07
		mainFreq        0.64379
		venusFreq       0.54388
		venusMagn       0.69278
		mareDensity     0
		terraceProb     0.35942
		erosion         0
		montesMagn      0.58218
		montesFreq      2.4527
		montesSpiky     0.74413
		montesFraction  0.57986
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0060475
		hillsFraction   0.61598
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24764
		craterFreq      0.1909
		craterDensity   0.9413
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50029
		volcanoTemp     1154.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6349
		BumpOffset      0.81746
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.215085831
		SemiMajorAxisKm 50771.5001
		Eccentricity    3.56490239e-05
		Inclination     -0.00214443844
		AscendingNode   12.5795093
		ArgOfPericenter 74.2933664
		MeanAnomaly     -47.268194
	}
}

DwarfMoon	"2.D2"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.5548e-11
	Radius          2.2414
	InertiaMoment   0.39806
	Oblateness     (0.347, 0.542, 0.000)
	Obliquity       -0.0016221
	EqAscendNode    155.51
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.733 0.731 0.729)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.27895
		Randomize      (-0.836, -0.514, 0.092)
		colorDistMagn   0.71018
		colorDistFreq   0.00098761
		detailScale     8
		snowLevel       2
		tropicLatitude  0.05036
		icecapLatitude  2
		icecapHeight    0.55006
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13877
		heightTempGrad  0.625
		beachWidth      0.00095434
		tropicWidth     0.07
		mainFreq        0.47652
		venusFreq       0.56703
		venusMagn       0.68728
		mareDensity     0
		terraceProb     0.11317
		erosion         0
		montesMagn      0.43266
		montesFreq      3.1966
		montesSpiky     0.96922
		montesFraction  0.65488
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015306
		hillsFraction   0.72173
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22475
		craterFreq      0.24815
		craterDensity   0.74479
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5523
		volcanoTemp     1102
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.0172
		BumpOffset      1.0086
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.228217264
		SemiMajorAxisKm 52817.4938
		Eccentricity    5.7753076e-05
		Inclination     -0.00162206921
		AscendingNode   155.512977
		ArgOfPericenter 84.6766051
		MeanAnomaly     -156.58651
	}
}

DwarfMoon	"2.D3"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            6.3332e-11
	Radius          2.7624
	InertiaMoment   0.39949
	Oblateness     (0.345, 0.508, 0.000)
	Obliquity       0.0070355
	EqAscendNode    -62.121
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.517 0.510 0.507)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84802
		Randomize      (-0.566, -0.684, 0.425)
		colorDistMagn   0.72371
		colorDistFreq   0.0041957
		detailScale     8
		snowLevel       2
		tropicLatitude  0.050509
		icecapLatitude  2
		icecapHeight    0.47264
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43648
		heightTempGrad  0.625
		beachWidth      0.0010022
		tropicWidth     0.07
		mainFreq        0.76492
		venusFreq       0.58457
		venusMagn       0.68186
		mareDensity     0
		terraceProb     0.23441
		erosion         0
		montesMagn      0.54738
		montesFreq      2.5208
		montesSpiky     0.93349
		montesFraction  0.74943
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.020091
		hillsFraction   0.44487
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25652
		craterFreq      0.20591
		craterDensity   0.88431
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45831
		volcanoTemp     1149.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.4862
		BumpOffset      1.2431
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.266356138
		SemiMajorAxisKm 58549.1508
		Eccentricity    8.85149237e-05
		Inclination     0.00703546926
		AscendingNode   -62.1214492
		ArgOfPericenter 44.4080717
		MeanAnomaly     179.682804
	}
}

DwarfMoon	"2.D4"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.0662e-10
	Radius          3.2618
	InertiaMoment   0.39778
	Oblateness     (0.344, 0.488, 0.000)
	Obliquity       -0.0012859
	EqAscendNode    24.306
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.697 0.692 0.690)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.41709
		Randomize      (-0.295, -0.854, 0.758)
		colorDistMagn   0.73726
		colorDistFreq   0.00077197
		detailScale     16
		snowLevel       2
		tropicLatitude  0.050366
		icecapLatitude  2
		icecapHeight    0.90069
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33419
		heightTempGrad  0.625
		beachWidth      0.00105
		tropicWidth     0.07
		mainFreq        0.5452
		venusFreq       0.60034
		venusMagn       0.6765
		mareDensity     0
		terraceProb     0.37157
		erosion         0
		montesMagn      0.39112
		montesFreq      3.2408
		montesSpiky     0.88586
		montesFraction  0.086818
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.025304
		hillsFraction   0.59974
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23335
		craterFreq      0.26498
		craterDensity   0.98966
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50655
		volcanoTemp     1097.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.9356
		BumpOffset      1.4678
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.286863762
		SemiMajorAxisKm 61517.1094
		Eccentricity    1.26046663e-05
		Inclination     -0.0012858553
		AscendingNode   24.306315
		ArgOfPericenter 12.5640942
		MeanAnomaly     -46.0910304
	}
}

DwarfMoon	"2.D5"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.7197e-10
	Radius          3.8328
	InertiaMoment   0.39932
	Oblateness     (0.344, 0.479, 0.000)
	Obliquity       -0.0085547
	EqAscendNode    175.67
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.481 0.473 0.468)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98615
		Randomize      (-0.025, 0.976, -0.909)
		colorDistMagn   0.75083
		colorDistFreq   0.0076
		detailScale     16
		snowLevel       2
		tropicLatitude  0.050241
		icecapLatitude  2
		icecapHeight    0.72033
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23189
		heightTempGrad  0.625
		beachWidth      0.0007979
		tropicWidth     0.07
		mainFreq        0.37725
		venusFreq       0.61616
		venusMagn       0.67119
		mareDensity     0
		terraceProb     0.12255
		erosion         0
		montesMagn      0.51763
		montesFreq      2.5811
		montesSpiky     0.68139
		montesFraction  0.34352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.031353
		hillsFraction   0.70326
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27153
		craterFreq      0.21887
		craterDensity   0.82114
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56467
		volcanoTemp     1045.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.4495
		BumpOffset      1.7247
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.296120754
		SemiMajorAxisKm 62833.5154
		Eccentricity    4.95377031e-05
		Inclination     -0.00855469712
		AscendingNode   175.666139
		ArgOfPericenter 50.5833029
		MeanAnomaly     125.522924
	}
}

DwarfMoon	"2.D6"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.6823e-10
	Radius          4.4547
	InertiaMoment   0.39744
	Oblateness     (0.341, 0.432, 0.000)
	Obliquity       -0.0097498
	EqAscendNode    100.28
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.657 0.655 0.654)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.55522
		Randomize      (0.245, 0.806, -0.576)
		colorDistMagn   0.76444
		colorDistFreq   0.01661
		detailScale     16
		snowLevel       2
		tropicLatitude  0.05022
		icecapLatitude  2
		icecapHeight    0.64491
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1296
		heightTempGrad  0.625
		beachWidth      0.00084575
		tropicWidth     0.07
		mainFreq        0.61936
		venusFreq       0.63383
		venusMagn       0.66592
		mareDensity     0
		terraceProb     0.2432
		erosion         0
		montesMagn      0.30552
		montesFreq      3.2871
		montesSpiky     0.96803
		montesFraction  0.44026
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.035837
		hillsFraction   0.3612
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24084
		craterFreq      0.16121
		craterDensity   0.92341
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46659
		volcanoTemp     1192.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.0092
		BumpOffset      2.0046
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.341262674
		SemiMajorAxisKm 69067.1157
		Eccentricity    6.58815678e-05
		Inclination     -0.00974975583
		AscendingNode   100.278575
		ArgOfPericenter 127.203627
		MeanAnomaly     119.294383
	}
}

DwarfMoon	"2.D7"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            4.0733e-10
	Radius          5.056
	InertiaMoment   0.39914
	Oblateness     (0.339, 0.400, 0.000)
	Obliquity       -0.0018168
	EqAscendNode    46.277
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.440 0.437 0.434)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12429
		Randomize      (0.516, 0.636, -0.243)
		colorDistMagn   0.7781
		colorDistFreq   0.012382
		detailScale     16
		snowLevel       2
		tropicLatitude  0.050357
		icecapLatitude  2
		icecapHeight    0.58123
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42731
		heightTempGrad  0.625
		beachWidth      0.00089361
		tropicWidth     0.07
		mainFreq        0.45632
		venusFreq       0.65744
		venusMagn       0.66066
		mareDensity     0
		terraceProb     0.38438
		erosion         0
		montesMagn      0.48939
		montesFreq      2.6358
		montesSpiky     0.93206
		montesFraction  0.51588
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.076835
		hillsFraction   0.58283
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21329
		craterFreq      0.23135
		craterDensity   1.0879
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51292
		volcanoTemp     1040.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.5504
		BumpOffset      2.2752
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.371423952
		SemiMajorAxisKm 73078.9107
		Eccentricity    9.95276258e-05
		Inclination     -0.00181680192
		AscendingNode   46.2766153
		ArgOfPericenter 158.081121
		MeanAnomaly     -171.903484
	}
}

DwarfMoon	"2.D8"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            6.0523e-10
	Radius          5.7466
	InertiaMoment   0.39702
	Oblateness     (0.336, 0.363, 0.000)
	Obliquity       0.01041
	EqAscendNode    -12.316
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.621 0.619 0.615)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.69336
		Randomize      (0.786, 0.466, 0.090)
		colorDistMagn   0.79182
		colorDistFreq   0.025789
		detailScale     16
		snowLevel       2
		tropicLatitude  0.050567
		icecapLatitude  2
		icecapHeight    0.51315
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32502
		heightTempGrad  0.625
		beachWidth      0.0015415
		tropicWidth     0.07
		mainFreq        0.72027
		venusFreq       0.74979
		venusMagn       0.6554
		mareDensity     0
		terraceProb     0.13177
		erosion         0
		montesMagn      0.62243
		montesFreq      3.336
		montesSpiky     0.88365
		montesFraction  0.58677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.086382
		hillsFraction   0.68602
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24845
		craterFreq      0.18643
		craterDensity   0.86682
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58317
		volcanoTemp     1088.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.172
		BumpOffset      2.586
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.405282514
		SemiMajorAxisKm 77455.2224
		Eccentricity    1.27061567e-05
		Inclination     0.0104101841
		AscendingNode   -12.3160972
		ArgOfPericenter -131.913212
		MeanAnomaly     -166.704121
	}
}

DwarfMoon	"2.D9"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            8.8333e-10
	Radius          6.6632
	InertiaMoment   0.39896
	Oblateness     (0.334, 0.330, 0.000)
	Obliquity       0.0045661
	EqAscendNode    -174.75
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.801 0.798 0.797)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.26242
		Randomize      (-0.943, 0.296, 0.423)
		colorDistMagn   0.8056
		colorDistFreq   0.019992
		detailScale     32
		snowLevel       2
		tropicLatitude  0.050466
		icecapLatitude  2
		icecapHeight    0.41086
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22273
		heightTempGrad  0.625
		beachWidth      0.00098932
		tropicWidth     0.07
		mainFreq        0.52548
		venusFreq       0.5419
		venusMagn       0.65012
		mareDensity     0
		terraceProb     0.25207
		erosion         0
		montesMagn      0.46025
		montesFreq      2.6864
		montesSpiky     0.99904
		montesFraction  0.66278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.10496
		hillsFraction   0.85471
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22573
		craterFreq      0.24454
		craterDensity   0.96663
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47405
		volcanoTemp     1136.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.9969
		BumpOffset      2.9984
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.436402988
		SemiMajorAxisKm 81371.1782
		Eccentricity    5.8763268e-05
		Inclination     0.00456614683
		AscendingNode   -174.748953
		ArgOfPericenter -94.0419607
		MeanAnomaly     -35.8585537
	}
}

DwarfMoon	"2.1"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.6914e-05
	Radius          177.77
	InertiaMoment   0.3978
	Oblateness     (0.329, 0.257, 0.000)
	Obliquity       0.038579
	EqAscendNode    -117.02
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.585 0.579 0.575)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83149
		Randomize      (-0.673, 0.126, 0.756)
		colorDistMagn   0.81947
		colorDistFreq   23.216
		detailScale     512
		snowLevel       2
		tropicLatitude  0.05105
		icecapLatitude  2
		icecapHeight    0.77245
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12043
		heightTempGrad  0.625
		beachWidth      0.00073717
		tropicWidth     0.07
		mainFreq        0.34969
		venusFreq       0.56573
		venusMagn       0.64482
		mareDensity     0
		terraceProb     0.398
		erosion         0
		montesMagn      0.57633
		montesFreq      3.3883
		montesSpiky     0.96683
		montesFraction  0.76097
		dunesFraction   0
		hillsMagn       0
		hillsFreq       66.945
		hillsFraction   0.56484
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25759
		craterFreq      0.99942
		craterDensity   0.79529
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51951
		volcanoTemp     983.89
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
		PeriodDays      0.50569278
		SemiMajorAxisKm 89771.1287
		Eccentricity    0.00033943454
		Inclination     0.0385790763
		AscendingNode   -117.018516
		ArgOfPericenter 27.0204318
		MeanAnomaly     -0.683473041
	}
}

DwarfMoon	"2.D10"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            1.8041e-09
	Radius          8.3804
	InertiaMoment   0.39877
	RotationPeriod  92.525
	Obliquity       -32.553
	EqAscendNode    -39.358

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.765 0.761 0.758)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.40056
		Randomize      (-0.403, -0.044, -0.911)
		colorDistMagn   0.83343
		colorDistFreq   0.029096
		detailScale     32
		snowLevel       2
		tropicLatitude  0.49564
		icecapLatitude  2
		icecapHeight    0.67822
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41814
		heightTempGrad  0.625
		beachWidth      0.00048503
		tropicWidth     0.07
		mainFreq        0.59679
		venusFreq       0.58348
		venusMagn       0.63948
		mareDensity     0
		terraceProb     0.14084
		erosion         0
		montesMagn      0.42719
		montesFreq      2.734
		montesSpiky     0.93063
		montesFraction  0.15408
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.12483
		hillsFraction   0.66959
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23413
		craterFreq      0.2602
		craterDensity   0.90624
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.35401
		volcanoTemp     1231.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.5424
		BumpOffset      3.7712
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      7.71040258
		SemiMajorAxisKm 551988.67
		Eccentricity    0.275271852
		Inclination     -32.5530885
		AscendingNode   -39.3582312
		ArgOfPericenter -36.4511906
		MeanAnomaly     125.115837
	}
}

DwarfMoon	"2.D11"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            2.536e-09
	Radius          9.3427
	InertiaMoment   0.39448
	Obliquity       217.32
	EqAscendNode    77.781
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.545 0.543 0.540)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.96963
		Randomize      (-0.132, -0.213, -0.578)
		colorDistMagn   0.84749
		colorDistFreq   0.060585
		detailScale     32
		snowLevel       2
		tropicLatitude  0.64506
		icecapLatitude  2
		icecapHeight    0.61148
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31585
		heightTempGrad  0.625
		beachWidth      0.00083288
		tropicWidth     0.07
		mainFreq        0.43539
		venusFreq       0.59931
		venusMagn       0.63408
		mareDensity     0
		terraceProb     0.26105
		erosion         0
		montesMagn      0.54265
		montesFreq      3.4452
		montesSpiky     0.88139
		montesFraction  0.3548
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.25916
		hillsFraction   0.8072
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27443
		craterFreq      0.2157
		craterDensity   1.0294
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48096
		volcanoTemp     1079.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.4085
		BumpOffset      4.2042
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.88818739
		SemiMajorAxisKm 651563.258
		Eccentricity    0.0927967929
		Inclination     217.322092
		AscendingNode   77.7814522
		ArgOfPericenter -60.2967627
		MeanAnomaly     -63.2436433
	}
}

DwarfMoon	"2.D12"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            3.5343e-09
	Radius          10.375
	InertiaMoment   0.39857
	Obliquity       227.6
	EqAscendNode    -89.258
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.726 0.724 0.722)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53869
		Randomize      (0.138, -0.383, -0.245)
		colorDistMagn   0.86168
		colorDistFreq   0.040397
		detailScale     32
		snowLevel       2
		tropicLatitude  0.77103
		icecapLatitude  2
		icecapHeight    0.54738
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21356
		heightTempGrad  0.625
		beachWidth      0.0011807
		tropicWidth     0.07
		mainFreq        0.68578
		venusFreq       0.61508
		venusMagn       0.6286
		mareDensity     0
		terraceProb     0.41261
		erosion         0
		montesMagn      0.38303
		montesFreq      2.7793
		montesSpiky     0.99791
		montesFraction  0.4481
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.27978
		hillsFraction   0.54524
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24158
		craterFreq      0.1493
		craterDensity   0.84824
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52645
		volcanoTemp     1027.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.3377
		BumpOffset      4.6689
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      11.2363591
		SemiMajorAxisKm 709516.556
		Eccentricity    0.390835433
		Inclination     227.599342
		AscendingNode   -89.2584749
		ArgOfPericenter -156.498115
		MeanAnomaly     -157.953747
	}
}

DwarfMoon	"2.D13"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            4.8905e-09
	Radius          11.796
	InertiaMoment   0.39985
	Obliquity       153.15
	EqAscendNode    6.2679
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.509 0.503 0.500)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.10776
		Randomize      (0.409, -0.553, 0.088)
		colorDistMagn   0.87599
		colorDistFreq   0.091424
		detailScale     32
		snowLevel       2
		tropicLatitude  0.40682
		icecapLatitude  2
		icecapHeight    0.46881
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11126
		heightTempGrad  0.625
		beachWidth      0.0015286
		tropicWidth     0.07
		mainFreq        0.50592
		venusFreq       0.63255
		venusMagn       0.62303
		mareDensity     0
		terraceProb     0.14979
		erosion         0
		montesMagn      0.5133
		montesFreq      3.5087
		montesSpiky     0.96563
		montesFraction  0.52277
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.32693
		hillsFraction   0.65363
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.215
		craterFreq      0.22819
		craterDensity   0.94669
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41852
		volcanoTemp     1174.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.616
		BumpOffset      5.308
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      13.5794142
		SemiMajorAxisKm 805006.682
		Eccentricity    0.330087022
		Inclination     153.154448
		AscendingNode   6.26785032
		ArgOfPericenter -101.439953
		MeanAnomaly     -81.4696243
	}
}

DwarfMoon	"2.D14"
{
	ParentBody     "2"
	Class          "Asteroid"
	Mass            6.7278e-09
	Radius          13.13
	InertiaMoment   0.39835
	RotationPeriod  181.65
	Obliquity       134.72
	EqAscendNode    177.68

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.689 0.685 0.683)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67683
		Randomize      (0.679, -0.723, 0.421)
		colorDistMagn   0.89045
		colorDistFreq   0.05716
		detailScale     64
		snowLevel       2
		tropicLatitude  0.67475
		icecapLatitude  2
		icecapHeight    0.87935
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40897
		heightTempGrad  0.625
		beachWidth      0.00067645
		tropicWidth     0.07
		mainFreq        0.31762
		venusFreq       0.65548
		venusMagn       0.61733
		mareDensity     0
		terraceProb     0.27015
		erosion         0
		montesMagn      0.26273
		montesFreq      2.8229
		montesSpiky     0.92917
		montesFraction  0.59372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.36243
		hillsFraction   0.77559
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24927
		craterFreq      0.18149
		craterDensity   0.7594
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48753
		volcanoTemp     1222.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.817
		BumpOffset      5.9085
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      15.1377953
		SemiMajorAxisKm 865473.71
		Eccentricity    0.308023343
		Inclination     134.722105
		AscendingNode   177.682371
		ArgOfPericenter 139.69434
		MeanAnomaly     -86.1480034
	}
}

Planet	"Pournelle"
{
	ParentBody     "Pourne"
	Class          "Terra"
	Mass            2.0848
	Radius          8396.2
	InertiaMoment   0.33061
	Oblateness      0.010713
	RotationPeriod  13.987
	RotationEpoch   0
	Obliquity       -6.2649
	EqAscendNode    159.34

	AlbedoBond      0.52
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.734 0.732 0.730)

	Surface
	{
		Preset         "aquaria_wet_default_yellow_seas.cfg"
		SurfStyle       0.45499
		Randomize      (-0.627, -0.500, -0.641)
		colorDistMagn   0.074275
		colorDistFreq   1065
		detailScale     32768
		seaLevel        0.97864
		snowLevel       2
		tropicLatitude  0.12765
		icecapLatitude  2
		icecapHeight    1.0364
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        1
		heightTempGrad  0.375
		beachWidth      0.0011218
		tropicWidth     0.5
		mainFreq        0.91796
		venusFreq       1.0194
		venusMagn       0.74764
		mareFreq        0
		mareDensity     0
		terraceProb     0.25807
		erosion         0
		montesMagn      0.2537
		montesFreq      424.55
		montesSpiky     0.8461
		montesFraction  0.26701
		dunesMagn       0.055272
		dunesFreq       75.578
		dunesFraction   0.73972
		hillsMagn       0.1707
		hillsFreq       683.14
		hillsFraction   0.85671
		hills2Fraction  0.036789
		riversMagn      0
		riversFreq      3.4495
		riversSin       5.9002
		riftsMagn       0
		riftsFreq       3.0768
		riftsSin        6.7385
		canyonsMagn     0.014875
		canyonsFreq     200.63
		canyonsFraction 0.81685
		cracksMagn      0.092205
		cracksFreq      0.90255
		cracksOctaves   2
		craterMagn      0.024598
		craterFreq      70.505
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.70019
		volcanoFreq     0.71738
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 2
		volcanoFlows    0
		volcanoRadius   0.50551
		volcanoTemp     197.99
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.933
		stripeTwist     0.11483
		cycloneMagn     2.9832
		cycloneFreq     0.96062
		cycloneDensity  0.30147
		cycloneOctaves  2
		BumpHeight      85.377
		BumpOffset      83.554
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      2.3063
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           43.554
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			NH3       	87.269
			SO2       	12.7306
		}
	}

	Clouds
	{
		Height          7.7021
		Velocity        102.92
		BumpHeight      3.8512
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.76947
		mainOctaves     10
		Coverage        1
		stripeZones     1.933
		stripeTwist     0.11483
	}

	Clouds
	{
		Height          15.404
		Velocity        148.51
		BumpHeight      3.8512
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.76947
		mainOctaves     10
		Coverage        1
		stripeZones     1.933
		stripeTwist     0.11483
	}

	Clouds
	{
		Height          23.106
		Velocity        139.3
		BumpHeight      3.8512
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.76947
		mainOctaves     10
		Coverage        1
		stripeZones     1.933
		stripeTwist     0.11483
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          90.217
		Density         31.017
		Pressure        29.693
#		Greenhouse      25.921
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.00079351
		Saturation      1.5698

		Composition
		{
			CH4        	55.346
			NH3       	23.897
			CO2       	14.832
			SO2       	5.8713
			CO        	0.052393
			Ar        	0.00073058
			H2O       	0.00017861
			C2H2      	0.00012541
			Ne        	5.3673e-05
			H2S       	3.8835e-05
			C2H6      	1.3531e-05
		}
	}

	Aurora
	{
		Height         83.205
		NorthLat       47.888
		NorthLon       -162.19
		NorthRadius    2100.5
		NorthWidth     629.89
		NorthRings     4
		NorthBright    0.51834
		NorthFlashFreq 69.019
		NorthMoveSpeed 0.93482
		NorthParticles 50000
		SouthLat       -39.742
		SouthLon       45.03
		SouthRadius    2576.5
		SouthWidth     749.08
		SouthRings     3
		SouthBright    0.51834
		SouthFlashFreq 73.881
		SouthMoveSpeed 0.85879
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
		SemiMajorAxis   2.82405674
		Eccentricity    0.0550289681
		Inclination     1.12896281
		AscendingNode   159.642182
		ArgOfPericenter 3.69569376
		MeanAnomaly     233.785349
	}
}


Moon	"Baen"
{
	ParentBody     "Pournelle"
	Class          "Terra"
	Mass            0.0065888
	Radius          1510.6
	InertiaMoment   0.38489
	Oblateness      0.019878
	Obliquity       -1.1824
	EqAscendNode    -91.399
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.852 0.794 0.737)

	Surface
	{
		Preset         "terra_airless_io.cfg"
		SurfStyle       0.24738
		Randomize      (0.172, -0.427, -0.485)
		colorDistMagn   0.09013
		colorDistFreq   178.23
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.20698
		snowLevel       2
		tropicLatitude  0.037692
		icecapLatitude  2
		icecapHeight    0.47742
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49147
		heightTempGrad  0.625
		beachWidth      0.0011656
		tropicWidth     0.07
		mainFreq        1.9183
		venusFreq       0.85175
		venusMagn       0
		mareFreq        0.41999
		mareDensity     0.15824
		terraceProb     0.28606
		erosion         0
		montesMagn      0.074656
		montesFreq      66.753
		montesSpiky     0.97845
		montesFraction  0.29673
		dunesMagn       0.051769
		dunesFreq       10.108
		dunesFraction   0.81269
		hillsMagn       0.11668
		hillsFreq       135.26
		hillsFraction   0.71822
		hills2Fraction  0
		riversMagn      59.56
		riversFreq      2.1574
		riversSin       6.9929
		riftsMagn       57.067
		riftsFreq       2.5656
		riftsSin        5.9695
		canyonsMagn     0.41034
		canyonsFreq     0.45188
		canyonsFraction 0.49219
		cracksMagn      0.070973
		cracksFreq      0.2855
		cracksOctaves   0
		craterMagn      0.53311
		craterFreq      4.234
		craterDensity   0.99158
		craterOctaves   19
		craterRayedFactor 0.077933
		volcanoMagn     0.18489
		volcanoFreq     0.63401
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.1775
		volcanoFlows    0.23712
		volcanoRadius   0.13414
		volcanoTemp     1024.5
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
		PeriodDays      0.460849629
		SemiMajorAxisKm 396000.1197
		Eccentricity    4.09412824e-05
		Inclination     -1.1823735
		AscendingNode   -91.3987911
		ArgOfPericenter -30.5765996
		MeanAnomaly     152.208759
	}
}



Planet	"3"
{
	ParentBody     "Pourne"
	Class          "Terra"
	Mass            1.141
	Radius          6769
	InertiaMoment   0.19174
	RotationPeriod  50.372
	RotationEpoch   0
	Obliquity       104.68
	EqAscendNode    -165.49

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.616 0.508 0.442)

	Surface
	{
		Preset         "terra_arid_mars2_green.cfg"
		SurfStyle       0.17182
		Randomize      (0.404, -0.390, 0.407)
		colorDistMagn   0.072042
		colorDistFreq   827.62
		detailScale     32768
		seaLevel        0.10135
		snowLevel       2
		tropicLatitude  0.95596
		icecapLatitude  1.0042
		icecapHeight    0.73809
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25883
		heightTempGrad  0.625
		beachWidth      0.0010836
		tropicWidth     0.07
		mainFreq        0.62315
		venusFreq       0.21082
		venusMagn       1.0519
		mareFreq        1.2938
		mareDensity     0
		terraceProb     0.40494
		erosion         0
		montesMagn      0.15333
		montesFreq      403.83
		montesSpiky     0.92415
		montesFraction  0.57194
		dunesMagn       0.066415
		dunesFreq       71.252
		dunesFraction   0.65802
		hillsMagn       0.16302
		hillsFreq       595.03
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      2.2481
		riversSin       5.5438
		riftsMagn       57.99
		riftsFreq       3.158
		riftsSin        6.4536
		canyonsMagn     0.032719
		canyonsFreq     179.02
		canyonsFraction 0
		cracksMagn      0.071656
		cracksFreq      0.64169
		cracksOctaves   0
		craterMagn      0.6305
		craterFreq      16.05
		craterDensity   0.31648
		craterOctaves   7.0773
		volcanoMagn     0.70796
		volcanoFreq     0.65109
		volcanoDensity  0.18505
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.81349
		volcanoRadius   0.50642
		volcanoTemp     987.87
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.7872
		stripeTwist     0.1983
		cycloneMagn     2.8848
		cycloneFreq     0.82909
		cycloneDensity  0.50627
		cycloneOctaves  2
		BumpHeight      19.893
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      2.2626
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          13.079
		Velocity        153.78
		BumpHeight      1.5663
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.70834
		mainOctaves     10
		Coverage        0.16728
		stripeZones     1.7872
		stripeTwist     0.1983
	}

	Clouds
	{
		Height          16.212
		Velocity        117.89
		BumpHeight      1.5663
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.70834
		mainOctaves     10
		Coverage        0.16728
		stripeZones     1.7872
		stripeTwist     0.1983
	}

	Clouds
	{
		Height          19.345
		Velocity        2.9193
		BumpHeight      1.5663
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.70834
		mainOctaves     10
		Coverage        0.16728
		stripeZones     1.7872
		stripeTwist     0.1983
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          39.786
		Density         0.20818
		Pressure        0.09749
		Greenhouse      1.0854
		Bright          9.9493
		Opacity         1
		SkyLight        3.3164
		Hue             -0.0043038
		Saturation      0.95175

		Composition
		{
			CO2       	85.755
			C2H2      	5.4875
			C2H6      	4.9302
			N2        	3.0471
			C3H8      	0.26602
			C2H4      	0.22394
			CH4       	0.12008
			NH3       	0.077694
			H2O       	0.060134
			CO        	0.014564
			C8H18     	0.0068709
			H2S       	0.0058687
			SO2       	0.0054431
			Ar        	1.3963e-05
		}
	}

	Aurora
	{
		Height         55.701
		NorthLat       68.018
		NorthLon       118.22
		NorthRadius    1831.9
		NorthWidth     488.49
		NorthRings     3
		NorthBright    0.34036
		NorthFlashFreq 71.28
		NorthMoveSpeed 0.80049
		NorthParticles 50000
		SouthLat       -52.769
		SouthLon       -57.562
		SouthRadius    1960.5
		SouthWidth     760.13
		SouthRings     2
		SouthBright    0.34036
		SouthFlashFreq 69.722
		SouthMoveSpeed 1.1861
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     9230.9
		OuterRadius     67566
		EdgeRadius      20777
		MeanRadius      13076
		Thickness       25
		ChartRadius     20777
		RotationPeriod  4.756
		FrontBright     0.60536
		BackBright      3.0557
		Density         0.99367
		Opacity         0.99367
		Brightness      1
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7006
		densityScale    2.3379
		densityOffset   -1.6537
		densityPower    1.0346
		colorContrast   0.14458
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
		SemiMajorAxis   1.4248682
		Eccentricity    0.000490721622
		Inclination     -2.44146936
		AscendingNode   -167.502334
		ArgOfPericenter 147.832401
		MeanAnomaly     243.019205
	}
}

DwarfMoon	"4.D1"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.55e-06
	Radius          92.351
	InertiaMoment   0.39734
	Oblateness      0.0022489
	Obliquity       -0.0062638
	EqAscendNode    9.9741
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.661 0.465 0.395)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.61836
		Randomize      (0.228, 0.632, 0.579)
		colorDistMagn   0.25014
		colorDistFreq   3.0134
		detailScale     256
		snowLevel       2
		tropicLatitude  0.042492
		icecapLatitude  1.8462
		icecapHeight    0.83273
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22421
		heightTempGrad  0.625
		beachWidth      0.0010232
		tropicWidth     0.07
		mainFreq        0.31246
		venusFreq       0.60795
		venusMagn       0.69253
		mareDensity     0
		terraceProb     0.25487
		erosion         0
		montesMagn      0.6524
		montesFreq      3.3919
		montesSpiky     0.96326
		montesFraction  0.78817
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.286
		hillsFraction   0.70419
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22176
		craterFreq      0.20483
		craterDensity   0.91929
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51628
		volcanoTemp     903.85
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
		PeriodDays      1.50172523
		SemiMajorAxisKm 57885.568
		Eccentricity    8.57719715e-05
		Inclination     -0.00626382082
		AscendingNode   9.97406228
		ArgOfPericenter -81.5374187
		MeanAnomaly     40.9930001
	}
}

DwarfMoon	"4.D2"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            3.881e-06
	Radius          99.721
	InertiaMoment   0.3991
	Oblateness      0.0014779
	Obliquity       -0.013207
	EqAscendNode    41.112
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.743 0.698 0.675)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.18743
		Randomize      (0.499, 0.462, 0.912)
		colorDistMagn   0.27005
		colorDistFreq   6.3528
		detailScale     256
		snowLevel       2
		tropicLatitude  0.042374
		icecapLatitude  1.843
		icecapHeight    0.70465
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12192
		heightTempGrad  0.625
		beachWidth      0.0016711
		tropicWidth     0.07
		mainFreq        0.5725
		venusFreq       0.62439
		venusMagn       0.68703
		mareDensity     0
		terraceProb     0.40246
		erosion         0
		montesMagn      0.47264
		montesFreq      2.7371
		montesSpiky     0.92629
		montesFraction  0.22628
		dunesFraction   0
		hillsMagn       0
		hillsFreq       18.125
		hillsFraction   0.36942
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25372
		craterFreq      0.35611
		craterDensity   1.0683
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.60029
		volcanoTemp     1051.6
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
		PeriodDays      1.69042102
		SemiMajorAxisKm 62638.318
		Eccentricity    8.54701847e-05
		Inclination     -0.0132069908
		AscendingNode   41.112271
		ArgOfPericenter -66.0928766
		MeanAnomaly     87.8206389
	}
}

DwarfMoon	"4.D3"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.0704e-06
	Radius          123.31
	InertiaMoment   0.39688
	Oblateness      0.0015201
	Obliquity       -0.0072808
	EqAscendNode    74.388
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.564 0.479 0.416)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.7565
		Randomize      (0.769, 0.292, -0.755)
		colorDistMagn   0.2893
		colorDistFreq   4.6535
		detailScale     512
		snowLevel       2
		tropicLatitude  0.042475
		icecapLatitude  1.8405
		icecapHeight    0.82993
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41962
		heightTempGrad  0.625
		beachWidth      0.00081893
		tropicWidth     0.07
		mainFreq        0.41006
		venusFreq       0.6441
		venusMagn       0.68161
		mareDensity     0
		terraceProb     0.14366
		erosion         0
		montesMagn      0.59308
		montesFreq      3.4493
		montesSpiky     0.87431
		montesFraction  0.37693
		dunesFraction   0
		hillsMagn       0
		hillsFreq       46.078
		hillsFraction   0.58373
		hills2Fraction  0
		eqridgeMagn     0.41113
		eqridgeWidth    0.1119
		eqridgeModMagn  0.53431
		eqridgeModFreq  0.3735
		canyonsFraction 0
		craterMagn      0.23108
		craterFreq      0.43502
		craterDensity   0.86254
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53651
		volcanoTemp     1159
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
		PeriodDays      1.82490937
		SemiMajorAxisKm 65918.0927
		Eccentricity    3.88264561e-05
		Inclination     -0.00728082212
		AscendingNode   74.3880671
		ArgOfPericenter -159.210165
		MeanAnomaly     -37.690683
	}
}

DwarfMoon	"4.1"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.2355e-06
	Radius          69.881
	InertiaMoment   0.39997
	Obliquity       0.59862
	EqAscendNode    -162.26
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.675 0.671 0.668)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.32556
		Randomize      (-0.960, 0.122, -0.422)
		colorDistMagn   0.30796
		colorDistFreq   2.9541
		detailScale     256
		snowLevel       2
		tropicLatitude  0.052836
		icecapLatitude  1.8408
		icecapHeight    0.56969
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31733
		heightTempGrad  0.625
		beachWidth      0.0011668
		tropicWidth     0.07
		mainFreq        0.6529
		venusFreq       0.67574
		venusMagn       0.67626
		mareDensity     0
		terraceProb     0.26388
		erosion         0
		montesMagn      0.4417
		montesFreq      2.7823
		montesSpiky     0.99455
		montesFraction  0.46427
		dunesFraction   0
		hillsMagn       0
		hillsFreq       12.825
		hillsFraction   0.6869
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26569
		craterFreq      0.24215
		craterDensity   0.96168
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52303
		volcanoTemp     1147.1
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
		PeriodDays      3.93655659
		SemiMajorAxisKm 110049.351
		Eccentricity    0.0136302793
		Inclination     0.598618025
		AscendingNode   -162.263307
		ArgOfPericenter -13.6096095
		MeanAnomaly     -166.926816
	}
}

DwarfMoon	"4.2"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            7.8909e-06
	Radius          134.78
	InertiaMoment   0.3959
	Obliquity       0.70931
	EqAscendNode    -166.62
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.458 0.453 0.448)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.89463
		Randomize      (-0.690, -0.048, -0.089)
		colorDistMagn   0.32609
		colorDistFreq   4.5072
		detailScale     512
		snowLevel       2
		tropicLatitude  0.054736
		icecapLatitude  1.8393
		icecapHeight    0.49892
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21504
		heightTempGrad  0.625
		beachWidth      0.00091464
		tropicWidth     0.07
		mainFreq        0.48344
		venusFreq       0.52186
		venusMagn       0.67095
		mareDensity     0
		terraceProb     0.41742
		erosion         0
		montesMagn      0.55586
		montesFreq      3.5132
		montesSpiky     0.96204
		montesFraction  0.53733
		dunesFraction   0
		hillsMagn       0
		hillsFreq       43.108
		hillsFraction   0.85815
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23873
		craterFreq      0.56749
		craterDensity   0.78805
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.404
		volcanoTemp     1194.8
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
		PeriodDays      8.17846627
		SemiMajorAxisKm 179180.98
		Eccentricity    0.0302498551
		Inclination     0.709314123
		AscendingNode   -166.618113
		ArgOfPericenter 30.9208626
		MeanAnomaly     110.356424
	}
}

DwarfMoon	"4.D4"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.7073e-11
	Radius          2.6181
	InertiaMoment   0.39872
	Obliquity       190.52
	EqAscendNode    176.65
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.638 0.635 0.629)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4637
		Randomize      (-0.420, -0.218, 0.244)
		colorDistMagn   0.34374
		colorDistFreq   0.0039212
		detailScale     8
		snowLevel       2
		tropicLatitude  0.22347
		icecapLatitude  1.8584
		icecapHeight    0.37749
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11275
		heightTempGrad  0.625
		beachWidth      0.00096249
		tropicWidth     0.07
		mainFreq        0.2709
		venusFreq       0.5548
		venusMagn       0.66568
		mareDensity     0
		terraceProb     0.15258
		erosion         0
		montesMagn      0.40368
		montesFreq      2.8257
		montesSpiky     0.92479
		montesFraction  0.60869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.014588
		hillsFraction   0.56582
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20686
		craterFreq      0.25719
		craterDensity   0.90221
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48438
		volcanoTemp     1142.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3563
		BumpOffset      1.1781
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      74.0252514
		SemiMajorAxisKm 778209.017
		Eccentricity    0.0604012274
		Inclination     190.518473
		AscendingNode   176.653327
		ArgOfPericenter 158.407781
		MeanAnomaly     -76.0127764
	}
}

DwarfMoon	"4.D5"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.1235e-10
	Radius          3.2682
	InertiaMoment   0.39997
	Obliquity       -21.436
	EqAscendNode    -79.445
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.421 0.413 0.409)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.032767
		Randomize      (-0.149, -0.388, 0.577)
		colorDistMagn   0.36096
		colorDistFreq   0.001784
		detailScale     16
		snowLevel       2
		tropicLatitude  0.32655
		icecapLatitude  2
		icecapHeight    0.75039
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41046
		heightTempGrad  0.625
		beachWidth      0.00041035
		tropicWidth     0.07
		mainFreq        0.55216
		venusFreq       0.57478
		venusMagn       0.66042
		mareDensity     0
		terraceProb     0.27303
		erosion         0
		montesMagn      0.52522
		montesFreq      3.5869
		montesSpiky     0.87176
		montesFraction  0.68875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.019176
		hillsFraction   0.67044
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24619
		craterFreq      0.2135
		craterDensity   1.0206
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53023
		volcanoTemp     1090.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.9413
		BumpOffset      1.4707
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      88.1309496
		SemiMajorAxisKm 874168.791
		Eccentricity    0.305571256
		Inclination     -21.435957
		AscendingNode   -79.4445708
		ArgOfPericenter -89.1026951
		MeanAnomaly     -29.3074926
	}
}

DwarfMoon	"4.D6"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.805e-10
	Radius          3.8065
	InertiaMoment   0.39851
	Obliquity       27.601
	EqAscendNode    -115.53
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.599 0.596 0.594)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60183
		Randomize      (0.121, -0.558, 0.910)
		colorDistMagn   0.37778
		colorDistFreq   0.0078188
		detailScale     16
		snowLevel       2
		tropicLatitude  0.49984
		icecapLatitude  1.8643
		icecapHeight    0.66527
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30816
		heightTempGrad  0.625
		beachWidth      0.0007582
		tropicWidth     0.07
		mainFreq        0.38613
		venusFreq       0.5913
		venusMagn       0.65516
		mareDensity     0
		terraceProb     0.43371
		erosion         0
		montesMagn      0.34062
		montesFreq      2.8679
		montesSpiky     0.99341
		montesFraction  0.80264
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.043342
		hillsFraction   0.80915
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22286
		craterFreq      0.27864
		craterDensity   0.84358
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42881
		volcanoTemp     1238
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.4258
		BumpOffset      1.7129
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      95.1433368
		SemiMajorAxisKm 919945.113
		Eccentricity    0.0632393128
		Inclination     27.601398
		AscendingNode   -115.525149
		ArgOfPericenter 86.4059577
		MeanAnomaly     -54.1583687
	}
}

DwarfMoon	"4.D7"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            2.8066e-10
	Radius          4.4281
	InertiaMoment   0.39981
	Obliquity       -28.233
	EqAscendNode    51.669
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.779 0.777 0.776)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.1709
		Randomize      (0.391, -0.728, -0.757)
		colorDistMagn   0.39425
		colorDistFreq   0.017373
		detailScale     16
		snowLevel       2
		tropicLatitude  0.43609
		icecapLatitude  2
		icecapHeight    0.60011
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20587
		heightTempGrad  0.625
		beachWidth      0.0014061
		tropicWidth     0.07
		mainFreq        0.62764
		venusFreq       0.60691
		venusMagn       0.64988
		mareDensity     0
		terraceProb     0.1614
		erosion         0
		montesMagn      0.49682
		montesFreq      3.6761
		montesSpiky     0.96082
		montesFraction  0.24931
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.051166
		hillsFraction   0.54631
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25468
		craterFreq      0.22604
		craterDensity   0.94225
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49082
		volcanoTemp     985.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.9853
		BumpOffset      1.9927
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      100.614103
		SemiMajorAxisKm 954880.236
		Eccentricity    0.291803621
		Inclination     -28.2331195
		AscendingNode   51.668685
		ArgOfPericenter 111.446982
		MeanAnomaly     -97.1245572
	}
}

DwarfMoon	"4.D8"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            4.2512e-10
	Radius          4.9211
	InertiaMoment   0.39828
	Obliquity       169.92
	EqAscendNode    9.8217
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.563 0.559 0.554)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73997
		Randomize      (0.662, -0.898, -0.424)
		colorDistMagn   0.41039
		colorDistFreq   0.01228
		detailScale     16
		snowLevel       2
		tropicLatitude  0.13415
		icecapLatitude  2
		icecapHeight    0.53498
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10358
		heightTempGrad  0.625
		beachWidth      0.0011539
		tropicWidth     0.07
		mainFreq        0.46343
		venusFreq       0.62323
		venusMagn       0.64458
		mareDensity     0
		terraceProb     0.28233
		erosion         0
		montesMagn      0.63995
		montesFreq      2.9092
		montesSpiky     0.92327
		montesFraction  0.38664
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.05712
		hillsFraction   0.65446
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23189
		craterFreq      0.17774
		craterDensity   0.74765
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53813
		volcanoTemp     1233.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.429
		BumpOffset      2.2145
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      106.31185
		SemiMajorAxisKm 990598.005
		Eccentricity    0.354891973
		Inclination     169.924875
		AscendingNode   9.8216683
		ArgOfPericenter 160.649006
		MeanAnomaly     177.403521
	}
}

DwarfMoon	"4.D9"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            6.3038e-10
	Radius          5.6029
	InertiaMoment   0.39964
	Obliquity       202.01
	EqAscendNode    84.725
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.743 0.740 0.737)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30904
		Randomize      (0.932, 0.932, -0.091)
		colorDistMagn   0.42624
		colorDistFreq   0.025676
		detailScale     16
		snowLevel       2
		tropicLatitude  0.41305
		icecapLatitude  1.8572
		icecapHeight    0.45001
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40129
		heightTempGrad  0.625
		beachWidth      0.00090176
		tropicWidth     0.07
		mainFreq        0.7343
		venusFreq       0.6426
		venusMagn       0.63924
		mareDensity     0
		terraceProb     0.45171
		erosion         0
		montesMagn      0.46816
		montesFreq      3.7944
		montesSpiky     0.86913
		montesFraction  0.47168
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.066312
		hillsFraction   0.77704
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26749
		craterFreq      0.23877
		craterDensity   0.8852
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44299
		volcanoTemp     1181.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.0426
		BumpOffset      2.5213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      115.296301
		SemiMajorAxisKm 1045650.58
		Eccentricity    0.0297540609
		Inclination     202.00758
		AscendingNode   84.7253789
		ArgOfPericenter 81.0407166
		MeanAnomaly     116.283766
	}
}

DwarfMoon	"4.D10"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            9.1847e-10
	Radius          6.5764
	InertiaMoment   0.39803
	Obliquity       -44.792
	EqAscendNode    148.37
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.527 0.518 0.515)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87811
		Randomize      (-0.797, 0.762, 0.242)
		colorDistMagn   0.44181
		colorDistFreq   0.020492
		detailScale     32
		snowLevel       2
		tropicLatitude  0.67444
		icecapLatitude  1.9336
		icecapHeight    0.8233
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.299
		heightTempGrad  0.625
		beachWidth      0.00034962
		tropicWidth     0.07
		mainFreq        0.53233
		venusFreq       0.67263
		venusMagn       0.63383
		mareDensity     0
		terraceProb     0.17016
		erosion         0
		montesMagn      0.58667
		montesFreq      2.9498
		montesSpiky     0.99227
		montesFraction  0.54416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.076378
		hillsFraction   0.52434
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23947
		craterFreq      0.19612
		craterDensity   0.99098
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49712
		volcanoTemp     1029
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.9187
		BumpOffset      2.9594
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      132.134373
		SemiMajorAxisKm 1145126.69
		Eccentricity    0.203642097
		Inclination     -44.7919399
		AscendingNode   148.371499
		ArgOfPericenter -147.687918
		MeanAnomaly     -125.915197
	}
}

DwarfMoon	"4.D11"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.3189e-09
	Radius          7.4191
	InertiaMoment   0.39948
	RotationPeriod  1988.1
	Obliquity       -42.432
	EqAscendNode    168.33

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.706 0.701 0.698)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.44717
		Randomize      (-0.527, 0.592, 0.575)
		colorDistMagn   0.45714
		colorDistFreq   0.04214
		detailScale     32
		snowLevel       2
		tropicLatitude  0.64347
		icecapLatitude  2
		icecapHeight    0.70137
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1967
		heightTempGrad  0.625
		beachWidth      0.00099747
		tropicWidth     0.07
		mainFreq        0.35971
		venusFreq       0.51815
		venusMagn       0.62835
		mareDensity     0
		terraceProb     0.29181
		erosion         0
		montesMagn      0.43655
		montesFreq      3.9892
		montesSpiky     0.95959
		montesFraction  0.61584
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.16271
		hillsFraction   0.6387
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2095
		craterFreq      0.25306
		craterDensity   0.82233
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54711
		volcanoTemp     1176.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.6772
		BumpOffset      3.3386
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      149.316146
		SemiMajorAxisKm 1242360.15
		Eccentricity    0.469117208
		Inclination     -42.4316861
		AscendingNode   168.334138
		ArgOfPericenter -155.072848
		MeanAnomaly     -173.693805
	}
}

DwarfMoon	"4.D12"
{
	ParentBody     "4"
	Class          "Asteroid"
	Mass            1.871e-09
	Radius          8.3682
	InertiaMoment   0.39775
	Obliquity       189.96
	EqAscendNode    -48.372
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.486 0.483 0.480)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.01624
		Randomize      (-0.257, 0.422, 0.908)
		colorDistMagn   0.47225
		colorDistFreq   0.030757
		detailScale     32
		snowLevel       2
		tropicLatitude  0.21403
		icecapLatitude  1.8541
		icecapHeight    0.63054
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49441
		heightTempGrad  0.625
		beachWidth      0.00074533
		tropicWidth     0.07
		mainFreq        0.60449
		venusFreq       0.55323
		venusMagn       0.62277
		mareDensity     0
		terraceProb     0.47203
		erosion         0
		montesMagn      0.55093
		montesFreq      2.9901
		montesSpiky     0.92174
		montesFraction  0.69755
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.18157
		hillsFraction   0.75182
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24698
		craterFreq      0.21023
		craterDensity   0.92431
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45364
		volcanoTemp     1024.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.5314
		BumpOffset      3.7657
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      166.097654
		SemiMajorAxisKm 1333783.47
		Eccentricity    0.0603609656
		Inclination     189.96384
		AscendingNode   -48.3720158
		ArgOfPericenter 158.731472
		MeanAnomaly     175.316222
	}
}

Barycenter	"5-5.1"
{
	ParentBody     "Pourne"
	Mass            0.23746
	Radius          3755.3
	RotationPeriod  24
	RotationEpoch   0
	Obliquity       -inf
	EqAscendNode    -inf


	Orbit
	{
		RefPlane        "Equator"
		Period          9.7197465
		SemiMajorAxis   5.16678684
		Eccentricity    0.00612186366
		Inclination     -4.67737363
		AscendingNode   -117.242821
		ArgOfPericenter 39.6889309
		MeanAnomaly     176.0768
	}
}

Planet	"5"
{
	ParentBody     "5-5.1"
	Class          "Aquaria"
	Mass            0.23156
	Radius          4730.1
	InertiaMoment   0.33026
	Obliquity       -1.0246
	EqAscendNode    15.185
	TidalLocked     true

	AlbedoBond      0.81983
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.730 0.727 0.722)

	Surface
	{
		Preset         "aquaria_arid_white.cfg"
		SurfStyle       0.88864
		Randomize      (-0.565, -0.279, -0.544)
		colorDistMagn   0.063162
		colorDistFreq   611.3
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.19222
		snowLevel       0.85
		tropicLatitude  0.075076
		icecapLatitude  2
		icecapHeight    0.59893
		climatePole     0.4375
		climateTropic   0.49717
		climateEquator  0.59516
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18463
		heightTempGrad  0.44033
		beachWidth      0.00074535
		tropicWidth     0.30463
		mainFreq        1.9505
		venusFreq       0.9836
		venusMagn       0
		mareFreq        1.4927
		mareDensity     0.15336
		terraceProb     0.2355
		erosion         0
		montesMagn      0.22981
		montesFreq      286.21
		montesSpiky     0.84645
		montesFraction  0.87686
		dunesMagn       0.03643
		dunesFreq       41.813
		dunesFraction   0.57632
		hillsMagn       0.12986
		hillsFreq       566.15
		hillsFraction   0.10791
		hills2Fraction  0.066568
		riversMagn      0
		riversFreq      1.9119
		riversSin       7.4983
		riftsMagn       0
		riftsFreq       3.6603
		riftsSin        6.9141
		canyonsMagn     0.37106
		canyonsFreq     1.5715
		canyonsFraction 0
		cracksMagn      0.034344
		cracksFreq      1.7814
		cracksOctaves   4
		craterMagn      0.6827
		craterFreq      16.633
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.6215
		volcanoFreq     0.55967
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.4532
		volcanoRadius   0.52343
		volcanoTemp     246.85
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.6202
		stripeTwist     0.25665
		cycloneMagn     2.7989
		cycloneFreq     0.70632
		cycloneDensity  0.39471
		cycloneOctaves  2
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.494
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          14.396
		Velocity        156.2
		BumpHeight      2.1977
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.63527
		mainOctaves     10
		Coverage        0.20343
		stripeZones     1.6202
		stripeTwist     0.25665
	}

	Clouds
	{
		Height          18.791
		Velocity        116.24
		BumpHeight      2.1977
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.63527
		mainOctaves     10
		Coverage        0.20343
		stripeZones     1.6202
		stripeTwist     0.25665
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          110.7
		Density         3.5507
		Pressure        1.3277
		Greenhouse      8.6381
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.0020059
		Saturation      0.89817

		Composition
		{
			N2        	94.639
			CO        	4.3208
			C2H4      	0.77229
			C2H6      	0.21808
			CO2       	0.023534
			C2H2      	0.013328
			Ar        	0.012136
			H2S       	0.00045682
			Ne        	0.00020718
			C3H8      	8.1694e-05
		}
	}

	Aurora
	{
		Height         64.499
		NorthLat       70.977
		NorthLon       172.61
		NorthRadius    881.63
		NorthWidth     316.33
		NorthRings     5
		NorthBright    0.3
		NorthFlashFreq 69.491
		NorthMoveSpeed 1.1889
		NorthParticles 50000
		SouthLat       -73.25
		SouthLon       21.779
		SouthRadius    1395.8
		SouthWidth     353.2
		SouthRings     4
		SouthBright    0.3
		SouthFlashFreq 67.805
		SouthMoveSpeed 1.0983
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
		Period          0.0140737376
		SemiMajorAxis   1.29341884e-05
		Eccentricity    0.0114593599
		Inclination     -1.02462531
		AscendingNode   15.1846043
		ArgOfPericenter 66.0312247
		MeanAnomaly     -1.508658
	}
}

Moon	"5.1"
{
	ParentBody     "5-5.1"
	Class          "Aquaria"
	Mass            0.0058972
	Radius          1384.7
	InertiaMoment   0.38587
	Obliquity       -1.0246
	EqAscendNode    15.185
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.425 0.420 0.414)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.047811
		Randomize      (0.735, 0.335, -0.515)
		colorDistMagn   0.062915
		colorDistFreq   163.63
		detailScale     4096
		drivenDarkening 0.69198
		seaLevel        0.13391
		snowLevel       2
		tropicLatitude  0.075076
		icecapLatitude  0.56938
		icecapHeight    0.17576
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14171
		heightTempGrad  0.625
		beachWidth      0.00083406
		tropicWidth     0.07
		mainFreq        1.7485
		venusFreq       0.48758
		venusMagn       0.18874
		mareFreq        0.59418
		mareDensity     0.15622
		terraceProb     0.35213
		erosion         0
		montesMagn      0.057951
		montesFreq      77.707
		montesSpiky     0.9554
		montesFraction  0.051711
		dunesMagn       0.03926
		dunesFreq       15.046
		dunesFraction   0.84545
		hillsMagn       0.14287
		hillsFreq       169.93
		hillsFraction   0.83047
		hills2Fraction  0.0073812
		riversMagn      0
		riversFreq      3.0576
		riversSin       7.6065
		riftsMagn       0
		riftsFreq       3.3109
		riftsSin        6.7494
		canyonsMagn     0.46541
		canyonsFreq     0.48376
		canyonsFraction 0
		cracksMagn      0.062127
		cracksFreq      0.4094
		cracksOctaves   0
		craterMagn      0.53043
		craterFreq      2.4866
		craterDensity   0.86574
		craterOctaves   19
		craterRayedFactor 0.1438
		volcanoMagn     0.20367
		volcanoFreq     0.71978
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.1408
		volcanoFlows    0.082415
		volcanoRadius   0.15099
		volcanoTemp     228.15
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
		PeriodDays      5.14032275
		SemiMajorAxisKm 75976.4993
		Eccentricity    0.0114593599
		Inclination     -1.02462531
		AscendingNode   15.1846043
		ArgOfPericenter -113.968775
		MeanAnomaly     -1.508658
	}
}

Planet	"6"
{
	ParentBody     "Pourne"
	Class          "Neptune"
	Mass            16.608
	Radius          20681
	InertiaMoment   0.23381
	Oblateness      0.026591
	RotationPeriod  10.26
	RotationEpoch   0
	Obliquity       -1.939
	EqAscendNode    -33.51

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "neptune_cold_default.cfg"
		SurfStyle       0.40859
		Randomize      (0.510, -0.383, 0.796)
		detailScale     256
		tropicLatitude  0.04162
		icecapLatitude  0.94162
		mareDensity     0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.4981
		stripeFluct     0.37499
		stripeTwist     12.818
		cycloneMagn     13.207
		cycloneFreq     0.77377
		cycloneDensity  0.13829
		cycloneOctaves  0
		cycloneMagn2     0.27807
		cycloneFreq2     1.0095
		cycloneLatitude2 0.86836
		cycloneOctaves2  0
		BumpHeight      15.931
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.17015
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          73.064
		Velocity        -1937.3
		BumpHeight      20.451
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.17015
		ModulateBright  1
		mainFreq        0.88826
		mainOctaves     12
		Coverage        0.54655
		stripeZones     1.4981
		stripeFluct     0.37499
		stripeTwist     12.818
	}

	Clouds
	{
		Height          130.2
		Velocity        -93.254
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.17015
		ModulateBright  1
		Opacity         0.7
		mainFreq        0.88826
		mainOctaves     12
		Coverage        0.54655
		stripeZones     1.4981
		stripeFluct     0.37499
		stripeTwist     12.818
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          301.6
		Density         2064.1
		Pressure        1.8072e+05
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0.0051168
		Saturation      1.8016

		Composition
		{
			H2        	89.011
			He        	6.5171
			CH4       	3.2501
			C3H8      	0.33692
			C2H2      	0.32321
			C8H18     	0.31162
			C2H4      	0.11967
			C2H6      	0.057683
			N2        	0.032656
			NH3       	0.029963
			O2        	0.0080051
			Ne        	0.0012142
			Ar        	0.00074181
			CO2       	0.00018094
			H2S       	1.4448e-06
			Kr        	3.9582e-07
			H2O       	3.7251e-07
			Xe        	3.7878e-08
			CO        	3.2893e-08
			SO2       	1.1217e-08
			Cl2       	3.5131e-10
		}
	}

	Aurora
	{
		Height         422.24
		NorthLat       73.166
		NorthLon       -142.76
		NorthRadius    5617
		NorthWidth     1985.5
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 81.679
		NorthMoveSpeed 0.6568
		NorthParticles 10000
		SouthLat       -47.712
		SouthLon       31.249
		SouthRadius    3083.6
		SouthWidth     774.64
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 68.768
		SouthMoveSpeed 1.1037
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     27774
		OuterRadius     34742
		EdgeRadius      34742
		MeanRadius      30094
		Thickness       25
		ChartRadius     34742
		RotationPeriod  3.7487
		FrontBright     0.19699
		BackBright      2.8364
		Density         0.17015
		Opacity         0.17015
		Brightness      1
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7047.5
		densityScale    2.2055
		densityOffset   -1.7682
		densityPower    1.0031
		colorContrast   0.070749
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
		Period          32.4634943
		SemiMajorAxis   11.5447794
		Eccentricity    0.0739528713
		Inclination     3.84754029
		AscendingNode   -30.3810243
		ArgOfPericenter 176.813292
		MeanAnomaly     277.39357
	}
}

DwarfMoon	"6.D1"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.2189e-06
	Radius          83.609
	InertiaMoment   0.39993
	Oblateness     (0.346, 0.518, 0.000)
	Obliquity       -0.010383
	EqAscendNode    7.3686
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.770 0.689 0.604)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.095909
		Randomize      (-0.166, -0.563, -0.268)
		colorDistMagn   0.7335
		colorDistFreq   2.9391
		detailScale     256
		snowLevel       2
		tropicLatitude  0.066946
		icecapLatitude  0.60106
		icecapHeight    0.15218
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10506
		heightTempGrad  0.625
		beachWidth      0.0011878
		tropicWidth     0.07
		mainFreq        0.6923
		venusFreq       0.54112
		venusMagn       0.68678
		mareDensity     0
		terraceProb     0.28527
		erosion         0
		montesMagn      0.50853
		montesFreq      3.8041
		montesSpiky     0.86077
		montesFraction  0.4871
		dunesFraction   0
		hillsMagn       0
		hillsFreq       14.946
		hillsFraction   0.56679
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22868
		craterFreq      0.23077
		craterDensity   1.0127
		craterOctaves   15
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43675
		volcanoTemp     413.83
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
		PeriodDays      0.252732091
		SemiMajorAxisKm 43081.4548
		Eccentricity    3.5894919e-05
		Inclination     -0.0103832032
		AscendingNode   7.36861523
		ArgOfPericenter 122.631796
		MeanAnomaly     129.254194
	}
}

DwarfMoon	"6.D2"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.7848e-06
	Radius          109.27
	InertiaMoment   0.39845
	Oblateness     (0.342, 0.442, 0.000)
	Obliquity       -0.0090088
	EqAscendNode    -163.17
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.609 0.493 0.328)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.66498
		Randomize      (0.104, -0.733, 0.065)
		colorDistMagn   0.74706
		colorDistFreq   8.3646
		detailScale     512
		snowLevel       2
		tropicLatitude  0.066967
		icecapLatitude  0.57972
		icecapHeight    0.038681
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40277
		heightTempGrad  0.625
		beachWidth      0.00093566
		tropicWidth     0.07
		mainFreq        0.50992
		venusFreq       0.56524
		venusMagn       0.68137
		mareDensity     0
		terraceProb     0.45779
		erosion         0
		montesMagn      0.68228
		montesFreq      2.9525
		montesSpiky     0.98889
		montesFraction  0.55864
		dunesFraction   0
		hillsMagn       0
		hillsFreq       21.641
		hillsFraction   0.67128
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26147
		craterFreq      0.51115
		craterDensity   0.8388
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49408
		volcanoTemp     237.25
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
		PeriodDays      0.327530253
		SemiMajorAxisKm 51209.5603
		Eccentricity    3.32959353e-05
		Inclination     -0.00900880369
		AscendingNode   -163.166711
		ArgOfPericenter -44.4644959
		MeanAnomaly     175.721837
	}
}

DwarfMoon	"6.D3"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.6626e-06
	Radius          108.94
	InertiaMoment   0.39976
	Oblateness     (0.339, 0.400, 0.000)
	Obliquity       0.0054782
	EqAscendNode    -102.95
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.697 0.665 0.603)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.23404
		Randomize      (0.374, -0.902, 0.398)
		colorDistMagn   0.76066
		colorDistFreq   4.534
		detailScale     512
		snowLevel       2
		tropicLatitude  0.067184
		icecapLatitude  0.55857
		icecapHeight    0.35099
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30048
		heightTempGrad  0.625
		beachWidth      0.0012835
		tropicWidth     0.07
		mainFreq        0.32467
		venusFreq       0.58306
		venusMagn       0.67602
		mareDensity     0
		terraceProb     0.17288
		erosion         0
		montesMagn      0.48026
		montesFreq      4.009
		montesSpiky     0.95591
		montesFraction  0.63135
		dunesFraction   0
		hillsMagn       0
		hillsFreq       35.783
		hillsFraction   0.81114
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2366
		craterFreq      0.41518
		craterDensity   0.93789
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54259
		volcanoTemp     200.66
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
		PeriodDays      0.366593301
		SemiMajorAxisKm 55204.3267
		Eccentricity    5.50765335e-05
		Inclination     0.00547815409
		AscendingNode   -102.950401
		ArgOfPericenter -93.4415974
		MeanAnomaly     168.219343
	}
}

DwarfMoon	"6.D4"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.0631e-06
	Radius          138.61
	InertiaMoment   0.39822
	Oblateness     (0.335, 0.336, 0.000)
	Obliquity       -0.0070812
	EqAscendNode    -137.62
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.504 0.406 0.358)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.80311
		Randomize      (0.645, 0.928, 0.731)
		colorDistMagn   0.77431
		colorDistFreq   12.739
		detailScale     512
		snowLevel       2
		tropicLatitude  0.066995
		icecapLatitude  0.53702
		icecapHeight    0.31087
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19819
		heightTempGrad  0.625
		beachWidth      0.00073137
		tropicWidth     0.07
		mainFreq        0.57977
		venusFreq       0.59892
		venusMagn       0.67071
		mareDensity     0
		terraceProb     0.29482
		erosion         0
		montesMagn      0.6052
		montesFreq      2.9928
		montesSpiky     0.91709
		montesFraction  0.7173
		dunesFraction   0
		hillsMagn       0
		hillsFreq       50.333
		hillsFraction   0.54739
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19056
		craterFreq      0.52111
		craterDensity   0.73331
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44877
		volcanoTemp     234.08
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
		PeriodDays      0.425270578
		SemiMajorAxisKm 60948.1245
		Eccentricity    6.12746e-06
		Inclination     -0.00708116745
		AscendingNode   -137.62316
		ArgOfPericenter 48.4975596
		MeanAnomaly     -106.13841
	}
}

DwarfMoon	"6.1"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.2138e-07
	Radius          42.772
	InertiaMoment   0.39932
	Oblateness     (0.276, 0.010, 0.000)
	Obliquity       0.16428
	EqAscendNode    135.57
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.691 0.597 0.533)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.37218
		Randomize      (0.915, 0.758, -0.936)
		colorDistMagn   0.78801
		colorDistFreq   0.62067
		detailScale     128
		snowLevel       2
		tropicLatitude  0.069585
		icecapLatitude  0.51824
		icecapHeight    0.27165
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49589
		heightTempGrad  0.625
		beachWidth      0.00077923
		tropicWidth     0.07
		mainFreq        0.41797
		venusFreq       0.61466
		venusMagn       0.66544
		mareDensity     0
		terraceProb     0.47901
		erosion         0
		montesMagn      0.45029
		montesFreq      1.8431
		montesSpiky     0.85771
		montesFraction  0.85966
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.3311
		hillsFraction   0.65529
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24401
		craterFreq      0.23651
		craterDensity   0.88112
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50034
		volcanoTemp     267.5
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
		PeriodDays      1.01946208
		SemiMajorAxisKm 109168.53
		Eccentricity    0.00497321691
		Inclination     0.16427682
		AscendingNode   135.572335
		ArgOfPericenter -127.865424
		MeanAnomaly     145.130141
	}
}

DwarfMoon	"6.2"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.3312e-06
	Radius          118.71
	InertiaMoment   0.39918
	Oblateness     (0.146, 0.002, 0.000)
	Obliquity       -1.1695
	EqAscendNode    -94.652
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.842 0.792 0.744)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94125
		Randomize      (-0.814, 0.588, -0.603)
		colorDistMagn   0.80177
		colorDistFreq   8.8508
		detailScale     512
		snowLevel       2
		tropicLatitude  0.050584
		icecapLatitude  0.47788
		icecapHeight    0.23431
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3936
		heightTempGrad  0.625
		beachWidth      0.00082708
		tropicWidth     0.07
		mainFreq        0.66238
		venusFreq       0.63206
		venusMagn       0.66018
		mareDensity     0
		terraceProb     0.18156
		erosion         0
		montesMagn      0.56476
		montesFreq      3.0331
		montesSpiky     0.98775
		montesFraction  0.30346
		dunesFraction   0
		hillsMagn       0
		hillsFreq       29.91
		hillsFraction   0.77851
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21958
		craterFreq      0.42587
		craterDensity   0.98505
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55239
		volcanoTemp     160.91
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
		PeriodDays      2.21531889
		SemiMajorAxisKm 183150.286
		Eccentricity    0.0102461664
		Inclination     -1.16952643
		AscendingNode   -94.6521659
		ArgOfPericenter 76.2813864
		MeanAnomaly     -51.4462497
	}
}

DwarfMoon	"6.3"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            7.3832e-06
	Radius          176.34
	InertiaMoment   0.39904
	Oblateness     (0.000, 0.000, 0.000)
	Obliquity       -0.664
	EqAscendNode    94
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.690 0.589 0.458)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.51031
		Randomize      (-0.544, 0.418, -0.270)
		colorDistMagn   0.81562
		colorDistFreq   8.9967
		detailScale     512
		snowLevel       2
		tropicLatitude  0.057422
		icecapLatitude  0.46335
		icecapHeight    0.15208
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29131
		heightTempGrad  0.625
		beachWidth      0.00057494
		tropicWidth     0.07
		mainFreq        0.49033
		venusFreq       0.65476
		venusMagn       0.65492
		mareDensity     0
		terraceProb     0.30459
		erosion         0
		montesMagn      0.41488
		montesFreq      2.1385
		montesSpiky     0.95466
		montesFraction  0.41479
		dunesFraction   0
		hillsMagn       0
		hillsFreq       55.488
		hillsFraction   0.52557
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25204
		craterFreq      1.2166
		craterDensity   0.81677
		craterOctaves   16
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45838
		volcanoTemp     334.33
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
		PeriodDays      4.81394785
		SemiMajorAxisKm 307268.288
		Eccentricity    0.0278333616
		Inclination     -0.664004789
		AscendingNode   94.0004515
		ArgOfPericenter 126.335999
		MeanAnomaly     106.454827
	}
}

Moon	"6.4"
{
	ParentBody     "6"
	Class          "Aquaria"
	Mass            5.5649e-05
	Radius          329.88
	InertiaMoment   0.3989
	Obliquity       -1.088
	EqAscendNode    56.995
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.783 0.765 0.729)

	Surface
	{
		Preset         "aquaria_airless_default.cfg"
		SurfStyle       0.079382
		Randomize      (-0.274, 0.248, 0.063)
		colorDistMagn   0.078344
		colorDistFreq   42.23
		detailScale     1024
		drivenDarkening 0.56165
		seaLevel        0.19481
		snowLevel       2
		tropicLatitude  0.051647
		icecapLatitude  0.75337
		icecapHeight    0.12631
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18902
		heightTempGrad  0.625
		beachWidth      0.00062279
		tropicWidth     0.07
		mainFreq        1.5382
		venusFreq       1.7252
		venusMagn       0
		mareFreq        0
		mareDensity     0.15399
		terraceProb     0.50393
		erosion         0
		montesMagn      0.057334
		montesFreq      14.712
		montesSpiky     0.98907
		montesFraction  0.22148
		dunesMagn       0.039964
		dunesFreq       2.6172
		dunesFraction   0.51872
		hillsMagn       0.11983
		hillsFreq       36.591
		hillsFraction   0.14052
		hills2Fraction  0.17756
		riversMagn      0
		riversFreq      3.5689
		riversSin       7.213
		riftsMagn       0
		riftsFreq       3.9364
		riftsSin        5.1107
		canyonsMagn     0.63584
		canyonsFreq     0.11804
		canyonsFraction 0
		cracksMagn      0.046099
		cracksFreq      0.07649
		cracksOctaves   0
		craterMagn      0.76336
		craterFreq      0.89005
		craterDensity   0.98692
		craterOctaves   16
		craterRayedFactor 0.14622
		volcanoMagn     0.1744
		volcanoFreq     0.5919
		volcanoDensity  0.26366
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.11188
		volcanoRadius   0.15852
		volcanoTemp     397.06
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.494
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
		PeriodDays      10.4608258
		SemiMajorAxisKm 515499.062
		Eccentricity    0.00327545162
		Inclination     -1.08797071
		AscendingNode   56.9952852
		ArgOfPericenter 69.2777649
		MeanAnomaly     82.1129297
	}
}

DwarfMoon	"6.5"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            6.2531e-08
	Radius          36.061
	InertiaMoment   0.39874
	Obliquity       -1.2896
	EqAscendNode    -15.896
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.602 0.511 0.471)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64845
		Randomize      (-0.003, 0.078, 0.396)
		colorDistMagn   0.84359
		colorDistFreq   0.29411
		detailScale     128
		snowLevel       2
		tropicLatitude  0.049052
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
		humidity        0.48673
		heightTempGrad  0.625
		beachWidth      0.00067065
		tropicWidth     0.07
		mainFreq        0.55918
		venusFreq       0.539
		venusMagn       0.64434
		mareDensity     0
		terraceProb     0.19021
		erosion         0
		montesMagn      0.36284
		montesFreq      2.2786
		montesSpiky     0.85452
		montesFraction  0.56547
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.3851
		hillsFraction   0.75303
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26284
		craterFreq      0.26811
		craterDensity   1.0721
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56479
		volcanoTemp     261.17
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
		PeriodDays      22.7316996
		SemiMajorAxisKm 864844.482
		Eccentricity    0.000529527036
		Inclination     -1.28956732
		AscendingNode   -15.8959158
		ArgOfPericenter -144.865476
		MeanAnomaly     -144.331908
	}
}

DwarfMoon	"6.D5"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            1.8938e-10
	Radius          4.4012
	InertiaMoment   0.39731
	Obliquity       -1.2607
	EqAscendNode    -23.676
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.768 0.706 0.668)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.21752
		Randomize      (0.267, -0.092, 0.729)
		colorDistMagn   0.85773
		colorDistFreq   0.010883
		detailScale     16
		snowLevel       2
		tropicLatitude  0.049417
		icecapLatitude  0.99125
		icecapHeight    0.0053851
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38443
		heightTempGrad  0.625
		beachWidth      0.0013185
		tropicWidth     0.07
		mainFreq        0.39471
		venusFreq       0.56391
		venusMagn       0.63899
		mareDensity     0
		terraceProb     0.31461
		erosion         0
		montesMagn      0.50424
		montesFreq      3.1145
		montesSpiky     0.98661
		montesFraction  0.63881
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.045583
		hillsFraction   0.49979
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23736
		craterFreq      0.22076
		craterDensity   0.86348
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46666
		volcanoTemp     154.58
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.9611
		BumpOffset      1.9805
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      49.3966068
		SemiMajorAxisKm 1450935.67
		Eccentricity    0.0126527748
		Inclination     -1.26070821
		AscendingNode   -23.6763415
		ArgOfPericenter -81.384022
		MeanAnomaly     142.614856
	}
}

DwarfMoon	"6.D6"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            2.9357e-10
	Radius          5.822
	InertiaMoment   0.39908
	RotationPeriod  1683.2
	RotationEpoch   0
	Obliquity       140.18
	EqAscendNode    60.628

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.604 0.491 0.394)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.78658
		Randomize      (0.537, -0.262, -0.938)
		colorDistMagn   0.87201
		colorDistFreq   0.0044382
		detailScale     16
		snowLevel       2
		tropicLatitude  0.59542
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
		humidity        0.28214
		heightTempGrad  0.625
		beachWidth      0.00046636
		tropicWidth     0.07
		mainFreq        0.63617
		venusFreq       0.58197
		venusMagn       0.63358
		mareDensity     0
		terraceProb     0.53473
		erosion         0
		montesMagn      0.6633
		montesFreq      2.3777
		montesSpiky     0.9534
		montesFraction  0.72717
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.071391
		hillsFraction   0.62376
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19955
		craterFreq      0.16643
		craterDensity   0.96275
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51298
		volcanoTemp     188
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.2398
		BumpOffset      2.6199
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      545.654365
		SemiMajorAxisKm 7196618.85
		Eccentricity    0.444834662
		Inclination     165.019621
		AscendingNode   59.0132292
		ArgOfPericenter 55.827402
		MeanAnomaly     -159.745482
	}
}

DwarfMoon	"6.D7"
{
	ParentBody     "6"
	Class          "Asteroid"
	Mass            4.436e-10
	Radius          5.9026
	InertiaMoment   0.39683
	RotationPeriod  695.97
	RotationEpoch   0
	Obliquity       111.53
	EqAscendNode    -122.03

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.684 0.681 0.676)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.35565
		Randomize      (0.808, -0.432, -0.605)
		colorDistMagn   0.88643
		colorDistFreq   0.018446
		detailScale     16
		snowLevel       2
		tropicLatitude  0.90754
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
		humidity        0.17985
		heightTempGrad  0.625
		beachWidth      0.00051421
		tropicWidth     0.07
		mainFreq        0.47047
		venusFreq       0.59789
		venusMagn       0.6281
		mareDensity     0
		terraceProb     0.19884
		erosion         0
		montesMagn      0.47588
		montesFreq      3.1563
		montesSpiky     0.91384
		montesFraction  0.88456
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.06112
		hillsFraction   0.73139
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24477
		craterFreq      0.23326
		craterDensity   0.78968
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58339
		volcanoTemp     221.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      5.3123
		BumpOffset      2.6562
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      549.619029
		SemiMajorAxisKm 7231436.66
		Eccentricity    0.213002874
		Inclination     144.451018
		AscendingNode   -120.051003
		ArgOfPericenter -129.094557
		MeanAnomaly     -90.8085214
	}
}

Comet	"C89"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.4376e-09
	Radius          7.2448
	InertiaMoment   0.39778
	Oblateness      0.10179
	RotationPeriod  3.8103
	RotationEpoch   0
	Obliquity       25.262
	EqAscendNode    130.79

	AbsMagn         14.083
	SlopeParam      5.5749
	AlbedoBond      0.025585
	AlbedoGeom      0.030702
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.716 0.712 0.708)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.070171
		Randomize      (0.088, -0.301, 0.084)
		colorDistMagn   0.66982
		colorDistFreq   0.0343
		detailScale     32
		snowLevel       2
		tropicLatitude  0.60426
		icecapLatitude  2
		icecapHeight    0.83501
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25712
		heightTempGrad  0.625
		beachWidth      0.0011602
		tropicWidth     0.07
		mainFreq        0.5753
		venusFreq       0.57886
		venusMagn       0.63812
		mareDensity     0
		terraceProb     0.38526
		erosion         0
		montesMagn      0.63754
		montesFreq      1.8723
		montesSpiky     0.98009
		montesFraction  0.45204
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.1056
		hillsFraction   0.67102
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2698
		craterFreq      0.21374
		craterDensity   0.83059
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42291
		volcanoTemp     1162.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.471
		BumpOffset      8.7354
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.080039
		GasToDust   0.25
		Particles   2596
		GasBright   0.0065232
		DustBright  0.017449
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          45.4580267
		SemiMajorAxis   14.4496582
		Eccentricity    0.917489523
		Inclination     13.0269994
		AscendingNode   -28.7880924
		ArgOfPericenter 105.549107
		MeanAnomaly     -147.875095
	}
}

Comet	"C21"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.5538e-11
	Radius          1.7699
	InertiaMoment   0.39964
	RotationPeriod  132.06
	RotationEpoch   0
	Obliquity       319.97
	EqAscendNode    119.93

	AbsMagn         2.4919
	SlopeParam      5.2583
	AlbedoBond      0.055136
	AlbedoGeom      0.066163
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.743 0.648 0.551)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.88881
		Randomize      (-0.004, -0.256, -0.953)
		colorDistMagn   0.14305
		colorDistFreq   0.0022004
		detailScale     8
		snowLevel       2
		tropicLatitude  0.83534
		icecapLatitude  2
		icecapHeight    0.72624
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23503
		heightTempGrad  0.625
		beachWidth      0.0012996
		tropicWidth     0.07
		mainFreq        0.61868
		venusFreq       0.63952
		venusMagn       0.56643
		mareDensity     0
		terraceProb     0.35613
		erosion         0
		montesMagn      0
		montesFreq      2.539
		montesSpiky     0.92938
		montesFraction  0.595
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0082175
		hillsFraction   0.6685
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0
		craterFreq      0.25319
		craterDensity   0.84756
		craterOctaves   7.5556
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43646
		volcanoTemp     1076.9
		lavaCoverTidal  0
		lavaCoverSun    0.088147
		lavaCoverYoung  0
		BumpHeight      4.0426
		BumpOffset      2.0213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.057315
		GasToDust   0.25
		Particles   2137
		GasBright   0.006195
		DustBright  0.018683
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          54.738943
		SemiMajorAxis   16.3549088
		Eccentricity    0.990184928
		Inclination     -76.1856019
		AscendingNode   125.97667
		ArgOfPericenter 41.6359915
		MeanAnomaly     -86.3062487
	}
}

Comet	"C10"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1238e-17
	Radius          0.012058
	InertiaMoment   0.399
	Oblateness      0.001735
	RotationPeriod  29.253
	RotationEpoch   0
	Obliquity       81.764
	EqAscendNode    12.296

	AbsMagn         11.695
	SlopeParam      3.1962
	AlbedoBond      0.037807
	AlbedoGeom      0.045369
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.489 0.434 0.349)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22712
		Randomize      (-0.342, 0.398, -0.356)
		colorDistMagn   0.8749
		colorDistFreq   6.7798e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.19973
		icecapLatitude  2
		icecapHeight    0.49033
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2491
		heightTempGrad  0.625
		beachWidth      0.00092069
		tropicWidth     0.07
		mainFreq        0.75503
		venusFreq       0.60063
		venusMagn       0.61521
		mareDensity     0
		terraceProb     0.1803
		erosion         0
		montesMagn      0.5855
		montesFreq      3.0731
		montesSpiky     0.95145
		montesFraction  0.47963
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.3743e-07
		hillsFraction   0.45888
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22819
		craterFreq      0.18477
		craterDensity   0.87256
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50997
		volcanoTemp     1107.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.029632
		BumpOffset      0.014816
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0062415
		DustBright  0.031724
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          73.9272796
		SemiMajorAxis   19.9826771
		Eccentricity    0.86941469
		Inclination     -86.7174388
		AscendingNode   -179.772525
		ArgOfPericenter -176.976318
		MeanAnomaly     99.209905
	}
}

Comet	"C166"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.9359e-09
	Radius          6.7091
	InertiaMoment   0.39992
	RotationPeriod  43.088
	RotationEpoch   0
	Obliquity       252.72
	EqAscendNode    164.26

	AbsMagn         10.483
	SlopeParam      2.0078
	AlbedoBond      0.046152
	AlbedoGeom      0.055383
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.712 0.707 0.705)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.702
		Randomize      (0.458, -0.882, -0.095)
		colorDistMagn   0.22728
		colorDistFreq   0.024114
		detailScale     32
		snowLevel       2
		tropicLatitude  0.65163
		icecapLatitude  2
		icecapHeight    0.50211
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15861
		heightTempGrad  0.625
		beachWidth      0.00051262
		tropicWidth     0.07
		mainFreq        0.33878
		venusFreq       0.57353
		venusMagn       0.62031
		mareDensity     0
		terraceProb     0.10044
		erosion         0
		montesMagn      0.55699
		montesFreq      2.8117
		montesSpiky     0.9761
		montesFraction  0.84052
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14053
		hillsFraction   0.53779
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25337
		craterFreq      0.15183
		craterDensity   0.92386
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5294
		volcanoTemp     1150.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.395
		BumpOffset      8.1977
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0788
		GasToDust   0.25
		Particles   2571
		GasBright   0.004504
		DustBright  0.0078547
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          75.7783318
		SemiMajorAxis   20.3148622
		Eccentricity    0.935120726
		Inclination     -38.9731326
		AscendingNode   -28.533419
		ArgOfPericenter -64.2113708
		MeanAnomaly     133.056823
	}
}

Comet	"C136"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.385e-10
	Radius          2.7853
	InertiaMoment   0.39914
	Oblateness      0.0020368
	RotationPeriod  27.006
	RotationEpoch   0
	Obliquity       192.15
	EqAscendNode    328.88

	AbsMagn         14.242
	SlopeParam      2.033
	AlbedoBond      0.044391
	AlbedoGeom      0.05327
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.673 0.669 0.663)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53376
		Randomize      (-0.465, 0.903, 0.624)
		colorDistMagn   0.83817
		colorDistFreq   0.0045608
		detailScale     8
		snowLevel       2
		tropicLatitude  0.93814
		icecapLatitude  2
		icecapHeight    0.43829
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16063
		heightTempGrad  0.625
		beachWidth      0.0013065
		tropicWidth     0.07
		mainFreq        0.55898
		venusFreq       0.568
		venusMagn       0.47843
		mareDensity     0
		terraceProb     0.10188
		erosion         0
		montesMagn      0.64066
		montesFreq      3.2088
		montesSpiky     0.84533
		montesFraction  0.39606
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.016123
		hillsFraction   0.64913
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21996
		craterFreq      0.16148
		craterDensity   0.83402
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48559
		volcanoTemp     1242
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.2352
		BumpOffset      3.1176
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.064626
		GasToDust   0.25
		Particles   2285
		GasBright   0.0064228
		DustBright  0.04163
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          76.4743406
		SemiMajorAxis   20.4390645
		Eccentricity    0.893152026
		Inclination     -81.6637875
		AscendingNode   -10.9117208
		ArgOfPericenter -27.0882562
		MeanAnomaly     -74.7115315
	}
}

Comet	"C129"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.3008e-11
	Radius          1.266
	InertiaMoment   0.39806
	Oblateness      0.001422
	RotationPeriod  32.256
	RotationEpoch   0
	Obliquity       106.02
	EqAscendNode    31.294

	AbsMagn         6.2137
	SlopeParam      2.4522
	AlbedoBond      0.029896
	AlbedoGeom      0.035875
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.686 0.625 0.578)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.2945
		Randomize      (-0.681, -0.681, 0.459)
		colorDistMagn   0.083391
		colorDistFreq   0.00061201
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99482
		icecapLatitude  2
		icecapHeight    0.58468
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38776
		heightTempGrad  0.625
		beachWidth      0.0012017
		tropicWidth     0.07
		mainFreq        0.43725
		venusFreq       0.62901
		venusMagn       0.65875
		mareDensity     0
		terraceProb     0.12752
		erosion         0
		montesMagn      0.4525
		montesFreq      2.6894
		montesSpiky     0.9696
		montesFraction  0.60391
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0029111
		hillsFraction   0.76347
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25164
		craterFreq      0.24189
		craterDensity   0.73062
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50106
		volcanoTemp     1206.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.8819
		BumpOffset      1.441
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.051913
		GasToDust   0.25
		Particles   2028
		GasBright   0.0013074
		DustBright  0.015074
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          81.3583296
		SemiMajorAxis   21.3002746
		Eccentricity    0.833022133
		Inclination     18.8653665
		AscendingNode   -120.882637
		ArgOfPericenter -167.07747
		MeanAnomaly     138.515136
	}
}

Comet	"C160"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.9951e-12
	Radius          0.97795
	InertiaMoment   0.39678
	Oblateness      0.0031078
	RotationPeriod  21.766
	RotationEpoch   0
	Obliquity       24.608
	EqAscendNode    269.18

	AbsMagn         11.011
	SlopeParam      3.1118
	AlbedoBond      0.045786
	AlbedoGeom      0.054943
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.626 0.618 0.615)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.068354
		Randomize      (0.273, -0.525, 0.049)
		colorDistMagn   0.55844
		colorDistFreq   0.00078001
		detailScale     8
		snowLevel       2
		tropicLatitude  0.38072
		icecapLatitude  2
		icecapHeight    0.7217
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23901
		heightTempGrad  0.625
		beachWidth      0.00085139
		tropicWidth     0.07
		mainFreq        0.47745
		venusFreq       0.62491
		venusMagn       0.77903
		mareDensity     0
		terraceProb     0.17391
		erosion         0
		montesMagn      0.56952
		montesFreq      1.9147
		montesSpiky     0.8209
		montesFraction  0.075056
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0026491
		hillsFraction   0.63134
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22527
		craterFreq      0.15407
		craterDensity   0.78992
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46702
		volcanoTemp     1048.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.1872
		BumpOffset      1.0936
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.04775
		GasToDust   0.25
		Particles   1944
		GasBright   0.0062057
		DustBright  0.013292
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          82.6669037
		SemiMajorAxis   21.5280636
		Eccentricity    0.90896479
		Inclination     3.29853849
		AscendingNode   -135.242883
		ArgOfPericenter 125.027807
		MeanAnomaly     -44.0555803
	}
}

Comet	"C142"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.4724e-08
	Radius          19.106
	InertiaMoment   0.39874
	RotationPeriod  47.326
	RotationEpoch   0
	Obliquity       60.266
	EqAscendNode    223.96

	AbsMagn         13.105
	SlopeParam      5.9494
	AlbedoBond      0.044731
	AlbedoGeom      0.053677
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.759 0.757 0.753)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.16741
		Randomize      (-0.281, 0.546, 0.480)
		colorDistMagn   0.56364
		colorDistFreq   0.11905
		detailScale     64
		snowLevel       2
		tropicLatitude  0.99664
		icecapLatitude  2
		icecapHeight    0.6142
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48022
		heightTempGrad  0.625
		beachWidth      0.0015677
		tropicWidth     0.07
		mainFreq        0.44136
		venusFreq       0.65598
		venusMagn       0.65914
		mareDensity     0
		terraceProb     0.42014
		erosion         0
		montesMagn      0.61715
		montesFreq      1.1984
		montesSpiky     0.98233
		montesFraction  0.35738
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.82051
		hillsFraction   0.56066
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24911
		craterFreq      0.15981
		craterDensity   0.95636
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55261
		volcanoTemp     1143.6
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
		MaxLength   0.095675
		GasToDust   0.25
		Particles   2912
		GasBright   0.007357
		DustBright  0.033557
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          88.1214975
		SemiMajorAxis   22.4649316
		Eccentricity    0.897742702
		Inclination     39.2732263
		AscendingNode   32.0663114
		ArgOfPericenter -138.112417
		MeanAnomaly     -165.896677
	}
}

Comet	"C140"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.6375e-16
	Radius          0.029452
	InertiaMoment   0.39888
	Oblateness      0.039202
	RotationPeriod  6.1528
	RotationEpoch   0
	Obliquity       344.23
	EqAscendNode    138.93

	AbsMagn         8.8292
	SlopeParam      4.5638
	AlbedoBond      0.044617
	AlbedoGeom      0.053541
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.466 0.458 0.454)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.95619
		Randomize      (-0.342, 0.665, -0.138)
		colorDistMagn   0.36219
		colorDistFreq   5.3726e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.53928
		icecapLatitude  2
		icecapHeight    0.3978
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37369
		heightTempGrad  0.625
		beachWidth      0.00068063
		tropicWidth     0.07
		mainFreq        0.32626
		venusFreq       0.76181
		venusMagn       0.61947
		mareDensity     0
		terraceProb     0.29369
		erosion         0
		montesMagn      0.51704
		montesFreq      3.6063
		montesSpiky     0.94954
		montesFraction  0.74304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9028e-06
		hillsFraction   0.59226
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25957
		craterFreq      0.20897
		craterDensity   0.82769
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40691
		volcanoTemp     1076.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.075154
		BumpOffset      0.037577
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0071188
		DustBright  0.036174
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          89.7271053
		SemiMajorAxis   22.7369894
		Eccentricity    0.869585693
		Inclination     20.3511906
		AscendingNode   -129.521464
		ArgOfPericenter 129.503678
		MeanAnomaly     -45.5792695
	}
}

Comet	"C41"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.1797e-18
	Radius          0.0093144
	InertiaMoment   0.39828
	Oblateness      0.0045001
	RotationPeriod  18.14
	RotationEpoch   0
	Obliquity       0.35157
	EqAscendNode    250.19

	AbsMagn         5.625
	SlopeParam      3.7632
	AlbedoBond      0.059712
	AlbedoGeom      0.071655
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.409 0.407 0.405)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.0009766
		Randomize      (0.611, 0.554, -0.766)
		colorDistMagn   0.39596
		colorDistFreq   1.666e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.58587
		icecapLatitude  2
		icecapHeight    0.62395
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10035
		heightTempGrad  0.625
		beachWidth      0.0011704
		tropicWidth     0.07
		mainFreq        0.32694
		venusFreq       0.59709
		venusMagn       0.71684
		mareDensity     0
		terraceProb     0.2253
		erosion         0
		montesMagn      0.4378
		montesFreq      2.7462
		montesSpiky     0.99241
		montesFraction  0.67624
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6473e-07
		hillsFraction   0.70954
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25592
		craterFreq      0.2181
		craterDensity   0.89554
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47736
		volcanoTemp     1149.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.022495
		BumpOffset      0.011248
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.016551
		DustBright  0.024532
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          90.0711517
		SemiMajorAxis   22.7950736
		Eccentricity    0.888772008
		Inclination     -35.5899648
		AscendingNode   -141.158054
		ArgOfPericenter 175.978321
		MeanAnomaly     -81.0358568
	}
}

Comet	"C181"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.2375e-09
	Radius          10.412
	InertiaMoment   0.39686
	RotationPeriod  120.05
	RotationEpoch   0
	Obliquity       283.01
	EqAscendNode    81.948

	AbsMagn         9.312
	SlopeParam      10.489
	AlbedoBond      0.033628
	AlbedoGeom      0.040354
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.756 0.719 0.701)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.78613
		Randomize      (0.919, 0.226, 0.546)
		colorDistMagn   0.82524
		colorDistFreq   0.09264
		detailScale     32
		snowLevel       2
		tropicLatitude  0.96552
		icecapLatitude  2
		icecapHeight    0.71398
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3576
		heightTempGrad  0.625
		beachWidth      0.00086569
		tropicWidth     0.07
		mainFreq        0.4535
		venusFreq       0.57617
		venusMagn       0.66031
		mareDensity     0
		terraceProb     0.85639
		erosion         0
		montesMagn      0.5288
		montesFreq      2.5773
		montesSpiky     0.85804
		montesFraction  0.71433
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.22558
		hillsFraction   0.65544
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24219
		craterFreq      0.14511
		craterDensity   0.97196
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56115
		volcanoTemp     1054.4
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
		MaxLength   0.085887
		GasToDust   0.25
		Particles   2714
		GasBright   0.01656
		DustBright  0.017952
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          90.5300071
		SemiMajorAxis   22.8724256
		Eccentricity    0.905707782
		Inclination     32.5577283
		AscendingNode   -82.2551785
		ArgOfPericenter -155.95238
		MeanAnomaly     90.3909972
	}
}

Comet	"C49"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.5682e-07
	Radius          41.447
	InertiaMoment   0.39746
	RotationPeriod  76.542
	RotationEpoch   0
	Obliquity       304.5
	EqAscendNode    230.29

	AbsMagn         8.5195
	SlopeParam      4.0409
	AlbedoBond      0.064061
	AlbedoGeom      0.076873
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.794 0.791 0.789)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84584
		Randomize      (0.858, 0.078, -0.291)
		colorDistMagn   0.27584
		colorDistFreq   0.53935
		detailScale     128
		snowLevel       2
		tropicLatitude  0.99999
		icecapLatitude  2
		icecapHeight    0.58895
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12648
		heightTempGrad  0.625
		beachWidth      0.0011187
		tropicWidth     0.07
		mainFreq        0.27275
		venusFreq       0.68392
		venusMagn       0.6165
		mareDensity     0
		terraceProb     0.24848
		erosion         0
		montesMagn      0.50947
		montesFreq      3.3481
		montesSpiky     0.99037
		montesFraction  0.1308
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7134
		hillsFraction   0.59373
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21887
		craterFreq      0.17901
		craterDensity   0.88553
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51458
		volcanoTemp     1218
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
		GasBright   0.014659
		DustBright  0.016905
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          92.5940919
		SemiMajorAxis   23.2187787
		Eccentricity    0.866120664
		Inclination     -145.619862
		AscendingNode   -176.114133
		ArgOfPericenter -92.1239603
		MeanAnomaly     170.02289
	}
}

Comet	"C39"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.7637e-15
	Radius          0.09058
	InertiaMoment   0.39845
	RotationPeriod  70.147
	RotationEpoch   0
	Obliquity       284.31
	EqAscendNode    165.16

	AbsMagn         14.652
	SlopeParam      2.5139
	AlbedoBond      0.059045
	AlbedoGeom      0.070855
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.514 0.512 0.509)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.78976
		Randomize      (0.550, 0.673, 0.616)
		colorDistMagn   0.13366
		colorDistFreq   4.5044e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.86092
		icecapLatitude  2
		icecapHeight    0.42206
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39382
		heightTempGrad  0.625
		beachWidth      0.0011833
		tropicWidth     0.07
		mainFreq        0.66347
		venusFreq       0.61366
		venusMagn       0.67539
		mareDensity     0
		terraceProb     0.13157
		erosion         0
		montesMagn      0.6485
		montesFreq      2.5667
		montesSpiky     0.9606
		montesFraction  0.51474
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.484e-05
		hillsFraction   0.74476
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27241
		craterFreq      0.25118
		craterDensity   0.63077
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50037
		volcanoTemp     1081.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.2267
		BumpOffset      0.11335
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0093895
		GasToDust   0.25
		Particles   1169
		GasBright   0.016841
		DustBright  0.026621
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          93.1407961
		SemiMajorAxis   23.3100829
		Eccentricity    0.896393023
		Inclination     140.371094
		AscendingNode   121.00235
		ArgOfPericenter 162.366528
		MeanAnomaly     69.2266011
	}
}

Comet	"C110"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1716e-17
	Radius          0.012227
	InertiaMoment   0.39782
	RotationPeriod  85.944
	RotationEpoch   0
	Obliquity       283.66
	EqAscendNode    303.55

	AbsMagn         11.228
	SlopeParam      4.5799
	AlbedoBond      0.042971
	AlbedoGeom      0.051565
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.422 0.421 0.418)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.78794
		Randomize      (0.735, 0.449, 0.581)
		colorDistMagn   0.94267
		colorDistFreq   1.0103e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.42264
		icecapLatitude  1.5535
		icecapHeight    0.81528
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37571
		heightTempGrad  0.625
		beachWidth      0.0014745
		tropicWidth     0.07
		mainFreq        0.55118
		venusFreq       0.68887
		venusMagn       0.47423
		mareDensity     0
		terraceProb     0.29511
		erosion         0
		montesMagn      0.57463
		montesFreq      2.572
		montesSpiky     0.99054
		montesFraction  0.32155
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.8827e-07
		hillsFraction   0.69657
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22627
		craterFreq      0.2118
		craterDensity   1.0138
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52567
		volcanoTemp     1268.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.028254
		BumpOffset      0.014127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.016907
		DustBright  0.02208
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          96.7595644
		SemiMajorAxis   23.9100118
		Eccentricity    0.801608276
		Inclination     -51.4392649
		AscendingNode   -177.471344
		ArgOfPericenter 156.507075
		MeanAnomaly     -15.4886629
	}
}

Comet	"C183"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.8695e-12
	Radius          1.0708
	InertiaMoment   0.39636
	RotationPeriod  43.473
	RotationEpoch   0
	Obliquity       359.04
	EqAscendNode    166.97

	AbsMagn         14.41
	SlopeParam      3.4007
	AlbedoBond      0.033753
	AlbedoGeom      0.040503
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.630 0.626 0.619)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99734
		Randomize      (0.981, 0.107, -0.836)
		colorDistMagn   0.049968
		colorDistFreq   0.00060202
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99312
		icecapLatitude  2
		icecapHeight    0.51693
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46413
		heightTempGrad  0.625
		beachWidth      0.00085276
		tropicWidth     0.07
		mainFreq        0.54304
		venusFreq       0.55536
		venusMagn       0.69994
		mareDensity     0
		terraceProb     0.19612
		erosion         0
		montesMagn      0.64393
		montesFreq      2.7545
		montesSpiky     0.91613
		montesFraction  0.32409
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0024533
		hillsFraction   0.6275
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23406
		craterFreq      0.23674
		craterDensity   0.83737
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52791
		volcanoTemp     921.63
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.6631
		BumpOffset      1.3315
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.049212
		GasToDust   0.25
		Particles   1973
		GasBright   0.015912
		DustBright  0.01622
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          97.9156862
		SemiMajorAxis   24.1000921
		Eccentricity    0.901195497
		Inclination     -82.4203049
		AscendingNode   26.9831407
		ArgOfPericenter -122.730184
		MeanAnomaly     25.4897982
	}
}

Comet	"C17"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1967e-16
	Radius          0.026528
	InertiaMoment   0.39988
	Oblateness      0.0026422
	RotationPeriod  23.744
	RotationEpoch   0
	Obliquity       167.9
	EqAscendNode    309.88

	AbsMagn         7.4246
	SlopeParam      2.8761
	AlbedoBond      0.054523
	AlbedoGeom      0.065428
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.458 0.455 0.453)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46638
		Randomize      (-0.127, -0.018, -0.190)
		colorDistMagn   0.68982
		colorDistFreq   4.6922e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.55868
		icecapLatitude  2
		icecapHeight    0.75513
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42196
		heightTempGrad  0.625
		beachWidth      0.0010255
		tropicWidth     0.07
		mainFreq        0.43353
		venusFreq       0.5163
		venusMagn       0.77076
		mareDensity     0
		terraceProb     0.15658
		erosion         0
		montesMagn      0.48253
		montesFreq      3.8359
		montesSpiky     0.99852
		montesFraction  0.87517
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.7639e-06
		hillsFraction   0.7312
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25134
		craterFreq      0.22026
		craterDensity   0.9257
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49463
		volcanoTemp     1142.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.064118
		BumpOffset      0.032059
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0064682
		DustBright  0.023169
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          100.077788
		SemiMajorAxis   24.4535727
		Eccentricity    0.902715746
		Inclination     153.805376
		AscendingNode   58.7851817
		ArgOfPericenter 49.5804357
		MeanAnomaly     119.790512
	}
}

Comet	"C98"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.8223e-11
	Radius          1.639
	InertiaMoment   0.39883
	RotationPeriod  41.539
	RotationEpoch   0
	Obliquity       187.43
	EqAscendNode    153.4

	AbsMagn         12.571
	SlopeParam      7.3259
	AlbedoBond      0.042336
	AlbedoGeom      0.050804
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.648 0.645 0.640)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.52064
		Randomize      (0.365, -0.837, 0.868)
		colorDistMagn   0.66731
		colorDistFreq   0.0015539
		detailScale     8
		snowLevel       2
		tropicLatitude  0.97789
		icecapLatitude  2
		icecapHeight    0.42467
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13652
		heightTempGrad  0.625
		beachWidth      0.001252
		tropicWidth     0.07
		mainFreq        0.39283
		venusFreq       0.63331
		venusMagn       0.53575
		mareDensity     0
		terraceProb     0.55104
		erosion         0
		montesMagn      0.60542
		montesFreq      3.0244
		montesSpiky     0.92429
		montesFraction  0.40397
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0061038
		hillsFraction   0.53438
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22387
		craterFreq      0.21291
		craterDensity   1.0491
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53565
		volcanoTemp     1064.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.7888
		BumpOffset      1.8944
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.056076
		GasToDust   0.25
		Particles   2112
		GasBright   0.0045277
		DustBright  0.0087367
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          100.428315
		SemiMajorAxis   24.5106392
		Eccentricity    0.963646818
		Inclination     -71.627709
		AscendingNode   -147.399831
		ArgOfPericenter -178.96623
		MeanAnomaly     -159.216173
	}
}

Planet	"7"
{
	ParentBody     "Pourne"
	Class          "Aquaria"
	Mass            0.71137
	Radius          6611.7
	InertiaMoment   0.32993
	Oblateness      0.0084397
	RotationPeriod  18.828
	RotationEpoch   0
	Obliquity       -23.315
	EqAscendNode    -158.09

	AlbedoBond      0.6
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.826 0.758 0.615)

	Surface
	{
		Preset         "aquaria_wet_default.cfg"
		SurfStyle       0.32228
		Randomize      (-0.504, -0.058, -0.448)
		colorDistMagn   0.063579
		colorDistFreq   829.3
		detailScale     16384
		seaLevel        0.0080202
		snowLevel       0.85
		tropicLatitude  0.29128
		icecapLatitude  0.99517
		icecapHeight    0.0033326
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20019
		heightTempGrad  0.625
		beachWidth      0.00096887
		tropicWidth     0.07
		mainFreq        1.5967
		venusFreq       0.94767
		venusMagn       0.79259
		mareFreq        1.1301
		mareDensity     0.016885
		terraceProb     0.15996
		erosion         0.12762
		montesMagn      0.21141
		montesFreq      321.84
		montesSpiky     0.8613
		montesFraction  0.48672
		dunesMagn       0.031971
		dunesFreq       48.463
		dunesFraction   0.41292
		hillsMagn       0.11257
		hillsFreq       523.88
		hillsFraction   0.3591
		hills2Fraction  0.407
		riversMagn      54.923
		riversFreq      3.5794
		riversSin       5.4254
		riftsMagn       0
		riftsFreq       2.3589
		riftsSin        4.9788
		canyonsMagn     0.031759
		canyonsFreq     173.08
		canyonsFraction 0.44446
		cracksMagn      0.06545
		cracksFreq      3.2007
		cracksOctaves   6
		craterMagn      0.58292
		craterFreq      13.518
		craterDensity   0
		craterOctaves   0.91437
		craterRayedFactor 0
		volcanoMagn     0.61451
		volcanoFreq     0.84368
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.5977
		volcanoFlows    0.89534
		volcanoRadius   0.54892
		volcanoTemp     337.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     3.6212
		stripeTwist     0.13419
		cycloneMagn     2.6472
		cycloneFreq     1.0512
		cycloneDensity  0.18617
		cycloneOctaves  4
		BumpHeight      20
		BumpOffset      0.1604
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.1
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.9131
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.1604
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			N2        	100
		}
	}

	Clouds
	{
		Height          14.953
		Velocity        171.39
		BumpHeight      2.5564
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.5986
		mainOctaves     10
		Coverage        0.1
		stripeZones     3.6212
		stripeTwist     0.13419
	}

	Clouds
	{
		Height          20.065
		Velocity        95.792
		BumpHeight      2.5564
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.5986
		mainOctaves     10
		Coverage        0.1
		stripeZones     3.6212
		stripeTwist     0.13419
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          40
		Density         3.81
		Pressure        0.74025
		Greenhouse      2.3906
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.11782
		Saturation      0.90568

		Composition
		{
			N2        	100
			CH4       	0.0002897
			CO        	0.00011875
			Ar        	4.2723e-05
		}
	}

	Aurora
	{
		Height         37.382
		NorthLat       71.595
		NorthLon       28.832
		NorthRadius    1454
		NorthWidth     311.99
		NorthRings     5
		NorthBright    0.32315
		NorthFlashFreq 76.074
		NorthMoveSpeed 1.177
		NorthParticles 50000
		SouthLat       -37.324
		SouthLon       -165.17
		SouthRadius    1620.1
		SouthWidth     443.99
		SouthRings     4
		SouthBright    0.32315
		SouthFlashFreq 69.333
		SouthMoveSpeed 0.90847
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
		Period          101.212324
		SemiMajorAxis   24.6380501
		Eccentricity    0.020630418
		Inclination     -6.96601237
		AscendingNode   -159.893203
		ArgOfPericenter 49.6472057
		MeanAnomaly     254.78553
	}
}

DwarfMoon	"7.D1"
{
	ParentBody     "7"
	Class          "Asteroid"
	Mass            1.1699e-08
	Radius          17.764
	InertiaMoment   0.39762
	Oblateness      0.249
	Obliquity       0.0025571
	EqAscendNode    -173.93
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.695 0.691 0.689)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.11095
		Randomize      (0.718, 0.161, 0.640)
		colorDistMagn   0.59733
		colorDistFreq   0.2132
		detailScale     64
		snowLevel       2
		tropicLatitude  0.12132
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
		humidity        0.23632
		heightTempGrad  0.625
		beachWidth      0.00071152
		tropicWidth     0.07
		mainFreq        0.58344
		venusFreq       0.66227
		venusMagn       0.66269
		mareDensity     0
		terraceProb     0.25133
		erosion         0
		montesMagn      0.5244
		montesFreq      3.1159
		montesSpiky     0.91222
		montesFraction  0.38197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.43347
		hillsFraction   0.58838
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21772
		craterFreq      0.257
		craterDensity   0.76171
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53222
		volcanoTemp     231.57
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15.988
		BumpOffset      7.994
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.154186172
		SemiMajorAxisKm 10842.8139
		Eccentricity    6.09563928e-05
		Inclination     0.0025571056
		AscendingNode   -173.934108
		ArgOfPericenter 44.7164038
		MeanAnomaly     173.384791
	}
}

DwarfMoon	"7.D2"
{
	ParentBody     "7"
	Class          "Asteroid"
	Mass            1.5926e-08
	Radius          23.275
	InertiaMoment   0.39924
	Oblateness      0.11553
	Obliquity       -0.0054715
	EqAscendNode    99.697
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.478 0.472 0.468)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.68002
		Randomize      (0.988, -0.009, 0.973)
		colorDistMagn   0.6111
		colorDistFreq   0.19207
		detailScale     64
		snowLevel       2
		tropicLatitude  0.12119
		icecapLatitude  0.99833
		icecapHeight    0.0014291
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13403
		heightTempGrad  0.625
		beachWidth      0.0010594
		tropicWidth     0.07
		mainFreq        0.42186
		venusFreq       0.49455
		venusMagn       0.65743
		mareDensity     0
		terraceProb     0.39684
		erosion         0
		montesMagn      0.33772
		montesFreq      2.3806
		montesSpiky     0.84771
		montesFraction  0.4681
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4969
		hillsFraction   0.69148
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2508
		craterFreq      0.21336
		craterDensity   0.89013
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43306
		volcanoTemp     334.98
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
		PeriodDays      0.336622493
		SemiMajorAxisKm 18247.6584
		Eccentricity    7.58546819e-05
		Inclination     -0.00547145241
		AscendingNode   99.6974119
		ArgOfPericenter 28.3428014
		MeanAnomaly     79.4628518
	}
}

DwarfMoon	"7.D3"
{
	ParentBody     "7"
	Class          "Asteroid"
	Mass            2.1639e-08
	Radius          21.514
	InertiaMoment   0.39725
	Oblateness      0.046365
	Obliquity       -0.00040948
	EqAscendNode    -38.272
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.659 0.654 0.650)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.24909
		Randomize      (-0.741, -0.179, -0.694)
		colorDistMagn   0.6248
		colorDistFreq   0.29616
		detailScale     64
		snowLevel       2
		tropicLatitude  0.12127
		icecapLatitude  0.97705
		icecapHeight    0.016433
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43174
		heightTempGrad  0.625
		beachWidth      0.0011072
		tropicWidth     0.07
		mainFreq        0.66729
		venusFreq       0.54631
		venusMagn       0.65216
		mareDensity     0
		terraceProb     0.1401
		erosion         0
		montesMagn      0.49603
		montesFreq      3.1577
		montesSpiky     0.98433
		montesFraction  0.54084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.147
		hillsFraction   0.87907
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22831
		craterFreq      0.27833
		craterDensity   0.99865
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49248
		volcanoTemp     158.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      19.363
		BumpOffset      9.6815
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      0.403645943
		SemiMajorAxisKm 20595.8055
		Eccentricity    5.94566565e-06
		Inclination     -0.000409480361
		AscendingNode   -38.2719344
		ArgOfPericenter 19.2814685
		MeanAnomaly     13.3473359
	}
}

DwarfMoon	"7.D4"
{
	ParentBody     "7"
	Class          "Asteroid"
	Mass            2.9369e-08
	Radius          28.541
	InertiaMoment   0.39906
	Oblateness      0.060037
	Obliquity       -0.0013886
	EqAscendNode    -6.3224
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2.25
	BrightnessReal  1
	Color          (0.442 0.436 0.429)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.81816
		Randomize      (-0.471, -0.349, -0.361)
		colorDistMagn   0.63845
		colorDistFreq   0.25051
		detailScale     128
		snowLevel       2
		tropicLatitude  0.12126
		icecapLatitude  0.95567
		icecapHeight    0.026843
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32944
		heightTempGrad  0.625
		beachWidth      0.00055509
		tropicWidth     0.07
		mainFreq        0.49376
		venusFreq       0.56866
		venusMagn       0.64687
		mareDensity     0
		terraceProb     0.2603
		erosion         0
		montesMagn      0.63786
		montesFreq      2.4594
		montesSpiky     0.95087
		montesFraction  0.61236
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8232
		hillsFraction   0.5708
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26093
		craterFreq      0.22591
		craterDensity   0.82879
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54035
		volcanoTemp     191.82
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
		PeriodDays      0.466798408
		SemiMajorAxisKm 22691.5745
		Eccentricity    7.79780505e-05
		Inclination     -0.00138859356
		AscendingNode   -6.3223616
		ArgOfPericenter 35.5523058
		MeanAnomaly     -123.963395
	}
}

Moon	"7.1"
{
	ParentBody     "7"
	Class          "Aquaria"
	Mass            0.00090293
	Radius          775.46
	InertiaMoment   0.39971
	Oblateness      0.0091014
	Obliquity       0.23938
	EqAscendNode    -75.474
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.619 0.617 0.614)

	Surface
	{
		Preset         "aquaria_airless_pluto.cfg"
		SurfStyle       0.38722
		Randomize      (-0.201, -0.519, -0.028)
		colorDistMagn   0.06729
		colorDistFreq   99.947
		detailScale     2048
		drivenDarkening 0
		seaLevel        0.19076
		snowLevel       2
		tropicLatitude  0.12518
		icecapLatitude  0.64097
		icecapHeight    0.25869
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22715
		heightTempGrad  0.625
		beachWidth      0.00090294
		tropicWidth     0.07
		mainFreq        1.5471
		venusFreq       0.89287
		venusMagn       0
		mareFreq        0.12554
		mareDensity     0.16083
		terraceProb     0.41135
		erosion         0
		montesMagn      0.06962
		montesFreq      34.007
		montesSpiky     0.87415
		montesFraction  0.40535
		dunesMagn       0.042628
		dunesFreq       6.595
		dunesFraction   0.11767
		hillsMagn       0.10851
		hillsFreq       85.048
		hillsFraction   0.5913
		hills2Fraction  0.28184
		riversMagn      0
		riversFreq      4.3237
		riversSin       5.9472
		riftsMagn       0
		riftsFreq       2.3347
		riftsSin        5.3276
		canyonsMagn     0.46118
		canyonsFreq     0.22802
		canyonsFraction 0
		cracksMagn      0.059922
		cracksFreq      0.29804
		cracksOctaves   0
		craterMagn      0.53636
		craterFreq      1.9631
		craterDensity   0.85596
		craterOctaves   18
		craterRayedFactor 0.068728
		volcanoMagn     0.15945
		volcanoFreq     0.75962
		volcanoDensity  0.35502
		volcanoOctaves  3
		volcanoActivity 0.60833
		volcanoFlows    0.19574
		volcanoRadius   0.14856
		volcanoTemp     354.14
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
		PeriodDays      0.969548936
		SemiMajorAxisKm 36955.1684
		Eccentricity    0.000270291639
		Inclination     0.239377303
		AscendingNode   -75.4744447
		ArgOfPericenter 146.211018
		MeanAnomaly     -175.06807
	}
}

Moon	"7.2"
{
	ParentBody     "7"
	Class          "Aquaria"
	Mass            0.0018357
	Radius          939.6
	InertiaMoment   0.39983
	Oblateness      0.0022199
	Obliquity       0.11269
	EqAscendNode    135.1
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.800 0.797 0.796)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.95629
		Randomize      (0.070, -0.689, 0.305)
		colorDistMagn   0.068029
		colorDistFreq   96.891
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.18807
		snowLevel       2
		tropicLatitude  0.12312
		icecapLatitude  0.99056
		icecapHeight    0.0017739
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12486
		heightTempGrad  0.625
		beachWidth      0.0012508
		tropicWidth     0.07
		mainFreq        1.8579
		venusFreq       1.0128
		venusMagn       0
		mareFreq        0.28914
		mareDensity     0.1251
		terraceProb     0.14906
		erosion         0
		montesMagn      0.075267
		montesFreq      34.014
		montesSpiky     0.72391
		montesFraction  0.90888
		dunesMagn       0.053166
		dunesFreq       4.961
		dunesFraction   0.84909
		hillsMagn       0.1328
		hillsFreq       129.44
		hillsFraction   0.12648
		hills2Fraction  0.040369
		riversMagn      0
		riversFreq      3.6631
		riversSin       6.0941
		riftsMagn       0
		riftsFreq       2.5149
		riftsSin        5.715
		canyonsMagn     0.40317
		canyonsFreq     0.32845
		canyonsFraction 0
		cracksMagn      0.026893
		cracksFreq      0.55808
		cracksOctaves   0
		craterMagn      0.63605
		craterFreq      3.279
		craterDensity   0.93294
		craterOctaves   18
		craterRayedFactor 0.20146
		volcanoMagn     0.15684
		volcanoFreq     0.55444
		volcanoDensity  0.33691
		volcanoOctaves  3
		volcanoActivity 0.79015
		volcanoFlows    0.32243
		volcanoRadius   0.14202
		volcanoTemp     288.9
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
		PeriodDays      1.83682381
		SemiMajorAxisKm 56606.0886
		Eccentricity    0.00134694448
		Inclination     0.112690554
		AscendingNode   135.099914
		ArgOfPericenter 95.4046724
		MeanAnomaly     29.132858
	}
}

Moon	"7.3"
{
	ParentBody     "7"
	Class          "Aquaria"
	Mass            0.0040285
	Radius          1250.7
	InertiaMoment   0.39913
	Obliquity       -1.3473
	EqAscendNode    -125.05
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.584 0.577 0.573)

	Surface
	{
		Preset         "aquaria_airless_triton.cfg"
		SurfStyle       0.52536
		Randomize      (0.340, -0.859, 0.638)
		colorDistMagn   0.068779
		colorDistFreq   158.06
		detailScale     4096
		drivenDarkening 0
		seaLevel        0.18534
		snowLevel       2
		tropicLatitude  0.099659
		icecapLatitude  0.71877
		icecapHeight    0.088139
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42257
		heightTempGrad  0.625
		beachWidth      0.0015987
		tropicWidth     0.07
		mainFreq        1.6704
		venusFreq       1.1339
		venusMagn       0
		mareFreq        0.44232
		mareDensity     0.1632
		terraceProb     0.26939
		erosion         0
		montesMagn      0.047299
		montesFreq      72.571
		montesSpiky     0.9751
		montesFraction  0.4124
		dunesMagn       0.033377
		dunesFreq       11.43
		dunesFraction   0.58052
		hillsMagn       0.11508
		hillsFreq       146.7
		hillsFraction   0.66166
		hills2Fraction  0.098897
		riversMagn      0
		riversFreq      3.3388
		riversSin       6.2431
		riftsMagn       0
		riftsFreq       2.6675
		riftsSin        6.0626
		canyonsMagn     0.71434
		canyonsFreq     0.50429
		canyonsFraction 0
		cracksMagn      0.046179
		cracksFreq      0.48106
		cracksOctaves   0
		craterMagn      0.59662
		craterFreq      3.5945
		craterDensity   0.7772
		craterOctaves   19
		craterRayedFactor 0.12735
		volcanoMagn     0.15325
		volcanoFreq     0.67972
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 1.0193
		volcanoFlows    0.18249
		volcanoRadius   0.13332
		volcanoTemp     363.65
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
		PeriodDays      3.47682497
		SemiMajorAxisKm 86706.3904
		Eccentricity    0.00400287099
		Inclination     -1.34728433
		AscendingNode   -125.053183
		ArgOfPericenter 82.9240697
		MeanAnomaly     95.5226013
	}
}

Comet	"C151"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.1781e-10
	Radius          4.3228
	InertiaMoment   0.39954
	RotationPeriod  79.803
	RotationEpoch   0
	Obliquity       222.44
	EqAscendNode    246.57

	AbsMagn         11.923
	SlopeParam      2.0205
	AlbedoBond      0.031617
	AlbedoGeom      0.03794
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.691 0.689 0.686)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.61788
		Randomize      (-0.004, 0.010, -0.735)
		colorDistMagn   0.56104
		colorDistFreq   0.0034528
		detailScale     16
		snowLevel       2
		tropicLatitude  0.60081
		icecapLatitude  2
		icecapHeight    0.66315
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35962
		heightTempGrad  0.625
		beachWidth      0.0013595
		tropicWidth     0.07
		mainFreq        0.66838
		venusFreq       0.57081
		venusMagn       0.57229
		mareDensity     0
		terraceProb     0.10116
		erosion         0
		montesMagn      0.59075
		montesFreq      3.0095
		montesSpiky     0.92719
		montesFraction  0.2797
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.04644
		hillsFraction   0.78069
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27339
		craterFreq      0.1571
		craterDensity   0.88096
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50681
		volcanoTemp     1046.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.116
		BumpOffset      5.0579
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.071713
		GasToDust   0.25
		Particles   2428
		GasBright   0.0075227
		DustBright  0.022683
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          105.611055
		SemiMajorAxis   25.3468177
		Eccentricity    0.930587199
		Inclination     47.9545261
		AscendingNode   -127.511122
		ArgOfPericenter -165.739953
		MeanAnomaly     -129.796253
	}
}

Comet	"C171"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.5471e-17
	Radius          0.02275
	InertiaMoment   0.39813
	RotationPeriod  99.084
	RotationEpoch   0
	Obliquity       262.82
	EqAscendNode    16.822

	AbsMagn         0.81745
	SlopeParam      5.1656
	AlbedoBond      0.03299
	AlbedoGeom      0.039588
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.532 0.461 0.364)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73004
		Randomize      (0.612, 0.820, -0.548)
		colorDistMagn   0.73693
		colorDistFreq   2.2195e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99908
		icecapLatitude  2
		icecapHeight    0.57372
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22494
		heightTempGrad  0.625
		beachWidth      0.0012303
		tropicWidth     0.07
		mainFreq        0.38268
		venusFreq       0.69488
		venusMagn       0.72147
		mareDensity     0
		terraceProb     0.34767
		erosion         0
		montesMagn      0.31325
		montesFreq      3.1727
		montesSpiky     0.99071
		montesFraction  0.40571
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.4623e-07
		hillsFraction   0.91013
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23213
		craterFreq      0.23786
		craterDensity   0.85467
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53821
		volcanoTemp     1218.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.056608
		BumpOffset      0.028304
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.018699
		DustBright  0.027711
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          106.953093
		SemiMajorAxis   25.5610929
		Eccentricity    0.9286292
		Inclination     -18.7795249
		AscendingNode   -103.684232
		ArgOfPericenter 168.571616
		MeanAnomaly     -166.588349
	}
}

Comet	"C123"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.0282e-14
	Radius          0.18454
	InertiaMoment   0.39856
	Oblateness      0.050986
	RotationPeriod  5.392
	RotationEpoch   0
	Obliquity       237.91
	EqAscendNode    136.22

	AbsMagn         6.6642
	SlopeParam      3.4329
	AlbedoBond      0.029372
	AlbedoGeom      0.035246
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.548 0.543 0.539)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.66085
		Randomize      (-0.865, -0.324, 0.602)
		colorDistMagn   0.47322
		colorDistFreq   2.1474e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.85892
		icecapLatitude  2
		icecapHeight    0.35504
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46817
		heightTempGrad  0.625
		beachWidth      0.00064048
		tropicWidth     0.07
		mainFreq        0.55507
		venusFreq       0.53912
		venusMagn       0.47637
		mareDensity     0
		terraceProb     0.19866
		erosion         0
		montesMagn      0.4637
		montesFreq      3.7339
		montesSpiky     0.77313
		montesFraction  0.63207
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0001202
		hillsFraction   0.4801
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22333
		craterFreq      0.24248
		craterDensity   0.916
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41327
		volcanoTemp     1105.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.46013
		BumpOffset      0.23007
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.020863
		GasToDust   0.25
		Particles   1401
		GasBright   0.00079162
		DustBright  0.022728
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          108.541885
		SemiMajorAxis   25.813611
		Eccentricity    0.87607468
		Inclination     116.777801
		AscendingNode   173.514307
		ArgOfPericenter -12.6731172
		MeanAnomaly     -75.3483043
	}
}

Comet	"C62"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.2531e-15
	Radius          0.099179
	InertiaMoment   0.39832
	RotationPeriod  106.41
	RotationEpoch   0
	Obliquity       258.75
	EqAscendNode    62.951

	AbsMagn         3.5074
	SlopeParam      2.8489
	AlbedoBond      0.040478
	AlbedoGeom      0.048574
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.574 0.515 0.457)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.71875
		Randomize      (-0.742, -0.695, -0.269)
		colorDistMagn   0.67732
		colorDistFreq   2.3609e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.3876
		icecapLatitude  2
		icecapHeight    0.61847
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21894
		heightTempGrad  0.625
		beachWidth      0.0014847
		tropicWidth     0.07
		mainFreq        0.28169
		venusFreq       0.53671
		venusMagn       0.61692
		mareDensity     0
		terraceProb     0.15463
		erosion         0
		montesMagn      0.38436
		montesFreq      2.9872
		montesSpiky     0.77086
		montesFraction  0.57543
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4675e-05
		hillsFraction   0.73949
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21453
		craterFreq      0.2162
		craterDensity   0.78905
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58748
		volcanoTemp     1254.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.22951
		BumpOffset      0.11475
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.010852
		GasToDust   0.25
		Particles   1199
		GasBright   0.0010368
		DustBright  0.01506
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          108.552109
		SemiMajorAxis   25.8152318
		Eccentricity    0.888480645
		Inclination     -81.9135957
		AscendingNode   -22.9177343
		ArgOfPericenter -16.6559256
		MeanAnomaly     -159.630441
	}
}

Comet	"C169"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.9409e-14
	Radius          0.22124
	InertiaMoment   0.3983
	RotationPeriod  52.71
	RotationEpoch   0
	Obliquity       186.78
	EqAscendNode    291.8

	AbsMagn         10.234
	SlopeParam      3.9791
	AlbedoBond      0.032859
	AlbedoGeom      0.03943
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.557 0.550 0.548)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.51883
		Randomize      (0.550, 0.939, 0.833)
		colorDistMagn   0.55584
		colorDistFreq   3.4788e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.70398
		icecapLatitude  2
		icecapHeight    0.8192
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11841
		heightTempGrad  0.625
		beachWidth      0.00064323
		tropicWidth     0.07
		mainFreq        0.72747
		venusFreq       0.53648
		venusMagn       0.67934
		mareDensity     0
		terraceProb     0.24327
		erosion         0
		montesMagn      0.55105
		montesFreq      3.0281
		montesSpiky     0.95876
		montesFraction  0.8067
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.8006e-05
		hillsFraction   0.46179
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24037
		craterFreq      0.15063
		craterDensity   0.99296
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58491
		volcanoTemp     1051.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.58444
		BumpOffset      0.29222
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.023788
		GasToDust   0.25
		Particles   1460
		GasBright   0.018907
		DustBright  0.029883
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          112.264349
		SemiMajorAxis   26.4004763
		Eccentricity    0.894535819
		Inclination     128.755591
		AscendingNode   -15.7131978
		ArgOfPericenter 154.395722
		MeanAnomaly     -96.1140343
	}
}

Comet	"C60"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.7509e-12
	Radius          0.96448
	InertiaMoment   0.39848
	RotationPeriod  55.053
	RotationEpoch   0
	Obliquity       182.71
	EqAscendNode    337.93

	AbsMagn         11.456
	SlopeParam      6.5591
	AlbedoBond      0.040376
	AlbedoGeom      0.048451
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.622 0.620 0.617)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.50753
		Randomize      (-0.804, -0.576, -0.888)
		colorDistMagn   0.49243
		colorDistFreq   0.00052933
		detailScale     8
		snowLevel       2
		tropicLatitude  0.49702
		icecapLatitude  2
		icecapHeight    0.40916
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11241
		heightTempGrad  0.625
		beachWidth      0.00089759
		tropicWidth     0.07
		mainFreq        0.63259
		venusFreq       0.56366
		venusMagn       0.56822
		mareDensity     0
		terraceProb     0.47769
		erosion         0
		montesMagn      0.57995
		montesFreq      2.8434
		montesSpiky     0.97155
		montesFraction  0.41167
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0022828
		hillsFraction   0.78323
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22725
		craterFreq      0.24891
		craterDensity   0.93376
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44544
		volcanoTemp     1087.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.2943
		BumpOffset      1.1471
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.047527
		GasToDust   0.25
		Particles   1939
		GasBright   0.00090582
		DustBright  0.017571
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          112.421661
		SemiMajorAxis   26.4251332
		Eccentricity    0.900477253
		Inclination     27.129857
		AscendingNode   10.129824
		ArgOfPericenter 110.311308
		MeanAnomaly     175.445134
	}
}

Comet	"C28"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.784e-10
	Radius          3.8937
	InertiaMoment   0.39741
	RotationPeriod  103.73
	RotationEpoch   0
	Obliquity       46.105
	EqAscendNode    57.523

	AbsMagn         10.067
	SlopeParam      4.9274
	AlbedoBond      0.03874
	AlbedoGeom      0.046488
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.751 0.706 0.616)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12807
		Randomize      (0.211, -0.673, -0.787)
		colorDistMagn   0.8696
		colorDistFreq   0.0042612
		detailScale     16
		snowLevel       2
		tropicLatitude  0.70646
		icecapLatitude  2
		icecapHeight    0.59438
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40789
		heightTempGrad  0.625
		beachWidth      0.0014044
		tropicWidth     0.07
		mainFreq        0.32035
		venusFreq       0.57764
		venusMagn       0.71638
		mareDensity     0
		terraceProb     0.3261
		erosion         0
		montesMagn      0.54704
		montesFreq      3.0919
		montesSpiky     0.97992
		montesFraction  0.38416
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.043881
		hillsFraction   0.56687
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25917
		craterFreq      0.18221
		craterDensity   0.98102
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.60276
		volcanoTemp     1212.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.7516
		BumpOffset      4.3758
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.070027
		GasToDust   0.25
		Particles   2394
		GasBright   0.0050123
		DustBright  0.011537
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          113.451953
		SemiMajorAxis   26.5863369
		Eccentricity    0.908895831
		Inclination     178.57286
		AscendingNode   35.3909436
		ArgOfPericenter -124.579659
		MeanAnomaly     -112.411737
	}
}

Comet	"C65"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.6317e-08
	Radius          20.632
	InertiaMoment   0.39957
	Oblateness      0.010872
	RotationPeriod  11.696
	RotationEpoch   0
	Obliquity       192.81
	EqAscendNode    190.49

	AbsMagn         3.0913
	SlopeParam      4.6041
	AlbedoBond      0.020545
	AlbedoGeom      0.024654
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.763 0.760 0.756)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.53557
		Randomize      (-0.650, -0.874, 0.659)
		colorDistMagn   0.95681
		colorDistFreq   0.1979
		detailScale     64
		snowLevel       2
		tropicLatitude  0.59564
		icecapLatitude  2
		icecapHeight    0.5141
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17874
		heightTempGrad  0.625
		beachWidth      0.00071528
		tropicWidth     0.07
		mainFreq        0.6746
		venusFreq       0.66598
		venusMagn       0.67618
		mareDensity     0
		terraceProb     0.29725
		erosion         0
		montesMagn      0.3737
		montesFreq      3.2048
		montesSpiky     0.98628
		montesFraction  0.56209
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.1046
		hillsFraction   0.68971
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26156
		craterFreq      0.21593
		craterDensity   0.86496
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45674
		volcanoTemp     955.73
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
		MaxLength   0.096914
		GasToDust   0.25
		Particles   2937
		GasBright   0.001096
		DustBright  0.011431
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          117.313441
		SemiMajorAxis   27.1862331
		Eccentricity    0.880723025
		Inclination     -24.4350357
		AscendingNode   157.204566
		ArgOfPericenter -24.6672136
		MeanAnomaly     -28.6805772
	}
}

Comet	"C59"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.744e-10
	Radius          3.0077
	InertiaMoment   0.39992
	RotationPeriod  84
	RotationEpoch   0
	Obliquity       324.69
	EqAscendNode    295.41

	AbsMagn         3.8798
	SlopeParam      5.596
	AlbedoBond      0.017926
	AlbedoGeom      0.021512
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.674 0.672 0.669)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.90192
		Randomize      (-0.835, -0.517, 0.803)
		colorDistMagn   0.38992
		colorDistFreq   0.0064586
		detailScale     8
		snowLevel       2
		tropicLatitude  0.81197
		icecapLatitude  2
		icecapHeight    0.73649
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25914
		heightTempGrad  0.625
		beachWidth      0.0013541
		tropicWidth     0.07
		mainFreq        0.37824
		venusFreq       0.57365
		venusMagn       0.53319
		mareDensity     0
		terraceProb     0.38722
		erosion         0
		montesMagn      0.39384
		montesFreq      2.7671
		montesSpiky     0.85711
		montesFraction  0.58889
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.021958
		hillsFraction   0.81311
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23186
		craterFreq      0.21648
		craterDensity   1.0182
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5301
		volcanoTemp     1154.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.6164
		BumpOffset      3.3082
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.065864
		GasToDust   0.25
		Particles   2310
		GasBright   0.00081286
		DustBright  0.018853
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          117.472403
		SemiMajorAxis   27.2107862
		Eccentricity    0.926140943
		Inclination     160.145108
		AscendingNode   20.5082949
		ArgOfPericenter 14.470645
		MeanAnomaly     -44.7193871
	}
}

Comet	"C116"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.7831e-15
	Radius          0.083882
	InertiaMoment   0.39702
	Oblateness      0.0080206
	RotationPeriod  13.555
	RotationEpoch   0
	Obliquity       151.77
	EqAscendNode    198.63

	AbsMagn         10.68
	SlopeParam      3.7243
	AlbedoBond      0.043292
	AlbedoGeom      0.051951
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.514 0.505 0.502)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.42159
		Randomize      (0.919, 0.092, 0.437)
		colorDistMagn   0.66231
		colorDistFreq   3.0277e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.93455
		icecapLatitude  2
		icecapHeight    0.55447
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2953
		heightTempGrad  0.625
		beachWidth      0.00053572
		tropicWidth     0.07
		mainFreq        0.43309
		venusFreq       0.60878
		venusMagn       0.65837
		mareDensity     0
		terraceProb     0.22211
		erosion         0
		montesMagn      0.56169
		montesFreq      3.043
		montesSpiky     0.95635
		montesFraction  0.26023
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9756e-05
		hillsFraction   0.61087
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25436
		craterFreq      0.21124
		craterDensity   0.86255
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45093
		volcanoTemp     969.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.21435
		BumpOffset      0.10718
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0081509
		GasToDust   0.25
		Particles   1144
		GasBright   0.015281
		DustBright  0.016567
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          118.220841
		SemiMajorAxis   27.3262404
		Eccentricity    0.890985271
		Inclination     87.7896634
		AscendingNode   -145.571715
		ArgOfPericenter 46.7358924
		MeanAnomaly     26.278722
	}
}

Comet	"C165"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.8708e-08
	Radius          20.92
	InertiaMoment   0.39862
	RotationPeriod  67.86
	RotationEpoch   0
	Obliquity       34.702
	EqAscendNode    121.75

	AbsMagn         2.3224
	SlopeParam      6.4411
	AlbedoBond      0.032593
	AlbedoGeom      0.039111
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.817 0.766 0.703)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.096395
		Randomize      (0.427, -0.823, -0.404)
		colorDistMagn   0.061427
		colorDistFreq   0.29513
		detailScale     64
		snowLevel       2
		tropicLatitude  0.67416
		icecapLatitude  2
		icecapHeight    0.93112
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30534
		heightTempGrad  0.625
		beachWidth      0.00066908
		tropicWidth     0.07
		mainFreq        0.50838
		venusFreq       0.58257
		venusMagn       0.59834
		mareDensity     0
		terraceProb     0.46649
		erosion         0
		montesMagn      0.35378
		montesFreq      2.7333
		montesSpiky     0.86839
		montesFraction  0.43833
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3275
		hillsFraction   0.55597
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25895
		craterFreq      0.23843
		craterDensity   1.0009
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47529
		volcanoTemp     1116.7
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
		MaxLength   0.097138
		GasToDust   0.25
		Particles   2942
		GasBright   0.0048334
		DustBright  0.0087151
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          118.632218
		SemiMajorAxis   27.3895957
		Eccentricity    0.917949505
		Inclination     -127.09195
		AscendingNode   -122.316164
		ArgOfPericenter 131.851303
		MeanAnomaly     -164.687922
	}
}

Comet	"C57"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.604e-07
	Radius          29.243
	InertiaMoment   0.39521
	RotationPeriod  45.412
	RotationEpoch   0
	Obliquity       248.65
	EqAscendNode    210.39

	AbsMagn         11.769
	SlopeParam      4.3193
	AlbedoBond      0.016573
	AlbedoGeom      0.019888
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.777 0.776 0.774)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.69071
		Randomize      (-0.896, -0.398, 0.184)
		colorDistMagn   0.12407
		colorDistFreq   0.33899
		detailScale     128
		snowLevel       2
		tropicLatitude  0.77047
		icecapLatitude  2
		icecapHeight    0.55322
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15261
		heightTempGrad  0.625
		beachWidth      0.00046698
		tropicWidth     0.07
		mainFreq        0.72064
		venusFreq       0.59117
		venusMagn       0.82221
		mareDensity     0
		terraceProb     0.27232
		erosion         0
		montesMagn      0.58722
		montesFreq      2.5932
		montesSpiky     0.98833
		montesFraction  0.42808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0308
		hillsFraction   0.34777
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24012
		craterFreq      0.24923
		craterDensity   0.87538
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56525
		volcanoTemp     1086.9
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
		GasBright   0.00057204
		DustBright  0.021474
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          119.474934
		SemiMajorAxis   27.5191525
		Eccentricity    0.905066133
		Inclination     -50.8615134
		AscendingNode   -55.6394186
		ArgOfPericenter 121.760797
		MeanAnomaly     94.9404703
	}
}

Comet	"C117"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.2475e-16
	Radius          0.026899
	InertiaMoment   0.39899
	RotationPeriod  78.688
	RotationEpoch   0
	Obliquity       9.7924
	EqAscendNode    241.14

	AbsMagn         7.0983
	SlopeParam      4.2881
	AlbedoBond      0.028817
	AlbedoGeom      0.03458
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.462 0.455 0.450)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.027201
		Randomize      (0.950, 0.033, 0.746)
		colorDistMagn   0.75198
		colorDistFreq   1.7165e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.86025
		icecapLatitude  2
		icecapHeight    0.63747
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14857
		heightTempGrad  0.625
		beachWidth      0.0012793
		tropicWidth     0.07
		mainFreq        0.699
		venusFreq       0.60053
		venusMagn       0.67775
		mareDensity     0
		terraceProb     0.26962
		erosion         0
		montesMagn      0.47446
		montesFreq      3.1146
		montesSpiky     0.89318
		montesFraction  0.66197
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.0638e-06
		hillsFraction   0.59634
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24955
		craterFreq      0.24307
		craterDensity   0.77451
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50937
		volcanoTemp     1203.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.061253
		BumpOffset      0.030626
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.014946
		DustBright  0.015712
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          119.930126
		SemiMajorAxis   27.5890057
		Eccentricity    0.85970014
		Inclination     -125.205107
		AscendingNode   -65.2264772
		ArgOfPericenter -56.9120263
		MeanAnomaly     74.4646623
	}
}

Comet	"C137"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.5671e-12
	Radius          0.89316
	InertiaMoment   0.39709
	RotationPeriod  97.072
	RotationEpoch   0
	Obliquity       50.172
	EqAscendNode    11.394

	AbsMagn         9.0436
	SlopeParam      2.803
	AlbedoBond      0.030554
	AlbedoGeom      0.036665
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.723 0.579 0.509)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.13937
		Randomize      (-0.435, 0.843, 0.934)
		colorDistMagn   0.93427
		colorDistFreq   0.00036073
		detailScale     8
		snowLevel       2
		tropicLatitude  0.73613
		icecapLatitude  2
		icecapHeight    0.54871
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41389
		heightTempGrad  0.625
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        0.40667
		venusFreq       0.55714
		venusMagn       0.53824
		mareDensity     0
		terraceProb     0.15138
		erosion         0
		montesMagn      0.52227
		montesFreq      3.2888
		montesSpiky     0.96746
		montesFraction  0.76541
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0016819
		hillsFraction   0.63518
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21163
		craterFreq      0.20926
		craterDensity   0.6452
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54169
		volcanoTemp     1075.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.1505
		BumpOffset      1.0753
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.046288
		GasToDust   0.25
		Particles   1914
		GasBright   0.0066242
		DustBright  0.040238
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          123.697757
		SemiMajorAxis   28.1638315
		Eccentricity    0.882472531
		Inclination     -6.97526853
		AscendingNode   -63.8587745
		ArgOfPericenter -121.686595
		MeanAnomaly     105.785698
	}
}

Comet	"C12"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.0695e-09
	Radius          7.8233
	InertiaMoment   0.39886
	RotationPeriod  63.963
	RotationEpoch   0
	Obliquity       157.8
	EqAscendNode    97.321

	AbsMagn         3.7968
	SlopeParam      4.3427
	AlbedoBond      0.037912
	AlbedoGeom      0.045494
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.758 0.713 0.673)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43834
		Randomize      (-0.281, 0.279, 0.263)
		colorDistMagn   0.14767
		colorDistFreq   0.049198
		detailScale     32
		snowLevel       2
		tropicLatitude  0.97253
		icecapLatitude  2
		icecapHeight    0.66656
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35563
		heightTempGrad  0.625
		beachWidth      0.00090777
		tropicWidth     0.07
		mainFreq        0.398
		venusFreq       0.58396
		venusMagn       0.65525
		mareDensity     0
		terraceProb     0.27436
		erosion         0
		montesMagn      0.39173
		montesFreq      3.2211
		montesSpiky     0.98405
		montesFraction  0.63715
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.14522
		hillsFraction   0.90081
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2162
		craterFreq      0.25422
		craterDensity   1.0129
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48751
		volcanoTemp     974.44
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.637
		BumpOffset      9.3184
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.081277
		GasToDust   0.25
		Particles   2621
		GasBright   0.0063978
		DustBright  0.029188
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          124.106222
		SemiMajorAxis   28.2257976
		Eccentricity    0.885628163
		Inclination     125.652013
		AscendingNode   1.64752577
		ArgOfPericenter -47.1915402
		MeanAnomaly     -133.464273
	}
}

Comet	"C96"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.5956e-08
	Radius          15.937
	InertiaMoment   0.39896
	RotationPeriod  109.47
	RotationEpoch   0
	Obliquity       111.39
	EqAscendNode    68.378

	AbsMagn         8.5682
	SlopeParam      5.2117
	AlbedoBond      0.042232
	AlbedoGeom      0.050678
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.806 0.728 0.690)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30943
		Randomize      (0.304, -0.718, 0.250)
		colorDistMagn   0.48149
		colorDistFreq   0.047865
		detailScale     64
		snowLevel       2
		tropicLatitude  0.96456
		icecapLatitude  2
		icecapHeight    0.64312
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42998
		heightTempGrad  0.625
		beachWidth      0.001265
		tropicWidth     0.07
		mainFreq        0.74492
		venusFreq       0.65831
		venusMagn       0.82671
		mareDensity     0
		terraceProb     0.35187
		erosion         0
		montesMagn      0.51066
		montesFreq      2.882
		montesSpiky     0.8727
		montesFraction  0.80369
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.56358
		hillsFraction   0.56975
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23339
		craterFreq      0.24517
		craterDensity   0.88828
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57763
		volcanoTemp     1197.6
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
		MaxLength   0.092751
		GasToDust   0.25
		Particles   2853
		GasBright   0.0050993
		DustBright  0.010545
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          124.428121
		SemiMajorAxis   28.2745835
		Eccentricity    0.956098846
		Inclination     -6.46026059
		AscendingNode   19.7250043
		ArgOfPericenter 127.804924
		MeanAnomaly     135.451473
	}
}

Comet	"C8"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.0336e-14
	Radius          0.11726
	InertiaMoment   0.39913
	RotationPeriod  82.156
	RotationEpoch   0
	Obliquity       5.726
	EqAscendNode    287.27

	AbsMagn         8.0525
	SlopeParam      7.5266
	AlbedoBond      0.037703
	AlbedoGeom      0.045243
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.528 0.522 0.519)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.015905
		Randomize      (-0.404, 0.517, -0.975)
		colorDistMagn   0.69232
		colorDistFreq   1.0402e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9679
		icecapLatitude  2
		icecapHeight    0.68683
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14257
		heightTempGrad  0.625
		beachWidth      0.00093361
		tropicWidth     0.07
		mainFreq        0.61419
		venusFreq       0.61738
		venusMagn       0.56582
		mareDensity     0
		terraceProb     0.57037
		erosion         0
		montesMagn      0.49801
		montesFreq      2.9313
		montesSpiky     0.91247
		montesFraction  0.23295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.1189e-05
		hillsFraction   0.51555
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23687
		craterFreq      0.22107
		craterDensity   1.0229
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53478
		volcanoTemp     1040
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.30173
		BumpOffset      0.15087
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.013552
		GasToDust   0.25
		Particles   1253
		GasBright   0.0060119
		DustBright  0.034333
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          124.97445
		SemiMajorAxis   28.3572869
		Eccentricity    0.938847519
		Inclination     69.7603868
		AscendingNode   -7.17040401
		ArgOfPericenter -151.749478
		MeanAnomaly     45.564171
	}
}

Comet	"C32"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.4738e-16
	Radius          0.041173
	InertiaMoment   0.39672
	RotationPeriod  76.022
	RotationEpoch   0
	Obliquity       198.18
	EqAscendNode    227.57

	AbsMagn         6.3367
	SlopeParam      2.867
	AlbedoBond      0.038945
	AlbedoGeom      0.046734
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.480 0.475 0.471)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5505
		Randomize      (0.335, -0.910, 0.450)
		colorDistMagn   0.39896
		colorDistFreq   5.5932e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.52448
		icecapLatitude  2
		icecapHeight    0.57683
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22096
		heightTempGrad  0.625
		beachWidth      0.00077853
		tropicWidth     0.07
		mainFreq        0.52814
		venusFreq       0.52455
		venusMagn       0.45916
		mareDensity     0
		terraceProb     0.15594
		erosion         0
		montesMagn      0.45556
		montesFreq      3.418
		montesSpiky     0.90314
		montesFraction  0.7297
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.453e-06
		hillsFraction   0.48305
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24051
		craterFreq      0.21891
		craterDensity   0.97429
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5159
		volcanoTemp     1146.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10577
		BumpOffset      0.052887
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0039337
		DustBright  0.0078568
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          125.339378
		SemiMajorAxis   28.4124626
		Eccentricity    0.899060733
		Inclination     39.8771317
		AscendingNode   127.69338
		ArgOfPericenter -131.661612
		MeanAnomaly     -0.458954964
	}
}

Comet	"C63"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.0619e-16
	Radius          0.031804
	InertiaMoment   0.39969
	RotationPeriod  65.239
	RotationEpoch   0
	Obliquity       116.77
	EqAscendNode    105.46

	AbsMagn         11.162
	SlopeParam      3.465
	AlbedoBond      0.019818
	AlbedoGeom      0.023782
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.516 0.478 0.412)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.32436
		Randomize      (-0.712, -0.755, 0.040)
		colorDistMagn   0.76707
		colorDistFreq   7.6326e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.88581
		icecapLatitude  2
		icecapHeight    0.71073
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4722
		heightTempGrad  0.625
		beachWidth      0.0010282
		tropicWidth     0.07
		mainFreq        0.56729
		venusFreq       0.5109
		venusMagn       0.63732
		mareDensity     0
		terraceProb     0.2012
		erosion         0
		montesMagn      0.57307
		montesFreq      3.058
		montesSpiky     0.95392
		montesFraction  0.39426
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5657e-06
		hillsFraction   0.72158
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19941
		craterFreq      0.24859
		craterDensity   1.0087
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48355
		volcanoTemp     888.52
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.07951
		BumpOffset      0.039755
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0010748
		DustBright  0.013832
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          125.456029
		SemiMajorAxis   28.4300885
		Eccentricity    0.92648828
		Inclination     24.7840516
		AscendingNode   -81.5277359
		ArgOfPericenter 10.4039024
		MeanAnomaly     -159.295185
	}
}

Comet	"C146"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.2877e-14
	Radius          0.20206
	InertiaMoment   0.39844
	Oblateness      0.0013877
	RotationPeriod  32.676
	RotationEpoch   0
	Obliquity       212.34
	EqAscendNode    34.008

	AbsMagn         8.4067
	SlopeParam      3.7087
	AlbedoBond      0.044961
	AlbedoGeom      0.053953
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.639 0.521 0.457)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.58984
		Randomize      (-0.158, 0.308, -0.282)
		colorDistMagn   0.93149
		colorDistFreq   1.5038e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.61656
		icecapLatitude  2
		icecapHeight    0.59673
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29329
		heightTempGrad  0.625
		beachWidth      0.00094186
		tropicWidth     0.07
		mainFreq        0.62739
		venusFreq       0.61355
		venusMagn       0.74578
		mareDensity     0
		terraceProb     0.22083
		erosion         0
		montesMagn      0.5067
		montesFreq      2.6234
		montesSpiky     0.90686
		montesFraction  0.70429
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6052e-05
		hillsFraction   0.47137
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23255
		craterFreq      0.2084
		craterDensity   0.95062
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49979
		volcanoTemp     878.08
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.46643
		BumpOffset      0.23321
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.022325
		GasToDust   0.25
		Particles   1430
		GasBright   0.0076137
		DustBright  0.028541
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          127.106527
		SemiMajorAxis   28.6788956
		Eccentricity    0.916545854
		Inclination     -165.539555
		AscendingNode   76.6707888
		ArgOfPericenter 169.69066
		MeanAnomaly     -129.728058
	}
}

Comet	"C162"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.5186e-15
	Radius          0.10056
	InertiaMoment   0.39624
	RotationPeriod  57.409
	RotationEpoch   0
	Obliquity       100.65
	EqAscendNode    354.21

	AbsMagn         2.844
	SlopeParam      4.2647
	AlbedoBond      0.045907
	AlbedoGeom      0.055089
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.523 0.517 0.510)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.27957
		Randomize      (0.335, -0.644, 0.668)
		colorDistMagn   0.73944
		colorDistFreq   5.1058e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99391
		icecapLatitude  2
		icecapHeight    0.52331
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34554
		heightTempGrad  0.625
		beachWidth      0.00083847
		tropicWidth     0.07
		mainFreq        0.56687
		venusFreq       0.60755
		venusMagn       0.48233
		mareDensity     0
		terraceProb     0.2676
		erosion         0
		montesMagn      0.36733
		montesFreq      2.4314
		montesSpiky     0.9004
		montesFraction  0.45354
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.8883e-05
		hillsFraction   0.60295
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21052
		craterFreq      0.23871
		craterDensity   0.92902
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42876
		volcanoTemp     1015.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.20596
		BumpOffset      0.10298
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.011075
		GasToDust   0.25
		Particles   1203
		GasBright   0.0057117
		DustBright  0.011406
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          127.462155
		SemiMajorAxis   28.7323639
		Eccentricity    0.874848613
		Inclination     4.31891047
		AscendingNode   179.441135
		ArgOfPericenter -100.454818
		MeanAnomaly     89.0823316
	}
}

Comet	"C95"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.8714e-07
	Radius          49.685
	InertiaMoment   0.39695
	Oblateness      0.0014916
	RotationPeriod  31.41
	RotationEpoch   0
	Obliquity       253.38
	EqAscendNode    25.866

	AbsMagn         12.997
	SlopeParam      4.5879
	AlbedoBond      0.026401
	AlbedoGeom      0.031681
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.847 0.810 0.752)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70382
		Randomize      (0.273, -0.658, -0.060)
		colorDistMagn   0.37772
		colorDistFreq   1.0059
		detailScale     128
		snowLevel       2
		tropicLatitude  0.21404
		icecapLatitude  2
		icecapHeight    0.56014
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17672
		heightTempGrad  0.625
		beachWidth      0.00082142
		tropicWidth     0.07
		mainFreq        0.4579
		venusFreq       0.67932
		venusMagn       0.77517
		mareDensity     0
		terraceProb     0.29582
		erosion         0
		montesMagn      0.61483
		montesFreq      2.8078
		montesSpiky     0.94467
		montesFraction  0.42081
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.4101
		hillsFraction   0.58545
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23752
		craterFreq      0.21319
		craterDensity   0.9532
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50359
		volcanoTemp     1164
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
		GasBright   0.0053576
		DustBright  0.011476
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          127.503336
		SemiMajorAxis   28.7385522
		Eccentricity    0.924959119
		Inclination     -114.12029
		AscendingNode   169.504766
		ArgOfPericenter 44.895147
		MeanAnomaly     19.5469269
	}
}

Comet	"C97"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.5589e-10
	Radius          5.1111
	InertiaMoment   0.39651
	RotationPeriod  66.102
	RotationEpoch   0
	Obliquity       329.41
	EqAscendNode    110.89

	AbsMagn         4.8941
	SlopeParam      5.987
	AlbedoBond      0.026654
	AlbedoGeom      0.031985
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.763 0.692 0.629)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91504
		Randomize      (0.335, -0.777, 0.559)
		colorDistMagn   0.57655
		colorDistFreq   0.018962
		detailScale     16
		snowLevel       2
		tropicLatitude  0.77798
		icecapLatitude  2
		icecapHeight    0.74752
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28325
		heightTempGrad  0.625
		beachWidth      0.0002085
		tropicWidth     0.07
		mainFreq        0.5473
		venusFreq       0.64441
		venusMagn       0.472
		mareDensity     0
		terraceProb     0.42366
		erosion         0
		montesMagn      0.41947
		montesFreq      2.9537
		montesSpiky     0.97802
		montesFraction  0.58282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.058663
		hillsFraction   0.55289
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22895
		craterFreq      0.1705
		craterDensity   0.81729
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48086
		volcanoTemp     1231.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.613
		BumpOffset      6.8065
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.074414
		GasToDust   0.25
		Particles   2483
		GasBright   0.0048227
		DustBright  0.0096315
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          127.814708
		SemiMajorAxis   28.7853209
		Eccentricity    0.95359123
		Inclination     -152.575179
		AscendingNode   125.417739
		ArgOfPericenter -72.6280183
		MeanAnomaly     172.874738
	}
}

Comet	"C44"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.6649e-11
	Radius          1.9379
	InertiaMoment   0.39955
	Oblateness      0.0016396
	RotationPeriod  30.123
	RotationEpoch   0
	Obliquity       294.41
	EqAscendNode    17.724

	AbsMagn         5.3713
	SlopeParam      5.6067
	AlbedoBond      0.03956
	AlbedoGeom      0.047471
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.747 0.640 0.556)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.8178
		Randomize      (0.704, 0.376, 0.162)
		colorDistMagn   0.68232
		colorDistFreq   0.0016654
		detailScale     8
		snowLevel       2
		tropicLatitude  0.36247
		icecapLatitude  2
		icecapHeight    0.52056
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46015
		heightTempGrad  0.625
		beachWidth      0.001001
		tropicWidth     0.07
		mainFreq        0.71334
		venusFreq       0.57093
		venusMagn       0.82077
		mareDensity     0
		terraceProb     0.38821
		erosion         0
		montesMagn      0.43145
		montesFreq      2.9686
		montesSpiky     0.97575
		montesFraction  0.66042
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0075461
		hillsFraction   0.66458
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24233
		craterFreq      0.21783
		craterDensity   0.95581
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5074
		volcanoTemp     849.94
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.9746
		BumpOffset      2.4873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.058777
		GasToDust   0.25
		Particles   2167
		GasBright   0.015978
		DustBright  0.021535
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          128.0848
		SemiMajorAxis   28.8258585
		Eccentricity    0.933527806
		Inclination     125.927454
		AscendingNode   -159.242561
		ArgOfPericenter -179.070897
		MeanAnomaly     -140.340373
	}
}

Comet	"C51"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.9672e-10
	Radius          4.2633
	InertiaMoment   0.39717
	Oblateness      0.0024177
	RotationPeriod  24.696
	RotationEpoch   0
	Obliquity       20.541
	EqAscendNode    315.31

	AbsMagn         12.479
	SlopeParam      5.2396
	AlbedoBond      0.066528
	AlbedoGeom      0.079834
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.691 0.688 0.684)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.057059
		Randomize      (0.919, -0.041, 0.328)
		colorDistMagn   0.49515
		colorDistFreq   0.011693
		detailScale     16
		snowLevel       2
		tropicLatitude  0.85509
		icecapLatitude  2
		icecapHeight    0.81152
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23301
		heightTempGrad  0.625
		beachWidth      0.0011057
		tropicWidth     0.07
		mainFreq        0.4116
		venusFreq       0.64625
		venusMagn       0.65642
		mareDensity     0
		terraceProb     0.35442
		erosion         0
		montesMagn      0.60338
		montesFreq      3.5623
		montesSpiky     0.86253
		montesFraction  0.45872
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.040291
		hillsFraction   0.56232
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28272
		craterFreq      0.24987
		craterDensity   1.0413
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49208
		volcanoTemp     1085.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.664
		BumpOffset      5.3321
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.071489
		GasToDust   0.25
		Particles   2424
		GasBright   0.014002
		DustBright  0.015182
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          128.281145
		SemiMajorAxis   28.8553096
		Eccentricity    0.874554509
		Inclination     -47.6811827
		AscendingNode   -115.567435
		ArgOfPericenter 120.941637
		MeanAnomaly     -96.3159396
	}
}

Comet	"C99"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.3063e-13
	Radius          0.52559
	InertiaMoment   0.39576
	Oblateness      0.008752
	RotationPeriod  12.946
	RotationEpoch   0
	Obliquity       45.451
	EqAscendNode    195.92

	AbsMagn         8.3582
	SlopeParam      2.4729
	AlbedoBond      0.026899
	AlbedoGeom      0.032278
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.596 0.590 0.588)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12625
		Randomize      (0.396, -0.896, -0.822)
		colorDistMagn   0.757
		colorDistFreq   0.00012211
		detailScale     8
		snowLevel       2
		tropicLatitude  0.64777
		icecapLatitude  2
		icecapHeight    0.54159
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38978
		heightTempGrad  0.625
		beachWidth      0.00049557
		tropicWidth     0.07
		mainFreq        0.64726
		venusFreq       0.62366
		venusMagn       0.56998
		mareDensity     0
		terraceProb     0.12888
		erosion         0
		montesMagn      0.50552
		montesFreq      3.0956
		montesSpiky     0.82005
		montesFraction  0.7764
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00063492
		hillsFraction   0.51333
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21746
		craterFreq      0.24487
		craterDensity   0.94754
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45294
		volcanoTemp     1098.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.3119
		BumpOffset      0.65594
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.037739
		GasToDust   0.25
		Particles   1742
		GasBright   0.0042145
		DustBright  0.0078601
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          129.128945
		SemiMajorAxis   28.982305
		Eccentricity    0.977488587
		Inclination     -174.901945
		AscendingNode   -175.054716
		ArgOfPericenter 53.7999106
		MeanAnomaly     -58.8065179
	}
}

Comet	"C108"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.0775e-14
	Radius          0.1189
	InertiaMoment   0.39803
	RotationPeriod  46.561
	RotationEpoch   0
	Obliquity       207.62
	EqAscendNode    218.53

	AbsMagn         7.7316
	SlopeParam      3.4409
	AlbedoBond      0.042864
	AlbedoGeom      0.051437
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.527 0.523 0.521)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.57673
		Randomize      (0.673, 0.568, -0.038)
		colorDistMagn   0.75449
		colorDistFreq   5.0335e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.81207
		icecapLatitude  2
		icecapHeight    0.59013
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26918
		heightTempGrad  0.625
		beachWidth      0.0011874
		tropicWidth     0.07
		mainFreq        0.46185
		venusFreq       0.5339
		venusMagn       0.77593
		mareDensity     0
		terraceProb     0.19929
		erosion         0
		montesMagn      0.49011
		montesFreq      2.3083
		montesSpiky     0.95858
		montesFraction  0.71247
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.5892e-05
		hillsFraction   0.72944
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23528
		craterFreq      0.24396
		craterDensity   0.87305
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55723
		volcanoTemp     1000.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.28244
		BumpOffset      0.14122
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.013776
		GasToDust   0.25
		Particles   1258
		GasBright   0.017302
		DustBright  0.024064
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          130.716783
		SemiMajorAxis   29.2194086
		Eccentricity    0.895209024
		Inclination     -42.0354569
		AscendingNode   -103.889556
		ArgOfPericenter 41.4642117
		MeanAnomaly     -177.960371
	}
}

Comet	"C7"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.1345e-13
	Radius          0.36568
	InertiaMoment   0.39736
	Oblateness      0.0050778
	RotationPeriod  17.047
	RotationEpoch   0
	Obliquity       147.71
	EqAscendNode    244.76

	AbsMagn         12.027
	SlopeParam      6.0643
	AlbedoBond      0.053191
	AlbedoGeom      0.06383
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.579 0.576 0.571)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4103
		Randomize      (-0.435, 0.577, 0.716)
		colorDistMagn   0.60215
		colorDistFreq   3.2463e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.51251
		icecapLatitude  2
		icecapHeight    0.5998
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2893
		heightTempGrad  0.625
		beachWidth      0.00079008
		tropicWidth     0.07
		mainFreq        0.35727
		venusFreq       0.62641
		venusMagn       0.52964
		mareDensity     0
		terraceProb     0.43092
		erosion         0
		montesMagn      0.59314
		montesFreq      2.859
		montesSpiky     0.96925
		montesFraction  0.4936
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00029976
		hillsFraction   0.53629
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2409
		craterFreq      0.18518
		craterDensity   0.80157
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48012
		volcanoTemp     1106.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.85925
		BumpOffset      0.42962
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.03189
		GasToDust   0.25
		Particles   1624
		GasBright   0.0058697
		DustBright  0.035665
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          130.9253
		SemiMajorAxis   29.2504738
		Eccentricity    0.919415631
		Inclination     174.552383
		AscendingNode   -109.789215
		ArgOfPericenter -7.66442039
		MeanAnomaly     145.633971
	}
}

Comet	"C4"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.7422e-09
	Radius          11.089
	InertiaMoment   0.39938
	RotationPeriod  127.09
	RotationEpoch   0
	Obliquity       213.65
	EqAscendNode    117.22

	AbsMagn         12.39
	SlopeParam      4.064
	AlbedoBond      0.037493
	AlbedoGeom      0.044991
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.790 0.742 0.673)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.59347
		Randomize      (-0.527, 0.755, -0.212)
		colorDistMagn   0.29347
		colorDistFreq   0.087996
		detailScale     32
		snowLevel       2
		tropicLatitude  0.68249
		icecapLatitude  2
		icecapHeight    0.70913
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32951
		heightTempGrad  0.625
		beachWidth      0.0012595
		tropicWidth     0.07
		mainFreq        0.42933
		venusFreq       0.66341
		venusMagn       0.77004
		mareDensity     0
		terraceProb     0.25044
		erosion         0
		montesMagn      0.60137
		montesFreq      2.6136
		montesSpiky     0.98611
		montesFraction  0.5073
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.26555
		hillsFraction   0.58695
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25404
		craterFreq      0.18559
		craterDensity   1.0343
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4392
		volcanoTemp     1205.6
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
		MaxLength   0.086903
		GasToDust   0.25
		Particles   2735
		GasBright   0.0053332
		DustBright  0.039771
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          131.477837
		SemiMajorAxis   29.3327122
		Eccentricity    0.878694476
		Inclination     -108.728276
		AscendingNode   152.061717
		ArgOfPericenter 14.393049
		MeanAnomaly     34.8461107
	}
}

Comet	"C68"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.0192e-12
	Radius          0.68042
	InertiaMoment   0.39774
	Oblateness      0.0023335
	RotationPeriod  25.165
	RotationEpoch   0
	Obliquity       126.86
	EqAscendNode    318.03

	AbsMagn         2.614
	SlopeParam      7.389
	AlbedoBond      0.040785
	AlbedoGeom      0.048942
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.609 0.604 0.598)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.3524
		Randomize      (-0.558, 0.948, -0.413)
		colorDistMagn   0.38689
		colorDistFreq   0.00029258
		detailScale     8
		snowLevel       2
		tropicLatitude  0.86471
		icecapLatitude  2
		icecapHeight    0.86095
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13853
		heightTempGrad  0.625
		beachWidth      0.00054589
		tropicWidth     0.07
		mainFreq        0.60063
		venusFreq       0.6277
		venusMagn       0.74246
		mareDensity     0
		terraceProb     0.55712
		erosion         0
		montesMagn      0.36137
		montesFreq      3.4733
		montesSpiky     0.96942
		montesFraction  0.5488
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0012459
		hillsFraction   0.64667
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24605
		craterFreq      0.21566
		craterDensity   0.92338
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49079
		volcanoTemp     1056.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7439
		BumpOffset      0.87197
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.041902
		GasToDust   0.25
		Particles   1826
		GasBright   0.0054131
		DustBright  0.043545
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          132.138359
		SemiMajorAxis   29.4308718
		Eccentricity    0.927815132
		Inclination     -170.774744
		AscendingNode   134.484729
		ArgOfPericenter -121.130497
		MeanAnomaly     -175.13015
	}
}

Comet	"C73"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.9773e-08
	Radius          14.556
	InertiaMoment   0.39907
	RotationPeriod  71.079
	RotationEpoch   0
	Obliquity       136.96
	EqAscendNode    170.59

	AbsMagn         6.8326
	SlopeParam      4.9017
	AlbedoBond      0.022737
	AlbedoGeom      0.027284
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.747 0.743 0.741)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.38044
		Randomize      (-0.404, 0.650, -0.866)
		colorDistMagn   0.85643
		colorDistFreq   0.1118
		detailScale     64
		snowLevel       2
		tropicLatitude  0.93266
		icecapLatitude  2
		icecapHeight    0.46662
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20486
		heightTempGrad  0.625
		beachWidth      0.00096358
		tropicWidth     0.07
		mainFreq        0.63738
		venusFreq       0.58513
		venusMagn       0.56881
		mareDensity     0
		terraceProb     0.32379
		erosion         0
		montesMagn      0.46788
		montesFreq      2.3867
		montesSpiky     0.98422
		montesFraction  0.7025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.61408
		hillsFraction   0.57415
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22441
		craterFreq      0.17501
		craterDensity   0.85415
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49784
		volcanoTemp     1324.6
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
		MaxLength   0.091289
		GasToDust   0.25
		Particles   2824
		GasBright   0.0064096
		DustBright  0.0366
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          137.08446
		SemiMajorAxis   30.1607871
		Eccentricity    0.940821946
		Inclination     -108.835546
		AscendingNode   157.481298
		ArgOfPericenter 161.917205
		MeanAnomaly     -120.112713
	}
}

Comet	"C74"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.5202e-10
	Radius          4.668
	InertiaMoment   0.39688
	RotationPeriod  45.795
	RotationEpoch   0
	Obliquity       354.98
	EqAscendNode    213.1

	AbsMagn         1.3197
	SlopeParam      5.5855
	AlbedoBond      0.041093
	AlbedoGeom      0.049311
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.695 0.692 0.688)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98605
		Randomize      (-0.373, 0.591, -0.557)
		colorDistMagn   0.95397
		colorDistFreq   0.0083551
		detailScale     16
		snowLevel       2
		tropicLatitude  0.47422
		icecapLatitude  2
		icecapHeight    0.56576
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45813
		heightTempGrad  0.625
		beachWidth      0.0011071
		tropicWidth     0.07
		mainFreq        0.4817
		venusFreq       0.57629
		venusMagn       0.59501
		mareDensity     0
		terraceProb     0.38624
		erosion         0
		montesMagn      0.3271
		montesFreq      2.5157
		montesSpiky     0.93218
		montesFraction  0.52214
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.064385
		hillsFraction   0.55766
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21818
		craterFreq      0.21511
		craterDensity   0.75535
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5624
		volcanoTemp     1058.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.798
		BumpOffset      5.3992
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.072952
		GasToDust   0.25
		Particles   2453
		GasBright   0.006554
		DustBright  0.035265
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          137.181785
		SemiMajorAxis   30.1750609
		Eccentricity    0.944150772
		Inclination     151.071527
		AscendingNode   -101.637309
		ArgOfPericenter -76.1708995
		MeanAnomaly     118.424242
	}
}

Comet	"C3"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.6512e-07
	Radius          34.574
	InertiaMoment   0.39784
	Oblateness      0.0012517
	RotationPeriod  34.353
	RotationEpoch   0
	Obliquity       355.63
	EqAscendNode    74.708

	AbsMagn         4.7618
	SlopeParam      3.4969
	AlbedoBond      0.052719
	AlbedoGeom      0.063263
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.832 0.778 0.734)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98786
		Randomize      (-0.558, 0.815, -0.522)
		colorDistMagn   0.15225
		colorDistFreq   0.19639
		detailScale     128
		snowLevel       2
		tropicLatitude  0.16251
		icecapLatitude  2
		icecapHeight    0.61728
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47624
		heightTempGrad  0.625
		beachWidth      0.00081592
		tropicWidth     0.07
		mainFreq        0.57977
		venusFreq       0.68937
		venusMagn       0.73976
		mareDensity     0
		terraceProb     0.20373
		erosion         0
		montesMagn      0.41615
		montesFreq      2.5098
		montesSpiky     0.88889
		montesFraction  0.68362
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.5473
		hillsFraction   0.60182
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25979
		craterFreq      0.25527
		craterDensity   0.80936
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52633
		volcanoTemp     1172
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
		GasBright   0.0051178
		DustBright  0.041177
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          138.050674
		SemiMajorAxis   30.302343
		Eccentricity    0.944844427
		Inclination     13.6010116
		AscendingNode   -11.1721636
		ArgOfPericenter -100.690898
		MeanAnomaly     -111.406385
	}
}

Comet	"C124"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.3283e-15
	Radius          0.059177
	InertiaMoment   0.39987
	RotationPeriod  72.506
	RotationEpoch   0
	Obliquity       95.925
	EqAscendNode    178.73

	AbsMagn         0.56097
	SlopeParam      4.0023
	AlbedoBond      0.043726
	AlbedoGeom      0.052472
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.497 0.493 0.487)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.26646
		Randomize      (-0.835, -0.384, 0.912)
		colorDistMagn   0.56881
		colorDistFreq   1.7347e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.91089
		icecapLatitude  2
		icecapHeight    0.51552
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32143
		heightTempGrad  0.625
		beachWidth      0.001084
		tropicWidth     0.07
		mainFreq        0.40213
		venusFreq       0.51588
		venusMagn       0.53742
		mareDensity     0
		terraceProb     0.24522
		erosion         0
		montesMagn      0.30598
		montesFreq      4.089
		montesSpiky     0.9541
		montesFraction  0.4602
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.8085e-06
		hillsFraction   0.44346
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2167
		craterFreq      0.16455
		craterDensity   0.85163
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49404
		volcanoTemp     1138.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.13253
		BumpOffset      0.066266
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0025257
		GasToDust   0.25
		Particles   1030
		GasBright   0.00092335
		DustBright  0.021407
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          138.7354
		SemiMajorAxis   30.4024592
		Eccentricity    0.92839084
		Inclination     -91.3011938
		AscendingNode   -114.665486
		ArgOfPericenter -123.894183
		MeanAnomaly     39.6348274
	}
}

Comet	"C42"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.2903e-08
	Radius          18.843
	InertiaMoment   0.39967
	RotationPeriod  83.375
	RotationEpoch   0
	Obliquity       218.37
	EqAscendNode    292.7

	AbsMagn         13.934
	SlopeParam      4.3271
	AlbedoBond      0.039457
	AlbedoGeom      0.047349
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.759 0.756 0.752)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60658
		Randomize      (0.642, 0.495, -0.456)
		colorDistMagn   0.49787
		colorDistFreq   0.25833
		detailScale     64
		snowLevel       2
		tropicLatitude  0.99942
		icecapLatitude  2
		icecapHeight    0.7183
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.35362
		heightTempGrad  0.625
		beachWidth      0.0016139
		tropicWidth     0.07
		mainFreq        0.59216
		venusFreq       0.5888
		venusMagn       0.74137
		mareDensity     0
		terraceProb     0.273
		erosion         0
		montesMagn      0.63455
		montesFreq      2.8237
		montesSpiky     0.94208
		montesFraction  0.50116
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.68817
		hillsFraction   0.69387
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25088
		craterFreq      0.25085
		craterDensity   0.82708
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53163
		volcanoTemp     1182.7
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
		MaxLength   0.095452
		GasToDust   0.25
		Particles   2908
		GasBright   0.016378
		DustBright  0.023514
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          138.802703
		SemiMajorAxis   30.412291
		Eccentricity    0.951052367
		Inclination     115.428692
		AscendingNode   -131.402243
		ArgOfPericenter 85.7673946
		MeanAnomaly     97.5313678
	}
}

Comet	"C177"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.437e-14
	Radius          0.15608
	InertiaMoment   0.39749
	Oblateness      0.0029788
	RotationPeriod  22.263
	RotationEpoch   0
	Obliquity       130.93
	EqAscendNode    271.9

	AbsMagn         16.917
	SlopeParam      4.2569
	AlbedoBond      0.033376
	AlbedoGeom      0.040051
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.539 0.537 0.533)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36369
		Randomize      (0.796, 0.464, -0.692)
		colorDistMagn   0.45648
		colorDistFreq   1.9423e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.015288
		icecapLatitude  2
		icecapHeight    0.74032
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14454
		heightTempGrad  0.625
		beachWidth      0.0011915
		tropicWidth     0.07
		mainFreq        0.67979
		venusFreq       0.60991
		venusMagn       0.57343
		mareDensity     0
		terraceProb     0.26693
		erosion         0
		montesMagn      0.68236
		montesFreq      3.9666
		montesSpiky     0.95654
		montesFraction  0.36869
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7422e-05
		hillsFraction   0.71531
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26201
		craterFreq      0.2373
		craterDensity   0.97857
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46543
		volcanoTemp     1120
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.35474
		BumpOffset      0.17737
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.018162
		GasToDust   0.25
		Particles   1346
		GasBright   0.017635
		DustBright  0.021636
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          138.847571
		SemiMajorAxis   30.4188445
		Eccentricity    0.940837405
		Inclination     -49.0764309
		AscendingNode   178.84061
		ArgOfPericenter 32.1094811
		MeanAnomaly     78.9907331
	}
}

Comet	"C149"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.7622e-07
	Radius          42.025
	InertiaMoment   0.39966
	RotationPeriod  42.701
	RotationEpoch   0
	Obliquity       146.4
	EqAscendNode    161.55

	AbsMagn         8.1974
	SlopeParam      5.5332
	AlbedoBond      0.031471
	AlbedoGeom      0.037765
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.794 0.792 0.790)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.40666
		Randomize      (-0.065, 0.129, 0.646)
		colorDistMagn   0.35905
		colorDistFreq   0.965
		detailScale     128
		snowLevel       2
		tropicLatitude  0.85595
		icecapLatitude  2
		icecapHeight    0.48611
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25309
		heightTempGrad  0.625
		beachWidth      0.0010725
		tropicWidth     0.07
		mainFreq        0.56291
		venusFreq       0.58869
		venusMagn       0.48041
		mareDensity     0
		terraceProb     0.3814
		erosion         0
		montesMagn      0.50157
		montesFreq      2.8666
		montesSpiky     0.8775
		montesFraction  0.68697
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.2942
		hillsFraction   0.85187
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21591
		craterFreq      0.20811
		craterDensity   1.0426
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53092
		volcanoTemp     1078.9
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
		GasBright   0.007614
		DustBright  0.024971
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          139.90643
		SemiMajorAxis   30.573299
		Eccentricity    0.940836207
		Inclination     -28.2429397
		AscendingNode   -34.1598342
		ArgOfPericenter 27.0269646
		MeanAnomaly     103.178257
	}
}

Comet	"C20"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.0777e-09
	Radius          5.5192
	InertiaMoment   0.39825
	Oblateness      0.0012251
	RotationPeriod  34.763
	RotationEpoch   0
	Obliquity       101.95
	EqAscendNode    77.422

	AbsMagn         7.2129
	SlopeParam      4.6283
	AlbedoBond      0.038327
	AlbedoGeom      0.045993
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.784 0.676 0.615)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.2832
		Randomize      (-0.035, -0.197, 0.738)
		colorDistMagn   0.97117
		colorDistFreq   0.0038244
		detailScale     16
		snowLevel       2
		tropicLatitude  0.79009
		icecapLatitude  2
		icecapHeight    0.62947
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38176
		heightTempGrad  0.625
		beachWidth      0.00055607
		tropicWidth     0.07
		mainFreq        0.3627
		venusFreq       0.65199
		venusMagn       0.53054
		mareDensity     0
		terraceProb     0.29939
		erosion         0
		montesMagn      0.4773
		montesFreq      2.4172
		montesSpiky     0.98199
		montesFraction  0.83307
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.078978
		hillsFraction   0.683
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2387
		craterFreq      0.21999
		craterDensity   0.99575
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52489
		volcanoTemp     1043.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.19
		BumpOffset      7.0952
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.075652
		GasToDust   0.25
		Particles   2508
		GasBright   0.0062908
		DustBright  0.019777
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          140.396222
		SemiMajorAxis   30.6446126
		Eccentricity    0.893255331
		Inclination     -53.8690278
		AscendingNode   21.5121508
		ArgOfPericenter -162.2023
		MeanAnomaly     -137.975027
	}
}

Comet	"C91"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.6505e-12
	Radius          0.74501
	InertiaMoment   0.39755
	RotationPeriod  46.178
	RotationEpoch   0
	Obliquity       101.3
	EqAscendNode    215.82

	AbsMagn         5.431
	SlopeParam      2.0702
	AlbedoBond      0.025867
	AlbedoGeom      0.031041
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.613 0.607 0.602)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.28139
		Randomize      (0.150, -0.420, 0.703)
		colorDistMagn   0.85119
		colorDistFreq   0.00020537
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99029
		icecapLatitude  2
		icecapHeight    0.57803
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36365
		heightTempGrad  0.625
		beachWidth      0.00084727
		tropicWidth     0.07
		mainFreq        0.68639
		venusFreq       0.55887
		venusMagn       0.67697
		mareDensity     0
		terraceProb     0.10402
		erosion         0
		montesMagn      0.43295
		montesFreq      2.4244
		montesSpiky     0.82948
		montesFraction  0.61013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0011522
		hillsFraction   0.64283
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25487
		craterFreq      0.17168
		craterDensity   0.95903
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55973
		volcanoTemp     1029.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7464
		BumpOffset      0.87318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.043364
		GasToDust   0.25
		Particles   1855
		GasBright   0.0062079
		DustBright  0.015385
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          141.077631
		SemiMajorAxis   30.7436877
		Eccentricity    0.913438041
		Inclination     176.669157
		AscendingNode   -6.75731465
		ArgOfPericenter -154.18699
		MeanAnomaly     -55.3674029
	}
}

Comet	"C30"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.1145e-13
	Radius          0.4004
	InertiaMoment   0.39711
	RotationPeriod  39.978
	RotationEpoch   0
	Obliquity       122.14
	EqAscendNode    142.55

	AbsMagn         -0.069546
	SlopeParam      6.5945
	AlbedoBond      0.038843
	AlbedoGeom      0.046611
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.583 0.580 0.575)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33929
		Randomize      (0.273, -0.791, -0.169)
		colorDistMagn   0.13838
		colorDistFreq   9.9734e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.77282
		icecapLatitude  2
		icecapHeight    0.83032
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11442
		heightTempGrad  0.625
		beachWidth      0.00049145
		tropicWidth     0.07
		mainFreq        0.43768
		venusFreq       0.55729
		venusMagn       0.77148
		mareDensity     0
		terraceProb     0.48105
		erosion         0
		montesMagn      0.28729
		montesFreq      3.2418
		montesSpiky     0.82875
		montesFraction  0.55477
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00048357
		hillsFraction   0.53088
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24883
		craterFreq      0.25218
		craterDensity   0.84541
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54252
		volcanoTemp     979.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.8508
		BumpOffset      0.4254
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.033352
		GasToDust   0.25
		Particles   1653
		GasBright   0.0045096
		DustBright  0.0096605
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          141.67474
		SemiMajorAxis   30.8303747
		Eccentricity    0.943433854
		Inclination     -136.247608
		AscendingNode   -64.6914123
		ArgOfPericenter -68.1359817
		MeanAnomaly     80.0771944
	}
}

Comet	"C168"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.1049e-12
	Radius          0.68992
	InertiaMoment   0.3998
	RotationPeriod  80.372
	RotationEpoch   0
	Obliquity       328.76
	EqAscendNode    249.28

	AbsMagn         1.6811
	SlopeParam      3.4088
	AlbedoBond      0.046276
	AlbedoGeom      0.055531
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.608 0.605 0.600)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91322
		Randomize      (0.519, 0.999, 0.524)
		colorDistMagn   0.45929
		colorDistFreq   7.1975e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.44321
		icecapLatitude  2
		icecapHeight    0.67677
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26514
		heightTempGrad  0.625
		beachWidth      0.0013997
		tropicWidth     0.07
		mainFreq        0.44949
		venusFreq       0.55178
		venusMagn       0.65992
		mareDensity     0
		terraceProb     0.19676
		erosion         0
		montesMagn      0.33684
		montesFreq      2.9573
		montesSpiky     0.80972
		montesFraction  0.42244
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.001707
		hillsFraction   0.49299
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24443
		craterFreq      0.23815
		craterDensity   0.76939
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50554
		volcanoTemp     1117.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.636
		BumpOffset      0.81798
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.042125
		GasToDust   0.25
		Particles   1830
		GasBright   0.018983
		DustBright  0.030996
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          142.529466
		SemiMajorAxis   30.9542506
		Eccentricity    0.919494798
		Inclination     122.610601
		AscendingNode   175.692318
		ArgOfPericenter 140.057579
		MeanAnomaly     -93.4398199
	}
}

Comet	"C141"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.3996e-18
	Radius          0.0094444
	InertiaMoment   0.39611
	RotationPeriod  72.99
	RotationEpoch   0
	Obliquity       202.25
	EqAscendNode    181.44

	AbsMagn         5.2306
	SlopeParam      5.184
	AlbedoBond      0.030868
	AlbedoGeom      0.037042
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.413 0.408 0.403)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.5618
		Randomize      (-0.312, 0.605, 0.171)
		colorDistMagn   0.46767
		colorDistFreq   4.3209e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96129
		icecapLatitude  2
		icecapHeight    0.52953
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22696
		heightTempGrad  0.625
		beachWidth      0.00082417
		tropicWidth     0.07
		mainFreq        0.59172
		venusFreq       0.6753
		venusMagn       0.63971
		mareDensity     0
		terraceProb     0.34934
		erosion         0
		montesMagn      0.42792
		montesFreq      3.7935
		montesSpiky     0.8817
		montesFraction  0.55013
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.9809e-07
		hillsFraction   0.57694
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25386
		craterFreq      0.24072
		craterDensity   1.0784
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49277
		volcanoTemp     1310
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.02149
		BumpOffset      0.010745
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.007247
		DustBright  0.034856
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          143.171619
		SemiMajorAxis   31.0471551
		Eccentricity    0.923716425
		Inclination     91.4657411
		AscendingNode   -142.236992
		ArgOfPericenter -64.449326
		MeanAnomaly     50.6937861
	}
}

Comet	"C100"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.0687e-14
	Radius          0.16854
	InertiaMoment   0.39868
	RotationPeriod  78.142
	RotationEpoch   0
	Obliquity       263.47
	EqAscendNode    238.43

	AbsMagn         4.6038
	SlopeParam      3.1458
	AlbedoBond      0.042441
	AlbedoGeom      0.05093
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.544 0.540 0.535)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73186
		Randomize      (0.427, -0.956, -0.513)
		colorDistMagn   0.84858
		colorDistFreq   7.3571e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.54515
		icecapLatitude  2
		icecapHeight    0.62515
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24305
		heightTempGrad  0.625
		beachWidth      0.0012391
		tropicWidth     0.07
		mainFreq        0.48937
		venusFreq       0.61482
		venusMagn       0.59597
		mareDensity     0
		terraceProb     0.17647
		erosion         0
		montesMagn      0.41216
		montesFreq      3.1689
		montesSpiky     0.96078
		montesFraction  0.56942
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.6033e-05
		hillsFraction   0.48813
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20703
		craterFreq      0.16989
		craterDensity   0.88325
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51066
		volcanoTemp     1032.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.37781
		BumpOffset      0.1889
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.019401
		GasToDust   0.25
		Particles   1371
		GasBright   0.0038829
		DustBright  0.0070019
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          143.804114
		SemiMajorAxis   31.1385268
		Eccentricity    0.874646013
		Inclination     -114.140812
		AscendingNode   -150.854363
		ArgOfPericenter -53.2687955
		MeanAnomaly     123.143133
	}
}

Comet	"C61"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.8963e-13
	Radius          0.30928
	InertiaMoment   0.39981
	Oblateness      0.0015952
	RotationPeriod  30.555
	RotationEpoch   0
	Obliquity       40.731
	EqAscendNode    20.438

	AbsMagn         7.6832
	SlopeParam      2.0947
	AlbedoBond      0.018966
	AlbedoGeom      0.022759
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.624 0.552 0.512)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.11314
		Randomize      (-0.773, -0.636, -0.578)
		colorDistMagn   0.58683
		colorDistFreq   4.1299e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.68347
		icecapLatitude  2
		icecapHeight    0.53431
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36567
		heightTempGrad  0.625
		beachWidth      0.00044113
		tropicWidth     0.07
		mainFreq        0.47785
		venusFreq       0.55194
		venusMagn       0.59453
		mareDensity     0
		terraceProb     0.10544
		erosion         0
		montesMagn      0.48892
		montesFreq      2.9162
		montesSpiky     0.91565
		montesFraction  0.78813
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00023733
		hillsFraction   0.75961
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22182
		craterFreq      0.17706
		craterDensity   0.87021
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50613
		volcanoTemp     1021.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.82753
		BumpOffset      0.41376
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.029189
		GasToDust   0.25
		Particles   1569
		GasBright   0.00098047
		DustBright  0.016306
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          144.072018
		SemiMajorAxis   31.1771884
		Eccentricity    0.934142051
		Inclination     175.829428
		AscendingNode   122.938502
		ArgOfPericenter -144.380726
		MeanAnomaly     -43.587454
	}
}

Comet	"C75"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.15e-11
	Radius          1.4969
	InertiaMoment   0.39894
	Oblateness      0.0040243
	RotationPeriod  19.206
	RotationEpoch   0
	Obliquity       213
	EqAscendNode    255.61

	AbsMagn         10.122
	SlopeParam      6.5417
	AlbedoBond      0.023173
	AlbedoGeom      0.027808
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.643 0.638 0.636)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.59166
		Randomize      (-0.342, 0.531, -0.247)
		colorDistMagn   0.11426
		colorDistFreq   0.00026906
		detailScale     8
		snowLevel       2
		tropicLatitude  0.62852
		icecapLatitude  2
		icecapHeight    0.64885
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3114
		heightTempGrad  0.625
		beachWidth      0.00035066
		tropicWidth     0.07
		mainFreq        0.29009
		venusFreq       0.56663
		venusMagn       0.61735
		mareDensity     0
		terraceProb     0.47603
		erosion         0
		montesMagn      0.54837
		montesFreq      2.6185
		montesSpiky     0.84477
		montesFraction  0.30691
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0067713
		hillsFraction   0.53967
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20846
		craterFreq      0.24733
		craterDensity   0.98487
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47452
		volcanoTemp     1191.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.7403
		BumpOffset      1.8702
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.054614
		GasToDust   0.25
		Particles   2083
		GasBright   0.0066801
		DustBright  0.033949
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          144.892336
		SemiMajorAxis   31.295421
		Eccentricity    0.901149742
		Inclination     36.1035892
		AscendingNode   -108.187758
		ArgOfPericenter -142.20383
		MeanAnomaly     54.658372
	}
}

Comet	"C134"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.2738e-07
	Radius          27.081
	InertiaMoment   0.39927
	RotationPeriod  79.242
	RotationEpoch   0
	Obliquity       116.11
	EqAscendNode    243.86

	AbsMagn         9.2611
	SlopeParam      5.5435
	AlbedoBond      0.044279
	AlbedoGeom      0.053135
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.773 0.772 0.771)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.32254
		Randomize      (-0.527, -0.978, 0.005)
		colorDistMagn   0.6573
		colorDistFreq   0.1561
		detailScale     128
		snowLevel       2
		tropicLatitude  0.81273
		icecapLatitude  2
		icecapHeight    0.6501
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45409
		heightTempGrad  0.625
		beachWidth      0.0016194
		tropicWidth     0.07
		mainFreq        0.46969
		venusFreq       0.58629
		venusMagn       0.77746
		mareDensity     0
		terraceProb     0.38236
		erosion         0
		montesMagn      0.52756
		montesFreq      3.0617
		montesSpiky     0.98439
		montesFraction  0.79086
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4774
		hillsFraction   0.67754
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23057
		craterFreq      0.20954
		craterDensity   0.96847
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50809
		volcanoTemp     1074.8
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
		GasBright   0.0012339
		DustBright  0.0091981
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          146.717325
		SemiMajorAxis   31.5576597
		Eccentricity    0.924392372
		Inclination     -19.5737769
		AscendingNode   123.929811
		ArgOfPericenter 33.5290017
		MeanAnomaly     -133.541847
	}
}

Comet	"C170"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.2888e-15
	Radius          0.070945
	InertiaMoment   0.39968
	Oblateness      0.0019114
	RotationPeriod  27.906
	RotationEpoch   0
	Obliquity       44.797
	EqAscendNode    334.31

	AbsMagn         6.7152
	SlopeParam      4.5478
	AlbedoBond      0.046401
	AlbedoGeom      0.055681
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.505 0.500 0.495)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.12444
		Randomize      (0.581, 0.880, -0.857)
		colorDistMagn   0.64726
		colorDistFreq   2.8509e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96101
		icecapLatitude  2
		icecapHeight    0.47839
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37167
		heightTempGrad  0.625
		beachWidth      0.0013868
		tropicWidth     0.07
		mainFreq        0.5392
		venusFreq       0.51039
		venusMagn       0.69952
		mareDensity     0
		terraceProb     0.29228
		erosion         0
		montesMagn      0.46496
		montesFreq      3.0994
		montesSpiky     0.897
		montesFraction  0.58417
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.7478e-06
		hillsFraction   0.4136
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23633
		craterFreq      0.20608
		craterDensity   0.91877
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48294
		volcanoTemp     1084.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.16365
		BumpOffset      0.081826
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.00545
		GasToDust   0.25
		Particles   1089
		GasBright   0.018812
		DustBright  0.028788
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          149.02643
		SemiMajorAxis   31.8879098
		Eccentricity    0.925554489
		Inclination     -127.894744
		AscendingNode   -73.3495844
		ArgOfPericenter 68.0471769
		MeanAnomaly     -127.843669
	}
}

Comet	"C114"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.4793e-12
	Radius          0.81573
	InertiaMoment   0.39734
	RotationPeriod  66.537
	RotationEpoch   0
	Obliquity       75.735
	EqAscendNode    113.6

	AbsMagn         7.3111
	SlopeParam      2.4626
	AlbedoBond      0.043185
	AlbedoGeom      0.051822
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.719 0.588 0.505)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.21038
		Randomize      (0.858, 0.211, -0.182)
		colorDistMagn   0.47598
		colorDistFreq   0.00047401
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99368
		icecapLatitude  2
		icecapHeight    0.77041
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18877
		heightTempGrad  0.625
		beachWidth      0.0011486
		tropicWidth     0.07
		mainFreq        0.31277
		venusFreq       0.6263
		venusMagn       0.61862
		mareDensity     0
		terraceProb     0.1282
		erosion         0
		montesMagn      0.47973
		montesFreq      2.901
		montesSpiky     0.91875
		montesFraction  0.67788
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.001816
		hillsFraction   0.63901
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26866
		craterFreq      0.24337
		craterDensity   1.0048
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47949
		volcanoTemp     1002.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.7063
		BumpOffset      0.85313
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.044826
		GasToDust   0.25
		Particles   1885
		GasBright   0.015896
		DustBright  0.018332
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          149.168892
		SemiMajorAxis   31.9082288
		Eccentricity    0.951819452
		Inclination     -65.3488026
		AscendingNode   89.3831184
		ArgOfPericenter 80.1615161
		MeanAnomaly     172.568002
	}
}

Comet	"C109"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.5529e-16
	Radius          0.038128
	InertiaMoment   0.39949
	Oblateness      0.0036286
	RotationPeriod  20.247
	RotationEpoch   0
	Obliquity       65.641
	EqAscendNode    261.04

	AbsMagn         3.597
	SlopeParam      4.01
	AlbedoBond      0.028019
	AlbedoGeom      0.033622
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.475 0.472 0.469)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.18234
		Randomize      (0.704, 0.509, 0.271)
		colorDistMagn   0.84597
		colorDistFreq   1.2818e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.92158
		icecapLatitude  2
		icecapHeight    0.6754
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12244
		heightTempGrad  0.625
		beachWidth      0.00073095
		tropicWidth     0.07
		mainFreq        0.75404
		venusFreq       0.50419
		venusMagn       0.82829
		mareDensity     0
		terraceProb     0.24587
		erosion         0
		montesMagn      0.38664
		montesFreq      2.459
		montesSpiky     0.89671
		montesFraction  0.5295
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.7326e-06
		hillsFraction   0.7124
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.231
		craterFreq      0.168
		craterDensity   0.79396
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4716
		volcanoTemp     1134.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.1014
		BumpOffset      0.050701
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.017114
		DustBright  0.023063
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          150.255027
		SemiMajorAxis   32.0629291
		Eccentricity    0.921789523
		Inclination     117.914371
		AscendingNode   -136.228898
		ArgOfPericenter 119.130146
		MeanAnomaly     -8.17041283
	}
}

Comet	"C144"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.863e-11
	Radius          1.9649
	InertiaMoment   0.39859
	RotationPeriod  87.304
	RotationEpoch   0
	Obliquity       136.3
	EqAscendNode    308.98

	AbsMagn         4.959
	SlopeParam      2.4417
	AlbedoBond      0.044846
	AlbedoGeom      0.053815
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.656 0.652 0.648)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.37862
		Randomize      (-0.219, 0.427, -0.901)
		colorDistMagn   0.74445
		colorDistFreq   0.0025176
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96649
		icecapLatitude  2
		icecapHeight    0.32473
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18675
		heightTempGrad  0.625
		beachWidth      0.0012548
		tropicWidth     0.07
		mainFreq        0.53156
		venusFreq       0.63181
		venusMagn       0.69868
		mareDensity     0
		terraceProb     0.12685
		erosion         0
		montesMagn      0.4211
		montesFreq      2.3944
		montesSpiky     0.83823
		montesFraction  0.53684
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.008882
		hillsFraction   0.52321
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24076
		craterFreq      0.24044
		craterDensity   0.82107
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52283
		volcanoTemp     1210.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.6626
		BumpOffset      2.3313
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.059
		GasToDust   0.25
		Particles   2171
		GasBright   0.0075219
		DustBright  0.031012
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          152.039206
		SemiMajorAxis   32.3162469
		Eccentricity    0.960688357
		Inclination     -32.349398
		AscendingNode   -16.6845508
		ArgOfPericenter 73.13946
		MeanAnomaly     -95.292022
	}
}

Comet	"C40"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.5708e-16
	Radius          0.029046
	InertiaMoment   0.39978
	RotationPeriod  45.028
	RotationEpoch   0
	Obliquity       142.33
	EqAscendNode    207.67

	AbsMagn         9.16
	SlopeParam      3.1795
	AlbedoBond      0.039355
	AlbedoGeom      0.047226
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.462 0.458 0.457)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39537
		Randomize      (0.581, 0.614, 0.925)
		colorDistMagn   0.2794
		colorDistFreq   3.4507e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.77384
		icecapLatitude  2
		icecapHeight    0.5403
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24708
		heightTempGrad  0.625
		beachWidth      0.0013268
		tropicWidth     0.07
		mainFreq        0.50119
		venusFreq       0.6053
		venusMagn       0.69535
		mareDensity     0
		terraceProb     0.17902
		erosion         0
		montesMagn      0.5251
		montesFreq      2.6619
		montesSpiky     0.89984
		montesFraction  0.29084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5659e-06
		hillsFraction   0.72633
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26227
		craterFreq      0.18041
		craterDensity   0.96173
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56833
		volcanoTemp     1115.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.065256
		BumpOffset      0.032628
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.016705
		DustBright  0.025567
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          152.135869
		SemiMajorAxis   32.3299426
		Eccentricity    0.915943436
		Inclination     -26.7489161
		AscendingNode   -74.5043538
		ArgOfPericenter -34.5474902
		MeanAnomaly     -116.184137
	}
}

Comet	"C112"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.1998e-09
	Radius          7.9324
	InertiaMoment   0.3976
	Oblateness      0.0014572
	RotationPeriod  31.834
	RotationEpoch   0
	Obliquity       359.7
	EqAscendNode    28.58

	AbsMagn         3.1922
	SlopeParam      5.9744
	AlbedoBond      0.043077
	AlbedoGeom      0.051693
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.799 0.719 0.633)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.99916
		Randomize      (0.796, 0.330, -0.801)
		colorDistMagn   0.25022
		colorDistFreq   0.024846
		detailScale     32
		snowLevel       2
		tropicLatitude  0.010771
		icecapLatitude  2
		icecapHeight    0.57252
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48224
		heightTempGrad  0.625
		beachWidth      0.00056157
		tropicWidth     0.07
		mainFreq        0.65236
		venusFreq       0.64798
		venusMagn       0.57056
		mareDensity     0
		terraceProb     0.42248
		erosion         0
		montesMagn      0.37629
		montesFreq      2.7503
		montesSpiky     0.86297
		montesFraction  0.5161
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.16738
		hillsFraction   0.66709
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21266
		craterFreq      0.16734
		craterDensity   0.86784
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50232
		volcanoTemp     935.37
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      17.775
		BumpOffset      8.8873
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.081501
		GasToDust   0.25
		Particles   2626
		GasBright   0.016438
		DustBright  0.020169
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          152.862037
		SemiMajorAxis   32.4327382
		Eccentricity    0.918486064
		Inclination     -0.314735016
		AscendingNode   0.682205446
		ArgOfPericenter -166.995419
		MeanAnomaly     -85.3431831
	}
}

Comet	"C25"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.2016e-17
	Radius          0.018715
	InertiaMoment   0.3994
	RotationPeriod  82.76
	RotationEpoch   0
	Obliquity       112.05
	EqAscendNode    289.99

	AbsMagn         10.309
	SlopeParam      3.1878
	AlbedoBond      0.055812
	AlbedoGeom      0.066974
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.445 0.441 0.434)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.31125
		Randomize      (0.119, -0.494, 0.284)
		colorDistMagn   0.59706
		colorDistFreq   2.5977e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.80592
		icecapLatitude  2
		icecapHeight    0.70192
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44809
		heightTempGrad  0.625
		beachWidth      0.00097376
		tropicWidth     0.07
		mainFreq        0.4026
		venusFreq       0.60296
		venusMagn       0.65564
		mareDensity     0
		terraceProb     0.17966
		erosion         0
		montesMagn      0.55285
		montesFreq      2.8782
		montesSpiky     0.99648
		montesFraction  0.40223
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.6706e-07
		hillsFraction   0.61228
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21092
		craterFreq      0.18264
		craterDensity   0.91553
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53319
		volcanoTemp     1011.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.050327
		BumpOffset      0.025163
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.005629
		DustBright  0.01449
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          153.739056
		SemiMajorAxis   32.5566712
		Eccentricity    0.925454972
		Inclination     164.440037
		AscendingNode   157.91758
		ArgOfPericenter -114.531786
		MeanAnomaly     -56.3620069
	}
}

Comet	"C82"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.2893e-10
	Radius          3.2932
	InertiaMoment   0.39983
	Oblateness      0.0098018
	RotationPeriod  12.327
	RotationEpoch   0
	Obliquity       299.13
	EqAscendNode    193.2

	AbsMagn         6.1602
	SlopeParam      5.9996
	AlbedoBond      0.041504
	AlbedoGeom      0.049805
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.678 0.675 0.673)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83091
		Randomize      (-0.127, 0.115, -0.082)
		colorDistMagn   0.85381
		colorDistFreq   0.004919
		detailScale     16
		snowLevel       2
		tropicLatitude  0.99864
		icecapLatitude  2
		icecapHeight    0.52819
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48426
		heightTempGrad  0.625
		beachWidth      0.0013554
		tropicWidth     0.07
		mainFreq        0.45392
		venusFreq       0.64106
		venusMagn       0.77442
		mareDensity     0
		terraceProb     0.42485
		erosion         0
		montesMagn      0.45116
		montesFreq      3.1493
		montesSpiky     0.92959
		montesFraction  0.65353
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.018413
		hillsFraction   0.804
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23973
		craterFreq      0.17339
		craterDensity   0.71787
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45487
		volcanoTemp     1027.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.0716
		BumpOffset      4.0358
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.067326
		GasToDust   0.25
		Particles   2339
		GasBright   0.0070501
		DustBright  0.025251
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          155.632401
		SemiMajorAxis   32.8234227
		Eccentricity    0.948353122
		Inclination     -29.7082207
		AscendingNode   -31.1192736
		ArgOfPericenter -123.971509
		MeanAnomaly     -151.548901
	}
}

Comet	"C158"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.5136e-09
	Radius          9.5098
	InertiaMoment   0.39715
	RotationPeriod  73.479
	RotationEpoch   0
	Obliquity       308.57
	EqAscendNode    184.16

	AbsMagn         7.5706
	SlopeParam      7.2087
	AlbedoBond      0.045666
	AlbedoGeom      0.054799
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.728 0.723 0.720)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.85714
		Randomize      (0.212, -0.406, -0.570)
		colorDistMagn   0.35589
		colorDistFreq   0.042809
		detailScale     32
		snowLevel       2
		tropicLatitude  0.88977
		icecapLatitude  2
		icecapHeight    0.54287
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.13248
		heightTempGrad  0.625
		beachWidth      0.00056431
		tropicWidth     0.07
		mainFreq        0.37771
		venusFreq       0.64609
		venusMagn       0.721
		mareDensity     0
		terraceProb     0.53978
		erosion         0
		montesMagn      0.48614
		montesFreq      3.6471
		montesSpiky     0.97819
		montesFraction  0.64009
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.24384
		hillsFraction   0.65931
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23447
		craterFreq      0.20725
		craterDensity   0.93425
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49149
		volcanoTemp     1081.4
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
		MaxLength   0.084425
		GasToDust   0.25
		Particles   2685
		GasBright   0.0066265
		DustBright  0.015251
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          155.651763
		SemiMajorAxis   32.826145
		Eccentricity    0.955936374
		Inclination     65.7405407
		AscendingNode   178.505595
		ArgOfPericenter 30.2390765
		MeanAnomaly     23.7844936
	}
}

Comet	"C81"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.9427e-09
	Radius          10.269
	InertiaMoment   0.39851
	RotationPeriod  41.15
	RotationEpoch   0
	Obliquity       81.11
	EqAscendNode    150.69

	AbsMagn         9.6556
	SlopeParam      5.2209
	AlbedoBond      0.024319
	AlbedoGeom      0.029183
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.730 0.727 0.726)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22531
		Randomize      (-0.158, 0.175, -0.391)
		colorDistMagn   0.76203
		colorDistFreq   0.062136
		detailScale     32
		snowLevel       2
		tropicLatitude  0.87178
		icecapLatitude  2
		icecapHeight    0.3944
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.23099
		heightTempGrad  0.625
		beachWidth      0.0012119
		tropicWidth     0.07
		mainFreq        0.60494
		venusFreq       0.65394
		venusMagn       0.74301
		mareDensity     0
		terraceProb     0.35272
		erosion         0
		montesMagn      0.53712
		montesFreq      3.0768
		montesSpiky     0.98216
		montesFraction  0.23754
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.17109
		hillsFraction   0.84275
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24377
		craterFreq      0.24671
		craterDensity   0.84277
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5373
		volcanoTemp     993.48
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
		MaxLength   0.085664
		GasToDust   0.25
		Particles   2710
		GasBright   0.0070522
		DustBright  0.026439
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          157.091512
		SemiMajorAxis   33.0282579
		Eccentricity    0.939668907
		Inclination     -115.933162
		AscendingNode   118.379253
		ArgOfPericenter 30.4642463
		MeanAnomaly     64.4966013
	}
}

Comet	"C102"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.3367e-17
	Radius          0.017331
	InertiaMoment   0.39854
	Oblateness      0.002177
	RotationPeriod  26.093
	RotationEpoch   0
	Obliquity       339.51
	EqAscendNode    323.45

	AbsMagn         8.1491
	SlopeParam      4.2959
	AlbedoBond      0.042547
	AlbedoGeom      0.051056
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.440 0.435 0.432)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94308
		Randomize      (0.488, 0.925, 0.106)
		colorDistMagn   0.099114
		colorDistFreq   1.8313e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.46697
		icecapLatitude  2
		icecapHeight    0.37692
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34958
		heightTempGrad  0.625
		beachWidth      0.0012262
		tropicWidth     0.07
		mainFreq        0.57935
		venusFreq       0.5982
		venusMagn       0.63852
		mareDensity     0
		terraceProb     0.27029
		erosion         0
		montesMagn      0.50038
		montesFreq      3.3294
		montesSpiky     0.99258
		montesFraction  0.75278
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.1391e-07
		hillsFraction   0.40076
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2643
		craterFreq      0.24457
		craterDensity   1.0354
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48821
		volcanoTemp     1199.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.03636
		BumpOffset      0.01818
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.018049
		DustBright  0.030456
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          158.424857
		SemiMajorAxis   33.2148837
		Eccentricity    0.885669148
		Inclination     7.34572032
		AscendingNode   -179.907618
		ArgOfPericenter -43.4516953
		MeanAnomaly     171.923083
	}
}

Comet	"C101"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.0119e-15
	Radius          0.054046
	InertiaMoment   0.39997
	RotationPeriod  51.171
	RotationEpoch   0
	Obliquity       121.49
	EqAscendNode    280.94

	AbsMagn         12.191
	SlopeParam      3.7321
	AlbedoBond      0.027136
	AlbedoGeom      0.032563
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.492 0.489 0.483)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33747
		Randomize      (0.458, 0.985, -0.204)
		colorDistMagn   0.94548
		colorDistFreq   2.2437e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9746
		icecapLatitude  2
		icecapHeight    0.71999
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49631
		heightTempGrad  0.625
		beachWidth      0.0010826
		tropicWidth     0.07
		mainFreq        0.30557
		venusFreq       0.60642
		venusMagn       0.6182
		mareDensity     0
		terraceProb     0.22275
		erosion         0
		montesMagn      0.59687
		montesFreq      3.2459
		montesSpiky     0.90012
		montesFraction  0.38604
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.8663e-06
		hillsFraction   0.45507
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27706
		craterFreq      0.21263
		craterDensity   0.81006
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.63098
		volcanoTemp     965.67
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.13028
		BumpOffset      0.065139
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0010636
		GasToDust   0.25
		Particles   1001
		GasBright   0.01811
		DustBright  0.031585
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          158.598002
		SemiMajorAxis   33.2390801
		Eccentricity    0.907923757
		Inclination     -91.0944086
		AscendingNode   -75.4650752
		ArgOfPericenter -59.2298035
		MeanAnomaly     -163.755737
	}
}

Comet	"C164"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.0879e-18
	Radius          0.010341
	InertiaMoment   0.39506
	RotationPeriod  117.42
	RotationEpoch   0
	Obliquity       176.68
	EqAscendNode    79.234

	AbsMagn         7.1478
	SlopeParam      5.5228
	AlbedoBond      0.046029
	AlbedoGeom      0.055235
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.514 0.394 0.310)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49079
		Randomize      (0.396, -0.763, -0.714)
		colorDistMagn   0.92594
		colorDistFreq   9.395e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.5265
		icecapLatitude  2
		icecapHeight    0.69797
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.45208
		heightTempGrad  0.625
		beachWidth      0.0014255
		tropicWidth     0.07
		mainFreq        0.674
		venusFreq       0.59107
		venusMagn       0.57286
		mareDensity     0
		terraceProb     0.38045
		erosion         0
		montesMagn      0.47569
		montesFreq      2.6476
		montesSpiky     0.94248
		montesFraction  0.61152
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.1697e-07
		hillsFraction   0.57258
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26663
		craterFreq      0.20667
		craterDensity   0.78028
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56391
		volcanoTemp     1083.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.02635
		BumpOffset      0.013175
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0051445
		DustBright  0.0095939
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          161.778574
		SemiMajorAxis   33.6819988
		Eccentricity    0.917418726
		Inclination     31.0038814
		AscendingNode   100.678757
		ArgOfPericenter -127.235945
		MeanAnomaly     -45.9749731
	}
}

Comet	"C80"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.1055e-07
	Radius          32.018
	InertiaMoment   0.39995
	RotationPeriod  65.669
	RotationEpoch   0
	Obliquity       223.09
	EqAscendNode    108.18

	AbsMagn         19.699
	SlopeParam      4.596
	AlbedoBond      0.041401
	AlbedoGeom      0.049682
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.816 0.784 0.743)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.6197
		Randomize      (-0.188, 0.234, -0.700)
		colorDistMagn   0.67232
		colorDistFreq   0.75853
		detailScale     128
		snowLevel       2
		tropicLatitude  0.81317
		icecapLatitude  2
		icecapHeight    0.72802
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37773
		heightTempGrad  0.625
		beachWidth      0.0013684
		tropicWidth     0.07
		mainFreq        0.34535
		venusFreq       0.67201
		venusMagn       0.71822
		mareDensity     0
		terraceProb     0.29653
		erosion         0
		montesMagn      0.69932
		montesFreq      3.0058
		montesSpiky     0.88136
		montesFraction  0.49498
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.5598
		hillsFraction   0.92443
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24798
		craterFreq      0.21456
		craterDensity   0.90824
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48221
		volcanoTemp     1159.9
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
		GasBright   0.0070359
		DustBright  0.027645
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          163.020049
		SemiMajorAxis   33.8540944
		Eccentricity    0.916984539
		Inclination     -166.599774
		AscendingNode   35.8303337
		ArgOfPericenter 91.2150383
		MeanAnomaly     156.532536
	}
}

Comet	"C31"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.3567e-14
	Radius          0.1284
	InertiaMoment   0.39902
	Oblateness      0.013726
	RotationPeriod  10.401
	RotationEpoch   0
	Obliquity       340.16
	EqAscendNode    185.06

	AbsMagn         9.8319
	SlopeParam      2.1188
	AlbedoBond      0.056985
	AlbedoGeom      0.068382
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.532 0.525 0.523)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94489
		Randomize      (0.304, -0.851, 0.141)
		colorDistMagn   0.28295
		colorDistFreq   8.0301e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.51412
		icecapLatitude  2
		icecapHeight    0.4828
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36769
		heightTempGrad  0.625
		beachWidth      0.001235
		tropicWidth     0.07
		mainFreq        0.70637
		venusFreq       0.54393
		venusMagn       0.81937
		mareDensity     0
		terraceProb     0.10685
		erosion         0
		montesMagn      0.54138
		montesFreq      3.3248
		montesSpiky     0.96278
		montesFraction  0.36463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.1095e-05
		hillsFraction   0.50925
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24457
		craterFreq      0.18177
		craterDensity   0.72862
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4603
		volcanoTemp     1113
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.30148
		BumpOffset      0.15074
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.015015
		GasToDust   0.25
		Particles   1283
		GasBright   0.0042308
		DustBright  0.0087495
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          164.104511
		SemiMajorAxis   34.0040672
		Eccentricity    0.918556055
		Inclination     -143.00045
		AscendingNode   -58.5776934
		ArgOfPericenter -110.126771
		MeanAnomaly     81.78763
	}
}

Comet	"C130"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.2892e-13
	Radius          0.40599
	InertiaMoment   0.39952
	RotationPeriod  113.05
	RotationEpoch   0
	Obliquity       324.04
	EqAscendNode    73.806

	AbsMagn         16.414
	SlopeParam      3.1288
	AlbedoBond      0.044057
	AlbedoGeom      0.052868
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.638 0.589 0.522)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.90011
		Randomize      (-0.650, -0.740, 0.768)
		colorDistMagn   0.24268
		colorDistFreq   1.8854e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.47338
		icecapLatitude  2
		icecapHeight    0.66921
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24103
		heightTempGrad  0.625
		beachWidth      0.0016452
		tropicWidth     0.07
		mainFreq        0.70566
		venusFreq       0.61976
		venusMagn       0.67815
		mareDensity     0
		terraceProb     0.17519
		erosion         0
		montesMagn      0.67643
		montesFreq      2.7712
		montesSpiky     0.91296
		montesFraction  0.42968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00030702
		hillsFraction   0.74285
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24714
		craterFreq      0.16306
		craterDensity   0.97491
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57011
		volcanoTemp     1140.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.99336
		BumpOffset      0.49668
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.033576
		GasToDust   0.25
		Particles   1658
		GasBright   0.0013293
		DustBright  0.013862
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          164.721295
		SemiMajorAxis   34.0892165
		Eccentricity    0.910968803
		Inclination     -7.70743883
		AscendingNode   -179.637612
		ArgOfPericenter 108.138292
		MeanAnomaly     55.2489364
	}
}

Comet	"C76"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.0896e-13
	Radius          0.48002
	InertiaMoment   0.3964
	RotationPeriod  84.636
	RotationEpoch   0
	Obliquity       71.015
	EqAscendNode    298.13

	AbsMagn         6.613
	SlopeParam      2.0825
	AlbedoBond      0.041195
	AlbedoGeom      0.049435
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.592 0.587 0.584)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19726
		Randomize      (-0.312, 0.472, 0.062)
		colorDistMagn   0.265
		colorDistFreq   0.00016149
		detailScale     8
		snowLevel       2
		tropicLatitude  0.72639
		icecapLatitude  2
		icecapHeight    0.75733
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16466
		heightTempGrad  0.625
		beachWidth      0.0010942
		tropicWidth     0.07
		mainFreq        0.57128
		venusFreq       0.55551
		venusMagn       0.63772
		mareDensity     0
		terraceProb     0.10473
		erosion         0
		montesMagn      0.46243
		montesFreq      2.7073
		montesSpiky     0.96729
		montesFraction  0.68529
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00071586
		hillsFraction   0.51943
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2795
		craterFreq      0.17447
		craterDensity   0.91325
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5286
		volcanoTemp     1225.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.077
		BumpOffset      0.5385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.036276
		GasToDust   0.25
		Particles   1712
		GasBright   0.0067879
		DustBright  0.032652
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          164.975981
		SemiMajorAxis   34.1243457
		Eccentricity    0.930450614
		Inclination     31.594131
		AscendingNode   145.890912
		ArgOfPericenter 74.54352
		MeanAnomaly     -122.359906
	}
}

Comet	"C125"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.38e-17
	Radius          0.018976
	InertiaMoment   0.39841
	RotationPeriod  46.944
	RotationEpoch   0
	Obliquity       313.94
	EqAscendNode    221.24

	AbsMagn         9.9399
	SlopeParam      4.5718
	AlbedoBond      0.02955
	AlbedoGeom      0.03546
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.444 0.438 0.436)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87207
		Randomize      (-0.804, -0.443, -0.779)
		colorDistMagn   0.6598
		colorDistFreq   1.2296e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.65376
		icecapLatitude  2
		icecapHeight    0.60215
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1747
		heightTempGrad  0.625
		beachWidth      0.00092756
		tropicWidth     0.07
		mainFreq        0.65757
		venusFreq       0.70355
		venusMagn       0.57114
		mareDensity     0
		terraceProb     0.2944
		erosion         0
		montesMagn      0.54398
		montesFreq      2.1344
		montesSpiky     0.88952
		montesFraction  0.91302
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.5116e-07
		hillsFraction   0.37407
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2054
		craterFreq      0.21039
		craterDensity   0.7486
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55486
		volcanoTemp     1272.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.045708
		BumpOffset      0.022854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0010368
		DustBright  0.020103
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          165.007746
		SemiMajorAxis   34.1287259
		Eccentricity    0.932820255
		Inclination     6.11454044
		AscendingNode   -29.5818371
		ArgOfPericenter 97.5313739
		MeanAnomaly     55.1895278
	}
}

Comet	"C15"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1005e-13
	Radius          0.25798
	InertiaMoment   0.4
	RotationPeriod  75.507
	RotationEpoch   0
	Obliquity       91.859
	EqAscendNode    224.86

	AbsMagn         3.4155
	SlopeParam      6.6125
	AlbedoBond      0.054236
	AlbedoGeom      0.065084
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.562 0.559 0.557)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25516
		Randomize      (-0.189, 0.101, -0.809)
		colorDistMagn   0.50597
		colorDistFreq   2.2966e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.90424
		icecapLatitude  2
		icecapHeight    0.56455
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31543
		heightTempGrad  0.625
		beachWidth      0.0013384
		tropicWidth     0.07
		mainFreq        0.3135
		venusFreq       0.55383
		venusMagn       0.71593
		mareDensity     0
		terraceProb     0.48276
		erosion         0
		montesMagn      0.38201
		montesFreq      3.4972
		montesSpiky     0.96711
		montesFraction  0.62276
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00016319
		hillsFraction   0.77202
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26301
		craterFreq      0.25388
		craterDensity   0.78387
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51724
		volcanoTemp     975.27
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.64636
		BumpOffset      0.32318
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.026265
		GasToDust   0.25
		Particles   1510
		GasBright   0.0064949
		DustBright  0.025522
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          166.449878
		SemiMajorAxis   34.3272892
		Eccentricity    0.949110312
		Inclination     -71.3736727
		AscendingNode   62.4962506
		ArgOfPericenter -23.5357995
		MeanAnomaly     78.3751038
	}
}

Comet	"C131"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.4143e-14
	Radius          0.13019
	InertiaMoment   0.39786
	RotationPeriod  66.975
	RotationEpoch   0
	Obliquity       182.06
	EqAscendNode    116.32

	AbsMagn         9.4824
	SlopeParam      3.7165
	AlbedoBond      0.030064
	AlbedoGeom      0.036077
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.589 0.504 0.467)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.50572
		Randomize      (-0.619, -0.800, -0.923)
		colorDistMagn   0.36532
		colorDistFreq   1.1853e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.86281
		icecapLatitude  2
		icecapHeight    0.79909
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4943
		heightTempGrad  0.625
		beachWidth      0.00058879
		tropicWidth     0.07
		mainFreq        0.52775
		venusFreq       0.61115
		venusMagn       0.69826
		mareDensity     0
		terraceProb     0.22147
		erosion         0
		montesMagn      0.53293
		montesFreq      2.8472
		montesSpiky     0.73066
		montesFraction  0.82096
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2286e-05
		hillsFraction   0.72461
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24298
		craterFreq      0.20983
		craterDensity   0.90598
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47811
		volcanoTemp     1173.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.28529
		BumpOffset      0.14264
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.015238
		GasToDust   0.25
		Particles   1287
		GasBright   0.0013329
		DustBright  0.012668
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          166.710239
		SemiMajorAxis   34.3630764
		Eccentricity    0.895022765
		Inclination     -119.160824
		AscendingNode   -126.326521
		ArgOfPericenter -86.7038857
		MeanAnomaly     59.5922499
	}
}

Comet	"C19"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.2684e-08
	Radius          17.21
	InertiaMoment   0.39976
	RotationPeriod  59.019
	RotationEpoch   0
	Obliquity       243.93
	EqAscendNode    34.91

	AbsMagn         10.822
	SlopeParam      4.0563
	AlbedoBond      0.054823
	AlbedoGeom      0.065787
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.823 0.771 0.679)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.6776
		Randomize      (-0.065, -0.137, 0.428)
		colorDistMagn   0.87225
		colorDistFreq   0.11404
		detailScale     64
		snowLevel       2
		tropicLatitude  0.32702
		icecapLatitude  2
		icecapHeight    0.54618
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1285
		heightTempGrad  0.625
		beachWidth      0.0016125
		tropicWidth     0.07
		mainFreq        0.52434
		venusFreq       0.669
		venusMagn       0.45615
		mareDensity     0
		terraceProb     0.24978
		erosion         0
		montesMagn      0.56506
		montesFreq      2.2449
		montesSpiky     0.88101
		montesFraction  0.4352
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.75916
		hillsFraction   0.69808
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24273
		craterFreq      0.18351
		craterDensity   0.77347
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47079
		volcanoTemp     1109.7
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
		MaxLength   0.09399
		GasToDust   0.25
		Particles   2878
		GasBright   0.0063682
		DustBright  0.02089
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          167.019286
		SemiMajorAxis   34.4055313
		Eccentricity    0.910491257
		Inclination     135.148559
		AscendingNode   -0.530676395
		ArgOfPericenter -159.141419
		MeanAnomaly     53.7499534
	}
}

Comet	"C93"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.882e-15
	Radius          0.07661
	InertiaMoment   0.39728
	RotationPeriod  85.284
	RotationEpoch   0
	Obliquity       177.34
	EqAscendNode    300.84

	AbsMagn         8.7799
	SlopeParam      3.4489
	AlbedoBond      0.026139
	AlbedoGeom      0.031367
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.510 0.502 0.497)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4926
		Randomize      (0.212, -0.539, -0.679)
		colorDistMagn   0.10422
		colorDistFreq   4.039e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  2
		icecapHeight    0.7824
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47019
		heightTempGrad  0.625
		beachWidth      0.0011343
		tropicWidth     0.07
		mainFreq        0.3511
		venusFreq       0.52785
		venusMagn       0.71868
		mareDensity     0
		terraceProb     0.19993
		erosion         0
		montesMagn      0.51584
		montesFreq      2.6429
		montesSpiky     0.90341
		montesFraction  0.83674
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.2532e-05
		hillsFraction   0.61479
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24564
		craterFreq      0.24548
		craterDensity   0.82411
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52712
		volcanoTemp     896.79
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.17459
		BumpOffset      0.087293
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0066887
		GasToDust   0.25
		Particles   1114
		GasBright   0.0058194
		DustBright  0.013394
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          167.121165
		SemiMajorAxis   34.4195211
		Eccentricity    0.963194441
		Inclination     91.826171
		AscendingNode   42.3140138
		ArgOfPericenter -101.254571
		MeanAnomaly     159.793652
	}
}

Comet	"C53"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.401e-13
	Radius          0.43841
	InertiaMoment   0.39681
	RotationPeriod  59.823
	RotationEpoch   0
	Obliquity       96.579
	EqAscendNode    40.337

	AbsMagn         4.534
	SlopeParam      7.4219
	AlbedoBond      0.010177
	AlbedoGeom      0.012212
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.666 0.578 0.501)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.26828
		Randomize      (0.981, -0.160, 0.947)
		colorDistMagn   0.67982
		colorDistFreq   6.8764e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.97873
		icecapLatitude  2
		icecapHeight    0.57132
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33954
		heightTempGrad  0.625
		beachWidth      0.00079282
		tropicWidth     0.07
		mainFreq        0.50498
		venusFreq       0.62503
		venusMagn       0.69576
		mareDensity     0
		terraceProb     0.56029
		erosion         0
		montesMagn      0.4104
		montesFreq      4.0527
		montesSpiky     0.91852
		montesFraction  0.61641
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00043632
		hillsFraction   0.52527
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25856
		craterFreq      0.21702
		craterDensity   0.88048
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46774
		volcanoTemp     1152.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.0584
		BumpOffset      0.52919
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.034814
		GasToDust   0.25
		Particles   1683
		GasBright   0.013273
		DustBright  0.013532
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          169.199523
		SemiMajorAxis   34.704299
		Eccentricity    0.931729612
		Inclination     11.1360622
		AscendingNode   -61.0957251
		ArgOfPericenter 43.2049872
		MeanAnomaly     106.284909
	}
}

Comet	"C72"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.9965e-07
	Radius          45.38
	InertiaMoment   0.39723
	Oblateness      0.16519
	RotationPeriod  2.9864
	RotationEpoch   0
	Obliquity       278.94
	EqAscendNode    128.08

	AbsMagn         10.367
	SlopeParam      4.3115
	AlbedoBond      0.04099
	AlbedoGeom      0.049188
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.798 0.794 0.793)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.77483
		Randomize      (-0.435, 0.710, 0.825)
		colorDistMagn   0.76455
		colorDistFreq   1.37
		detailScale     128
		snowLevel       2
		tropicLatitude  0.99957
		icecapLatitude  2
		icecapHeight    0.7959
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3516
		heightTempGrad  0.625
		beachWidth      0.00082005
		tropicWidth     0.07
		mainFreq        0.38319
		venusFreq       0.59353
		venusMagn       0.53405
		mareDensity     0
		terraceProb     0.27165
		erosion         0
		montesMagn      0.55422
		montesFreq      2.1946
		montesSpiky     0.88537
		montesFraction  0.33267
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.8668
		hillsFraction   0.58962
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2294
		craterFreq      0.24764
		craterDensity   0.91829
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42682
		volcanoTemp     1191
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
		GasBright   0.0062469
		DustBright  0.037952
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          169.301778
		SemiMajorAxis   34.7182798
		Eccentricity    0.918509326
		Inclination     -41.0310461
		AscendingNode   -76.9475565
		ArgOfPericenter 113.421709
		MeanAnomaly     -4.52119002
	}
}

Comet	"C178"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.0361e-16
	Radius          0.05005
	InertiaMoment   0.39919
	RotationPeriod  88.722
	RotationEpoch   0
	Obliquity       348.95
	EqAscendNode    314.41

	AbsMagn         9.5343
	SlopeParam      4.8423
	AlbedoBond      0.04691
	AlbedoGeom      0.056292
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.487 0.483 0.481)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.9693
		Randomize      (0.827, 0.404, -0.382)
		colorDistMagn   0.55324
		colorDistFreq   1.5761e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.84505
		icecapLatitude  2
		icecapHeight    0.41496
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3978
		heightTempGrad  0.625
		beachWidth      0.0013351
		tropicWidth     0.07
		mainFreq        0.51217
		venusFreq       0.60164
		venusMagn       0.59881
		mareDensity     0
		terraceProb     0.31845
		erosion         0
		montesMagn      0.53419
		montesFreq      2.0582
		montesSpiky     0.89348
		montesFraction  0.73372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.967e-06
		hillsFraction   0.69929
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25573
		craterFreq      0.14662
		craterDensity   0.90871
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52005
		volcanoTemp     1153.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.12225
		BumpOffset      0.061127
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.017394
		DustBright  0.020688
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          171.453637
		SemiMajorAxis   35.0118443
		Eccentricity    0.972812909
		Inclination     55.032021
		AscendingNode   -100.193763
		ArgOfPericenter 102.428421
		MeanAnomaly     -166.874582
	}
}

Comet	"C29"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.2478e-11
	Radius          1.2486
	InertiaMoment   0.39915
	RotationPeriod  64.386
	RotationEpoch   0
	Obliquity       264.12
	EqAscendNode    100.04

	AbsMagn         6.5616
	SlopeParam      5.6174
	AlbedoBond      0.056568
	AlbedoGeom      0.067882
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.706 0.615 0.556)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.73368
		Randomize      (0.242, -0.732, -0.478)
		colorDistMagn   0.96828
		colorDistFreq   0.001226
		detailScale     8
		snowLevel       2
		tropicLatitude  0.94667
		icecapLatitude  2
		icecapHeight    0.68036
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26116
		heightTempGrad  0.625
		beachWidth      0.00064791
		tropicWidth     0.07
		mainFreq        0.58799
		venusFreq       0.56813
		venusMagn       0.74083
		mareDensity     0
		terraceProb     0.3892
		erosion         0
		montesMagn      0.46115
		montesFreq      3.165
		montesSpiky     0.92674
		montesFraction  0.75057
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0045995
		hillsFraction   0.54977
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25354
		craterFreq      0.21918
		craterDensity   0.9105
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4862
		volcanoTemp     1145.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.0167
		BumpOffset      1.5084
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.05169
		GasToDust   0.25
		Particles   2024
		GasBright   0.0047701
		DustBright  0.01059
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          171.693805
		SemiMajorAxis   35.0445325
		Eccentricity    0.904133203
		Inclination     97.8118101
		AscendingNode   -71.7708714
		ArgOfPericenter -124.659591
		MeanAnomaly     38.4837108
	}
}

Comet	"C159"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.8181e-10
	Radius          3.0497
	InertiaMoment   0.39904
	RotationPeriod  47.709
	RotationEpoch   0
	Obliquity       166.59
	EqAscendNode    226.67

	AbsMagn         3.2902
	SlopeParam      2.4313
	AlbedoBond      0.032184
	AlbedoGeom      0.03862
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.677 0.673 0.667)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46275
		Randomize      (0.242, -0.466, -0.260)
		colorDistMagn   0.46209
		colorDistFreq   0.0028825
		detailScale     8
		snowLevel       2
		tropicLatitude  0.81782
		icecapLatitude  2
		icecapHeight    0.62634
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.38575
		heightTempGrad  0.625
		beachWidth      0.00070785
		tropicWidth     0.07
		mainFreq        0.63209
		venusFreq       0.63472
		venusMagn       0.74634
		mareDensity     0
		terraceProb     0.12617
		erosion         0
		montesMagn      0.3788
		montesFreq      3.8672
		montesSpiky     0.92451
		montesFraction  0.46821
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.025408
		hillsFraction   0.64529
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23013
		craterFreq      0.239
		craterDensity   0.8707
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55046
		volcanoTemp     1115
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.5924
		BumpOffset      3.7962
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.066088
		GasToDust   0.25
		Particles   2314
		GasBright   0.0064253
		DustBright  0.014262
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          171.707103
		SemiMajorAxis   35.046342
		Eccentricity    0.911785945
		Inclination     49.2544989
		AscendingNode   109.7674
		ArgOfPericenter -132.99065
		MeanAnomaly     -16.7440691
	}
}

Comet	"C54"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.7809e-14
	Radius          0.14058
	InertiaMoment   0.39891
	Oblateness      0.0011726
	RotationPeriod  35.578
	RotationEpoch   0
	Obliquity       314.6
	EqAscendNode    82.85

	AbsMagn         12.108
	SlopeParam      2.5037
	AlbedoBond      0.04007
	AlbedoGeom      0.048084
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.620 0.551 0.443)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.87388
		Randomize      (-0.989, -0.219, -0.744)
		colorDistMagn   0.76959
		colorDistFreq   1.749e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.52617
		icecapLatitude  2
		icecapHeight    0.65465
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19281
		heightTempGrad  0.625
		beachWidth      0.0015364
		tropicWidth     0.07
		mainFreq        0.33328
		venusFreq       0.61609
		venusMagn       0.7173
		mareDensity     0
		terraceProb     0.1309
		erosion         0
		montesMagn      0.59499
		montesFreq      2.1175
		montesSpiky     0.79268
		montesFraction  0.44372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.5387e-05
		hillsFraction   0.50263
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25306
		craterFreq      0.24955
		craterDensity   0.8059
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52207
		volcanoTemp     1086
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.29766
		BumpOffset      0.14883
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.016477
		GasToDust   0.25
		Particles   1312
		GasBright   7.3521e-05
		DustBright  0.025542
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          172.704122
		SemiMajorAxis   35.1818757
		Eccentricity    0.915310511
		Inclination     -106.045862
		AscendingNode   16.448283
		ArgOfPericenter -56.7395894
		MeanAnomaly     179.946755
	}
}

Comet	"C180"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.1949e-07
	Radius          32.465
	InertiaMoment   0.39906
	Oblateness      0.0013216
	RotationPeriod  33.509
	RotationEpoch   0
	Obliquity       64.987
	EqAscendNode    39.435

	AbsMagn         15.316
	SlopeParam      6.4249
	AlbedoBond      0.04704
	AlbedoGeom      0.056448
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.804 0.785 0.756)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.18052
		Randomize      (0.889, 0.285, 0.236)
		colorDistMagn   0.73443
		colorDistFreq   0.35796
		detailScale     128
		snowLevel       2
		tropicLatitude  0.62849
		icecapLatitude  2
		icecapHeight    0.62085
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10433
		heightTempGrad  0.625
		beachWidth      0.0010221
		tropicWidth     0.07
		mainFreq        0.60449
		venusFreq       0.58502
		venusMagn       0.6409
		mareDensity     0
		terraceProb     0.46496
		erosion         0
		montesMagn      0.66021
		montesFreq      2.4656
		montesSpiky     0.93762
		montesFraction  0.34765
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1601
		hillsFraction   0.66961
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24631
		craterFreq      0.23702
		craterDensity   0.72028
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49726
		volcanoTemp     1120.8
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
		GasBright   0.016856
		DustBright  0.018846
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          173.022379
		SemiMajorAxis   35.2250842
		Eccentricity    0.961130424
		Inclination     -100.736907
		AscendingNode   -15.8275354
		ArgOfPericenter -83.2999824
		MeanAnomaly     -98.2953169
	}
}

Comet	"C23"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.8641e-14
	Radius          0.182
	InertiaMoment   0.39952
	RotationPeriod  44.644
	RotationEpoch   0
	Obliquity       36.01
	EqAscendNode    204.96

	AbsMagn         6.999
	SlopeParam      7.4906
	AlbedoBond      0.055465
	AlbedoGeom      0.066558
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.549 0.542 0.538)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.10003
		Randomize      (0.058, -0.375, -0.334)
		colorDistMagn   0.40194
		colorDistFreq   1.3953e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.48727
		icecapLatitude  2
		icecapHeight    0.52684
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34156
		heightTempGrad  0.625
		beachWidth      0.0012867
		tropicWidth     0.07
		mainFreq        0.7649
		venusFreq       0.61987
		venusMagn       0.61564
		mareDensity     0
		terraceProb     0.56691
		erosion         0
		montesMagn      0.472
		montesFreq      2.7248
		montesSpiky     0.96495
		montesFraction  0.80074
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.9051e-05
		hillsFraction   0.64038
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22545
		craterFreq      0.21972
		craterDensity   0.76149
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5717
		volcanoTemp     1044.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.40109
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

	CometTail
	{
		MaxLength   0.02064
		GasToDust   0.25
		Particles   1396
		GasBright   0.0059486
		DustBright  0.01655
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          173.825739
		SemiMajorAxis   35.3340357
		Eccentricity    0.91366679
		Inclination     173.034172
		AscendingNode   -9.56898451
		ArgOfPericenter 111.045435
		MeanAnomaly     -51.8474394
	}
}

Comet	"C106"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.9093e-12
	Radius          1.1563
	InertiaMoment   0.39821
	Oblateness      0.069608
	RotationPeriod  4.6116
	RotationEpoch   0
	Obliquity       131.58
	EqAscendNode    133.5

	AbsMagn         3.961
	SlopeParam      2.0579
	AlbedoBond      0.042758
	AlbedoGeom      0.05131
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.631 0.628 0.625)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36551
		Randomize      (0.612, 0.687, -0.657)
		colorDistMagn   0.57398
		colorDistFreq   0.00085826
		detailScale     8
		snowLevel       2
		tropicLatitude  0.98239
		icecapLatitude  2
		icecapHeight    0.91438
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16264
		heightTempGrad  0.625
		beachWidth      0.00060034
		tropicWidth     0.07
		mainFreq        0.3567
		venusFreq       0.56205
		venusMagn       0.71914
		mareDensity     0
		terraceProb     0.1033
		erosion         0
		montesMagn      0.3959
		montesFreq      3.9439
		montesSpiky     0.92155
		montesFraction  0.54282
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0033199
		hillsFraction   0.76971
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24338
		craterFreq      0.16864
		craterDensity   1.0239
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41847
		volcanoTemp     1233.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.8316
		BumpOffset      1.4158
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.050451
		GasToDust   0.25
		Particles   1999
		GasBright   0.017625
		DustBright  0.026121
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          174.037577
		SemiMajorAxis   35.3627372
		Eccentricity    0.947630561
		Inclination     45.5235659
		AscendingNode   -121.415221
		ArgOfPericenter 15.0212994
		MeanAnomaly     -26.548973
	}
}

Comet	"C127"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1963e-08
	Radius          12.311
	InertiaMoment   0.39824
	RotationPeriod  86.617
	RotationEpoch   0
	Obliquity       29.982
	EqAscendNode    306.27

	AbsMagn         -1.2103
	SlopeParam      5.9618
	AlbedoBond      0.029724
	AlbedoGeom      0.035669
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.738 0.736 0.734)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.083283
		Randomize      (-0.742, -0.562, -0.160)
		colorDistMagn   0.84077
		colorDistFreq   0.10061
		detailScale     32
		snowLevel       2
		tropicLatitude  0.98522
		icecapLatitude  2
		icecapHeight    0.86796
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28123
		heightTempGrad  0.625
		beachWidth      0.0012146
		tropicWidth     0.07
		mainFreq        0.31965
		venusFreq       0.65181
		venusMagn       0.61905
		mareDensity     0
		terraceProb     0.42131
		erosion         0
		montesMagn      0.24709
		montesFreq      2.4913
		montesSpiky     0.93492
		montesFraction  0.44525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2581
		hillsFraction   0.81945
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26351
		craterFreq      0.16382
		craterDensity   0.91097
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52424
		volcanoTemp     1039.5
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
		MaxLength   0.088588
		GasToDust   0.25
		Particles   2769
		GasBright   0.0012087
		DustBright  0.017552
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          174.107695
		SemiMajorAxis   35.3722346
		Eccentricity    0.944938885
		Inclination     50.5990259
		AscendingNode   -11.417689
		ArgOfPericenter 176.159463
		MeanAnomaly     114.876466
	}
}

Comet	"C5"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.8827e-10
	Radius          3.5561
	InertiaMoment   0.39762
	RotationPeriod  69.23
	RotationEpoch   0
	Obliquity       71.669
	EqAscendNode    159.73

	AbsMagn         8.2613
	SlopeParam      4.6365
	AlbedoBond      0.052952
	AlbedoGeom      0.063542
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.683 0.678 0.676)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19908
		Randomize      (-0.496, 0.696, 0.097)
		colorDistMagn   0.40789
		colorDistFreq   0.0072125
		detailScale     16
		snowLevel       2
		tropicLatitude  0.95339
		icecapLatitude  2
		icecapHeight    0.34333
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18277
		heightTempGrad  0.625
		beachWidth      0.001103
		tropicWidth     0.07
		mainFreq        0.69324
		venusFreq       0.64815
		venusMagn       0.81666
		mareDensity     0
		terraceProb     0.30011
		erosion         0
		montesMagn      0.50314
		montesFreq      2.7029
		montesSpiky     0.9345
		montesFraction  0.2729
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.027662
		hillsFraction   0.57133
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24927
		craterFreq      0.22133
		craterDensity   0.94153
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5029
		volcanoTemp     1139.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.5985
		BumpOffset      4.2992
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.068565
		GasToDust   0.25
		Particles   2364
		GasBright   0.0055304
		DustBright  0.038384
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          176.552054
		SemiMajorAxis   35.7025337
		Eccentricity    0.918165137
		Inclination     -172.606215
		AscendingNode   85.2372786
		ArgOfPericenter 66.0891493
		MeanAnomaly     126.151758
	}
}

Comet	"C126"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.6279e-07
	Radius          38.383
	InertiaMoment   0.39976
	Oblateness      0.0034522
	RotationPeriod  20.759
	RotationEpoch   0
	Obliquity       171.96
	EqAscendNode    263.76

	AbsMagn         6.4414
	SlopeParam      5.1932
	AlbedoBond      0.043836
	AlbedoGeom      0.052603
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.790 0.788 0.786)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.47767
		Randomize      (-0.773, -0.502, -0.469)
		colorDistMagn   0.74947
		colorDistFreq   1.2629
		detailScale     128
		snowLevel       2
		tropicLatitude  0.10934
		icecapLatitude  2
		icecapHeight    0.68971
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42797
		heightTempGrad  0.625
		beachWidth      0.0016711
		tropicWidth     0.07
		mainFreq        0.49699
		venusFreq       0.66874
		venusMagn       0.59692
		mareDensity     0
		terraceProb     0.35018
		erosion         0
		montesMagn      0.45816
		montesFreq      2.3537
		montesSpiky     0.98645
		montesFraction  0.61782
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3996
		hillsFraction   0.86868
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27508
		craterFreq      0.24218
		craterDensity   0.98168
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4701
		volcanoTemp     1005.9
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
		GasBright   0.0011319
		DustBright  0.018818
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          176.890562
		SemiMajorAxis   35.7481547
		Eccentricity    0.966850842
		Inclination     -6.23202137
		AscendingNode   129.618269
		ArgOfPericenter -105.280897
		MeanAnomaly     0.660708379
	}
}

Comet	"C6"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.5057e-12
	Radius          1.1404
	InertiaMoment   0.39926
	RotationPeriod  44.26
	RotationEpoch   0
	Obliquity       289.69
	EqAscendNode    202.25

	AbsMagn         4.4632
	SlopeParam      5.2678
	AlbedoBond      0.037598
	AlbedoGeom      0.045117
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.631 0.627 0.623)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.80469
		Randomize      (-0.465, 0.636, 0.406)
		colorDistMagn   0.50866
		colorDistFreq   0.00056333
		detailScale     8
		snowLevel       2
		tropicLatitude  0.95153
		icecapLatitude  2
		icecapHeight    0.51268
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43604
		heightTempGrad  0.625
		beachWidth      0.0015465
		tropicWidth     0.07
		mainFreq        0.52055
		venusFreq       0.63641
		venusMagn       0.45294
		mareDensity     0
		terraceProb     0.35699
		erosion         0
		montesMagn      0.40862
		montesFreq      2.7836
		montesSpiky     0.85071
		montesFraction  0.66745
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0028801
		hillsFraction   0.55462
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24498
		craterFreq      0.25492
		craterDensity   0.8777
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57543
		volcanoTemp     1172.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.4308
		BumpOffset      1.2154
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.050228
		GasToDust   0.25
		Particles   1994
		GasBright   0.0057092
		DustBright  0.037016
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          177.049011
		SemiMajorAxis   35.769499
		Eccentricity    0.932709505
		Inclination     -119.899938
		AscendingNode   80.1511387
		ArgOfPericenter 179.154798
		MeanAnomaly     -74.9255376
	}
}

Comet	"C119"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.4071e-08
	Radius          17.45
	InertiaMoment   0.39885
	Oblateness      0.0021042
	RotationPeriod  26.551
	RotationEpoch   0
	Obliquity       85.83
	EqAscendNode    326.17

	AbsMagn         10.424
	SlopeParam      5.554
	AlbedoBond      0.029006
	AlbedoGeom      0.034807
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.755 0.751 0.749)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.23842
		Randomize      (-0.988, -0.086, -0.635)
		colorDistMagn   0.93986
		colorDistFreq   0.18232
		detailScale     64
		snowLevel       2
		tropicLatitude  0.53481
		icecapLatitude  2
		icecapHeight    0.4121
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2551
		heightTempGrad  0.625
		beachWidth      0.00066633
		tropicWidth     0.07
		mainFreq        0.36214
		venusFreq       0.58386
		venusMagn       0.7196
		mareDensity     0
		terraceProb     0.38333
		erosion         0
		montesMagn      0.5556
		montesFreq      3.2671
		montesSpiky     0.93741
		montesFraction  0.21546
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.90117
		hillsFraction   0.56525
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24116
		craterFreq      0.21096
		craterDensity   0.92107
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48691
		volcanoTemp     970.63
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
		MaxLength   0.094213
		GasToDust   0.25
		Particles   2883
		GasBright   8.166e-05
		DustBright  0.028197
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          177.845071
		SemiMajorAxis   35.8766384
		Eccentricity    0.929482526
		Inclination     64.9998893
		AscendingNode   -14.3509662
		ArgOfPericenter -17.0547751
		MeanAnomaly     145.389498
	}
}

Comet	"C156"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.0187e-17
	Radius          0.014658
	InertiaMoment   0.39744
	Oblateness      0.0010229
	RotationPeriod  37.987
	RotationEpoch   0
	Obliquity       232.53
	EqAscendNode    99.133

	AbsMagn         3.6844
	SlopeParam      5.1748
	AlbedoBond      0.045547
	AlbedoGeom      0.054656
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.478 0.431 0.379)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64592
		Randomize      (0.150, -0.287, 0.812)
		colorDistMagn   0.067033
		colorDistFreq   1.6463e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.80617
		icecapLatitude  2
		icecapHeight    0.74959
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.42595
		heightTempGrad  0.625
		beachWidth      0.00087724
		tropicWidth     0.07
		mainFreq        0.71986
		venusFreq       0.6835
		venusMagn       0.67894
		mareDensity     0
		terraceProb     0.34851
		erosion         0
		montesMagn      0.38887
		montesFreq      3.4022
		montesSpiky     0.94487
		montesFraction  0.48246
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.6517e-07
		hillsFraction   0.68824
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24259
		craterFreq      0.23929
		craterDensity   0.79863
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51397
		volcanoTemp     1114.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.03477
		BumpOffset      0.017385
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0069741
		DustBright  0.017283
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          178.893748
		SemiMajorAxis   36.017533
		Eccentricity    0.956856549
		Inclination     172.335759
		AscendingNode   -96.0746774
		ArgOfPericenter -137.365642
		MeanAnomaly     139.09265
	}
}

Comet	"C26"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.4801e-07
	Radius          37.855
	InertiaMoment   0.39766
	RotationPeriod  54.275
	RotationEpoch   0
	Obliquity       330.07
	EqAscendNode    332.5

	AbsMagn         6.7821
	SlopeParam      3.771
	AlbedoBond      0.038637
	AlbedoGeom      0.046364
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.790 0.787 0.785)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.91685
		Randomize      (0.150, -0.554, 0.594)
		colorDistMagn   0.68732
		colorDistFreq   0.84623
		detailScale     128
		snowLevel       2
		tropicLatitude  0.99742
		icecapLatitude  2
		icecapHeight    0.3062
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30136
		heightTempGrad  0.625
		beachWidth      0.0008173
		tropicWidth     0.07
		mainFreq        0.65812
		venusFreq       0.59475
		venusMagn       0.675
		mareDensity     0
		terraceProb     0.22594
		erosion         0
		montesMagn      0.46663
		montesFreq      2.95
		montesSpiky     0.94683
		montesFraction  0.77389
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.0143
		hillsFraction   0.59779
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28769
		craterFreq      0.21945
		craterDensity   0.8511
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44981
		volcanoTemp     1145
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
		GasBright   0.0054417
		DustBright  0.013487
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          178.952842
		SemiMajorAxis   36.0254644
		Eccentricity    0.957350735
		Inclination     115.50057
		AscendingNode   -8.94530956
		ArgOfPericenter -6.4059296
		MeanAnomaly     95.0218662
	}
}

Comet	"C1"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.7069e-16
	Radius          0.053302
	InertiaMoment   0.39804
	RotationPeriod  90.241
	RotationEpoch   0
	Obliquity       279.59
	EqAscendNode    349.68

	AbsMagn         12.793
	SlopeParam      2.1427
	AlbedoBond      0.052493
	AlbedoGeom      0.062992
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.493 0.488 0.481)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.77665
		Randomize      (-0.619, 0.934, 0.860)
		colorDistMagn   0.87756
		colorDistFreq   1.5332e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.87971
		icecapLatitude  2
		icecapHeight    0.40614
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36971
		heightTempGrad  0.625
		beachWidth      0.0014288
		tropicWidth     0.07
		mainFreq        0.48977
		venusFreq       0.53415
		venusMagn       0.69411
		mareDensity     0
		terraceProb     0.10826
		erosion         0
		montesMagn      0.61035
		montesFreq      2.1809
		montesSpiky     0.76846
		montesFraction  0.5208
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.8848e-06
		hillsFraction   0.63025
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.17515
		craterFreq      0.18599
		craterDensity   0.94702
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55836
		volcanoTemp     1004.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.14386
		BumpOffset      0.07193
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.004632
		DustBright  0.044042
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          179.205538
		SemiMajorAxis   36.0593704
		Eccentricity    0.923381322
		Inclination     129.337316
		AscendingNode   -119.01243
		ArgOfPericenter -79.4615465
		MeanAnomaly     154.214041
	}
}

Comet	"C120"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1235e-09
	Radius          5.5962
	InertiaMoment   0.39595
	RotationPeriod  96.121
	RotationEpoch   0
	Obliquity       303.85
	EqAscendNode    8.6804

	AbsMagn         6.8829
	SlopeParam      6.4906
	AlbedoBond      0.043508
	AlbedoGeom      0.05221
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.767 0.688 0.633)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.84403
		Randomize      (-0.958, -0.146, -0.326)
		colorDistMagn   0.088699
		colorDistFreq   0.014517
		detailScale     16
		snowLevel       2
		tropicLatitude  0.98874
		icecapLatitude  2
		icecapHeight    0.53562
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10837
		heightTempGrad  0.625
		beachWidth      0.00080987
		tropicWidth     0.07
		mainFreq        0.61821
		venusFreq       0.57492
		venusMagn       0.74466
		mareDensity     0
		terraceProb     0.47118
		erosion         0
		montesMagn      0.46913
		montesFreq      3.3528
		montesSpiky     0.85757
		montesFraction  0.64675
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.094817
		hillsFraction   0.548
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23712
		craterFreq      0.24277
		craterDensity   0.85715
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5435
		volcanoTemp     1004.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.289
		BumpOffset      6.6445
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.075876
		GasToDust   0.25
		Particles   2512
		GasBright   0.00028661
		DustBright  0.026802
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          181.492737
		SemiMajorAxis   36.3655383
		Eccentricity    0.940310798
		Inclination     -61.0321982
		AscendingNode   -54.7429911
		ArgOfPericenter 47.6538744
		MeanAnomaly     -169.712698
	}
}

Comet	"C9"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.4082e-16
	Radius          0.037603
	InertiaMoment   0.39705
	RotationPeriod  53.887
	RotationEpoch   0
	Obliquity       223.74
	EqAscendNode    329.78

	AbsMagn         4.1434
	SlopeParam      2.5342
	AlbedoBond      0.053439
	AlbedoGeom      0.064127
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.475 0.471 0.467)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.62151
		Randomize      (-0.373, 0.458, -0.665)
		colorDistMagn   0.78223
		colorDistFreq   8.5038e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.87576
		icecapLatitude  2
		icecapHeight    0.85454
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39584
		heightTempGrad  0.625
		beachWidth      0.0013772
		tropicWidth     0.07
		mainFreq        0.46226
		venusFreq       0.60888
		venusMagn       0.59259
		mareDensity     0
		terraceProb     0.13292
		erosion         0
		montesMagn      0.40053
		montesFreq      3.0021
		montesSpiky     0.71502
		montesFraction  0.652
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.2444e-06
		hillsFraction   0.49087
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2327
		craterFreq      0.25457
		craterDensity   0.93616
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45186
		volcanoTemp     973.62
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.08592
		BumpOffset      0.04296
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0061359
		DustBright  0.03302
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          181.528607
		SemiMajorAxis   36.3703297
		Eccentricity    0.903067666
		Inclination     146.68943
		AscendingNode   108.579671
		ArgOfPericenter -18.871086
		MeanAnomaly     130.641708
	}
}

Comet	"C37"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.3811e-12
	Radius          0.88087
	InertiaMoment   0.3986
	Oblateness      0.0011985
	RotationPeriod  35.171
	RotationEpoch   0
	Obliquity       208.28
	EqAscendNode    80.136

	AbsMagn         9.3795
	SlopeParam      6.0382
	AlbedoBond      0.058454
	AlbedoGeom      0.070145
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.667 0.592 0.563)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.57854
		Randomize      (0.488, 0.792, -0.003)
		colorDistMagn   0.86696
		colorDistFreq   5.6494e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.9994
		icecapLatitude  2
		icecapHeight    0.64189
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28729
		heightTempGrad  0.625
		beachWidth      0.00089622
		tropicWidth     0.07
		mainFreq        0.55939
		venusFreq       0.63194
		venusMagn       0.63652
		mareDensity     0
		terraceProb     0.42847
		erosion         0
		montesMagn      0.53043
		montesFreq      2.2986
		montesSpiky     0.92406
		montesFraction  0.31897
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0013134
		hillsFraction   0.79063
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21538
		craterFreq      0.18087
		craterDensity   0.90052
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52347
		volcanoTemp     1014.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3647
		BumpOffset      1.1823
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.046065
		GasToDust   0.25
		Particles   1910
		GasBright   0.017057
		DustBright  0.028784
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          182.541193
		SemiMajorAxis   36.505456
		Eccentricity    0.891158374
		Inclination     -81.6178637
		AscendingNode   110.363065
		ArgOfPericenter -74.85925
		MeanAnomaly     -8.20196902
	}
}

Comet	"C104"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.1134e-09
	Radius          11.244
	InertiaMoment   0.39838
	RotationPeriod  61.041
	RotationEpoch   0
	Obliquity       55.546
	EqAscendNode    48.479

	AbsMagn         11.845
	SlopeParam      5.5644
	AlbedoBond      0.042652
	AlbedoGeom      0.051183
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.775 0.743 0.689)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15429
		Randomize      (0.550, 0.806, 0.724)
		colorDistMagn   0.37464
		colorDistFreq   0.039439
		detailScale     32
		snowLevel       2
		tropicLatitude  0.99618
		icecapLatitude  2
		icecapHeight    0.60758
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
		beachWidth      0.00091326
		tropicWidth     0.07
		mainFreq        0.69258
		venusFreq       0.58138
		venusMagn       0.67736
		mareDensity     0
		terraceProb     0.38429
		erosion         0
		montesMagn      0.58897
		montesFreq      3.5351
		montesSpiky     0.86799
		montesFraction  0.36667
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.30714
		hillsFraction   0.83032
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2521
		craterFreq      0.21235
		craterDensity   0.87818
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46292
		volcanoTemp     1166.5
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
		MaxLength   0.087126
		GasToDust   0.25
		Particles   2739
		GasBright   0.017874
		DustBright  0.028252
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          183.718667
		SemiMajorAxis   36.6622722
		Eccentricity    0.949613788
		Inclination     -37.7735032
		AscendingNode   -135.437512
		ArgOfPericenter 159.970621
		MeanAnomaly     102.115512
	}
}

Comet	"C152"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.7075e-11
	Radius          1.3862
	InertiaMoment   0.3979
	RotationPeriod  52.325
	RotationEpoch   0
	Obliquity       80.456
	EqAscendNode    289.08

	AbsMagn         7.9887
	SlopeParam      2.7938
	AlbedoBond      0.04531
	AlbedoGeom      0.054372
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.639 0.635 0.633)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.22349
		Randomize      (0.027, -0.049, -0.426)
		colorDistMagn   0.65228
		colorDistFreq   0.0013916
		detailScale     8
		snowLevel       2
		tropicLatitude  0.88822
		icecapLatitude  2
		icecapHeight    0.78519
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21288
		heightTempGrad  0.625
		beachWidth      0.00090309
		tropicWidth     0.07
		mainFreq        0.50459
		venusFreq       0.56041
		venusMagn       0.59787
		mareDensity     0
		terraceProb     0.15072
		erosion         0
		montesMagn      0.49644
		montesFreq      3.0805
		montesSpiky     0.8302
		montesFraction  0.67063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0048286
		hillsFraction   0.75751
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26274
		craterFreq      0.20783
		craterDensity   0.80663
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59082
		volcanoTemp     1079.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.5348
		BumpOffset      1.7674
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.053375
		GasToDust   0.25
		Particles   2058
		GasBright   0.0074496
		DustBright  0.021566
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          185.356604
		SemiMajorAxis   36.8798571
		Eccentricity    0.926169239
		Inclination     -62.7542086
		AscendingNode   -64.0608887
		ArgOfPericenter 54.2207911
		MeanAnomaly     -52.6856763
	}
}

Comet	"C154"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.8566e-14
	Radius          0.14255
	InertiaMoment   0.39769
	RotationPeriod  98.058
	RotationEpoch   0
	Obliquity       156.49
	EqAscendNode    14.108

	AbsMagn         11.598
	SlopeParam      3.9868
	AlbedoBond      0.045428
	AlbedoGeom      0.054513
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.594 0.552 0.470)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.4347
		Randomize      (0.089, -0.168, 0.193)
		colorDistMagn   0.83299
		colorDistFreq   8.9534e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99786
		icecapLatitude  2
		icecapHeight    0.56137
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31942
		heightTempGrad  0.625
		beachWidth      0.00059016
		tropicWidth     0.07
		mainFreq        0.59593
		venusFreq       0.53087
		venusMagn       0.64011
		mareDensity     0
		terraceProb     0.24392
		erosion         0
		montesMagn      0.58326
		montesFreq      3.2292
		montesSpiky     0.90368
		montesFraction  0.24198
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.2217e-05
		hillsFraction   0.71991
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25118
		craterFreq      0.15613
		craterDensity   0.93959
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53992
		volcanoTemp     1147
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.34848
		BumpOffset      0.17424
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0167
		GasToDust   0.25
		Particles   1317
		GasBright   0.0072485
		DustBright  0.019388
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          185.855548
		SemiMajorAxis   36.9460098
		Eccentricity    0.955552836
		Inclination     116.589976
		AscendingNode   14.5992928
		ArgOfPericenter -107.105884
		MeanAnomaly     -55.9647432
	}
}

Comet	"C176"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.3906e-13
	Radius          0.48672
	InertiaMoment   0.39932
	RotationPeriod  48.091
	RotationEpoch   0
	Obliquity       272.91
	EqAscendNode    229.39

	AbsMagn         6.2669
	SlopeParam      3.6931
	AlbedoBond      0.046781
	AlbedoGeom      0.056137
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.591 0.588 0.585)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.75809
		Randomize      (0.765, 0.523, 0.999)
		colorDistMagn   0.34953
		colorDistFreq   6.9333e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.93594
		icecapLatitude  2
		icecapHeight    0.6387
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29127
		heightTempGrad  0.625
		beachWidth      0.001048
		tropicWidth     0.07
		mainFreq        0.4199
		venusFreq       0.61846
		venusMagn       0.54065
		mareDensity     0
		terraceProb     0.21956
		erosion         0
		montesMagn      0.45382
		montesFreq      3.6927
		montesSpiky     0.7955
		montesFraction  0.55744
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00045199
		hillsFraction   0.7326
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27191
		craterFreq      0.20549
		craterDensity   0.74109
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.5484
		volcanoTemp     1086.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.2394
		BumpOffset      0.61969
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0365
		GasToDust   0.25
		Particles   1717
		GasBright   0.017858
		DustBright  0.022603
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          186.245063
		SemiMajorAxis   36.9976126
		Eccentricity    0.948067223
		Inclination     32.6087369
		AscendingNode   -137.207435
		ArgOfPericenter -40.5678237
		MeanAnomaly     -151.751481
	}
}

Comet	"C163"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.1495e-16
	Radius          0.032248
	InertiaMoment   0.39877
	Oblateness      0.0013545
	RotationPeriod  33.093
	RotationEpoch   0
	Obliquity       318.66
	EqAscendNode    36.722

	AbsMagn         10.741
	SlopeParam      4.8508
	AlbedoBond      0.032458
	AlbedoGeom      0.038949
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.583 0.410 0.346)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.88518
		Randomize      (0.365, -0.704, 0.977)
		colorDistMagn   0.8304
		colorDistFreq   3.6844e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.61538
		icecapLatitude  2
		icecapHeight    0.60876
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19881
		heightTempGrad  0.625
		beachWidth      0.000682
		tropicWidth     0.07
		mainFreq        0.41555
		venusFreq       0.59932
		venusMagn       0.53986
		mareDensity     0
		terraceProb     0.31921
		erosion         0
		montesMagn      0.56313
		montesFreq      2.5501
		montesSpiky     0.99275
		montesFraction  0.8856
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.0224e-06
		hillsFraction   0.58813
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.28559
		craterFreq      0.15298
		craterDensity   0.86546
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49853
		volcanoTemp     1049.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.075435
		BumpOffset      0.037717
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0054372
		DustBright  0.010491
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          186.54699
		SemiMajorAxis   37.0375871
		Eccentricity    0.914702897
		Inclination     173.055516
		AscendingNode   -122.482969
		ArgOfPericenter 41.4794517
		MeanAnomaly     -10.6387432
	}
}

Comet	"C107"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.2676e-13
	Radius          0.37079
	InertiaMoment   0.39961
	RotationPeriod  72.026
	RotationEpoch   0
	Obliquity       349.6
	EqAscendNode    176.02

	AbsMagn         11.526
	SlopeParam      2.8215
	AlbedoBond      0.027807
	AlbedoGeom      0.033368
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.579 0.577 0.573)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.97112
		Randomize      (0.642, 0.628, -0.347)
		colorDistMagn   0.66481
		colorDistFreq   6.9594e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99999
		icecapLatitude  2
		icecapHeight    0.5006
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41591
		heightTempGrad  0.625
		beachWidth      0.0013439
		tropicWidth     0.07
		mainFreq        0.61372
		venusFreq       0.54997
		venusMagn       0.74411
		mareDensity     0
		terraceProb     0.15268
		erosion         0
		montesMagn      0.58159
		montesFreq      2.0356
		montesSpiky     0.80868
		montesFraction  0.34542
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00034517
		hillsFraction   0.74823
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23934
		craterFreq      0.21208
		craterDensity   0.93666
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49531
		volcanoTemp     1167.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.8136
		BumpOffset      0.4068
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.032113
		GasToDust   0.25
		Particles   1628
		GasBright   0.017473
		DustBright  0.025084
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          187.653931
		SemiMajorAxis   37.1839594
		Eccentricity    0.944198266
		Inclination     95.6308731
		AscendingNode   -55.9425639
		ArgOfPericenter -111.127274
		MeanAnomaly     79.7736009
	}
}

Comet	"C45"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.5382e-12
	Radius          0.62143
	InertiaMoment   0.39792
	RotationPeriod  105.03
	RotationEpoch   0
	Obliquity       152.43
	EqAscendNode    60.237

	AbsMagn         13.369
	SlopeParam      6.5767
	AlbedoBond      0.061393
	AlbedoGeom      0.073672
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.706 0.617 0.493)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.42341
		Randomize      (0.735, 0.316, 0.472)
		colorDistMagn   0.77212
		colorDistFreq   0.00010099
		detailScale     8
		snowLevel       2
		tropicLatitude  0.74547
		icecapLatitude  2
		icecapHeight    0.6064
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.31341
		heightTempGrad  0.625
		beachWidth      0.0014445
		tropicWidth     0.07
		mainFreq        0.53195
		venusFreq       0.56055
		venusMagn       0.462
		mareDensity     0
		terraceProb     0.47936
		erosion         0
		montesMagn      0.62281
		montesFreq      3.0393
		montesSpiky     0.92132
		montesFraction  0.48735
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00078865
		hillsFraction   0.6505
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2383
		craterFreq      0.25052
		craterDensity   0.89055
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59403
		volcanoTemp     983.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.4183
		BumpOffset      0.70916
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.040439
		GasToDust   0.25
		Particles   1796
		GasBright   0.015751
		DustBright  0.020572
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          188.054995
		SemiMajorAxis   37.2369215
		Eccentricity    0.936569731
		Inclination     65.8427594
		AscendingNode   44.0044545
		ArgOfPericenter -80.3252889
		MeanAnomaly     -86.5732492
	}
}

Comet	"C150"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.5703e-08
	Radius          13.48
	InertiaMoment   0.3981
	Oblateness      0.0068039
	RotationPeriod  14.745
	RotationEpoch   0
	Obliquity       4.418
	EqAscendNode    204.06

	AbsMagn         4.3679
	SlopeParam      6.4575
	AlbedoBond      0.045193
	AlbedoGeom      0.054231
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.742 0.740 0.738)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.012272
		Randomize      (-0.035, 0.070, 0.955)
		colorDistMagn   0.46488
		colorDistFreq   0.073763
		detailScale     64
		snowLevel       2
		tropicLatitude  0.29
		icecapLatitude  2
		icecapHeight    0.57922
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10635
		heightTempGrad  0.625
		beachWidth      0.00091601
		tropicWidth     0.07
		mainFreq        0.41114
		venusFreq       0.58007
		venusMagn       0.53905
		mareDensity     0
		terraceProb     0.46804
		erosion         0
		montesMagn      0.40621
		montesFreq      2.9387
		montesSpiky     0.98027
		montesFraction  0.51002
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.44664
		hillsFraction   0.80975
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20351
		craterFreq      0.23986
		craterDensity   0.94503
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44666
		volcanoTemp     1112.5
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
		MaxLength   0.09005
		GasToDust   0.25
		Particles   2798
		GasBright   0.0075775
		DustBright  0.023818
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          188.840423
		SemiMajorAxis   37.3405316
		Eccentricity    0.915384657
		Inclination     -166.795504
		AscendingNode   39.1693721
		ArgOfPericenter -35.8643321
		MeanAnomaly     7.52688183
	}
}

Comet	"C71"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.2397e-17
	Radius          0.022437
	InertiaMoment   0.3992
	Oblateness      0.0011476
	RotationPeriod  35.983
	RotationEpoch   0
	Obliquity       60.92
	EqAscendNode    85.564

	AbsMagn         2.0445
	SlopeParam      3.7477
	AlbedoBond      0.022265
	AlbedoGeom      0.026718
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.557 0.454 0.339)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.16922
		Randomize      (-0.465, 0.769, 0.515)
		colorDistMagn   0.67482
		colorDistFreq   4.3297e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96888
		icecapLatitude  2
		icecapHeight    0.66788
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49833
		heightTempGrad  0.625
		beachWidth      0.00067651
		tropicWidth     0.07
		mainFreq        0.5396
		venusFreq       0.60175
		venusMagn       0.46724
		mareDensity     0
		terraceProb     0.22402
		erosion         0
		montesMagn      0.34648
		montesFreq      4.3851
		montesSpiky     0.95164
		montesFraction  0.5355
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.4118e-06
		hillsFraction   0.60438
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2338
		craterFreq      0.21539
		craterDensity   0.99224
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52069
		volcanoTemp     1057.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.049326
		BumpOffset      0.024663
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0060659
		DustBright  0.039323
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          189.276273
		SemiMajorAxis   37.397965
		Eccentricity    0.951985056
		Inclination     -163.233412
		AscendingNode   30.2295846
		ArgOfPericenter 64.2486717
		MeanAnomaly     -154.677716
	}
}

Comet	"C64"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.7992e-18
	Radius          0.010199
	InertiaMoment   0.39814
	RotationPeriod  40.76
	RotationEpoch   0
	Obliquity       334.79
	EqAscendNode    147.98

	AbsMagn         7.4734
	SlopeParam      4.0331
	AlbedoBond      0.040581
	AlbedoGeom      0.048697
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.414 0.411 0.409)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.92997
		Randomize      (-0.681, -0.814, 0.350)
		colorDistMagn   0.85906
		colorDistFreq   6.2413e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99999
		icecapLatitude  2
		icecapHeight    0.3494
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32547
		heightTempGrad  0.625
		beachWidth      0.00087174
		tropicWidth     0.07
		mainFreq        0.41601
		venusFreq       0.69551
		venusMagn       0.65681
		mareDensity     0
		terraceProb     0.24782
		erosion         0
		montesMagn      0.48374
		montesFreq      3.13
		montesSpiky     0.88921
		montesFraction  0.76304
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.6682e-07
		hillsFraction   0.70514
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27104
		craterFreq      0.17656
		craterDensity   0.92853
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53899
		volcanoTemp     1122.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.022892
		BumpOffset      0.011446
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0010946
		DustBright  0.012623
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          189.367937
		SemiMajorAxis   37.4100383
		Eccentricity    0.922747785
		Inclination     67.3526616
		AscendingNode   154.115381
		ArgOfPericenter -170.241638
		MeanAnomaly     102.704694
	}
}

Comet	"C43"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.4147e-09
	Radius          6.0431
	InertiaMoment   0.39811
	RotationPeriod  54.664
	RotationEpoch   0
	Obliquity       76.389
	EqAscendNode    335.21

	AbsMagn         8.944
	SlopeParam      4.9188
	AlbedoBond      0.060481
	AlbedoGeom      0.072577
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.708 0.702 0.699)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.21219
		Randomize      (0.673, 0.435, -0.147)
		colorDistMagn   0.59195
		colorDistFreq   0.021172
		detailScale     16
		snowLevel       2
		tropicLatitude  0.79329
		icecapLatitude  2
		icecapHeight    0.37262
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20688
		heightTempGrad  0.625
		beachWidth      0.00085744
		tropicWidth     0.07
		mainFreq        0.44179
		venusFreq       0.58018
		venusMagn       0.7722
		mareDensity     0
		terraceProb     0.32533
		erosion         0
		montesMagn      0.51984
		montesFreq      2.8973
		montesSpiky     0.86759
		montesFraction  0.25637
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.072118
		hillsFraction   0.67897
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24646
		craterFreq      0.17995
		craterDensity   1.0761
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44768
		volcanoTemp     1116.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      14.185
		BumpOffset      7.0926
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.077114
		GasToDust   0.25
		Particles   2537
		GasBright   0.016188
		DustBright  0.022515
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          191.376376
		SemiMajorAxis   37.6740871
		Eccentricity    0.914354607
		Inclination     45.00465
		AscendingNode   130.07303
		ArgOfPericenter 135.484872
		MeanAnomaly     1.92900734
	}
}

Comet	"C86"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.7066e-16
	Radius          0.034823
	InertiaMoment   0.39959
	RotationPeriod  94.313
	RotationEpoch   0
	Obliquity       91.205
	EqAscendNode    3.2526

	AbsMagn         14.853
	SlopeParam      3.7399
	AlbedoBond      0.041711
	AlbedoGeom      0.050053
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.522 0.476 0.414)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25335
		Randomize      (-0.004, -0.123, -0.844)
		colorDistMagn   0.38079
		colorDistFreq   5.8904e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.91623
		icecapLatitude  2
		icecapHeight    0.50746
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29732
		heightTempGrad  0.625
		beachWidth      0.0013296
		tropicWidth     0.07
		mainFreq        0.64227
		venusFreq       0.60408
		venusMagn       0.5694
		mareDensity     0
		terraceProb     0.22339
		erosion         0
		montesMagn      0.65217
		montesFreq      3.5032
		montesSpiky     0.99665
		montesFraction  0.46676
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3062e-06
		hillsFraction   0.71694
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22122
		craterFreq      0.21401
		craterDensity   0.68142
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54732
		volcanoTemp     1061.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.080525
		BumpOffset      0.040263
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0068588
		DustBright  0.020683
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          191.908147
		SemiMajorAxis   37.7438441
		Eccentricity    0.92058752
		Inclination     105.715366
		AscendingNode   114.228889
		ArgOfPericenter 45.721149
		MeanAnomaly     80.5661155
	}
}

Comet	"C173"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.0613e-08
	Radius          14.759
	InertiaMoment   0.39794
	Oblateness      0.0010035
	RotationPeriod  38.384
	RotationEpoch   0
	Obliquity       338.85
	EqAscendNode    101.85

	AbsMagn         6.4934
	SlopeParam      7.1811
	AlbedoBond      0.03312
	AlbedoGeom      0.039744
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.788 0.739 0.701)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.94126
		Randomize      (0.673, 0.702, 0.071)
		colorDistMagn   0.92318
		colorDistFreq   0.16358
		detailScale     64
		snowLevel       2
		tropicLatitude  0.9014
		icecapLatitude  2
		icecapHeight    0.77291
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33147
		heightTempGrad  0.625
		beachWidth      0.00091738
		tropicWidth     0.07
		mainFreq        0.4813
		venusFreq       0.64978
		venusMagn       0.77982
		mareDensity     0
		terraceProb     0.53712
		erosion         0
		montesMagn      0.45946
		montesFreq      3.3339
		montesSpiky     0.8634
		montesFraction  0.57076
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.38512
		hillsFraction   0.80093
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22219
		craterFreq      0.20579
		craterDensity   0.98554
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51266
		volcanoTemp     1285.5
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
		MaxLength   0.091512
		GasToDust   0.25
		Particles   2828
		GasBright   0.018417
		DustBright  0.025613
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          192.694496
		SemiMajorAxis   37.8468781
		Eccentricity    0.917441135
		Inclination     123.777487
		AscendingNode   -73.422699
		ArgOfPericenter 46.8497418
		MeanAnomaly     171.416506
	}
}

Comet	"C35"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.0292e-09
	Radius          8.5658
	InertiaMoment   0.39875
	RotationPeriod  91.803
	RotationEpoch   0
	Obliquity       132.24
	EqAscendNode    355.11

	AbsMagn         6.1064
	SlopeParam      4.6202
	AlbedoBond      0.057921
	AlbedoGeom      0.069505
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.722 0.719 0.717)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.36733
		Randomize      (0.427, 0.911, -0.622)
		colorDistMagn   0.68482
		colorDistFreq   0.038027
		detailScale     32
		snowLevel       2
		tropicLatitude  0.77297
		icecapLatitude  2
		icecapHeight    0.45584
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18075
		heightTempGrad  0.625
		beachWidth      0.002
		tropicWidth     0.07
		mainFreq        0.4701
		venusFreq       0.65617
		venusMagn       0.59357
		mareDensity     0
		terraceProb     0.29868
		erosion         0
		montesMagn      0.44982
		montesFreq      3.923
		montesSpiky     0.87232
		montesFraction  0.71062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11095
		hillsFraction   0.87579
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22772
		craterFreq      0.21864
		craterDensity   0.70122
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55363
		volcanoTemp     1347.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      18.867
		BumpOffset      9.4336
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.08274
		GasToDust   0.25
		Particles   2651
		GasBright   0.017201
		DustBright  0.03102
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          192.883447
		SemiMajorAxis   37.871615
		Eccentricity    0.927459214
		Inclination     141.791473
		AscendingNode   -103.415038
		ArgOfPericenter 49.6189047
		MeanAnomaly     72.2566645
	}
}

Comet	"C67"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.1235e-11
	Radius          2.1218
	InertiaMoment   0.39945
	RotationPeriod  50.404
	RotationEpoch   0
	Obliquity       268.84
	EqAscendNode    275.51

	AbsMagn         7.2621
	SlopeParam      6.0124
	AlbedoBond      0.021182
	AlbedoGeom      0.025418
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.660 0.654 0.651)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.74679
		Randomize      (-0.589, -0.993, -0.722)
		colorDistMagn   0.26863
		colorDistFreq   0.0036092
		detailScale     8
		snowLevel       2
		tropicLatitude  0.98176
		icecapLatitude  2
		icecapHeight    0.68827
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.28527
		heightTempGrad  0.625
		beachWidth      0.00070236
		tropicWidth     0.07
		mainFreq        0.33941
		venusFreq       0.63788
		venusMagn       0.71776
		mareDensity     0
		terraceProb     0.42605
		erosion         0
		montesMagn      0.47852
		montesFreq      3.3722
		montesSpiky     0.85122
		montesFraction  0.74092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011965
		hillsFraction   0.6607
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25043
		craterFreq      0.17605
		craterDensity   1.0001
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39252
		volcanoTemp     1123
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.9772
		BumpOffset      2.4886
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.060239
		GasToDust   0.25
		Particles   2196
		GasBright   0.0010439
		DustBright  0.0091039
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          194.656911
		SemiMajorAxis   38.1034008
		Eccentricity    0.958661685
		Inclination     -64.4803459
		AscendingNode   -102.730055
		ArgOfPericenter 100.178341
		MeanAnomaly     -42.3975463
	}
}

Comet	"C128"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.9447e-10
	Radius          3.948
	InertiaMoment   0.39964
	RotationPeriod  56.62
	RotationEpoch   0
	Obliquity       248
	EqAscendNode    348.78

	AbsMagn         9.7084
	SlopeParam      7.2659
	AlbedoBond      0.043946
	AlbedoGeom      0.052735
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.686 0.683 0.682)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.68889
		Randomize      (-0.712, -0.621, 0.149)
		colorDistMagn   0.93706
		colorDistFreq   0.0082044
		detailScale     16
		snowLevel       2
		tropicLatitude  0.55204
		icecapLatitude  2
		icecapHeight    0.4935
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1345
		heightTempGrad  0.625
		beachWidth      0.0010582
		tropicWidth     0.07
		mainFreq        0.58756
		venusFreq       0.63938
		venusMagn       0.63931
		mareDensity     0
		terraceProb     0.54527
		erosion         0
		montesMagn      0.5384
		montesFreq      2.5982
		montesSpiky     0.85173
		montesFraction  0.85887
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.027492
		hillsFraction   0.78792
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25682
		craterFreq      0.21011
		craterDensity   0.84595
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43513
		volcanoTemp     973.12
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10.082
		BumpOffset      5.0409
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.070251
		GasToDust   0.25
		Particles   2399
		GasBright   0.0012672
		DustBright  0.016304
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          194.690708
		SemiMajorAxis   38.1078111
		Eccentricity    0.96873938
		Inclination     113.750865
		AscendingNode   -36.4152504
		ArgOfPericenter -89.709428
		MeanAnomaly     179.343881
	}
}

Comet	"C22"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1718e-12
	Radius          0.56756
	InertiaMoment   0.39807
	RotationPeriod  69.687
	RotationEpoch   0
	Obliquity       177.99
	EqAscendNode    162.45

	AbsMagn         10.56
	SlopeParam      6.0512
	AlbedoBond      0.038431
	AlbedoGeom      0.046117
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.601 0.597 0.590)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.49442
		Randomize      (0.027, -0.316, -0.644)
		colorDistMagn   0.28648
		colorDistFreq   0.00018028
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96342
		icecapLatitude  2
		icecapHeight    0.39088
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48829
		heightTempGrad  0.625
		beachWidth      0.0011431
		tropicWidth     0.07
		mainFreq        0.46619
		venusFreq       0.62913
		venusMagn       0.59308
		mareDensity     0
		terraceProb     0.42969
		erosion         0
		montesMagn      0.55884
		montesFreq      2.6382
		montesSpiky     0.83696
		montesFraction  0.41916
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00085526
		hillsFraction   0.65435
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23029
		craterFreq      0.18308
		craterDensity   0.85664
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50164
		volcanoTemp     1010.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.3941
		BumpOffset      0.69706
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.038977
		GasToDust   0.25
		Particles   1767
		GasBright   0.006081
		DustBright  0.017607
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          194.92814
		SemiMajorAxis   38.1387873
		Eccentricity    0.921093327
		Inclination     -103.568198
		AscendingNode   -10.2892317
		ArgOfPericenter 41.5473528
		MeanAnomaly     -27.5152563
	}
}

Comet	"C90"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.0381e-11
	Radius          2.3233
	InertiaMoment   0.39935
	RotationPeriod  71.55
	RotationEpoch   0
	Obliquity       243.28
	EqAscendNode    173.3

	AbsMagn         8.9937
	SlopeParam      6.5245
	AlbedoBond      0.041919
	AlbedoGeom      0.050302
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.665 0.658 0.655)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67578
		Randomize      (0.119, -0.361, 0.393)
		colorDistMagn   0.75952
		colorDistFreq   0.0027903
		detailScale     8
		snowLevel       2
		tropicLatitude  0.95392
		icecapLatitude  2
		icecapHeight    0.48446
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11039
		heightTempGrad  0.625
		beachWidth      0.0013037
		tropicWidth     0.07
		mainFreq        0.42465
		venusFreq       0.56948
		venusMagn       0.65759
		mareDensity     0
		terraceProb     0.4744
		erosion         0
		montesMagn      0.52105
		montesFreq      2.2562
		montesSpiky     0.92697
		montesFraction  0.88027
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.011036
		hillsFraction   0.65683
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26087
		craterFreq      0.24578
		craterDensity   1.0907
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49658
		volcanoTemp     995.97
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.8872
		BumpOffset      2.4436
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.061701
		GasToDust   0.25
		Particles   2226
		GasBright   0.0063747
		DustBright  0.016408
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          195.05004
		SemiMajorAxis   38.154686
		Eccentricity    0.961680398
		Inclination     13.1143647
		AscendingNode   -47.149815
		ArgOfPericenter -160.829393
		MeanAnomaly     179.698239
	}
}

Comet	"C94"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.5033e-17
	Radius          0.024567
	InertiaMoment   0.3991
	RotationPeriod  55.835
	RotationEpoch   0
	Obliquity       35.356
	EqAscendNode    343.35

	AbsMagn         5.1689
	SlopeParam      4.0177
	AlbedoBond      0.042127
	AlbedoGeom      0.050552
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.457 0.451 0.446)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.098212
		Randomize      (0.242, -0.599, -0.369)
		colorDistMagn   0.25766
		colorDistFreq   3.3054e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.74606
		icecapLatitude  2
		icecapHeight    0.45782
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32345
		heightTempGrad  0.625
		beachWidth      0.00097788
		tropicWidth     0.07
		mainFreq        0.6093
		venusFreq       0.48191
		venusMagn       0.74356
		mareDensity     0
		terraceProb     0.24652
		erosion         0
		montesMagn      0.42638
		montesFreq      2.7291
		montesSpiky     0.99462
		montesFraction  0.59636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3059e-06
		hillsFraction   0.60038
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24155
		craterFreq      0.1711
		craterDensity   1.0664
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4406
		volcanoTemp     1330.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.060186
		BumpOffset      0.030093
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0055976
		DustBright  0.012426
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          195.501209
		SemiMajorAxis   38.2135002
		Eccentricity    0.982829471
		Inclination     12.9874332
		AscendingNode   -7.83534039
		ArgOfPericenter 45.0249361
		MeanAnomaly     56.7098968
	}
}

Comet	"C66"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.857e-09
	Radius          6.6167
	InertiaMoment   0.39795
	RotationPeriod  77.069
	RotationEpoch   0
	Obliquity       50.826
	EqAscendNode    233

	AbsMagn         10.884
	SlopeParam      5.2302
	AlbedoBond      0.040683
	AlbedoGeom      0.048819
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.712 0.709 0.703)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.14118
		Randomize      (-0.619, -0.933, 0.968)
		colorDistMagn   0.1192
		colorDistFreq   0.013002
		detailScale     32
		snowLevel       2
		tropicLatitude  0.62051
		icecapLatitude  2
		icecapHeight    0.60098
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.432
		heightTempGrad  0.625
		beachWidth      0.0011588
		tropicWidth     0.07
		mainFreq        0.50877
		venusFreq       0.64995
		venusMagn       0.69618
		mareDensity     0
		terraceProb     0.35357
		erosion         0
		montesMagn      0.56653
		montesFreq      3.2845
		montesSpiky     0.93471
		montesFraction  0.37559
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.11495
		hillsFraction   0.67498
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25539
		craterFreq      0.24827
		craterDensity   0.77932
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51326
		volcanoTemp     1089.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.983
		BumpOffset      6.9913
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.078577
		GasToDust   0.25
		Particles   2567
		GasBright   0.0010791
		DustBright  0.010259
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          197.430506
		SemiMajorAxis   38.4644943
		Eccentricity    0.937202413
		Inclination     147.2456
		AscendingNode   -52.9080215
		ArgOfPericenter 160.419116
		MeanAnomaly     -5.87549569
	}
}

Comet	"C92"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.74e-14
	Radius          0.2389
	InertiaMoment   0.39922
	Oblateness      0.0038177
	RotationPeriod  19.729
	RotationEpoch   0
	Obliquity       319.32
	EqAscendNode    258.33

	AbsMagn         13.49
	SlopeParam      2.8306
	AlbedoBond      0.042023
	AlbedoGeom      0.050427
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.562 0.557 0.550)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.887
		Randomize      (0.181, -0.480, -0.988)
		colorDistMagn   0.9483
		colorDistFreq   3.6942e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.56632
		icecapLatitude  2
		icecapHeight    0.66185
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21692
		heightTempGrad  0.625
		beachWidth      0.00099081
		tropicWidth     0.07
		mainFreq        0.51636
		venusFreq       0.54597
		venusMagn       0.69701
		mareDensity     0
		terraceProb     0.15333
		erosion         0
		montesMagn      0.62538
		montesFreq      2.5446
		montesSpiky     0.96297
		montesFraction  0.43677
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00012021
		hillsFraction   0.62888
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24999
		craterFreq      0.21346
		craterDensity   0.89328
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47307
		volcanoTemp     1063.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.6114
		BumpOffset      0.3057
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.025026
		GasToDust   0.25
		Particles   1485
		GasBright   0.0060228
		DustBright  0.01438
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          197.50309
		SemiMajorAxis   38.4739212
		Eccentricity    0.950243352
		Inclination     18.7343389
		AscendingNode   -59.576486
		ArgOfPericenter -145.3977
		MeanAnomaly     -101.060178
	}
}

Comet	"C143"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.4748e-09
	Radius          6.1274
	InertiaMoment   0.39436
	Oblateness      0.0032264
	RotationPeriod  21.265
	RotationEpoch   0
	Obliquity       278.29
	EqAscendNode    266.47

	AbsMagn         8.6171
	SlopeParam      7.237
	AlbedoBond      0.031022
	AlbedoGeom      0.037226
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.707 0.703 0.701)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.77301
		Randomize      (-0.250, 0.486, 0.790)
		colorDistMagn   0.65479
		colorDistFreq   0.031366
		detailScale     16
		snowLevel       2
		tropicLatitude  0.98655
		icecapLatitude  2
		icecapHeight    0.70502
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33349
		heightTempGrad  0.625
		beachWidth      0.00081124
		tropicWidth     0.07
		mainFreq        0.7126
		venusFreq       0.64264
		venusMagn       0.67855
		mareDensity     0
		terraceProb     0.54249
		erosion         0
		montesMagn      0.51186
		montesFreq      2.2077
		montesSpiky     0.92981
		montesFraction  0.72285
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.085384
		hillsFraction   0.54298
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24483
		craterFreq      0.20869
		craterDensity   0.89102
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46857
		volcanoTemp     1277.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      13.419
		BumpOffset      6.7094
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.077338
		GasToDust   0.25
		Particles   2542
		GasBright   0.0074486
		DustBright  0.032275
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          198.648701
		SemiMajorAxis   38.6225556
		Eccentricity    0.933104745
		Inclination     -1.2097885
		AscendingNode   -158.217494
		ArgOfPericenter 31.4604288
		MeanAnomaly     75.1498011
	}
}

Comet	"C11"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.3086e-08
	Radius          24.393
	InertiaMoment   0.39664
	RotationPeriod  102.49
	RotationEpoch   0
	Obliquity       299.78
	EqAscendNode    54.809

	AbsMagn         7.8438
	SlopeParam      3.7788
	AlbedoBond      0.053695
	AlbedoGeom      0.064434
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.804 0.755 0.731)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.83273
		Randomize      (-0.312, 0.339, -0.047)
		colorDistMagn   0.97407
		colorDistFreq   0.17799
		detailScale     64
		snowLevel       2
		tropicLatitude  0.99136
		icecapLatitude  2
		icecapHeight    0.58231
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.10237
		heightTempGrad  0.625
		beachWidth      0.0010642
		tropicWidth     0.07
		mainFreq        0.55158
		venusFreq       0.59241
		venusMagn       0.63572
		mareDensity     0
		terraceProb     0.22658
		erosion         0
		montesMagn      0.49287
		montesFreq      3.1455
		montesSpiky     0.88504
		montesFraction  0.17372
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3964
		hillsFraction   0.40821
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22297
		craterFreq      0.2208
		craterDensity   0.79314
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.61661
		volcanoTemp     1240.8
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
		MaxLength   0.099615
		GasToDust   0.25
		Particles   2992
		GasBright   0.0063288
		DustBright  0.030447
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          200.749799
		SemiMajorAxis   38.8944171
		Eccentricity    0.925112354
		Inclination     52.0215556
		AscendingNode   104.777299
		ArgOfPericenter -0.873666639
		MeanAnomaly     -114.976993
	}
}

Comet	"C27"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1476e-08
	Radius          12.142
	InertiaMoment   0.39928
	Oblateness      0.0016858
	RotationPeriod  29.689
	RotationEpoch   0
	Obliquity       188.09
	EqAscendNode    15.01

	AbsMagn         1.1165
	SlopeParam      4.3349
	AlbedoBond      0.056178
	AlbedoGeom      0.067414
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.794 0.738 0.677)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.52246
		Randomize      (0.181, -0.613, 0.903)
		colorDistMagn   0.77717
		colorDistFreq   0.067071
		detailScale     32
		snowLevel       2
		tropicLatitude  0.1241
		icecapLatitude  2
		icecapHeight    0.50599
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
		beachWidth      0.0012608
		tropicWidth     0.07
		mainFreq        0.49739
		venusFreq       0.5864
		venusMagn       0.69493
		mareDensity     0
		terraceProb     0.27368
		erosion         0
		montesMagn      0.32155
		montesFreq      3.0207
		montesSpiky     0.87678
		montesFraction  0.56808
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.41946
		hillsFraction   0.58275
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26697
		craterFreq      0.25251
		craterDensity   0.74711
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50868
		volcanoTemp     1178.6
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
		MaxLength   0.088365
		GasToDust   0.25
		Particles   2764
		GasBright   0.0052362
		DustBright  0.012503
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          201.300634
		SemiMajorAxis   38.9655325
		Eccentricity    0.936533797
		Inclination     -3.10684654
		AscendingNode   61.2486358
		ArgOfPericenter 130.487289
		MeanAnomaly     -79.9667571
	}
}

Comet	"C16"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.629e-15
	Radius          0.082727
	InertiaMoment   0.39857
	RotationPeriod  49.255
	RotationEpoch   0
	Obliquity       309.88
	EqAscendNode    267.37

	AbsMagn         11.096
	SlopeParam      2.1308
	AlbedoBond      0.03812
	AlbedoGeom      0.045744
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.510 0.508 0.504)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.86077
		Randomize      (-0.158, 0.041, -0.500)
		colorDistMagn   0.59961
		colorDistFreq   5.9058e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.90122
		icecapLatitude  2
		icecapHeight    0.6476
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1687
		heightTempGrad  0.625
		beachWidth      0.00058192
		tropicWidth     0.07
		mainFreq        0.58386
		venusFreq       0.53933
		venusMagn       0.74029
		mareDensity     0
		terraceProb     0.10756
		erosion         0
		montesMagn      0.57153
		montesFreq      3.6305
		montesSpiky     0.90945
		montesFraction  0.45054
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6966e-05
		hillsFraction   0.7502
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25647
		craterFreq      0.18393
		craterDensity   1.0039
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41578
		volcanoTemp     1008.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.18602
		BumpOffset      0.093009
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0079274
		GasToDust   0.25
		Particles   1139
		GasBright   0.0064907
		DustBright  0.024336
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          204.468062
		SemiMajorAxis   39.3732116
		Eccentricity    0.912691242
		Inclination     -115.378959
		AscendingNode   -76.7792935
		ArgOfPericenter 111.421964
		MeanAnomaly     -70.1853869
	}
}

Comet	"C85"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.2082e-15
	Radius          0.10859
	InertiaMoment   0.39818
	Oblateness      0.0022531
	RotationPeriod  25.631
	RotationEpoch   0
	Obliquity       233.19
	EqAscendNode    320.74

	AbsMagn         5.925
	SlopeParam      3.1542
	AlbedoBond      0.024982
	AlbedoGeom      0.029978
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.523 0.519 0.517)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64774
		Randomize      (-0.035, -0.063, 0.846)
		colorDistMagn   0.26134
		colorDistFreq   7.3201e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.98004
		icecapLatitude  2
		icecapHeight    0.31608
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44406
		heightTempGrad  0.625
		beachWidth      0.00088604
		tropicWidth     0.07
		mainFreq        0.38806
		venusFreq       0.6124
		venusMagn       0.53491
		mareDensity     0
		terraceProb     0.17711
		erosion         0
		montesMagn      0.4453
		montesFreq      3.3972
		montesSpiky     0.9066
		montesFraction  0.63862
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1926e-05
		hillsFraction   0.73439
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22676
		craterFreq      0.17283
		craterDensity   0.8368
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4895
		volcanoTemp     1027.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.28965
		BumpOffset      0.14483
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.012314
		GasToDust   0.25
		Particles   1228
		GasBright   0.0069341
		DustBright  0.021798
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          204.813469
		SemiMajorAxis   39.4175411
		Eccentricity    0.960492861
		Inclination     -58.6412727
		AscendingNode   -99.5176075
		ArgOfPericenter -140.581852
		MeanAnomaly     -122.312287
	}
}

Comet	"C174"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.7971e-10
	Radius          4.7331
	InertiaMoment   0.39944
	Oblateness      0.025605
	RotationPeriod  7.621
	RotationEpoch   0
	Obliquity       196.87
	EqAscendNode    144.36

	AbsMagn         -0.63161
	SlopeParam      2.4208
	AlbedoBond      0.046653
	AlbedoGeom      0.055984
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.695 0.693 0.690)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.54687
		Randomize      (0.704, 0.642, 0.380)
		colorDistMagn   0.05574
		colorDistFreq   0.013384
		detailScale     16
		snowLevel       2
		tropicLatitude  0.7539
		icecapLatitude  2
		icecapHeight    0.45052
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.18474
		heightTempGrad  0.625
		beachWidth      0.0010609
		tropicWidth     0.07
		mainFreq        0.28924
		venusFreq       0.63774
		venusMagn       0.83691
		mareDensity     0
		terraceProb     0.12549
		erosion         0
		montesMagn      0.26903
		montesFreq      3.4285
		montesSpiky     0.97401
		montesFraction  0.3879
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.04077
		hillsFraction   0.77389
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21509
		craterFreq      0.23758
		craterDensity   0.91372
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.38575
		volcanoTemp     1219.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      9.5381
		BumpOffset      4.7691
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.073175
		GasToDust   0.25
		Particles   2458
		GasBright   0.018249
		DustBright  0.024591
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          206.376622
		SemiMajorAxis   39.6178455
		Eccentricity    0.927253381
		Inclination     143.833984
		AscendingNode   -132.431068
		ArgOfPericenter 102.000146
		MeanAnomaly     118.649533
	}
}

Comet	"C153"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.6303e-13
	Radius          0.44452
	InertiaMoment   0.39942
	Oblateness      0.0019724
	RotationPeriod  27.458
	RotationEpoch   0
	Obliquity       298.47
	EqAscendNode    331.6

	AbsMagn         4.0406
	SlopeParam      3.4168
	AlbedoBond      0.031761
	AlbedoGeom      0.038113
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.587 0.584 0.581)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.8291
		Randomize      (0.058, -0.109, -0.117)
		colorDistMagn   0.74194
		colorDistFreq   0.00011404
		detailScale     8
		snowLevel       2
		tropicLatitude  0.87945
		icecapLatitude  2
		icecapHeight    0.45978
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46615
		heightTempGrad  0.625
		beachWidth      0.0010466
		tropicWidth     0.07
		mainFreq        0.33263
		venusFreq       0.54793
		venusMagn       0.61989
		mareDensity     0
		terraceProb     0.19739
		erosion         0
		montesMagn      0.39792
		montesFreq      3.1531
		montesSpiky     0.96315
		montesFraction  0.49636
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00050209
		hillsFraction   0.73765
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25627
		craterFreq      0.23957
		craterDensity   1.03
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48427
		volcanoTemp     1013.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.0111
		BumpOffset      0.50555
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.035038
		GasToDust   0.25
		Particles   1687
		GasBright   0.0073582
		DustBright  0.020468
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          206.718073
		SemiMajorAxis   39.661532
		Eccentricity    0.913243506
		Inclination     179.624216
		AscendingNode   82.3895357
		ArgOfPericenter 46.8629101
		MeanAnomaly     130.38965
	}
}

Comet	"C48"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.5153e-17
	Radius          0.020492
	InertiaMoment   0.3993
	Oblateness      0.012164
	RotationPeriod  11.055
	RotationEpoch   0
	Obliquity       86.484
	EqAscendNode    187.77

	AbsMagn         12.894
	SlopeParam      3.4729
	AlbedoBond      0.039764
	AlbedoGeom      0.047717
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.449 0.444 0.438)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.24023
		Randomize      (0.827, 0.138, -0.600)
		colorDistMagn   0.1289
		colorDistFreq   1.999e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.52891
		icecapLatitude  2
		icecapHeight    0.49908
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27321
		heightTempGrad  0.625
		beachWidth      0.00067513
		tropicWidth     0.07
		mainFreq        0.47398
		venusFreq       0.49603
		venusMagn       0.59405
		mareDensity     0
		terraceProb     0.20183
		erosion         0
		montesMagn      0.61256
		montesFreq      3.2629
		montesSpiky     0.89642
		montesFraction  0.47323
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.9572e-07
		hillsFraction   0.60834
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22493
		craterFreq      0.2502
		craterDensity   0.95008
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45855
		volcanoTemp     1184.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.048761
		BumpOffset      0.024381
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.014959
		DustBright  0.017795
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          207.131085
		SemiMajorAxis   39.7143423
		Eccentricity    0.946379302
		Inclination     -106.517016
		AscendingNode   -150.302666
		ArgOfPericenter -100.041667
		MeanAnomaly     -171.227366
	}
}

Comet	"C139"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.9659e-15
	Radius          0.091844
	InertiaMoment   0.39669
	Oblateness      0.0010418
	RotationPeriod  37.589
	RotationEpoch   0
	Obliquity       126.21
	EqAscendNode    96.42

	AbsMagn         13.616
	SlopeParam      3.9946
	AlbedoBond      0.030712
	AlbedoGeom      0.036855
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.639 0.540 0.385)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.35058
		Randomize      (-0.373, 0.724, -0.448)
		colorDistMagn   0.23887
		colorDistFreq   6.5992e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.78631
		icecapLatitude  2
		icecapHeight    0.72982
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12042
		heightTempGrad  0.625
		beachWidth      0.00053709
		tropicWidth     0.07
		mainFreq        0.50079
		venusFreq       0.52422
		venusMagn       0.5974
		mareDensity     0
		terraceProb     0.24457
		erosion         0
		montesMagn      0.62803
		montesFreq      3.479
		montesSpiky     0.99885
		montesFraction  0.37753
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.827e-05
		hillsFraction   0.60693
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26761
		craterFreq      0.16066
		craterDensity   0.89601
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51529
		volcanoTemp     942.82
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.21499
		BumpOffset      0.1075
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.009613
		GasToDust   0.25
		Particles   1174
		GasBright   0.0069722
		DustBright  0.037511
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          210.767356
		SemiMajorAxis   40.1777938
		Eccentricity    0.945009802
		Inclination     -66.1009983
		AscendingNode   120.871111
		ArgOfPericenter -128.472958
		MeanAnomaly     113.837194
	}
}

Comet	"C58"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.289e-09
	Radius          9.3789
	InertiaMoment   0.39863
	Oblateness      0.0042502
	RotationPeriod  18.676
	RotationEpoch   0
	Obliquity       106.67
	EqAscendNode    252.9

	AbsMagn         7.8921
	SlopeParam      4.9103
	AlbedoBond      0.040274
	AlbedoGeom      0.048329
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.726 0.723 0.721)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.29632
		Randomize      (-0.865, -0.457, 0.494)
		colorDistMagn   0.27225
		colorDistFreq   0.014078
		detailScale     32
		snowLevel       2
		tropicLatitude  0.83286
		icecapLatitude  2
		icecapHeight    0.63626
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40587
		heightTempGrad  0.625
		beachWidth      0.00091051
		tropicWidth     0.07
		mainFreq        0.53577
		venusFreq       0.58268
		venusMagn       0.46469
		mareDensity     0
		terraceProb     0.32456
		erosion         0
		montesMagn      0.49406
		montesFreq      2.6849
		montesSpiky     0.93721
		montesFraction  0.81766
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.2112
		hillsFraction   0.85747
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23608
		craterFreq      0.17756
		craterDensity   0.79784
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47595
		volcanoTemp     1220.5
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
		MaxLength   0.084202
		GasToDust   0.25
		Particles   2680
		GasBright   0.00070161
		DustBright  0.020154
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          211.729098
		SemiMajorAxis   40.2999232
		Eccentricity    0.957169229
		Inclination     -128.76901
		AscendingNode   168.989486
		ArgOfPericenter -130.729783
		MeanAnomaly     173.183722
	}
}

Comet	"C161"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.9769e-13
	Radius          0.3136
	InertiaMoment   0.3989
	RotationPeriod  88.005
	RotationEpoch   0
	Obliquity       242.63
	EqAscendNode    311.7

	AbsMagn         7.3601
	SlopeParam      3.7009
	AlbedoBond      0.032321
	AlbedoGeom      0.038786
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.574 0.567 0.562)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.67396
		Randomize      (0.304, -0.585, 0.358)
		colorDistMagn   0.64977
		colorDistFreq   6.2994e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.97371
		icecapLatitude  2
		icecapHeight    0.38101
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.49228
		heightTempGrad  0.625
		beachWidth      0.00099493
		tropicWidth     0.07
		mainFreq        0.28078
		venusFreq       0.61598
		venusMagn       0.83508
		mareDensity     0
		terraceProb     0.2202
		erosion         0
		montesMagn      0.48094
		montesFreq      2.2671
		montesSpiky     0.96096
		montesFraction  0.62561
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00027645
		hillsFraction   0.61729
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21931
		craterFreq      0.20696
		craterDensity   1.0096
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.52143
		volcanoTemp     982.22
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.75451
		BumpOffset      0.37726
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.029413
		GasToDust   0.25
		Particles   1573
		GasBright   0.0059679
		DustBright  0.01234
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          211.730714
		SemiMajorAxis   40.3001283
		Eccentricity    0.935112716
		Inclination     110.1991
		AscendingNode   -117.634064
		ArgOfPericenter -35.2030701
		MeanAnomaly     174.803118
	}
}

Comet	"C69"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.6582e-14
	Radius          0.21819
	InertiaMoment   0.39933
	RotationPeriod  93.452
	RotationEpoch   0
	Obliquity       344.88
	EqAscendNode    0.53869

	AbsMagn         10.62
	SlopeParam      2.4935
	AlbedoBond      0.02175
	AlbedoGeom      0.0261
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.669 0.589 0.435)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.95801
		Randomize      (-0.527, 0.888, -0.103)
		colorDistMagn   0.48971
		colorDistFreq   2.3646e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.86904
		icecapLatitude  2
		icecapHeight    0.49192
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.3918
		heightTempGrad  0.625
		beachWidth      0.0012894
		tropicWidth     0.07
		mainFreq        0.44991
		venusFreq       0.61857
		venusMagn       0.77367
		mareDensity     0
		terraceProb     0.13023
		erosion         0
		montesMagn      0.56026
		montesFreq      3.5988
		montesSpiky     0.91272
		montesFraction  0.35525
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0001298
		hillsFraction   0.63272
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24194
		craterFreq      0.24796
		craterDensity   0.85961
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54934
		volcanoTemp     1090.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.49762
		BumpOffset      0.24881
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.023564
		GasToDust   0.25
		Particles   1455
		GasBright   0.005649
		DustBright  0.042119
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          213.07338
		SemiMajorAxis   40.4703211
		Eccentricity    0.918136223
		Inclination     132.115238
		AscendingNode   -37.8918866
		ArgOfPericenter 92.4302657
		MeanAnomaly     92.9746994
	}
}

Comet	"C135"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.2003e-09
	Radius          8.6854
	InertiaMoment   0.39739
	RotationPeriod  51.94
	RotationEpoch   0
	Obliquity       334.13
	EqAscendNode    286.37

	AbsMagn         5.7393
	SlopeParam      6.474
	AlbedoBond      0.030393
	AlbedoGeom      0.036472
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.724 0.720 0.716)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.92815
		Randomize      (-0.496, 0.962, 0.315)
		colorDistMagn   0.74696
		colorDistFreq   0.055684
		detailScale     32
		snowLevel       2
		tropicLatitude  0.88517
		icecapLatitude  2
		icecapHeight    0.75956
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30736
		heightTempGrad  0.625
		beachWidth      0.00056294
		tropicWidth     0.07
		mainFreq        0.26213
		venusFreq       0.57753
		venusMagn       0.83159
		mareDensity     0
		terraceProb     0.4696
		erosion         0
		montesMagn      0.44066
		montesFreq      3.1338
		montesSpiky     0.93239
		montesFraction  0.57678
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.15442
		hillsFraction   0.66319
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22577
		craterFreq      0.24131
		craterDensity   0.90099
		craterOctaves   11
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.59837
		volcanoTemp     1008.4
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
		MaxLength   0.082963
		GasToDust   0.25
		Particles   2655
		GasBright   0.006203
		DustBright  0.043039
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          213.318963
		SemiMajorAxis   40.5014119
		Eccentricity    0.955538418
		Inclination     142.537922
		AscendingNode   20.2410597
		ArgOfPericenter 154.816549
		MeanAnomaly     -178.727196
	}
}

Comet	"C172"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.2512e-07
	Radius          46.013
	InertiaMoment   0.39956
	RotationPeriod  62.689
	RotationEpoch   0
	Obliquity       120.84
	EqAscendNode    59.335

	AbsMagn         9.9944
	SlopeParam      5.9247
	AlbedoBond      0.046526
	AlbedoGeom      0.055832
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.833 0.782 0.760)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.33565
		Randomize      (0.642, 0.761, -0.239)
		colorDistMagn   0.82782
		colorDistFreq   0.49631
		detailScale     128
		snowLevel       2
		tropicLatitude  0.72148
		icecapLatitude  2
		icecapHeight    0.6572
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.4782
		heightTempGrad  0.625
		beachWidth      0.0013738
		tropicWidth     0.07
		mainFreq        0.63688
		venusFreq       0.66573
		venusMagn       0.74691
		mareDensity     0
		terraceProb     0.41783
		erosion         0
		montesMagn      0.54529
		montesFreq      3.2501
		montesSpiky     0.94007
		montesFraction  0.77895
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.6159
		hillsFraction   0.83808
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22755
		craterFreq      0.14937
		craterDensity   0.75667
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45588
		volcanoTemp     1151.9
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
		GasBright   0.018567
		DustBright  0.026653
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          215.821613
		SemiMajorAxis   40.8175697
		Eccentricity    0.959758303
		Inclination     -25.9334266
		AscendingNode   128.057687
		ArgOfPericenter 26.4744184
		MeanAnomaly     176.3459
	}
}

Comet	"C179"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.6499e-17
	Radius          0.016049
	InertiaMoment   0.39721
	RotationPeriod  57.805
	RotationEpoch   0
	Obliquity       206.97
	EqAscendNode    356.92

	AbsMagn         6.0347
	SlopeParam      5.5126
	AlbedoBond      0.033503
	AlbedoGeom      0.040203
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.435 0.432 0.430)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.57491
		Randomize      (0.858, 0.345, -0.073)
		colorDistMagn   0.64475
		colorDistFreq   1.2726e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.3284
		icecapLatitude  2
		icecapHeight    0.53692
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.25107
		heightTempGrad  0.625
		beachWidth      0.00087861
		tropicWidth     0.07
		mainFreq        0.34474
		venusFreq       0.59343
		venusMagn       0.62073
		mareDensity     0
		terraceProb     0.3795
		erosion         0
		montesMagn      0.44803
		montesFreq      2.3177
		montesSpiky     0.98867
		montesFraction  0.54415
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.1955e-07
		hillsFraction   0.68415
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25072
		craterFreq      0.2052
		craterDensity   0.84332
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.42508
		volcanoTemp     1387.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.035073
		BumpOffset      0.017537
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.017134
		DustBright  0.019758
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          218.179472
		SemiMajorAxis   41.11432
		Eccentricity    0.945024158
		Inclination     171.06455
		AscendingNode   24.5015971
		ArgOfPericenter -74.0422981
		MeanAnomaly     108.685381
	}
}

Comet	"C33"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.4752e-17
	Radius          0.013203
	InertiaMoment   0.39889
	RotationPeriod  49.638
	RotationEpoch   0
	Obliquity       56.2
	EqAscendNode    270.09

	AbsMagn         17.926
	SlopeParam      3.4809
	AlbedoBond      0.057434
	AlbedoGeom      0.068921
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.427 0.424 0.420)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15611
		Randomize      (0.365, -0.970, 0.759)
		colorDistMagn   0.50057
		colorDistFreq   1.4652e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.6893
		icecapLatitude  2
		icecapHeight    0.66055
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.47422
		heightTempGrad  0.625
		beachWidth      0.00092206
		tropicWidth     0.07
		mainFreq        0.368
		venusFreq       0.42395
		venusMagn       0.53143
		mareDensity     0
		terraceProb     0.20246
		erosion         0
		montesMagn      0.69133
		montesFreq      3.5286
		montesSpiky     0.99445
		montesFraction  0.54149
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.016e-07
		hillsFraction   0.4478
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23647
		craterFreq      0.25184
		craterDensity   0.90551
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.41002
		volcanoTemp     980.24
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.030145
		BumpOffset      0.015073
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0036183
		DustBright  0.0069824
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          220.547954
		SemiMajorAxis   41.4113329
		Eccentricity    0.952230073
		Inclination     62.9732959
		AscendingNode   -129.584657
		ArgOfPericenter 63.9924437
		MeanAnomaly     -52.7133094
	}
}

Comet	"C145"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.6036e-12
	Radius          0.6301
	InertiaMoment   0.39989
	RotationPeriod  57.014
	RotationEpoch   0
	Obliquity       354.32
	EqAscendNode    351.5

	AbsMagn         12.665
	SlopeParam      3.1203
	AlbedoBond      0.031174
	AlbedoGeom      0.037408
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.604 0.601 0.596)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.98423
		Randomize      (-0.188, 0.367, -0.592)
		colorDistMagn   0.83558
		colorDistFreq   0.00020473
		detailScale     8
		snowLevel       2
		tropicLatitude  0.67468
		icecapLatitude  2
		icecapHeight    0.50892
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44002
		heightTempGrad  0.625
		beachWidth      0.0010983
		tropicWidth     0.07
		mainFreq        0.37264
		venusFreq       0.62231
		venusMagn       0.72053
		mareDensity     0
		terraceProb     0.17455
		erosion         0
		montesMagn      0.60752
		montesFreq      2.5215
		montesSpiky     0.96531
		montesFraction  0.33506
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00092373
		hillsFraction   0.50016
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23673
		craterFreq      0.15894
		craterDensity   1.058
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43208
		volcanoTemp     1244.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.6689
		BumpOffset      0.83443
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.040663
		GasToDust   0.25
		Particles   1801
		GasBright   0.007577
		DustBright  0.029767
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          221.777561
		SemiMajorAxis   41.565109
		Eccentricity    0.952432596
		Inclination     132.026054
		AscendingNode   -168.205876
		ArgOfPericenter -0.23153306
		MeanAnomaly     -107.581977
	}
}

Comet	"C121"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.7047e-11
	Radius          1.7946
	InertiaMoment   0.39871
	RotationPeriod  61.45
	RotationEpoch   0
	Obliquity       161.87
	EqAscendNode    51.193

	AbsMagn         1.507
	SlopeParam      2.0455
	AlbedoBond      0.02919
	AlbedoGeom      0.035029
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.724 0.656 0.572)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.44963
		Randomize      (-0.927, -0.205, -0.016)
		colorDistMagn   0.24646
		colorDistFreq   0.00094954
		detailScale     8
		snowLevel       2
		tropicLatitude  0.65891
		icecapLatitude  2
		icecapHeight    0.61966
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.36164
		heightTempGrad  0.625
		beachWidth      0.00065341
		tropicWidth     0.07
		mainFreq        0.46578
		venusFreq       0.56509
		venusMagn       0.77669
		mareDensity     0
		terraceProb     0.10259
		erosion         0
		montesMagn      0.33217
		montesFreq      3.4504
		montesSpiky     0.97172
		montesFraction  0.47467
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.01003
		hillsFraction   0.5289
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23297
		craterFreq      0.16527
		craterDensity   0.76271
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46123
		volcanoTemp     1037.9
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.766
		BumpOffset      2.383
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.057538
		GasToDust   0.25
		Particles   2142
		GasBright   0.00047325
		DustBright  0.025426
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          221.850873
		SemiMajorAxis   41.5742684
		Eccentricity    0.940512931
		Inclination     -23.5819242
		AscendingNode   -17.4659409
		ArgOfPericenter 109.645645
		MeanAnomaly     -118.246201
	}
}

Comet	"C47"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.6726e-15
	Radius          0.063902
	InertiaMoment   0.3977
	RotationPeriod  40.369
	RotationEpoch   0
	Obliquity       228.47
	EqAscendNode    145.26

	AbsMagn         5.1065
	SlopeParam      2.858
	AlbedoBond      0.062529
	AlbedoGeom      0.075034
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.502 0.495 0.489)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.63463
		Randomize      (0.796, 0.197, -0.909)
		colorDistMagn   0.96253
		colorDistFreq   2.4951e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.95354
		icecapLatitude  2
		icecapHeight    0.90121
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41995
		heightTempGrad  0.625
		beachWidth      0.0014316
		tropicWidth     0.07
		mainFreq        0.62788
		venusFreq       0.53114
		venusMagn       0.56763
		mareDensity     0
		terraceProb     0.15529
		erosion         0
		montesMagn      0.42481
		montesFreq      3.1847
		montesSpiky     0.95839
		montesFraction  0.64526
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.5911e-06
		hillsFraction   0.62255
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22985
		craterFreq      0.21756
		craterDensity   1.0564
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54073
		volcanoTemp     1150.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.14066
		BumpOffset      0.070329
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0037644
		GasToDust   0.25
		Particles   1055
		GasBright   0.015241
		DustBright  0.018702
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          221.868063
		SemiMajorAxis   41.576416
		Eccentricity    0.943095725
		Inclination     73.6224375
		AscendingNode   -47.1716264
		ArgOfPericenter -106.430724
		MeanAnomaly     -156.459237
	}
}

Comet	"C36"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.3286e-10
	Radius          2.7469
	InertiaMoment   0.39469
	RotationPeriod  59.42
	RotationEpoch   0
	Obliquity       350.26
	EqAscendNode    37.623

	AbsMagn         15.685
	SlopeParam      5.2489
	AlbedoBond      0.03915
	AlbedoGeom      0.046981
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.715 0.673 0.620)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.97294
		Randomize      (0.458, 0.852, -0.313)
		colorDistMagn   0.77464
		colorDistFreq   0.0028045
		detailScale     8
		snowLevel       2
		tropicLatitude  0.2137
		icecapLatitude  2
		icecapHeight    0.55892
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.43402
		heightTempGrad  0.625
		beachWidth      0.0010527
		tropicWidth     0.07
		mainFreq        0.26317
		venusFreq       0.64279
		venusMagn       0.61607
		mareDensity     0
		terraceProb     0.35527
		erosion         0
		montesMagn      0.66614
		montesFreq      2.0109
		montesSpiky     0.97784
		montesFraction  0.52816
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.012192
		hillsFraction   0.82319
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2224
		craterFreq      0.25151
		craterDensity   0.96788
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46928
		volcanoTemp     1081.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.539
		BumpOffset      3.2695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.064402
		GasToDust   0.25
		Particles   2280
		GasBright   0.017138
		DustBright  0.029893
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          222.473149
		SemiMajorAxis   41.651974
		Eccentricity    0.923861976
		Inclination     -10.5330649
		AscendingNode   -104.855744
		ArgOfPericenter -82.6390486
		MeanAnomaly     -117.374991
	}
}

Comet	"C84"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.4892e-13
	Radius          0.33864
	InertiaMoment   0.39971
	RotationPeriod  50.788
	RotationEpoch   0
	Obliquity       15.167
	EqAscendNode    278.23

	AbsMagn         9.4308
	SlopeParam      2.4832
	AlbedoBond      0.041608
	AlbedoGeom      0.049929
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.575 0.571 0.569)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.04213
		Randomize      (-0.065, -0.004, 0.537)
		colorDistMagn   0.10927
		colorDistFreq   8.9948e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.93731
		icecapLatitude  2
		icecapHeight    0.70346
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19079
		heightTempGrad  0.625
		beachWidth      0.0010425
		tropicWidth     0.07
		mainFreq        0.54345
		venusFreq       0.62108
		venusMagn       0.46968
		mareDensity     0
		terraceProb     0.12955
		erosion         0
		montesMagn      0.53168
		montesFreq      3.3066
		montesSpiky     0.96513
		montesFraction  0.18127
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00020785
		hillsFraction   0.75381
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23143
		craterFreq      0.2464
		craterDensity   0.90325
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.37353
		volcanoTemp     894.31
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.80498
		BumpOffset      0.40249
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.030651
		GasToDust   0.25
		Particles   1599
		GasBright   0.0069911
		DustBright  0.02293
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          222.93598
		SemiMajorAxis   41.7097222
		Eccentricity    0.953228285
		Inclination     -75.5242607
		AscendingNode   64.9587226
		ArgOfPericenter -137.232071
		MeanAnomaly     -8.09471989
	}
}

Comet	"C52"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.6379e-11
	Radius          1.3671
	InertiaMoment   0.39905
	RotationPeriod  92.615
	RotationEpoch   0
	Obliquity       238.56
	EqAscendNode    357.82

	AbsMagn         8.3097
	SlopeParam      6.0252
	AlbedoBond      0.039968
	AlbedoGeom      0.047961
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.639 0.634 0.632)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.66267
		Randomize      (0.950, -0.100, 0.637)
		colorDistMagn   0.58939
		colorDistFreq   0.00094858
		detailScale     8
		snowLevel       2
		tropicLatitude  0.59076
		icecapLatitude  2
		icecapHeight    0.47492
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.48628
		heightTempGrad  0.625
		beachWidth      0.00064929
		tropicWidth     0.07
		mainFreq        0.66896
		venusFreq       0.63485
		venusMagn       0.67578
		mareDensity     0
		terraceProb     0.42725
		erosion         0
		montesMagn      0.50433
		montesFreq      3.7233
		montesSpiky     0.97366
		montesFraction  0.9063
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0041935
		hillsFraction   0.54479
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26603
		craterFreq      0.17853
		craterDensity   0.94452
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55144
		volcanoTemp     918.81
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.0701
		BumpOffset      1.5351
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.053152
		GasToDust   0.25
		Particles   2053
		GasBright   0.013647
		DustBright  0.014348
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          223.592268
		SemiMajorAxis   41.79154
		Eccentricity    0.949677423
		Inclination     35.6936756
		AscendingNode   140.340844
		ArgOfPericenter 169.059365
		MeanAnomaly     -95.6584694
	}
}

Comet	"C103"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.7638e-07
	Radius          35.056
	InertiaMoment   0.39985
	RotationPeriod  95.202
	RotationEpoch   0
	Obliquity       197.53
	EqAscendNode    5.9665

	AbsMagn         4.2944
	SlopeParam      4.8847
	AlbedoBond      0.027366
	AlbedoGeom      0.032839
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.820 0.783 0.747)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.54869
		Randomize      (0.519, 0.866, 0.415)
		colorDistMagn   0.25395
		colorDistFreq   0.58341
		detailScale     128
		snowLevel       2
		tropicLatitude  0.94795
		icecapLatitude  2
		icecapHeight    0.52193
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20285
		heightTempGrad  0.625
		beachWidth      0.0010697
		tropicWidth     0.07
		mainFreq        0.42889
		venusFreq       0.58994
		venusMagn       0.65798
		mareDensity     0
		terraceProb     0.32225
		erosion         0
		montesMagn      0.40435
		montesFreq      3.4232
		montesSpiky     0.94228
		montesFraction  0.55611
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.9532
		hillsFraction   0.89072
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25739
		craterFreq      0.16927
		craterDensity   0.94204
		craterOctaves   14
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54538
		volcanoTemp     1232.9
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
		GasBright   0.017971
		DustBright  0.029345
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          225.543574
		SemiMajorAxis   42.034333
		Eccentricity    0.959548627
		Inclination     -125.948636
		AscendingNode   -8.04501235
		ArgOfPericenter -119.205488
		MeanAnomaly     50.4835177
	}
}

Comet	"C111"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            9.7038e-08
	Radius          24.734
	InertiaMoment   0.39937
	RotationPeriod  56.227
	RotationEpoch   0
	Obliquity       141.68
	EqAscendNode    346.07

	AbsMagn         7.522
	SlopeParam      5.2024
	AlbedoBond      0.028225
	AlbedoGeom      0.03387
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.769 0.768 0.767)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39355
		Randomize      (0.765, 0.390, 0.890)
		colorDistMagn   0.093939
		colorDistFreq   0.32854
		detailScale     64
		snowLevel       2
		tropicLatitude  0.97225
		icecapLatitude  2
		icecapHeight    0.47666
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22897
		heightTempGrad  0.625
		beachWidth      0.00071803
		tropicWidth     0.07
		mainFreq        0.39752
		venusFreq       0.66318
		venusMagn       0.53659
		mareDensity     0
		terraceProb     0.35102
		erosion         0
		montesMagn      0.48494
		montesFreq      2.6665
		montesSpiky     0.93987
		montesFraction  0.69463
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.6077
		hillsFraction   0.68155
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2206
		craterFreq      0.24367
		craterDensity   0.93138
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43796
		volcanoTemp     1101.8
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
		MaxLength   0.099838
		GasToDust   0.25
		Particles   2996
		GasBright   0.016682
		DustBright  0.021115
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          227.557313
		SemiMajorAxis   42.2841611
		Eccentricity    0.960946309
		Inclination     -141.60812
		AscendingNode   -171.590998
		ArgOfPericenter 98.2548898
		MeanAnomaly     165.365612
	}
}

Comet	"C115"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.1473e-13
	Radius          0.26158
	InertiaMoment   0.39912
	RotationPeriod  41.927
	RotationEpoch   0
	Obliquity       293.75
	EqAscendNode    156.12

	AbsMagn         2.7312
	SlopeParam      3.1373
	AlbedoBond      0.028624
	AlbedoGeom      0.034349
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.566 0.560 0.554)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.81598
		Randomize      (0.888, 0.152, 0.127)
		colorDistMagn   0.5714
		colorDistFreq   3.8847e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.8431
		icecapLatitude  2
		icecapHeight    0.44842
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44204
		heightTempGrad  0.625
		beachWidth      0.00099218
		tropicWidth     0.07
		mainFreq        0.58343
		venusFreq       0.61727
		venusMagn       0.63892
		mareDensity     0
		terraceProb     0.17583
		erosion         0
		montesMagn      0.36441
		montesFreq      2.9723
		montesSpiky     0.79411
		montesFraction  0.50253
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00018933
		hillsFraction   0.62503
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26021
		craterFreq      0.16666
		craterDensity   0.92619
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53404
		volcanoTemp     936.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.61274
		BumpOffset      0.30637
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.026488
		GasToDust   0.25
		Particles   1514
		GasBright   0.015598
		DustBright  0.01744
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          227.741006
		SemiMajorAxis   42.3069137
		Eccentricity    0.950189812
		Inclination     -160.946256
		AscendingNode   58.2988684
		ArgOfPericenter -151.112098
		MeanAnomaly     60.0067423
	}
}

Comet	"C167"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.3835e-11
	Radius          2.1515
	InertiaMoment   0.39847
	Oblateness      0.0063076
	RotationPeriod  15.327
	RotationEpoch   0
	Obliquity       110.74
	EqAscendNode    206.77

	AbsMagn         6.933
	SlopeParam      2.7845
	AlbedoBond      0.032726
	AlbedoGeom      0.039272
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.660 0.656 0.652)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.30761
		Randomize      (0.489, -0.942, 0.215)
		colorDistMagn   0.35272
		colorDistFreq   0.0018204
		detailScale     8
		snowLevel       2
		tropicLatitude  0.90387
		icecapLatitude  2
		icecapHeight    0.59131
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41187
		heightTempGrad  0.625
		beachWidth      0.00065616
		tropicWidth     0.07
		mainFreq        0.60018
		venusFreq       0.56352
		venusMagn       0.6405
		mareDensity     0
		terraceProb     0.15007
		erosion         0
		montesMagn      0.47037
		montesFreq      2.8857
		montesSpiky     0.92178
		montesFraction  0.59773
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015057
		hillsFraction   0.51728
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24868
		craterFreq      0.20638
		craterDensity   0.86012
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44437
		volcanoTemp     983.88
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      4.705
		BumpOffset      2.3525
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.060463
		GasToDust   0.25
		Particles   2201
		GasBright   0.0041563
		DustBright  0.0070126
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          228.723497
		SemiMajorAxis   42.428503
		Eccentricity    0.948293638
		Inclination     172.538763
		AscendingNode   129.150301
		ArgOfPericenter -10.8727179
		MeanAnomaly     94.2526412
	}
}

Comet	"C24"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.2742e-15
	Radius          0.058362
	InertiaMoment   0.39788
	Oblateness      0.0047748
	RotationPeriod  17.597
	RotationEpoch   0
	Obliquity       254.03
	EqAscendNode    247.47

	AbsMagn         1.8941
	SlopeParam      2.5241
	AlbedoBond      0.038534
	AlbedoGeom      0.046241
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.497 0.492 0.485)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.70564
		Randomize      (0.088, -0.435, -0.025)
		colorDistMagn   0.50328
		colorDistFreq   7.4622e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.92395
		icecapLatitude  2
		icecapHeight    0.61183
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.19483
		heightTempGrad  0.625
		beachWidth      0.00053022
		tropicWidth     0.07
		mainFreq        0.55548
		venusFreq       0.61126
		venusMagn       0.63612
		mareDensity     0
		terraceProb     0.13224
		erosion         0
		montesMagn      0.3425
		montesFreq      2.8038
		montesSpiky     0.90634
		montesFraction  0.58147
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.2769e-06
		hillsFraction   0.62641
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21954
		craterFreq      0.25285
		craterDensity   0.98815
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47875
		volcanoTemp     1277.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.13898
		BumpOffset      0.069488
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0023023
		GasToDust   0.25
		Particles   1026
		GasBright   0.005798
		DustBright  0.015511
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          228.840757
		SemiMajorAxis   42.443003
		Eccentricity    0.959823317
		Inclination     85.93437
		AscendingNode   112.242684
		ArgOfPericenter -161.506104
		MeanAnomaly     -143.138734
	}
}

Comet	"C138"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.506e-13
	Radius          0.28641
	InertiaMoment   0.39901
	RotationPeriod  61.861
	RotationEpoch   0
	Obliquity       268.19
	EqAscendNode    53.907

	AbsMagn         5.49
	SlopeParam      3.4249
	AlbedoBond      0.044504
	AlbedoGeom      0.053405
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.682 0.556 0.446)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.74497
		Randomize      (-0.404, 0.784, -0.757)
		colorDistMagn   0.078012
		colorDistFreq   2.2677e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.99639
		icecapLatitude  2
		icecapHeight    0.63188
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.26716
		heightTempGrad  0.625
		beachWidth      0.0012936
		tropicWidth     0.07
		mainFreq        0.6629
		venusFreq       0.54374
		venusMagn       0.57172
		mareDensity     0
		terraceProb     0.19803
		erosion         0
		montesMagn      0.43442
		montesFreq      3.3771
		montesSpiky     0.90996
		montesFraction  0.56342
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00017535
		hillsFraction   0.62117
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.29389
		craterFreq      0.24101
		craterDensity   0.9623
		craterOctaves   6
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4595
		volcanoTemp     1109.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.59446
		BumpOffset      0.29723
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.027951
		GasToDust   0.25
		Particles   1544
		GasBright   0.0068074
		DustBright  0.038865
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          229.664676
		SemiMajorAxis   42.5448166
		Eccentricity    0.98320719
		Inclination     -175.902691
		AscendingNode   138.326521
		ArgOfPericenter -42.8435084
		MeanAnomaly     -165.825777
	}
}

Comet	"C88"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.3925e-08
	Radius          22.59
	InertiaMoment   0.39947
	Oblateness      0.0011229
	RotationPeriod  36.386
	RotationEpoch   0
	Obliquity       167.24
	EqAscendNode    88.278

	AbsMagn         5.6824
	SlopeParam      4.8932
	AlbedoBond      0.041815
	AlbedoGeom      0.050178
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.834 0.756 0.693)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.46456
		Randomize      (0.058, -0.242, -0.225)
		colorDistMagn   0.57913
		colorDistFreq   0.42761
		detailScale     64
		snowLevel       2
		tropicLatitude  0.71273
		icecapLatitude  2
		icecapHeight    0.68175
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40385
		heightTempGrad  0.625
		beachWidth      0.0013167
		tropicWidth     0.07
		mainFreq        0.29803
		venusFreq       0.58755
		venusMagn       0.61778
		mareDensity     0
		terraceProb     0.32302
		erosion         0
		montesMagn      0.43924
		montesFreq      3.8511
		montesSpiky     0.87714
		montesFraction  0.62418
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0091
		hillsFraction   0.68561
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.19572
		craterFreq      0.17226
		craterDensity   0.89827
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51932
		volcanoTemp     1128.7
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
		MaxLength   0.098376
		GasToDust   0.25
		Particles   2967
		GasBright   0.0066534
		DustBright  0.018509
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          231.970304
		SemiMajorAxis   42.8290836
		Eccentricity    0.943298588
		Inclination     41.198235
		AscendingNode   -102.878097
		ArgOfPericenter -78.6145804
		MeanAnomaly     -169.422215
	}
}

Comet	"C38"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.4446e-13
	Radius          0.28247
	InertiaMoment   0.3999
	RotationPeriod  139.46
	RotationEpoch   0
	Obliquity       66.295
	EqAscendNode    122.65

	AbsMagn         5.8696
	SlopeParam      7.4558
	AlbedoBond      0.039253
	AlbedoGeom      0.047103
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.619 0.555 0.508)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.18415
		Randomize      (0.519, 0.733, 0.306)
		colorDistMagn   0.9654
		colorDistFreq   5.5032e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.97625
		icecapLatitude  2
		icecapHeight    0.74549
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14055
		heightTempGrad  0.625
		beachWidth      0.0013398
		tropicWidth     0.07
		mainFreq        0.40714
		venusFreq       0.62242
		venusMagn       0.65603
		mareDensity     0
		terraceProb     0.56355
		erosion         0
		montesMagn      0.44391
		montesFreq      2.4524
		montesSpiky     0.81919
		montesFraction  0.6929
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.00014004
		hillsFraction   0.76567
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20209
		craterFreq      0.21837
		craterDensity   0.83344
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43352
		volcanoTemp     1248.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.65411
		BumpOffset      0.32705
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.027727
		GasToDust   0.25
		Particles   1539
		GasBright   0.016958
		DustBright  0.027694
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          235.763702
		SemiMajorAxis   43.2947413
		Eccentricity    0.962678075
		Inclination     -17.5048604
		AscendingNode   127.265546
		ArgOfPericenter 167.173703
		MeanAnomaly     12.7937372
	}
}

Comet	"C55"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.8726e-16
	Radius          0.045081
	InertiaMoment   0.39629
	RotationPeriod  156.46
	RotationEpoch   0
	Obliquity       172.62
	EqAscendNode    125.36

	AbsMagn         8.1008
	SlopeParam      3.1711
	AlbedoBond      0.014574
	AlbedoGeom      0.017489
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.566 0.451 0.393)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.47949
		Randomize      (-0.958, -0.279, -0.435)
		colorDistMagn   0.86168
		colorDistFreq   1.3766e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.38364
		icecapLatitude  2
		icecapHeight    0.76797
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.44607
		heightTempGrad  0.625
		beachWidth      0.0013799
		tropicWidth     0.07
		mainFreq        0.59637
		venusFreq       0.60765
		venusMagn       0.74191
		mareDensity     0
		terraceProb     0.17838
		erosion         0
		montesMagn      0.4992
		montesFreq      2.3452
		montesSpiky     0.95616
		montesFraction  0.85455
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.7203e-06
		hillsFraction   0.47459
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.2484
		craterFreq      0.17805
		craterDensity   1.0289
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.43033
		volcanoTemp     1019.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10578
		BumpOffset      0.052891
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.000258
		DustBright  0.024167
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          236.732576
		SemiMajorAxis   43.4132737
		Eccentricity    0.936380397
		Inclination     -162.147788
		AscendingNode   -121.317397
		ArgOfPericenter 124.150419
		MeanAnomaly     40.9264046
	}
}

Comet	"C2"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.2008e-17
	Radius          0.017092
	InertiaMoment   0.3995
	RotationPeriod  58.619
	RotationEpoch   0
	Obliquity       137.61
	EqAscendNode    32.196

	AbsMagn         8.4708
	SlopeParam      2.8851
	AlbedoBond      0.037387
	AlbedoGeom      0.044865
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.537 0.395 0.333)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.38226
		Randomize      (-0.589, 0.874, -0.831)
		colorDistMagn   0.97698
		colorDistFreq   1.1627e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.96427
		icecapLatitude  2
		icecapHeight    0.53299
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22297
		heightTempGrad  0.625
		beachWidth      0.00097239
		tropicWidth     0.07
		mainFreq        0.30634
		venusFreq       0.50483
		venusMagn       0.71547
		mareDensity     0
		terraceProb     0.15723
		erosion         0
		montesMagn      0.50828
		montesFreq      2.3788
		montesSpiky     0.95373
		montesFraction  0.3041
		dunesFraction   0
		hillsMagn       0
		hillsFreq       6.1399e-07
		hillsFraction   0.61618
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26797
		craterFreq      0.2216
		craterDensity   0.88278
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47228
		volcanoTemp     1238.4
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.039622
		BumpOffset      0.019811
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.004884
		DustBright  0.0426
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          237.020786
		SemiMajorAxis   43.4485022
		Eccentricity    0.929856121
		Inclination     -107.877045
		AscendingNode   86.5876826
		ArgOfPericenter 7.40941289
		MeanAnomaly     -2.02678325
	}
}

Comet	"C157"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.6721e-07
	Radius          29.651
	InertiaMoment   0.39917
	Oblateness      0.031226
	RotationPeriod  6.8955
	RotationEpoch   0
	Obliquity       90.551
	EqAscendNode    141.65

	AbsMagn         11.296
	SlopeParam      5.937
	AlbedoBond      0.032044
	AlbedoGeom      0.038453
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.777 0.776 0.775)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.25153
		Randomize      (0.181, -0.347, -0.879)
		colorDistMagn   0.23118
		colorDistFreq   0.53484
		detailScale     128
		snowLevel       2
		tropicLatitude  0.27759
		icecapLatitude  2
		icecapHeight    0.42722
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27921
		heightTempGrad  0.625
		beachWidth      0.00072078
		tropicWidth     0.07
		mainFreq        0.53537
		venusFreq       0.66057
		venusMagn       0.6991
		mareDensity     0
		terraceProb     0.41898
		erosion         0
		montesMagn      0.57621
		montesFreq      3.5093
		montesSpiky     0.87308
		montesFraction  0.18833
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.3409
		hillsFraction   0.67356
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23856
		craterFreq      0.15512
		craterDensity   1.0192
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.39856
		volcanoTemp     1047.8
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
		GasBright   0.0068095
		DustBright  0.016257
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          239.535901
		SemiMajorAxis   43.7553266
		Eccentricity    0.910888277
		Inclination     79.0070358
		AscendingNode   -168.68655
		ArgOfPericenter -175.210391
		MeanAnomaly     129.162674
	}
}

Comet	"C87"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            8.925e-18
	Radius          0.011167
	InertiaMoment   0.39799
	RotationPeriod  60.634
	RotationEpoch   0
	Obliquity       309.22
	EqAscendNode    45.765

	AbsMagn         9.2105
	SlopeParam      4.3037
	AlbedoBond      0.02529
	AlbedoGeom      0.030348
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.460 0.398 0.371)

	Surface
	{
		Preset         "asteroid_red.cfg"
		SurfStyle       0.85895
		Randomize      (0.027, -0.182, -0.535)
		colorDistMagn   0.48424
		colorDistFreq   4.0905e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.47623
		icecapLatitude  2
		icecapHeight    0.59555
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15059
		heightTempGrad  0.625
		beachWidth      0.00057312
		tropicWidth     0.07
		mainFreq        0.48554
		venusFreq       0.59587
		venusMagn       0.59549
		mareDensity     0
		terraceProb     0.27097
		erosion         0
		montesMagn      0.52633
		montesFreq      3.6387
		montesSpiky     0.94702
		montesFraction  0.94968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.4203e-07
		hillsFraction   0.70082
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.21362
		craterFreq      0.24609
		craterDensity   0.96506
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46456
		volcanoTemp     1195.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.027887
		BumpOffset      0.013943
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0067652
		DustBright  0.019587
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          242.814067
		SemiMajorAxis   44.1536303
		Eccentricity    0.926040669
		Inclination     78.4032847
		AscendingNode   -7.59889126
		ArgOfPericenter 140.512849
		MeanAnomaly     -85.5154496
	}
}

Comet	"C175"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.2413e-11
	Radius          1.5178
	InertiaMoment   0.39773
	RotationPeriod  73.973
	RotationEpoch   0
	Obliquity       54.892
	EqAscendNode    186.87

	AbsMagn         9.7614
	SlopeParam      3.1033
	AlbedoBond      0.033248
	AlbedoGeom      0.039898
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.643 0.639 0.638)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.15248
		Randomize      (0.735, 0.583, 0.690)
		colorDistMagn   0.22337
		colorDistFreq   0.0010647
		detailScale     8
		snowLevel       2
		tropicLatitude  0.71757
		icecapLatitude  2
		icecapHeight    0.5557
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.438
		heightTempGrad  0.625
		beachWidth      0.00090446
		tropicWidth     0.07
		mainFreq        0.57086
		venusFreq       0.62758
		venusMagn       0.48418
		mareDensity     0
		terraceProb     0.17327
		erosion         0
		montesMagn      0.53968
		montesFreq      3.5416
		montesSpiky     0.91899
		montesFraction  0.75503
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0042989
		hillsFraction   0.75179
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20121
		craterFreq      0.14803
		craterDensity   0.84908
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.4902
		volcanoTemp     952.75
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      3.5493
		BumpOffset      1.7747
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.054837
		GasToDust   0.25
		Particles   2087
		GasBright   0.018063
		DustBright  0.023588
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          243.531913
		SemiMajorAxis   44.2406101
		Eccentricity    0.946279825
		Inclination     -81.7190494
		AscendingNode   164.294805
		ArgOfPericenter -24.342211
		MeanAnomaly     -133.734833
	}
}

Comet	"C78"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.7088e-16
	Radius          0.049361
	InertiaMoment   0.39553
	Oblateness      0.0015267
	RotationPeriod  30.984
	RotationEpoch   0
	Obliquity       147.05
	EqAscendNode    23.152

	AbsMagn         9.8857
	SlopeParam      3.457
	AlbedoBond      0.041298
	AlbedoGeom      0.049558
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.573 0.443 0.395)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.40848
		Randomize      (-0.250, 0.353, 0.681)
		colorDistMagn   0.48698
		colorDistFreq   1.0227e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.85789
		icecapLatitude  2
		icecapHeight    0.54745
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27119
		heightTempGrad  0.625
		beachWidth      0.00048127
		tropicWidth     0.07
		mainFreq        0.68041
		venusFreq       0.52051
		venusMagn       0.67657
		mareDensity     0
		terraceProb     0.20056
		erosion         0
		montesMagn      0.54268
		montesFreq      2.8628
		montesSpiky     0.99868
		montesFraction  0.27634
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.4945e-06
		hillsFraction   0.46534
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25796
		craterFreq      0.24702
		craterDensity   0.73941
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.50485
		volcanoTemp     1092.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10408
		BumpOffset      0.05204
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0069485
		DustBright  0.030112
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          243.861545
		SemiMajorAxis   44.2805223
		Eccentricity    0.943820204
		Inclination     26.3840104
		AscendingNode   169.893467
		ArgOfPericenter 128.046123
		MeanAnomaly     -141.688925
	}
}

Comet	"C70"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.1955e-15
	Radius          0.069968
	InertiaMoment   0.39751
	RotationPeriod  60.228
	RotationEpoch   0
	Obliquity       202.9
	EqAscendNode    43.051

	AbsMagn         7.0487
	SlopeParam      3.1626
	AlbedoBond      0.040888
	AlbedoGeom      0.049065
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.626 0.471 0.374)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.56361
		Randomize      (-0.496, 0.829, 0.206)
		colorDistMagn   0.58426
		colorDistFreq   1.6805e-06
		detailScale     8
		snowLevel       2
		tropicLatitude  0.63268
		icecapLatitude  2
		icecapHeight    0.5835
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.24507
		heightTempGrad  0.625
		beachWidth      0.00053297
		tropicWidth     0.07
		mainFreq        0.72829
		venusFreq       0.61001
		venusMagn       0.82367
		mareDensity     0
		terraceProb     0.17775
		erosion         0
		montesMagn      0.47324
		montesFreq      3.7809
		montesSpiky     0.72368
		montesFraction  0.72092
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.3531e-05
		hillsFraction   0.61868
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23791
		craterFreq      0.17553
		craterDensity   0.76828
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46617
		volcanoTemp     1023.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.17156
		BumpOffset      0.085782
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0052266
		GasToDust   0.25
		Particles   1085
		GasBright   0.0058666
		DustBright  0.040712
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          244.514817
		SemiMajorAxis   44.359568
		Eccentricity    0.947493849
		Inclination     -163.527141
		AscendingNode   -9.10820682
		ArgOfPericenter -72.9659615
		MeanAnomaly     -22.1108894
	}
}

Comet	"C155"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            6.122e-16
	Radius          0.045711
	InertiaMoment   0.39929
	RotationPeriod  62.274
	RotationEpoch   0
	Obliquity       14.513
	EqAscendNode    56.621

	AbsMagn         7.78
	SlopeParam      4.5558
	AlbedoBond      0.031904
	AlbedoGeom      0.038284
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.540 0.466 0.421)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.040313
		Randomize      (0.119, -0.228, 0.502)
		colorDistMagn   0.92871
		colorDistFreq   5.3586e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.89111
		icecapLatitude  2
		icecapHeight    0.64436
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.17268
		heightTempGrad  0.625
		beachWidth      0.0010337
		tropicWidth     0.07
		mainFreq        0.44544
		venusFreq       0.49512
		venusMagn       0.65953
		mareDensity     0
		terraceProb     0.29299
		erosion         0
		montesMagn      0.4913
		montesFreq      3.3111
		montesSpiky     0.99479
		montesFraction  0.65505
		dunesFraction   0
		hillsMagn       0
		hillsFreq       5.4317e-06
		hillsFraction   0.70359
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24673
		craterFreq      0.20754
		craterDensity   0.87586
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.45772
		volcanoTemp     1280.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.10003
		BumpOffset      0.050016
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0071204
		DustBright  0.018326
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          248.222354
		SemiMajorAxis   44.8068535
		Eccentricity    0.943533211
		Inclination     50.7835391
		AscendingNode   35.3856607
		ArgOfPericenter 81.824765
		MeanAnomaly     -68.0995916
	}
}

Comet	"C132"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.6638e-16
	Radius          0.041748
	InertiaMoment   0.39939
	RotationPeriod  42.314
	RotationEpoch   0
	Obliquity       40.077
	EqAscendNode    158.83

	AbsMagn         5.9801
	SlopeParam      4.2803
	AlbedoBond      0.044168
	AlbedoGeom      0.053001
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.479 0.476 0.473)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.11132
		Randomize      (-0.588, -0.859, -0.613)
		colorDistMagn   0.47045
		colorDistFreq   9.7087e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.8154
		icecapLatitude  2
		icecapHeight    0.46846
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34756
		heightTempGrad  0.625
		beachWidth      0.00073233
		tropicWidth     0.07
		mainFreq        0.36745
		venusFreq       0.60286
		venusMagn       0.72007
		mareDensity     0
		terraceProb     0.26895
		erosion         0
		montesMagn      0.44667
		montesFreq      2.9199
		montesSpiky     0.95183
		montesFraction  0.59025
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.3878e-06
		hillsFraction   0.70795
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23895
		craterFreq      0.2416
		craterDensity   0.84009
		craterOctaves   2
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.53246
		volcanoTemp     1107.6
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.099097
		BumpOffset      0.049549
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0013182
		DustBright  0.011493
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          249.626801
		SemiMajorAxis   44.9757066
		Eccentricity    0.949730835
		Inclination     -85.3187707
		AscendingNode   178.18948
		ArgOfPericenter 168.758555
		MeanAnomaly     -40.9926411
	}
}

Comet	"C18"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.9459e-18
	Radius          0.0085068
	InertiaMoment   0.39842
	RotationPeriod  91.011
	RotationEpoch   0
	Obliquity       25.916
	EqAscendNode    352.4

	AbsMagn         2.9871
	SlopeParam      3.4889
	AlbedoBond      0.038224
	AlbedoGeom      0.045868
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.409 0.403 0.397)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.071988
		Randomize      (-0.096, -0.078, 0.119)
		colorDistMagn   0.7797
		colorDistFreq   3.8279e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.98767
		icecapLatitude  2
		icecapHeight    0.43361
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.27523
		heightTempGrad  0.625
		beachWidth      0.001169
		tropicWidth     0.07
		mainFreq        0.69968
		venusFreq       0.70444
		venusMagn       0.818
		mareDensity     0
		terraceProb     0.2031
		erosion         0
		montesMagn      0.37102
		montesFreq      1.8199
		montesSpiky     0.94915
		montesFraction  0.60874
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.8341e-07
		hillsFraction   0.71402
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24687
		craterFreq      0.25353
		craterDensity   0.86205
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.55593
		volcanoTemp     976.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.018105
		BumpOffset      0.0090527
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0064274
		DustBright  0.02202
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          250.750627
		SemiMajorAxis   45.1105933
		Eccentricity    0.940808704
		Inclination     106.67243
		AscendingNode   171.981777
		ArgOfPericenter 12.7007944
		MeanAnomaly     -125.2716
	}
}

Comet	"C148"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.7494e-17
	Radius          0.020778
	InertiaMoment   0.39827
	RotationPeriod  67.416
	RotationEpoch   0
	Obliquity       288.38
	EqAscendNode    119.03

	AbsMagn         12.275
	SlopeParam      4.8592
	AlbedoBond      0.045076
	AlbedoGeom      0.054092
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.526 0.467 0.362)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.80106
		Randomize      (-0.096, 0.189, 0.337)
		colorDistMagn   0.23504
		colorDistFreq   2.9644e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.97433
		icecapLatitude  2
		icecapHeight    0.83997
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39982
		heightTempGrad  0.625
		beachWidth      0.0012289
		tropicWidth     0.07
		mainFreq        0.27178
		venusFreq       0.59699
		venusMagn       0.83331
		mareDensity     0
		terraceProb     0.31997
		erosion         0
		montesMagn      0.59878
		montesFreq      2.7916
		montesSpiky     0.94722
		montesFraction  0.30968
		dunesFraction   0
		hillsMagn       0
		hillsFreq       1.0383e-06
		hillsFraction   0.32508
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22277
		craterFreq      0.15803
		craterDensity   0.81407
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47671
		volcanoTemp     1145.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.046491
		BumpOffset      0.023246
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0076322
		DustBright  0.026143
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          251.339015
		SemiMajorAxis   45.181134
		Eccentricity    0.96321779
		Inclination     -79.0520522
		AscendingNode   -72.1879673
		ArgOfPericenter 48.7757553
		MeanAnomaly     -90.9756436
	}
}

Comet	"C34"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.2219e-07
	Radius          26.708
	InertiaMoment   0.39616
	Oblateness      0.0025024
	RotationPeriod  24.222
	RotationEpoch   0
	Obliquity       274.22
	EqAscendNode    312.6

	AbsMagn         9.6031
	SlopeParam      4.0486
	AlbedoBond      0.039048
	AlbedoGeom      0.046858
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.773 0.771 0.770)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.76172
		Randomize      (0.396, 0.971, -0.931)
		colorDistMagn   0.5945
		colorDistFreq   0.46717
		detailScale     128
		snowLevel       2
		tropicLatitude  0.72396
		icecapLatitude  2
		icecapHeight    0.77969
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32749
		heightTempGrad  0.625
		beachWidth      0.0001656
		tropicWidth     0.07
		mainFreq        0.62324
		venusFreq       0.67562
		venusMagn       0.56703
		mareDensity     0
		terraceProb     0.24913
		erosion         0
		montesMagn      0.53585
		montesFreq      3.674
		montesSpiky     0.94447
		montesFraction  0.34315
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.95336
		hillsFraction   0.38493
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23228
		craterFreq      0.18132
		craterDensity   0.83953
		craterOctaves   13
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49335
		volcanoTemp     1213.8
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
		GasBright   0.017245
		DustBright  0.032166
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          256.117891
		SemiMajorAxis   45.7520402
		Eccentricity    0.95585747
		Inclination     -96.4000121
		AscendingNode   134.775316
		ArgOfPericenter 88.4818304
		MeanAnomaly     -16.2915325
	}
}

Comet	"C133"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.5379e-17
	Radius          0.013387
	InertiaMoment   0.39764
	Oblateness      0.0073727
	RotationPeriod  14.155
	RotationEpoch   0
	Obliquity       258.1
	EqAscendNode    201.34

	AbsMagn         15.072
	SlopeParam      4.8677
	AlbedoBond      0.03023
	AlbedoGeom      0.036276
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.426 0.424 0.422)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.71693
		Randomize      (-0.558, -0.919, -0.304)
		colorDistMagn   0.56623
		colorDistFreq   7.4964e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.95878
		icecapLatitude  2
		icecapHeight    0.56697
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20083
		heightTempGrad  0.625
		beachWidth      0.00087586
		tropicWidth     0.07
		mainFreq        0.62276
		venusFreq       0.59465
		venusMagn       0.74522
		mareDensity     0
		terraceProb     0.32073
		erosion         0
		montesMagn      0.65606
		montesFreq      2.9909
		montesSpiky     0.8857
		montesFraction  0.41335
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.5489e-07
		hillsFraction   0.69238
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23487
		craterFreq      0.16228
		craterDensity   0.70449
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44884
		volcanoTemp     1041.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.035504
		BumpOffset      0.017752
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0012852
		DustBright  0.010337
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          265.814038
		SemiMajorAxis   46.899599
		Eccentricity    0.954726117
		Inclination     129.065695
		AscendingNode   -78.294001
		ArgOfPericenter -77.0269577
		MeanAnomaly     68.1692227
	}
}

Comet	"C50"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.5064e-08
	Radius          13.294
	InertiaMoment   0.39918
	RotationPeriod  50.021
	RotationEpoch   0
	Obliquity       162.52
	EqAscendNode    272.8

	AbsMagn         4.8284
	SlopeParam      4.6121
	AlbedoBond      0.039866
	AlbedoGeom      0.047839
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.742 0.739 0.737)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.45145
		Randomize      (0.888, 0.019, 0.019)
		colorDistMagn   0.39295
		colorDistFreq   0.14497
		detailScale     64
		snowLevel       2
		tropicLatitude  0.98299
		icecapLatitude  2
		icecapHeight    0.67404
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.37974
		heightTempGrad  0.625
		beachWidth      0.0012622
		tropicWidth     0.07
		mainFreq        0.56333
		venusFreq       0.66078
		venusMagn       0.63692
		mareDensity     0
		terraceProb     0.29796
		erosion         0
		montesMagn      0.41782
		montesFreq      3.445
		montesSpiky     0.93966
		montesFraction  0.63062
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.38695
		hillsFraction   0.57849
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20975
		craterFreq      0.21729
		craterDensity   0.81339
		craterOctaves   12
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.40274
		volcanoTemp     1051.6
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
		MaxLength   0.089827
		GasToDust   0.25
		Particles   2794
		GasBright   0.01434
		DustBright  0.016035
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          269.800057
		SemiMajorAxis   47.3672908
		Eccentricity    0.969827524
		Inclination     -83.9303098
		AscendingNode   106.101113
		ArgOfPericenter -40.5209166
		MeanAnomaly     166.358731
	}
}

Comet	"C118"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            4.1135e-18
	Radius          0.0086256
	InertiaMoment   0.39661
	RotationPeriod  51.555
	RotationEpoch   0
	Obliquity       227.81
	EqAscendNode    283.66

	AbsMagn         2.187
	SlopeParam      4.8762
	AlbedoBond      0.0434
	AlbedoGeom      0.05208
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.409 0.404 0.399)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.63281
		Randomize      (0.981, -0.027, -0.944)
		colorDistMagn   0.84337
		colorDistFreq   5.6007e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.8178
		icecapLatitude  2
		icecapHeight    0.73839
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40184
		heightTempGrad  0.625
		beachWidth      0.00082279
		tropicWidth     0.07
		mainFreq        0.52395
		venusFreq       0.5923
		venusMagn       0.69784
		mareDensity     0
		terraceProb     0.32149
		erosion         0
		montesMagn      0.35023
		montesFreq      3.1887
		montesSpiky     0.9885
		montesFraction  0.48875
		dunesFraction   0
		hillsMagn       0
		hillsFreq       2.1593e-07
		hillsFraction   0.58123
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24524
		craterFreq      0.16598
		craterDensity   0.99649
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.6092
		volcanoTemp     1237
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.021114
		BumpOffset      0.010557
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.014593
		DustBright  0.014876
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          273.496495
		SemiMajorAxis   47.7989508
		Eccentricity    0.915828888
		Inclination     17.0279852
		AscendingNode   72.1150849
		ArgOfPericenter 126.742068
		MeanAnomaly     25.9053244
	}
}

Comet	"C79"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.5419e-17
	Radius          0.015829
	InertiaMoment   0.39866
	RotationPeriod  107.89
	RotationEpoch   0
	Obliquity       5.072
	EqAscendNode    65.665

	AbsMagn         6.3892
	SlopeParam      4.0254
	AlbedoBond      0.02396
	AlbedoGeom      0.028752
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.507 0.419 0.356)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.014089
		Randomize      (-0.219, 0.294, 0.990)
		colorDistMagn   0.5817
		colorDistFreq   5.4115e-08
		detailScale     8
		snowLevel       2
		tropicLatitude  0.57724
		icecapLatitude  2
		icecapHeight    0.63068
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12446
		heightTempGrad  0.625
		beachWidth      0.00062481
		tropicWidth     0.07
		mainFreq        0.51257
		venusFreq       0.71731
		venusMagn       0.69659
		mareDensity     0
		terraceProb     0.24717
		erosion         0
		montesMagn      0.45686
		montesFreq      2.935
		montesSpiky     0.94935
		montesFraction  0.66903
		dunesFraction   0
		hillsMagn       0
		hillsFreq       3.3962e-07
		hillsFraction   0.41987
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.25258
		craterFreq      0.17393
		craterDensity   0.97793
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.58216
		volcanoTemp     1026.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.037116
		BumpOffset      0.018558
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.0070013
		DustBright  0.028869
		GasColor   (0.040 0.120 0.200)
		DustColor  (0.470 1.000 0.770)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          273.55173
		SemiMajorAxis   47.8053862
		Eccentricity    0.933441924
		Inclination     -33.226545
		AscendingNode   110.111791
		ArgOfPericenter -6.77132794
		MeanAnomaly     -79.6499011
	}
}

Comet	"C147"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.7436e-15
	Radius          0.064794
	InertiaMoment   0.39978
	RotationPeriod  115.11
	RotationEpoch   0
	Obliquity       70.361
	EqAscendNode    76.52

	AbsMagn         4.6725
	SlopeParam      4.2725
	AlbedoBond      0.031323
	AlbedoGeom      0.037588
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.592 0.495 0.401)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.19545
		Randomize      (-0.127, 0.248, 0.027)
		colorDistMagn   0.07256
		colorDistFreq   2.3554e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.88339
		icecapLatitude  2
		icecapHeight    0.68315
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.14655
		heightTempGrad  0.625
		beachWidth      0.0007854
		tropicWidth     0.07
		mainFreq        0.47358
		venusFreq       0.6052
		venusMagn       0.77824
		mareDensity     0
		terraceProb     0.26827
		erosion         0
		montesMagn      0.4139
		montesFreq      2.7116
		montesSpiky     0.99682
		montesFraction  0.52349
		dunesFraction   0
		hillsMagn       0
		hillsFreq       9.9867e-06
		hillsFraction   0.42995
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22802
		craterFreq      0.24015
		craterDensity   0.88601
		craterOctaves   3
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.56688
		volcanoTemp     911.69
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.16139
		BumpOffset      0.080695
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.0039879
		GasToDust   0.25
		Particles   1060
		GasBright   0.0076321
		DustBright  0.027333
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          274.629791
		SemiMajorAxis   47.9309038
		Eccentricity    0.92463884
		Inclination     49.243412
		AscendingNode   15.3269295
		ArgOfPericenter 22.37611
		MeanAnomaly     79.5203172
	}
}

Comet	"C113"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.0551e-10
	Radius          2.5438
	InertiaMoment   0.39925
	RotationPeriod  111.18
	RotationEpoch   0
	Obliquity       217.72
	EqAscendNode    71.092

	AbsMagn         10.947
	SlopeParam      7.2955
	AlbedoBond      0.028427
	AlbedoGeom      0.034112
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.759 0.695 0.568)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.60477
		Randomize      (0.827, 0.271, -0.491)
		colorDistMagn   0.37155
		colorDistFreq   0.0010075
		detailScale     8
		snowLevel       2
		tropicLatitude  0.97355
		icecapLatitude  2
		icecapHeight    0.65592
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33551
		heightTempGrad  0.625
		beachWidth      0.0007051
		tropicWidth     0.07
		mainFreq        0.49318
		venusFreq       0.63628
		venusMagn       0.59645
		mareDensity     0
		terraceProb     0.54812
		erosion         0
		montesMagn      0.56802
		montesFreq      2.8276
		montesSpiky     0.97383
		montesFraction  0.2939
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.01743
		hillsFraction   0.65297
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.1893
		craterFreq      0.21152
		craterDensity   0.78478
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.57366
		volcanoTemp     1069
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.1296
		BumpOffset      3.0648
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.063163
		GasToDust   0.25
		Particles   2255
		GasBright   0.016176
		DustBright  0.019241
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          278.436548
		SemiMajorAxis   48.3728135
		Eccentricity    0.960557901
		Inclination     -136.822023
		AscendingNode   -33.6721616
		ArgOfPericenter -29.8424447
		MeanAnomaly     109.774146
	}
}

Comet	"C77"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.3378e-14
	Radius          0.15393
	InertiaMoment   0.3988
	RotationPeriod  55.443
	RotationEpoch   0
	Obliquity       289.03
	EqAscendNode    340.64

	AbsMagn         0.26966
	SlopeParam      2.8398
	AlbedoBond      0.023579
	AlbedoGeom      0.028295
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.540 0.536 0.531)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.80287
		Randomize      (-0.281, 0.412, 0.372)
		colorDistMagn   0.38385
		colorDistFreq   1.323e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.54129
		icecapLatitude  2
		icecapHeight    0.43597
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.41793
		heightTempGrad  0.625
		beachWidth      0.00063774
		tropicWidth     0.07
		mainFreq        0.42035
		venusFreq       0.54159
		venusMagn       0.6572
		mareDensity     0
		terraceProb     0.15398
		erosion         0
		montesMagn      0.29752
		montesFreq      2.7876
		montesSpiky     0.9097
		montesFraction  0.50866
		dunesFraction   0
		hillsMagn       0
		hillsFreq       7.649e-05
		hillsFraction   0.49561
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.26514
		craterFreq      0.21484
		craterDensity   0.84854
		craterOctaves   4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.44309
		volcanoTemp     959.05
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.37133
		BumpOffset      0.18566
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.017939
		GasToDust   0.25
		Particles   1342
		GasBright   0.0068773
		DustBright  0.031373
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          283.224496
		SemiMajorAxis   48.9257767
		Eccentricity    0.933804792
		Inclination     42.8108773
		AscendingNode   20.5390846
		ArgOfPericenter 144.775659
		MeanAnomaly     -131.738591
	}
}

Comet	"C105"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.0051e-10
	Radius          3.6058
	InertiaMoment   0.39973
	Oblateness      0.0011
	RotationPeriod  36.789
	RotationEpoch   0
	Obliquity       273.56
	EqAscendNode    90.992

	AbsMagn         7.9404
	SlopeParam      6.5075
	AlbedoBond      0.027589
	AlbedoGeom      0.033107
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.729 0.666 0.631)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.7599
		Randomize      (0.581, 0.747, -0.966)
		colorDistMagn   0.47874
		colorDistFreq   0.010634
		detailScale     16
		snowLevel       2
		tropicLatitude  0.47759
		icecapLatitude  2
		icecapHeight    0.69647
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.30938
		heightTempGrad  0.625
		beachWidth      0.0007568
		tropicWidth     0.07
		mainFreq        0.52015
		venusFreq       0.57224
		venusMagn       0.69742
		mareDensity     0
		terraceProb     0.47278
		erosion         0
		montesMagn      0.49525
		montesFreq      3.6832
		montesSpiky     0.97593
		montesFraction  0.7317
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.031933
		hillsFraction   0.79565
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24756
		craterFreq      0.24427
		craterDensity   0.80233
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51796
		volcanoTemp     1200.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      8.2143
		BumpOffset      4.1071
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.068789
		GasToDust   0.25
		Particles   2369
		GasBright   0.017758
		DustBright  0.027178
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          288.327025
		SemiMajorAxis   49.5116525
		Eccentricity    0.931856813
		Inclination     -92.7348141
		AscendingNode   28.560224
		ArgOfPericenter -148.241934
		MeanAnomaly     -40.0263616
	}
}

Comet	"C46"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            5.0723e-14
	Radius          0.19928
	InertiaMoment   0.39943
	RotationPeriod  64.812
	RotationEpoch   0
	Obliquity       10.446
	EqAscendNode    102.75

	AbsMagn         8.7307
	SlopeParam      2.1068
	AlbedoBond      0.039662
	AlbedoGeom      0.047594
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.664 0.503 0.431)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.029018
		Randomize      (0.765, 0.257, 0.781)
		colorDistMagn   0.86432
		colorDistFreq   3.0579e-05
		detailScale     8
		snowLevel       2
		tropicLatitude  0.84858
		icecapLatitude  2
		icecapHeight    0.69498
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.16668
		heightTempGrad  0.625
		beachWidth      0.0012881
		tropicWidth     0.07
		mainFreq        0.37318
		venusFreq       0.5481
		venusMagn       0.53232
		mareDensity     0
		terraceProb     0.10615
		erosion         0
		montesMagn      0.51464
		montesFreq      3.1109
		montesSpiky     0.80761
		montesFraction  0.20993
		dunesFraction   0
		hillsMagn       0
		hillsFreq       8.2345e-05
		hillsFraction   0.63655
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23421
		craterFreq      0.17948
		craterDensity   0.82042
		craterOctaves   5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.48488
		volcanoTemp     1117.2
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.48906
		BumpOffset      0.24453
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.022102
		GasToDust   0.25
		Particles   1426
		GasBright   0.015505
		DustBright  0.019628
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          295.590061
		SemiMajorAxis   50.3396748
		Eccentricity    0.954958895
		Inclination     67.4305523
		AscendingNode   -154.901757
		ArgOfPericenter -1.30777312
		MeanAnomaly     -176.059964
	}
}

Comet	"C14"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            3.3375e-12
	Radius          0.8045
	InertiaMoment   0.39872
	Oblateness      0.015651
	RotationPeriod  9.7348
	RotationEpoch   0
	Obliquity       233.84
	EqAscendNode    182.35

	AbsMagn         7.6347
	SlopeParam      5.6281
	AlbedoBond      0.038016
	AlbedoGeom      0.045619
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.614 0.610 0.609)

	Surface
	{
		Preset         "asteroid_grey.cfg"
		SurfStyle       0.64955
		Randomize      (-0.219, 0.160, 0.881)
		colorDistMagn   0.40492
		colorDistFreq   0.00032232
		detailScale     8
		snowLevel       2
		tropicLatitude  0.52886
		icecapLatitude  2
		icecapHeight    0.46475
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.46217
		heightTempGrad  0.625
		beachWidth      0.00089484
		tropicWidth     0.07
		mainFreq        0.49358
		venusFreq       0.56522
		venusMagn       0.69452
		mareDensity     0
		terraceProb     0.39019
		erosion         0
		montesMagn      0.48772
		montesFreq      3.3922
		montesSpiky     0.8442
		montesFraction  0.94031
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0015698
		hillsFraction   0.79857
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.27396
		craterFreq      0.22053
		craterDensity   0.86735
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.46201
		volcanoTemp     841.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.8643
		BumpOffset      0.93213
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.044602
		GasToDust   0.25
		Particles   1880
		GasBright   0.0064809
		DustBright  0.026726
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          300.541478
		SemiMajorAxis   50.9002755
		Eccentricity    0.960904472
		Inclination     -133.612139
		AscendingNode   139.080486
		ArgOfPericenter -9.36711383
		MeanAnomaly     -110.164279
	}
}

Comet	"C83"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            7.549e-12
	Radius          1.056
	InertiaMoment   0.39835
	RotationPeriod  77.602
	RotationEpoch   0
	Obliquity       157.15
	EqAscendNode    235.71

	AbsMagn         16.016
	SlopeParam      7.357
	AlbedoBond      0.024659
	AlbedoGeom      0.029591
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.626 0.624 0.621)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.43652
		Randomize      (-0.096, 0.056, 0.228)
		colorDistMagn   0.95113
		colorDistFreq   0.00031088
		detailScale     8
		snowLevel       2
		tropicLatitude  0.2831
		icecapLatitude  2
		icecapHeight    0.61301
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.33752
		heightTempGrad  0.625
		beachWidth      0.001199
		tropicWidth     0.07
		mainFreq        0.73636
		venusFreq       0.63046
		venusMagn       0.82517
		mareDensity     0
		terraceProb     0.55404
		erosion         0
		montesMagn      0.67106
		montesFreq      3.2252
		montesSpiky     0.8376
		montesFraction  0.48104
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0019622
		hillsFraction   0.77628
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23568
		craterFreq      0.21429
		craterDensity   0.97135
		craterOctaves   8
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51196
		volcanoTemp     1160.7
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      2.3202
		BumpOffset      1.1601
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.048989
		GasToDust   0.25
		Particles   1969
		GasBright   0.0070297
		DustBright  0.024081
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          305.382056
		SemiMajorAxis   51.4453584
		Eccentricity    0.971763456
		Inclination     -169.816954
		AscendingNode   -40.6450863
		ArgOfPericenter 122.680578
		MeanAnomaly     13.5821568
	}
}

Comet	"C122"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.2216e-12
	Radius          0.57548
	InertiaMoment   0.39999
	Oblateness      0.0010775
	RotationPeriod  37.189
	RotationEpoch   0
	Obliquity       19.887
	EqAscendNode    93.706

	AbsMagn         10.178
	SlopeParam      2.8123
	AlbedoBond      0.043617
	AlbedoGeom      0.052341
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.680 0.559 0.512)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.055242
		Randomize      (-0.896, -0.265, 0.293)
		colorDistMagn   0.36844
		colorDistFreq   0.00026477
		detailScale     8
		snowLevel       2
		tropicLatitude  0.70131
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
		humidity        0.2149
		heightTempGrad  0.625
		beachWidth      0.0010969
		tropicWidth     0.07
		mainFreq        0.76383
		venusFreq       0.55368
		venusMagn       0.82992
		mareDensity     0
		terraceProb     0.15203
		erosion         0
		montesMagn      0.5497
		montesFreq      3.5693
		montesSpiky     0.91589
		montesFraction  0.1421
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.0010731
		hillsFraction   0.50692
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.22849
		craterFreq      0.21067
		craterDensity   0.98884
		craterOctaves   7
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.51662
		volcanoTemp     1071.5
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      1.3294
		BumpOffset      0.66468
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.039201
		GasToDust   0.25
		Particles   1771
		GasBright   0.00064159
		DustBright  0.024068
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          316.571962
		SemiMajorAxis   52.694524
		Eccentricity    0.921430181
		Inclination     -153.536807
		AscendingNode   31.6992873
		ArgOfPericenter -138.89226
		MeanAnomaly     -73.8720826
	}
}

Comet	"C182"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            2.3865e-10
	Radius          3.3391
	InertiaMoment   0.39893
	RotationPeriod  68.307
	RotationEpoch   0
	Obliquity       141.02
	EqAscendNode    124.46

	AbsMagn         5.7957
	SlopeParam      2.7752
	AlbedoBond      0.047172
	AlbedoGeom      0.056606
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.771 0.671 0.582)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.39174
		Randomize      (0.950, 0.166, 0.855)
		colorDistMagn   0.92042
		colorDistFreq   0.0073855
		detailScale     16
		snowLevel       2
		tropicLatitude  0.41326
		icecapLatitude  1.8757
		icecapHeight    0.3603
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21087
		heightTempGrad  0.625
		beachWidth      0.0013092
		tropicWidth     0.07
		mainFreq        0.7355
		venusFreq       0.5665
		venusMagn       0.67973
		mareDensity     0
		terraceProb     0.14941
		erosion         0
		montesMagn      0.44207
		montesFreq      2.6711
		montesSpiky     0.9719
		montesFraction  0.53084
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.023533
		hillsFraction   0.64146
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.23817
		craterFreq      0.2049
		craterDensity   0.90372
		craterOctaves   10
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.47385
		volcanoTemp     988.02
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      7.7
		BumpOffset      3.85
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.06755
		GasToDust   0.25
		Particles   2344
		GasBright   0.016245
		DustBright  0.017077
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          324.062387
		SemiMajorAxis   53.5224854
		Eccentricity    0.91310386
		Inclination     119.557399
		AscendingNode   164.45425
		ArgOfPericenter 55.7144483
		MeanAnomaly     16.9932879
	}
}

Comet	"C56"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.9365e-17
	Radius          0.014456
	InertiaMoment   0.39877
	RotationPeriod  70.611
	RotationEpoch   0
	Obliquity       30.636
	EqAscendNode    167.88

	AbsMagn         4.2196
	SlopeParam      3.7555
	AlbedoBond      0.040172
	AlbedoGeom      0.048206
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.431 0.427 0.424)

	Surface
	{
		Preset         "asteroid_default.cfg"
		SurfStyle       0.0851
		Randomize      (-0.927, -0.338, -0.125)
		colorDistMagn   0.95967
		colorDistFreq   1.125e-07
		detailScale     8
		snowLevel       2
		tropicLatitude  0.83235
		icecapLatitude  2
		icecapHeight    0.44629
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.29934
		heightTempGrad  0.625
		beachWidth      0.00062344
		tropicWidth     0.07
		mainFreq        0.44586
		venusFreq       0.59942
		venusMagn       0.77293
		mareDensity     0
		terraceProb     0.22466
		erosion         0
		montesMagn      0.40246
		montesFreq      2.4851
		montesSpiky     0.89289
		montesFraction  0.60252
		dunesFraction   0
		hillsMagn       0
		hillsFreq       4.9084e-07
		hillsFraction   0.43505
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.24417
		craterFreq      0.21675
		craterDensity   0.93908
		craterOctaves   1
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.49911
		volcanoTemp     1253.3
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      0.03708
		BumpOffset      0.01854
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		GasBright   0.00042417
		DustBright  0.022811
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          328.938297
		SemiMajorAxis   54.0580215
		Eccentricity    0.963784007
		Inclination     -51.3754089
		AscendingNode   -87.5287048
		ArgOfPericenter 167.602927
		MeanAnomaly     -133.376727
	}
}

Comet	"C13"
{
	ParentBody     "Pourne"
	Class          "Asteroid"
	Mass            1.0122e-10
	Radius          2.5088
	InertiaMoment   0.39601
	RotationPeriod  39.585
	RotationEpoch   0
	Obliquity       15.821
	EqAscendNode    139.83

	AbsMagn         11.386
	SlopeParam      4.936
	AlbedoBond      0.053961
	AlbedoGeom      0.064753
	Brightness      0.5
	BrightnessReal  0.3
	Color          (0.666 0.664 0.661)

	Surface
	{
		Preset         "asteroid_blue.cfg"
		SurfStyle       0.043947
		Randomize      (-0.250, 0.220, 0.572)
		colorDistMagn   0.28998
		colorDistFreq   0.0039861
		detailScale     8
		snowLevel       2
		tropicLatitude  0.67375
		icecapLatitude  2
		icecapHeight    0.79282
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.2089
		heightTempGrad  0.625
		beachWidth      0.0010513
		tropicWidth     0.07
		mainFreq        0.65289
		venusFreq       0.57503
		venusMagn       0.6746
		mareDensity     0
		terraceProb     0.32687
		erosion         0
		montesMagn      0.57832
		montesFreq      3.3022
		montesSpiky     0.93196
		montesFraction  0.46531
		dunesFraction   0
		hillsMagn       0
		hillsFreq       0.015099
		hillsFraction   0.83456
		hills2Fraction  0
		canyonsFraction 0
		craterMagn      0.20422
		craterFreq      0.18435
		craterDensity   0.93089
		craterOctaves   9
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.54436
		volcanoTemp     1208.1
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      6.7586
		BumpOffset      3.3793
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
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
		MaxLength   0.06294
		GasToDust   0.25
		Particles   2251
		GasBright   0.0064485
		DustBright  0.027948
		GasColor   (0.040 0.120 0.200)
		DustColor  (1.000 1.000 1.000)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          341.718501
		SemiMajorAxis   55.4493147
		Eccentricity    0.948071921
		Inclination     26.6975174
		AscendingNode   10.1047122
		ArgOfPericenter 71.0148035
		MeanAnomaly     0.763113443
	}
}


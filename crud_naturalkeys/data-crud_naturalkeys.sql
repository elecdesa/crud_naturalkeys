CREATE TABLE [dbo].[auxMeses](
	[ID] [char](2) NOT NULL,
	[Descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_auxMeses] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'01', N'Enero')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'02', N'Febrero')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'03', N'Marzo')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'04', N'Abril')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'05', N'Mayo')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'06', N'Junio')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'07', N'Julio')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'08', N'Agosto')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'09', N'Septiembre')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'10', N'Octubre')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'11', N'Noviembre')
INSERT [dbo].[auxMeses] ([ID], [Descripcion]) VALUES (N'12', N'Diciembre')


CREATE TABLE [dbo].[Mensual](
	[anio] [char](4) NOT NULL,
	[mes] [char](2) NOT NULL,
	[codalojamiento] [char](7) NOT NULL,
	[plazas] [int] NULL,
 CONSTRAINT [PK_Mensuales] PRIMARY KEY CLUSTERED 
(
	[anio] ASC,
	[mes] ASC,
	[codalojamiento] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'01', N'111001 ', 85)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'01', N'111002 ', 26)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'01', N'111003 ', 48)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'01', N'426435 ', 6)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'02', N'111001 ', 85)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'02', N'111002 ', 26)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'02', N'111003 ', 48)
INSERT [dbo].[Mensual] ([anio], [mes], [codalojamiento], [plazas]) VALUES (N'2014', N'02', N'426435 ', 6)

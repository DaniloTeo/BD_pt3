--Consultas sofisticadas que podem ser feitas no sistema

--Selecionar a quantidade de formaturas que acontecem em cada mes. Ordenar por mes.
SELECT EXTRACT(MONTH FROM F.DATA) AS "Mes", COUNT(*)
FROM FORMATURA F
GROUP BY EXTRACT(MONTH FROM F.DATA)
ORDER BY EXTRACT(MONTH FROM F.DATA);

--Selecionar a quantidade de cada tipo de servico de fotografia para formaturas no mes de fevereiro.
SELECT  FT.TIPO AS "Tipo",COUNT(*)
FROM FOTOGRAFIA FT, EVENTO EV
WHERE EV.FOTOGRAFIA = FT.CNPJ AND
        EXTRACT(MONTH FROM EV.DATA) = '02'
GROUP BY FT.TIPO;


--Selecione as formaturas da exibindo os nomes das equipes de fotografia, os nomes das casas de festa.
SELECT FO.ESCOLA AS "Escola", FT.NOME_EQUIPE AS "Equipe", CS.NOME AS "CasaFesta"
FROM EVENTO EV, FOTOGRAFIA FT, CASA_FESTAS CS, FORMATURA FO
WHERE EV.DATA = FO.DATA AND EV.FOTOGRAFIA = FT.CNPJ AND EV.NRO_CASA_FESTAS = CS.NRO AND EV.CEP_CASA_FESTAS = CS.CEP
ORDER BY FO.ESCOLA;


--Selecionar todas as formaturas que ocorreram antes da colacao de grau
SELECT *
FROM FORMATURA F
WHERE F.DATA < F.DATA_COLACAO;


--Selecionar para todas formaturas o nome da escola e se houver o nome da equipe de fotografia. Se n houver equipe exibir null
SELECT EV.DATA, FO.ESCOLA , FT.NOME_EQUIPE
FROM (EVENTO EV JOIN FORMATURA FO
                    ON EV.DATA = FO.DATA)
LEFT JOIN FOTOGRAFIA FT
ON FT.CNPJ = EV.FOTOGRAFIA
ORDER BY EV.DATA;


--Selecionar os nomes das casa de festa nas quais ocorreram mais de uma formatura no ano de 2018
SELECT CF.NOME AS "CasaFestas", COUNT(*) AS "Qtd"
FROM EVENTO EV, CASA_FESTAS CF
WHERE EV.CEP_CASA_FESTAS = CF.CEP AND EV.NRO_CASA_FESTAS = CF.NRO AND UPPER(EV.TIPO) = 'FORMATURA' AND EXTRACT(YEAR FROM EV.DATA) = '2018'
GROUP BY CF.NOME 
HAVING COUNT(*) > 1;

--Selecionar as quantidades de festas decoradas para cada decoradora. Agrupar pelos nomes das decoradoras
SELECT DR.NOME AS "Decor", COUNT(*) AS "Qtd"
FROM EVENTO EV, DECORA DA, DECORADORA DR
WHERE EV.DATA = DA.DATA_EVENTO AND DA.DECORADORA = DR.CNPJ
GROUP BY DR.NOME;





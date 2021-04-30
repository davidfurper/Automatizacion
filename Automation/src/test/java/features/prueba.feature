@testFuncional
  Feature: Ingresar a google y buscar qa automation
    Scenario Outline: Se debe ingresar a google y buscar qa automation
      Given se ingresa a <url>
      And se valida que exista el cuadro de texto para hacer busqueda
      And se ingresa el <texto>
      And se buscar
      Examples:
        | url | texto |
        | "http://www.google.cl" | "qa automation" |
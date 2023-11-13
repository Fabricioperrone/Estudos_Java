# Estudos_Java

## Recursividade

## Função/Método recursivo
- Método que chama ele mesmo
- Precisa de um ponto de parada

  Usando o exemplo de um fatorial de um número

  5! = 5 * 4 * 3 * 2 * 1 = 120

  ## Método não recursivo

  ```
  public int calculadoraFattorial(int num) {

    int total = 1;
    for(int i=num; i>1; i--) {
          total *= i;
      }
    return total;
  }
  ```

  ## Método recursivo

  ```
  public int fatorial(int num) {
    if(num == 0){
      return 1;
    }
    return num * fatorial(num-1);
  }
  ```

  ## Chama ele mesmo => fatorial(num-1);<=

  ```
  if(num == 0){
    return 1;
  }
  ```
  ## Ponto de parada

  Fatorial
  ![image](https://github.com/Fabricioperrone/Estudos_Java/assets/69866913/a99d066f-07d7-42fc-8f84-5a7d4a9f44e5)


  

# Cartão Profissional

## Descrição
Aplicativo Android desenvolvido em Jetpack Compose que exibe um cartão de visitas digital. A tela apresenta uma foto de perfil, saudação, nome do usuário, cargo(s) profissional(is), um breve resumo "Sobre mim" e uma lista de contatos (telefone, e-mail e endereço), cada um acompanhado de um ícone ilustrativo.

## Tecnologias utilizadas
- **Linguagem:** Kotlin
- **Toolkit de UI:** Jetpack Compose (Material 3)
- **IDE:** Android Studio Otter 2 Feature Drop | 2025.2.2 Patch 1
- **Ícones:** `androidx.compose.material.icons` (Icons.Default)

## Como compilar e executar o projeto
1. Clone o repositório:
```bash
   git clone <URL>
```
2. Abra o Android Studio.
3. Selecione **Open** e escolha a pasta do projeto clonado.
4. Aguarde a sincronização do Gradle.
5. Certifique-se de ter um emulador configurado ou um dispositivo físico conectado com depuração USB ativada.
6. Verifique se existe uma imagem chamada `user` na pasta `res/drawable`.
7. Clique em **Run** para compilar e executar o app no emulador/dispositivo selecionado.

## Descrição dos composables
`MainActivity.onCreate`: Ponto de entrada do app. Ativa o modo edge-to-edge e define o conteúdo da tela via `setContent`, aplicando o tema `CartãoProfissionalTheme` e chamando o composable `Project` com os dados do usuário (nome e cargos).
`Project`: Composable raiz da tela. Organiza verticalmente (`Column`) a imagem de perfil e o bloco de saudação/dados, centralizando tudo horizontalmente.
`Greeting`: Monta o bloco textual principal: saudação ("Olá, como vai?"), nome da pessoa, linha com os cargos (`cargo1` e `cargo2`), a seção `About`, o título "Contatos" e a seção `Contacts`.
`About`: Exibe o título "Sobre mim" e o parágrafo com o resumo profissional do usuário.
`Contacts`:  Exibe três linhas (`Row`), cada uma com um ícone (telefone, e-mail, localização) seguido do respectivo dado de contato (número, e-mail, endereço).

## Diagrama da hierarquia dos composables
```
MainActivity
|-- CartãoProfissionalTheme
    |-- Scaffold
        |-- Project
            |-- Column
                |-- Image (foto de perfil)
                |-- Greeting
                    |-- Text (saudação)
                    |-- Text (nome)
                    |-- Row
                    |   |-- Text (cargo1)
                    |   |-- Text (cargo2)
                    |-- About
                    |   |-- Text (título "Sobre mim")
                    |   |-- Text (descrição)
                    |-- Text (título "Contatos")
                    |-- Contacts
                        |-- Row (Icon + Text: telefone)
                        |-- Row (Icon + Text: e-mail)
                        |-- Row (Icon + Text: endereço)

```
## Aluno
- Miguel, 3° Período


# Jokes API

API that generates random jokes based on some categories or just random
___
![GitHub Issues](https://img.shields.io/github/issues/pitzzahh/jokes-API)
![Forks](https://img.shields.io/github/forks/pitzzahh/jokes-API)
![Stars](https://img.shields.io/github/stars/pitzzahh/jokes-API)
![License](https://img.shields.io/github/license/pitzzahh/jokes-API)
___
## API Reference

#### Get a random joke and returns a JSON response from the API

```html
 GET https://jokes.araopj.tech/v1/random
```

#### Example response

```json
{
  "joke": "What do you call a fake noodle? An \"impasta\".",
  "category": "DAD_JOKE",
  "lang": "ENGLISH"
}
```
```json
{
  "joke": "Ano ang sabi ng isang kahoy sa ibang kahoy? Pakapit!",
  "category": "ONE_LINER",
  "lang": "FILIPINO"
}
```
#### Get random joke based on category and language

```html
 GET https://jokes.araopj.tech/v1/random?category=${category}&lang=${language}
```

| Parameter  | Type     | Description                                 |
|:-----------|:---------|:--------------------------------------------|
| `category` | `String` | **Not Required**. category of joke to fetch |
| `lang`     | `String` | **Not Required**. language of joke to fetch |


##### Sample Request

```html
 GET https://jokes.araopj.tech/v1/random?category=ANY&lang=FILIPINO
```

#### Get random joke based on category

```html
 GET https://jokes.araopj.tech/v1/random?category=${category}
```

| Parameter  | Type     | Description                             |
|:-----------|:---------|:----------------------------------------|
| `category` | `String` | **Required**. category of joke to fetch |

| Categories <br/>available |
|:--------------------------|
| `ANY`                     |
| `DAD_JOKE`                |
| `PUN`                     |
| `KNOCK_KNOCK`             |
| `ONE_LINER`               |

#### Sample Request

```html
 GET https://jokes.araopj.tech/v1/random?category=DAD_JOKE
```
___

#### Get random joke based on language

```html
 GET https://jokes.araopj.tech/v1/random?lang=${language}
```

| Parameter | Type     | Description                             |
|:----------|:---------|:----------------------------------------|
| `lang`    | `String` | **Required**. language of joke to fetch |


| Languages <br/>available |
|:-------------------------|
| `ENGLISH`                |
| `FILIPINO`               |

#### Sample Request

```html
 GET https://jokes.araopj.tech/v1/random?lang=FILIPINO
```
___

## Contributing

Contributions are always welcome!

See `contributing.md` for ways to get started.

Please adhere to this project's `code of conduct`.

___
## Features
- [x] Random joke
- [x] Many joke categories
- [x] Many joke languages
- [x] Random joke based on category
- [x] Random joke based on language
- [x] Random joke based on category and language
- [x] API Documentation
- [ ] API Rate Limiting
- [ ] API Authentication
- [ ] API Key
- [ ] Microservice (? maybe)
___
## Support

For support, email pitzzahh@araopj.tech
___
## License
[MIT](https://choosealicense.com/licenses/mit/)

### 🤍 Special Thanks to [render.com](https://render.com/) for providing free hosting for this project


import { Router } from 'express';

const todosPokemon = [
    {
        id: "1",
        nombre: "bulbasaur",
        foto: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
    },
    {
        id: "4",
        nombre: "charmander",
        foto: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"
    },
    {
        id: "7",
        nombre: "squirtle",
        foto: "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"
    },
    {
        id:132,
        nombre: "ditto",
        foto:"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png"
    }
]
class IndexRouter {
    public router: Router = Router();

    constructor() {
        this.config();
    }

    config(): void {
        this.router.get('/hola', (req, res) => res.send("Hola Mundo"));

        this.router.get('/pokeTodos', (req, res) => {
            res.send(todosPokemon);
        })

        this.router.get('/poke/:id', (req, res) => {
            //console.log(req);
            const poke = this.obtenerPokemonPorId(req.params.id);
            res.send(poke);
        });

        this.router.get('/pokeNombre/:nombre', (req, res) => {
            console.log("Pruebas");
            const poke = this.obtenerPokemonPorNombre(req.params.nombre);
            res.send(poke);
        });
    }

    obtenerPokemonPorId(id: any) : any {
        return todosPokemon.find(dato => dato.id == id);
    }

    obtenerPokemonPorNombre(nombre: any) : any {
        return todosPokemon.find(dato => dato.nombre == nombre);
    }
}

const indexRouter = new IndexRouter();
export default indexRouter.router;
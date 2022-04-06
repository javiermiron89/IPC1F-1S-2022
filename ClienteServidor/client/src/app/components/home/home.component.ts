import { Component, OnInit } from '@angular/core';

import { PokemonInterface } from 'src/app/models/PokemonInterface';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(public pokemonService: PokemonService) { }

  //Arreglo para los pokemons
  datosPokemon: PokemonInterface[] = [];

  ngOnInit(): void {
    this.ObtenerPokemons();
  }

  ObtenerPokemons(){
    this.pokemonService.CargarDatos().subscribe(async (res) =>
    {
      let valores: any = res;
      this.datosPokemon = valores;
      console.log("LISTA DE DATOS");
      console.log(this.datosPokemon);
    },
    err => console.log(err));
  }

}

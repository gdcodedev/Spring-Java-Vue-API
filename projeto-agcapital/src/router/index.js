import { createRouter, createWebHashHistory } from 'vue-router'
import Clientes from '../views/Clientes.vue'
import Projetos from '../views/Projetos.vue'
import Atividades from '../views/Atividades.vue'

const routes = [
  {
    path: '/',
    name: 'home',
  },
  {
    path: '/clientes',
    name: 'clientes',
    component: Clientes
  },
  {
    path: '/projetos',
    name: 'projetos',
    component: Projetos
  },
  {
    path: '/atividades',
    name: 'atividades',
    component: Atividades
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

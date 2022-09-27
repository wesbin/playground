import { createWebHistory, createRouter } from 'vue-router'
import Comics from './comics'
import Musics from './musics'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/main/Main'),
  },
  ...Comics,
  ...Musics,
]

export default createRouter({
  history: createWebHistory(),
  routes,
})
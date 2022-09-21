import { createWebHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/main/Main')
  },
  {
    path: '/Comics',
    name: 'Comics',
    component: () => import('@/components/main/Comics')
  },
  {
    path: '/Music',
    name: 'Music',
    component: () => import('@/components/main/Music')
  }
]

export default createRouter({
  history: createWebHistory(),
  routes
})
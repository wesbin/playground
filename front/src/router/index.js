import { createWebHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/content/Main')
  },
  {
    path: '/Comics',
    name: 'Comics',
    component: () => import('@/components/content/Comics')
  },
  {
    path: '/Music',
    name: 'Music',
    component: () => import('@/components/content/Music')
  }
]

export default createRouter({
  history: createWebHistory(),
  routes
})
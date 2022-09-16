import { createWebHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/contents/Main')
  },
  {
    path: '/Comics',
    name: 'Comics',
    component: () => import('@/components/contents/Comics')
  },
  {
    path: '/Music',
    name: 'Music',
    component: () => import('@/components/contents/Music')
  }
]

export default createRouter({
  history: createWebHistory(),
  routes
})
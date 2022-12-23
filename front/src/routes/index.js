import {createRouter, createWebHistory} from 'vue-router';

const routes = [
  {
    path: '/',
    redirect: 'view'
  },
  {
    name: 'view',
    path: '/view',
    component: () => import('@/components/View/TestView')
  },
  {
    name: 'chat',
    path: '/chat',
    component: () => import('@/components/chat/ChatRoom')
  },
  {
    name: 'unknown',
    path: '/404',
    component: () => import('@/components/UnknownPage')
  },
  {
    path: '/:pathMatch(.*)*',
    redirect: '/404'
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router